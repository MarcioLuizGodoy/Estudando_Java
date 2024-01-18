import javax.swing.JOptionPane;

public class AulaTread {
		
public static void main(String[] args) throws InterruptedException {
	

	new Thread() {
				
				public void run() {
					
					for( int i = 0 ; i<6 ; i++) {	
						
						System.out.println("Executando algo em background");
						
						try {					
							
						Thread.sleep(1000);
										
						
							} catch(InterruptedException e) {
								e.printStackTrace();
											}
						}
				}
			} .start();
					
			System.out.println("Execute de cara");
	
			JOptionPane.showMessageDialog(null, "Funcionamento principal do sistema");
			
}
		}