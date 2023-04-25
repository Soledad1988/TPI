package miProjectoMaven.Model;

public class Pronostico {

	  private Partido partido;
	    private Equipo equipo;
	    private ResultadoEnum resultado;
	    private Persona participante;

	    public Pronostico() {
	    }

	    public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado, Persona participante) {
	        this.partido = partido;
	        this.equipo = equipo;
	        this.resultado = resultado;
	        this.participante = participante;
	    }

	    //constructores requeridos
	    public Pronostico(Partido partido2, Equipo equipo2, String string, String string2) {
			// TODO Auto-generated constructor stub
		}

		public Partido getPartido() {
	        return partido;
	    }

	    public void setPartido(Partido partido) {
	        this.partido = partido;
	    }

	    public Equipo getEquipo() {
	        return equipo;
	    }

	    public void setEquipo(Equipo equipo) {
	        this.equipo = equipo;
	    }

	    public ResultadoEnum getResultado() {
	        return resultado;
	    }

	    public void setResultado(ResultadoEnum resultado) {
	        this.resultado = resultado;
	    }

	    public Persona getParticipante() {
	        return participante;
	    }

	    public void setParticipante(Persona participante) {
	        this.participante = participante;
	    }

	    public int puntos (){
	        if(partido.resultado(equipo) == resultado) {
	            return 1;  //Si el resultado pronosticado del equipo es igual al resultado del equipo suma un punto
	        } else {
	            return 0; //Si es diferente no suma nada
	        }
	    }
}
