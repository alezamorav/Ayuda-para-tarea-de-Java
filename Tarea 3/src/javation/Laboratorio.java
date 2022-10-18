package javation;

import java.util.ArrayList;

public class Laboratorio extends Edificio{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int nivel;
    private int capacidad;
    private ArrayList<Persona> personasL;


    /*
    -----------
    Constructor
    -----------
    */
    public Laboratorio(String nombre){
        this.nombre = nombre;
        this.nivel = 1;
        this.capacidad = 5;
        this.personasL = new ArrayList<Persona>();
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

    //Getter nivel
    public int getNivel(){
        return nivel;
    }
    //Setter nivel
    public void setNivel(int newNivel){
        this.nivel = newNivel;
    }

    //Getter capacidad
    public int getCapacidad(){
        return capacidad;
    }
    //Setter capacidad
    public void setCapacidad(int newCapacidad){
        this.capacidad = newCapacidad;
    }
    //Getter personas
    public ArrayList<Persona> getPersonas(){
        return personasL;
    }
    //Setter personas
    public void setPersonas(ArrayList<Persona> newPersonas){
        this.personasL = newPersonas;
    }


    /*
    -------
    Métodos
    -------
    */

    //Producir
    /*  Genera los valores correspondientes de recursos generados del trabajo realizado por las personas del edificio.
    Retorna un ArrayList con estos valores.*/
    public ArrayList<Integer> producir(){

        ArrayList<Integer> resources = new ArrayList<Integer>();
        int workL = 0;
        int javalaresL = 0;
        int trigoL = 0;
        int tecnologiaL = 0;
        int hierroL = 0;

        if (granjeros(personasL) > (.75 * personasL.size())){
            for (int i = 0; i < personasL.size(); i++){
                Persona tmpPersona = personasL.get(i);
                workL += esCientifico(tmpPersona) * tmpPersona.trabajo_realizado();
            }
            javalaresL = workL / (personasL.size()/(personasL.size() - cientificos(personasL)));
            tecnologiaL = workL;
        }

        else{
            javalaresL = (-4) * personasL.size();
        }

        resources.set(0, javalaresL);
        resources.set(1, hierroL);
        resources.set(2, trigoL);
        resources.set(3, tecnologiaL);
        return resources;
    }

    //Mejorar
    /*  De tener los recursos necesarios para hacerlo, aumenta la capacidad del edificio en 2.
    De no tenerlos, Kao te avisa por pantalla.
    No retorna un valor.*/
    public void mejorar(){
        if (super.getJavalares() > 20 && super.getHierro() > 15 && super.getTecnologia() > 10){
            this.setCapacidad(this.getCapacidad() + 2);
        }
        else{
            System.out.println("(✿ ๑ ◕ ︵ ◕ ๑)   -'Te hacen falta recursos unu'");
            try{System.in.read();}
                catch(Exception e){}
        }
    }
    
}