package com.utn.ejercicio9.miProjectoMaven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import miProjectoMaven.Model.Equipo;
import miProjectoMaven.Model.Partido;
import miProjectoMaven.Model.Persona;
import miProjectoMaven.Model.Pronostico;
import miProjectoMaven.Model.ResultadoEnum;
import miProjectoMaven.Model.Ronda;


public class ContarPuntajeTest 
{
	@org.junit.jupiter.api.Test
    @Test
    public void contarPuntaje (){

        //Creamos los participantes

        Persona participante = new Persona();

        //creamos los equipos
        Equipo argentina = new Equipo("Argentina","Arg");
        Equipo arabia = new Equipo("Arabia Saudita","ArBi");
        Equipo polonia = new Equipo("Polonia","Pol");
        Equipo mexico = new Equipo("Mexico","Mex");

        //Creamos los partidos

        Partido partido1 = new Partido(argentina,arabia,1,2);
        Partido partido2 = new Partido(polonia,mexico,0,0);

        //array de partido para pasarle a ronda
        Partido[] vectorPartidos = {partido1,partido2};

        //Creamos la ronda
        Ronda ronda = new Ronda("1",vectorPartidos,2);

        //Creamos los pronosticos
        Pronostico pronostico1 = new Pronostico(partido1,argentina,ResultadoEnum.GANADOR,participante);
        Pronostico pronostico2 = new Pronostico(partido2,polonia,ResultadoEnum.EMPATE,participante);

        //Array  de pronosticos para pasarle a persona

        Pronostico[] pronostico = {pronostico1,pronostico2};
        participante.setProdePersona(pronostico);

        //prueba
        assertEquals(1,participante.puntaje());
        assertEquals(2,participante.puntaje());

    }
}
