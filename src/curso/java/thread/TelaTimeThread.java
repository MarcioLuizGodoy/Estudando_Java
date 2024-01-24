package curso.java.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


				/*Classe que torna tudo capaz*/
public class TelaTimeThread  extends JDialog { 
	
	//Atributos?//
	//PainelDaParede	
	private JPanel painelComponentes = new JPanel(new GridBagLayout());
	
	/*label em ingles é etiqueta*/ 
	private JLabel descricaoHora = new JLabel("	Hora da Thread 1	");	
	
	//CampoDeTexto
	private JTextField mostraTempo = new JTextField();
	
					//=============x============//
	
	/*SegundoComponenteDoPrimeiroPainel*/
	private JLabel descricaoHora2 = new JLabel("Hora da Thread 2");
	
	//SegudoCampoDeTexto
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton botaoDecisao = new JButton("Start");
	private JButton botaoDecisao2 = new JButton("Stop");
	
	
	//=========================X============================//
	
	
	/*Thread*/
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			while (true) {/*Fica sempre rodando a thread*/
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
			}
		}
	};
	
	
	private Thread thread1Time;
	
	
	//construtor da classe tela time thread
		public TelaTimeThread() { 
			
			
			setTitle("MInha tela de Time com thread"); // tituloDatela
			setSize(new Dimension(240, 240));// setaAs DimensoesDaTela
			setLocationRelativeTo(null); //centraliza a tela
			setResizable(false); // nao deixa aumentar tela pelos lados
			
					//controladorPosicao
			GridBagConstraints controladorPosicaoTela = new GridBagConstraints();
			controladorPosicaoTela.gridx = 0; //linhaZero
			controladorPosicaoTela.gridy = 0; //ColunaZero
			controladorPosicaoTela.gridwidth = 2;
			controladorPosicaoTela.insets = new Insets(5, 10, 5, 5);
			controladorPosicaoTela.anchor = GridBagConstraints.WEST;
			
					//decidindoPosicaoDaEtiqueta
			descricaoHora.setPreferredSize(new Dimension(200, 25)); 
					//AdicionandoAoPainelEComunicandoOcontroladorDePosicao
			painelComponentes.add(descricaoHora,controladorPosicaoTela);
			
			
			mostraTempo.setPreferredSize(new Dimension (200 ,25));
			controladorPosicaoTela.gridy ++;
			painelComponentes.add(mostraTempo,controladorPosicaoTela);
			
			descricaoHora2.setPreferredSize(new Dimension(200,25));
			controladorPosicaoTela.gridy ++;
			painelComponentes.add(descricaoHora2,controladorPosicaoTela);
			
			mostraTempo2.setPreferredSize(new Dimension(200, 25));
			controladorPosicaoTela.gridy++;
			painelComponentes.add(mostraTempo2,controladorPosicaoTela);
			
			
			controladorPosicaoTela.gridwidth = 1;
			
			
			botaoDecisao.setPreferredSize(new Dimension(90, 25));
			controladorPosicaoTela.gridy ++;
			painelComponentes.add(botaoDecisao, controladorPosicaoTela);
			
			botaoDecisao2.setPreferredSize(new Dimension(90,25));
			controladorPosicaoTela.gridx++;
			painelComponentes.add(botaoDecisao2,controladorPosicaoTela);
			
			
					//start//
			botaoDecisao.addActionListener(new ActionListener() {				
				@Override
				
				public void actionPerformed(ActionEvent e ){
					thread1Time = new Thread (thread1);
					thread1Time.start();
					
				}
			}) ;
			
			
							//stop//
			botaoDecisao2.addActionListener(new ActionListener() {
				
				
				@Override
				public void actionPerformed(ActionEvent e) {
					thread1Time.stop();				/*Erro*/
						//Metodo removido//
					
				}
			});
			
			
				//OpaineilDeComponentesTemQueSerPassadoAoDialog
			add(painelComponentes,BorderLayout.WEST); 
			
			
				//torna a tela visivel ao usuario
				//ultimo comando a ser executado
			setVisible(true);	
			
		
		}
}
