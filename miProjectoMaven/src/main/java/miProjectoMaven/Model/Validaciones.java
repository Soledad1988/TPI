package miProjectoMaven.Model;

public class Validaciones {
	
	public static void main(String[] args) {
	
	 String linea = "D:\\Users\\Brenda\\Desktop\\Java - UTN\\TrabajoPractico\\resultados.csv";
	
	 String[] contenidoLinea = linea.split(";");
		 
	 	if(contenidoLinea.length !=5) {
			 System.out.println("cantidad de columnas incorrectas");
		 }
	 
	 try {
		 Integer.parseInt(contenidoLinea[2]);
		 Integer.parseInt(contenidoLinea[3]);
	 	     System.out.println("Formato correcto");
	 }catch(Exception e) {
		 System.out.println("Formato de goles incorrectos");
	 }
         
         
	}
}
