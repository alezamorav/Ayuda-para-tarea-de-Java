package javation;

import java.util.ArrayList;

public class Museo implements Atraccion{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;


    /*
    -----------
    Constructor
    -----------
    */
    public Museo(String nombre){
        this.nombre = nombre;
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

    
    /*
    -------
    Métodos
    -------
    */

    //Visitar
    /*  Toma una lista de personas como parámetro.
    Calcula la cantidad de javalares que se generan al visitar la feria.
    Retorna la cantidad de javalares.*/
    public int visitar(ArrayList<Persona> people){

        int granjeros = 0;
        int cientificos = 0;
        int herreros = 0;

        for (int i = 0; i < people.size(); i++){
            Persona tmpPersona = people.get(i);
            if (tmpPersona instanceof Granjero){
                granjeros += 1;
            }
            else if (tmpPersona instanceof Cientifico){
                cientificos += 1;
            }
            else if (tmpPersona instanceof Herrero){
                herreros += 1;
            }
        }

        int javalares = 4 * (int)Math.floorDiv(granjeros, 4) + 4 * cientificos + 4 * (int)Math.floorDiv(herreros, 2);
        return javalares;
    }
    
}
