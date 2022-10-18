package javation;

import java.util.ArrayList;

public class Granero extends Edificio{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int nivel;
    private int capacidad;
    private ArrayList<Persona> personasG;
    private ArrayList<Integer> recursos;


    /*
    -----------
    Constructor
    -----------
    */
    public Granero(String nombre){
        this.nombre = nombre;
        this.nivel = 1;
        this.capacidad = 10;
        this.personasG = new ArrayList<Persona>();
        this.recursos = new ArrayList<Integer>();
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
        return personasG;
    }
    //Setter personas
    public void setPersonas(ArrayList<Persona> newPersonas){
        this.personasG = newPersonas;
    }

    //Getter recursos
    public ArrayList<Integer> getRecursos(){
        return recursos;
    }
    //Setter recursos
    public void setRecursos(ArrayList<Integer> newRecursos){
        this.recursos = newRecursos;
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
        int workG = 0; 
        int javalaresG = 0;
        int trigoG = 0;
        int tecnologiaG = 0;
        int hierroG = 0;

        if (granjeros(personasG) > personasG.size()/2){
            for (int i = 0; i < personasG.size(); i++){
                Persona tmpPersona = personasG.get(i);
                workG += tmpPersona.trabajo_realizado();
            }
            javalaresG = workG / personasG.size();
            trigoG = workG / (personasG.size()/2);
            tecnologiaG = cientificos(personasG)/2;
        }

        else {
            javalaresG = (-2) * personasG.size();
        }

        resources.set(0, javalaresG);
        resources.set(1, hierroG);
        resources.set(2, trigoG);
        resources.set(3, tecnologiaG);
        return resources;
    }

    //Mejorar
    /*  De tener los recursos necesarios para hacerlo, aumenta la capacidad del edificio en 3.
    De no tenerlos, Kao te avisa por pantalla.
    No retorna un valor.*/
    public void mejorar(){
        if (super.getJavalares() > 20 && super.getHierro() > 10 && super.getTrigo() > 15){
            this.setCapacidad(this.getCapacidad() + 3);
        }
        else{
            System.out.println("(✿ ๑ ◕ ︵ ◕ ๑)   -'Te hacen falta recursos unu'");
            try{System.in.read();}
                catch(Exception e){}
        }
    }

}