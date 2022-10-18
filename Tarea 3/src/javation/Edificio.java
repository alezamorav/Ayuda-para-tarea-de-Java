package javation;

import java.util.ArrayList;

public abstract class Edificio extends Jugador{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int nivel;
    private int capacidad;
    private ArrayList<Persona> personasE;


    /*
    -----------
    Constructor
    -----------
    */
    public Edificio(String nombre){
        this.nombre = nombre;
        this.personasE = new ArrayList<Persona>();
    }

    public Edificio(){

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
        return personasE;
    }
    //Setter personas
    public void setPersonas(ArrayList<Persona> newPersonas){
        this.personasE = newPersonas;
    }


    /*
    -------
    Métodos
    -------
    */

    //Sacar persona
    /*  Toma el nombre de la persona que se desea sacar como parámetro y la quita de la lista de
    personas del edificio.
    No retorna un valor.*/
    public void sacar_persona(String nombreP){
        for (int i = 0; i < personasE.size(); i++){
            Persona tmpPersona = personasE.get(i);
            String tmpNombre = tmpPersona.getNombre();
            if (tmpNombre.equals(nombreP)){
                personasE.remove(i);
            }
        }
    }

    //Agregar persona
    /*  Toma una persona como parámetro y la agrega a la lista de personas del edificio.*/
    public void agregar_persona(Persona person){
        this.personasE.add(person);
    }

    //Producir (abstractra, no se define aquí)
    public abstract ArrayList<Integer> producir();

    //Mejorar (abstracta, no se define aquí)
    public abstract void mejorar();

    //Método cantidad_personas_granjeras, agregado para calcular los valores de producir
    /*  Recibe la lista de personas del edificio como parámetro y va sumando 1 según encuentre granjeros.
    Retorna la cantidad de personas que son granjeras de la lista del edificio.*/
    public int granjeros(ArrayList<Persona> personasE){
        int granjeros = 0;
        for (int i = 0; i < personasE.size(); i++){
            Persona tmpPersona = personasE.get(i);
            if (tmpPersona instanceof Granjero){
                granjeros += 1;
            }
        }
        return granjeros;
    }
    
    //Método cantidad_personas_científicas, agregado para calcular los valores de producir
    /*  Recibe la lista de personas del edificio como parámetro y va sumando 1 según encuentre científicos.
    Retorna la cantidad de personas que son científicas de la lista del edificio.*/
    public int cientificos(ArrayList<Persona> personasE){
        int cientificos = 0;
        for (int i = 0; i < personasE.size(); i++){
            Persona tmpPersona = personasE.get(i);
            if (tmpPersona instanceof Cientifico){
                cientificos += 1;
            }
        }
        return cientificos;
    }
    
    //Método cantidad_personas_herreras, agregado para calcular los valores de producir
    /*  Recibe la lista de personas del edificio como parámetro y va sumando 1 según encuntre herreros.
    Retorna la cantidad de personas que son herreras en la lista del edificio.*/
    public int herreros(ArrayList<Persona> personasE){
        int herreros = 0;
        for (int i = 0; i < personasE.size(); i++){
            Persona tmpPersona = personasE.get(i);
            if (tmpPersona instanceof Herrero){
                herreros += 1;
            }
        }
        return herreros;
    }

    //Método es_cientifico, agregado para calcular los valores pedidos de producir y visitar.
    /*  Recibe una persona como parámetro.
    Retorna 1 si la persona es científica y 0 si no lo es.*/
    public int esCientifico(Persona person){
        if (person instanceof Cientifico){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    //Método es_herrero, agregado para calcular los valores pedidos de producir y visitar.
    /*  Recibe una persona como parámetro.
    Retorna 1 si la persona es herrera y 0 si no lo es.*/
    public int esHerrero(Persona person){
        if (person instanceof Herrero){
            return 1;
        }
        else{
            return 0;
        }
    }
}