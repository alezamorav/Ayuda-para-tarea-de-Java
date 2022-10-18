package javation;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador extends Javation{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int javalares;
    private int hierro;
    private int trigo;
    private int tecnologia;
    private ArrayList<Persona> personas;
    private ArrayList<Edificio> edificios;
    private ArrayList<Atraccion> atracciones; //Añadido por comodidad
    private ArrayList<Feria> ferias;
    private ArrayList<Museo> museos;
    private ArrayList<Javapato> javapatos;


    /*
    -----------
    Constructor
    -----------
    */
    public Jugador(String nombre, Scanner scan){
        this.nombre = nombre;
        this.javalares = 30;
        this.hierro = 15;
        this.trigo = 10;
        this.tecnologia = 6;
        this.personas = new ArrayList<Persona>();
        this.edificios = new ArrayList<Edificio>();
        this.ferias = new ArrayList<Feria>();
        this.museos = new ArrayList<Museo>();
        this.javapatos = new ArrayList<Javapato>();
    }

    public Jugador(){

    }


    /*
    -----------------
    Getters y Setters
    -----------------
    */
        
    //Getter nombre
    public String getNombre(){
        return nombre;
    }
    //Setter nombre
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }

    //Getter javalares
    public int getJavalares(){
        return javalares;
    }
    //Setter javalares
    public void setJavalares(int newJavalares){
        this.javalares = newJavalares;
    }

    //Getter hierro 
    public int getHierro(){
        return hierro;
    }
    //Setter hierro
    public void setHierro(int newHierro){
        this.hierro = newHierro;
    }

    //Getter trigo
    public int getTrigo(){
        return trigo;
    }
    //Setter trigo
    public void setTrigo(int newTrigo){
        this.trigo = newTrigo;
    } 

    //Getter tecnología
    public int getTecnologia(){
        return tecnologia;
    }
    //Setter tecnología
    public void setTecnologia(int newTecnologia){
        this.tecnologia = newTecnologia;
    }

    //Getter personas
    public ArrayList<Persona> getPersonas(){
        return personas;
    }
    //Setter personas
    public void setPersonas(ArrayList<Persona> newPersonas){
        this.personas = newPersonas;
    }

    //Getter edificios
    public ArrayList<Edificio> getEdificios(){
        return edificios;
    }
    //Setter edificios
    public void setEdificios(ArrayList<Edificio> newEdificios){
        this.edificios = newEdificios;
    }

    //Getter atracciones
    public ArrayList<Atraccion> getAtracciones(){
        return atracciones;
    }
    //Setter atracciones
    public void setAtracciones(ArrayList<Atraccion> newAtracciones){
        this.atracciones = newAtracciones;
    }

    //Getter ferias
    public ArrayList<Feria> getFerias(){
        return ferias;
    }
    //Setter ferias
    public void setFerias(ArrayList<Feria> newFerias){
        this.ferias = newFerias;
    }

    //Getter museos
    public ArrayList<Museo> getMuseos(){
        return museos;
    }
    //Setter museos
    public void setMuseos(ArrayList<Museo> newMuseos){
        this.museos = newMuseos;
    }

    //Getter javapatos
    public ArrayList<Javapato> getJavapatos(){
        return javapatos;
    }
    //Setter javapatos
    public void setJavapatos(ArrayList<Javapato> newJavapatos){
        this.javapatos = newJavapatos;
    }


    /*
    -------
    Métodos
    -------
    */

    //Sacar persona
    /*  Toma un string como parámetro con el nombre de la persona que se desea sacar.
    Parsea la lista de personas, creando una persona temporal y guandando en otra variable temporal su nombre,
    saca la persona que tiene el nombre correspondiente.*/
    public void sacar_persona(String perName, ArrayList<Persona> personas){
        for (int i = 0; i < personas.size(); i++){
            //Persona en el indice i de la lista de personas ingresada.
            Persona tmpPersona = personas.get(i);
            //Nombre de la Persona i de la lista de personas.
            String tmpPerName = tmpPersona.getNombre();
            if (tmpPerName.equals(perName)){
                personas.remove(i);
            }
        }
    }

    //Agregar persona
    /*  Toma una persona y una lista como parámetros y agrega la persona a la lista de personas entregada.*/
    public void agregar_persona(Persona person){
        personas.add(person);
    }

    //Sacar edificio
    /*  Toma un string con el nombre del edificio como parámetro.
    Parsea la lista de edificios, creando un edificio temporal y guardando su nombre en una variable temporal,
    saca del arraylist el edificio con el nombre correspondiente.*/
    public void sacar_edificio(String ediName){
        for (int i = 0; i < edificios.size(); i++){
            //Edificio en el indice i de la lista de edificios.
            Edificio tmpEdificio = edificios.get(i);
            //Nombre del Edificio i de la lista de edificios.
            String tmpEdiName = tmpEdificio.getNombre();
            if (tmpEdiName.equals(ediName)){
                edificios.remove(i);
            }
        }
    }

    //Agregar edificio
    /*  Toma un edificio como parámetro y lo agrega a la lista de edificios.*/
    public void agregar_edificio(Edificio building){
        edificios.add(building);
    }

    //Sacar atracción
    /*  Toma un string con el nombre de la atracción como parámetro.
    Parsea la lista de atracciones totales, y, según qué tipo de atracción es, busca si el nombre de éste coincide 
    con el parámetro. De ser así, saca la atracción de la lista correspondiente.*/
    public void sacar_atraccion(String atrName){

        for (int i = 0; i < atracciones.size(); i++){
            //Atracción en la posición i de la lista de atracciones.
            Atraccion tmpAtraccion = atracciones.get(i);

            //Si la atracción es una Feria.
            if (tmpAtraccion instanceof Feria){
                for (int j = 0; j < ferias.size(); j++){
                    //Feria en la posición j de la lista de ferias.
                    Feria tmpFeria = ferias.get(j);
                    //Nombre de la Feria en posición j de la lista.
                    String tmpFerName = tmpFeria.getNombre();
                    if (tmpFerName.equals(atrName)){
                        ferias.remove(j);
                    }
                }

            }

            //Si la atraccción es un Museo.
            else if (tmpAtraccion instanceof Museo){
                for (int k = 0; k < museos.size(); k++){
                    //Museo en la posición k de la lista de museos.
                    Museo tmpMuseo = museos.get(k);
                    //Nombre del Museo en la posición k de la lista de museos.
                    String tmpMusName = tmpMuseo.getNombre();
                    if (tmpMusName.equals(atrName)){
                        museos.remove(k);
                    }
                }
            }

            //Si la atracción es un Javapato.
            else if (tmpAtraccion instanceof Javapato){
                for (int l = 0; l < javapatos.size(); l++){
                    //Javapato en la posición l de la lista de javapatos.
                    Javapato tmpJavapato = javapatos.get(l);
                    //Nombre del javapato en la posición l de la lista de javapatos.
                    String tmpJavName = tmpJavapato.getNombre();
                    if (tmpJavName.equals(atrName)){
                        javapatos.remove(l);
                    }
                }
            }
        }
    }

    //Agregar atracción, añadido por comodidad para facilitar sacar_atracción.
    /*  Toma una atracción como parámetro y la agrega a un ArrayList con todas las atracciones.*/
    public void agregar_atraccion(Atraccion attraction){
        atracciones.add(attraction);
    }

    //Agregar feria
    /*  Toma una feria como parámetro y la agrega a la lista de ferias.*/
    public void agregar_feria(Feria fair){
        ferias.add(fair);
    }

    //Agregar museo
    /*  Toma una museo como parámetro y lo agrega a la lista de museos.*/
    public void agregar_museo(Museo museum){
        museos.add(museum);
    }

    //Agregar javapato
    /*  Toma un javapato como parámetro y lo agrega a la lista de javapatos.*/
    public void agregar_javapato(Javapato javap){
        javapatos.add(javap);
    }

}