package javation;

public abstract class Persona extends Jugador {

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int edad;
    private int nivel;
    private int productividad;


    /*
    -----------
    Constructor
    -----------
    */
    public Persona(String name) {
        this.nombre = name;
        this.edad = 1;
        this.nivel = 1;
        this.productividad = 1;
    }

    public Persona(){

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

    //Getter edad
    public int getEdad(){
        return edad;
    }
    //Setter edad
    public void setEdad(int newEdad){
        this.edad = newEdad;
    }

    //Getter nivel
    public int getNivel(){
        return nivel;
    }
    //Setter nivel
    public void setNivel(int newNivel){
        this.nivel = newNivel;
    }

    //Getter productividad
    public int getProductividad(){
        return productividad;
    }
    //Setter productividad
    public void setProductividad(int newProductividad){
        this.productividad = newProductividad;
    }
    

    /*
    -------
    Métodos
    -------
    */

    //Envejecer
    /*  Recibe un entero con la edad de la persona que se desea envejecer como parámetro y retorna la edad + 1.*/
    public int envejecer(int age){
        return age + 1;
    }

    //Mejorar (abstracto, sólo declaración)
    public abstract void mejorar();

    //Trabajo realizado (abstracto, sólo declaración)
    public abstract int trabajo_realizado();




}