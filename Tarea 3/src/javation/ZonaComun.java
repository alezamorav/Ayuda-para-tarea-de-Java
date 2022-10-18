package javation;

import java.util.ArrayList;

public class ZonaComun extends Edificio{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int nivel;
    private int capacidad;
    private ArrayList<Persona> personasZC;


    /*
    -----------
    Constructor
    -----------
    */
    public ZonaComun(String nombre){
        this.nombre = nombre;
        this.nivel = 1;
        this.capacidad = 6;
        this.personasZC = new ArrayList<Persona>();
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
        return personasZC;
    }
    //Setter personas
    public void setPersonas(ArrayList<Persona> newPersonas){
        this.personasZC = newPersonas;
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
        int javalares = this.personasZC.size();
        int trigo = 0;
        int tecnologia = 0;
        int hierro = 0;

        resources.set(0, javalares);
        resources.set(1, hierro);
        resources.set(2, trigo);
        resources.set(3, tecnologia);
        return resources;
    }

    //Mejorar
    /*  De tener los recursos necesarios para hacerlo, aumenta la capacidad del edificio en 4.
    De no tenerlos, Kao te avisa por pantalla.
    No retorna un valor.*/
    public void mejorar(){
        if (super.getJavalares() > 15 && super.getHierro() > 10 && super.getTrigo() > 10 && super.getTecnologia() > 10){
            this.setCapacidad(this.getCapacidad() + 4);
        }
        else{
            System.out.println("(✿ ๑ ◕ ︵ ◕ ๑)   -'Te hacen falta recursos unu'");
            try{System.in.read();}
                catch(Exception e){}
        }
    }
    
}