package curso.java.thread;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class TelaTimeThread  extends JDialog{

		/*Painel de componentes*/
		private JPanel jPanel = new JPanel(new GridBagLayout()); 
		
		private JLabel descricaoHora = new JLabel("Time Thread1");
		private JTextField mostraTempo = new JTextField();
		
		/*Construtor*/
		//ExecutarOqueTaDentroNaInstanciacao
		public TelaTimeThread() { 
			
			/*Primeira etapa na criação das telas*/
			
			setTitle("Minha tela de time com a Thread");
			setSize(new Dimension(240,240));
			setLocationRelativeTo(null);
			setResizable(false); /*Primeira parte concluida*/
			
			/*Inicio da Segunda Etapa*/
			
/*Painel e gerenciador de posicionamento de botoes na tela*/
			
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints .gridx =0;
			gridBagConstraints.gridy = 0;
			
			descricaoHora.setPreferredSize(new Dimension(200,25));
			jPanel.add(descricaoHora, gridBagConstraints);
			
			mostraTempo.setPreferredSize(new Dimension(200,25));
			gridBagConstraints.gridy++;
			gridBagConstraints.gridx++;
			jPanel.add(mostraTempo, gridBagConstraints);
			
			
			
			
			
			
			
		add(jPanel,BorderLayout.WEST);
			//ultimoComandoAexecutar
			setVisible(true); 
			//tornaAtelaVisivelAoUsuario
		}	
}
