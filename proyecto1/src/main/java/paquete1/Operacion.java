package paquete1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Operacion {
	
String NoPermitidos = "";

	public ArrayList<Integer> formato(String cadena) {
		String cad = cadena.trim();
		cad = cad.toLowerCase();
		String[] cade = cad.split(",");
		ArrayList<Integer> digitos = new ArrayList<Integer>(); 
		
		for (int i = 0; i < cade.length; i++) {
		if (isNumeric(cade[i]) ) {
		digitos.add(Integer.parseInt(cade[i]));
		}else{NoPermitidos += cade[i] + " - ";}
		}
		mostarDigitos(digitos);
		return digitos;
	}
	public void mostarDigitos(ArrayList<Integer> contenedora){
		int sumar = 0;
                
		for (int i = 0; i < contenedora.size(); i++) {
		sumar += contenedora.get(i);}
                
		JOptionPane.showMessageDialog(null, "La suma es : " +sumar);
		JOptionPane.showMessageDialog(null, "no son numeros : " + NoPermitidos);	
	}
	public int suma(int x, int y) {
		return x + y;}

	private boolean isNumeric(String cadena){
		try {Integer.parseInt(cadena);
		return true;
		} catch (NumberFormatException nfe){
		return false;
		}
	}
}
