package miProjectoMaven.Model;

import java.sql.*;

public class BaseDeDatos {

	public static void main(String[] args) throws Exception{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/partidosbd";
			String usuario = "root";
			String password = "Melek2010*";
			
			
			Connection conexion=DriverManager.getConnection(url, usuario, password);
			
			String Query="SELECT numero, equipo1, golesEquipo1, golesEquipo2, equipo2 "
					+ "FROM partido AS P inner join ronda AS R ON (P.idpartido = R.idronda)";
			
			Statement sentenciaSQL = conexion.createStatement();
			
			ResultSet cdr = sentenciaSQL.executeQuery(Query);
			
	
			while(cdr.next()) 
				System.out.println(cdr.getString(1)+" "
									+cdr.getString(2)+" "
									+cdr.getString(3)+" "
									+cdr.getString(4)+" "
									+cdr.getString(5));
			
			//cerrar conexión
			conexion.close();
			
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	       
	}
	
}
