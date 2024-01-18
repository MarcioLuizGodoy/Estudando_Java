
import javax.swing.JOptionPane;
public class AulaThread{	
	
	public static void  main (String[] args) throws InterruptedException{
		
		/*Processando em background envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/*Processando em background envio de nota fiscal*/
		Thread notaFiscal =new Thread(thread2);
		notaFiscal.start();
		
		  /*codigo do sistema do usuario continua rodando*/
		 /*tela principal do sistema*/
		  JOptionPane.showMessageDialog(null, "sistema continuaa executando a tarefa normal  para o usuario");
	}
	
	private static Runnable thread1 = new Runnable() {
		/*executa o que queremos*/
		@Override
		public void run() {
			/*codigo da rotina que eu quero executar em paralelo*/
			  for( int i=0; i<10; i++) {
				  System.out.println("Processo em background email");
				  try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
		}
	}; /*não pode tirar esse ponto e virgula porque estoura erro.*/
	
						//--- separacaoThread-----//
	private static Runnable thread2 = new Runnable() {
		/*executa o que queremos*/
		@Override
		public void run() {			
			/*codigo da rotina que eu quero executar em paralelo*/
			  for( int i=0; i<10; i++) {
				   System.out.println("Processo em background nota fiscal");
				   try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				  
			  }
			
		}
	}; /*não pode tirar esse ponto e virgula porque estoura erro.*/
	
		}



