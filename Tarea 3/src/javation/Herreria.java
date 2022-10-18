package javation;

import java.util.ArrayList;

public class Herreria extends Edificio{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int nivel;
    private int capacidad;
    private ArrayList<Persona> personasH;


    /*
    -----------
    Constructor
    -----------
    */
    public Herreria(String nombre){
        this.nombre = nombre;
        this.nivel = 1;
        this.capacidad = 8;
        this.personasH = new ArrayList<Persona>();
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
        return personasH;
    }
    //Setter personas
    public void setPersonas(ArrayList<Persona> newPersonas){
        this.personasH = newPersonas;
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
        int workHh = 0;
        int workHc = 0;
        int javalaresH = 0;
        int trigoH = 0;
        int tecnologiaH = 0;
        int hierroH = 0;

        for (int i = 0; i < personasH.size(); i++){
            Persona tmpPersona = personasH.get(i);
            workHh += esHerrero(tmpPersona) * tmpPersona.trabajo_realizado();
        }

        for (int j = 0; j < personasH.size(); j++){
            Persona tmpPersona = personasH.get(j);
            workHc += esCientifico(tmpPersona) * tmpPersona.trabajo_realizado() * 1/3;
        }

        javalaresH = workHh / personasH.size();
        hierroH = workHh / (personasH.size() - herreros(personasH));
        tecnologiaH = workHc / cientificos(personasH);

        resources.set(0, javalaresH);
        resources.set(1, hierroH);
        resources.set(2, trigoH);
        resources.set(3, tecnologiaH);
        return resources;
    }

    //Mejorar
    /*  De tener los recursos necesarios para hacerlo, aumenta la capacidad del edificio en 4.
    De no tenerlos, Kao te avisa por pantalla.
    No retorna un valor.*/
    public void mejorar(){
        if (super.getJavalares() > 20 && super.getHierro() > 20){
            this.setCapacidad(this.getCapacidad() + 4);
        }
        else{
            System.out.println("(✿ ๑ ◕ ︵ ◕ ๑)   -'Te hacen falta recursos unu'");
            try{System.in.read();}
                catch(Exception e){}
        }
    }
    
}