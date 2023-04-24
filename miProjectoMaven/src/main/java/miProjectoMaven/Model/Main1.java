package miProjectoMaven.Model;

import java.util.ArrayList;
import java.sql.*;

public class Main1 {
	
	public static void main(String[] args) throws Exception{
		
		ArrayList<String> partidos = new ArrayList<>();
		Partido partidosRonda[] = new  Partido[4];
		
		try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/partidosbd";
			String usuario = "root";
			String password = "*****";
			
			
			Connection conexion=DriverManager.getConnection(url, usuario, password);
			
			String query="SELECT numero, equipo1, golesEquipo1, golesEquipo2, equipo2 "
					+ "FROM partido AS P inner join ronda AS R ON (P.idpartido = R.idronda)";
			
			Statement sentenciaSQL = conexion.createStatement();
			
			ResultSet resultado = sentenciaSQL.executeQuery(query);
			
			while(resultado.next()) {
				
				String equipo1 = resultado.getString(2);
				String equipo2 = resultado.getString(5);
	            String gol1 = (resultado.getString(3));
	            String gol2 = (resultado.getString(4));
             
		      	partidos.add(equipo1);
		      	partidos.add(equipo2);
		      	partidos.add(gol1);
		      	partidos.add(gol2);
		      	
		      	
	              System.out.println(partidos);
		      	}
	            
	      
			//cerrar conexión
			conexion.close();
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
