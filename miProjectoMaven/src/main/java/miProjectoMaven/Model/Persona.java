package miProjectoMaven.Model;

public class Persona {
	
	int id;
	private String nombre;
    private Pronostico [] prodePersona;
    
    public Persona() {    }
    
    public Persona(int id, String nombre, Pronostico[] prodePersona) {
    	this.id = id;
        this.nombre = nombre;
        this.prodePersona = prodePersona;
    }
    
    //constructor requerido
    public Persona(int id, String nombre) {
    	this.id = id;
        this.nombre = nombre;
	}

	public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pronostico[] getProdePersona() {
        return prodePersona;
    }
    public void setProdePersona(Pronostico[] prodePersona) {
        this.prodePersona = prodePersona;
    }
    public int puntaje() {
        int totalPuntos = 0;
        for(Pronostico pronostico : prodePersona) {
            totalPuntos+= pronostico.puntos();
        }
        return totalPuntos;
    }
}
