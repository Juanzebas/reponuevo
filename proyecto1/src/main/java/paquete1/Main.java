
package paquete1;
 import javax.swing.JOptionPane;


public class Main {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operacion p = new Operacion();
		
		String cadena = JOptionPane.showInputDialog("Digitar seguido de una ',' ejemplo: '5,6,7'");
		
		p.formato(cadena);
		
	}

}
