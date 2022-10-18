package javation;

public class Cientifico extends Persona{

    /*
    ---------
    Atributos
    ---------
    */
    private String nombre;
    private int productividad;
    private int edad;
    private int nivel;

    /*
    -----------
    Constructor
    -----------
    */
    public Cientifico(String nombre){
        this.nombre = nombre;
        this.productividad = 10;
        this.edad = 24;
        this.nivel = 1;
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

    //Getter productividad
    public int getProductividad(){
        return productividad;
    }
    //Setter productividad
    public void setProductividad(int newProductividad){
        this.productividad = newProductividad;
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
    //Setter edad
    public void setNivel(int newNivel){
        this.nivel = newNivel;
    }


    /*
    -------
    Métodos
    -------
    */

    //Mejorar
    /*  De tener la cantidad de javalares necesarios, aumenta la productividad del científico en 1
    y le resta los javalares correspondientes al costo de mejorar.
    De no tener javalares suficientes, Kao te lo avisa.*/
    public void mejorar(){
        if (super.getJavalares() > 15){
            this.nivel += 1;
            this.setProductividad(this.getProductividad() + 1);
            super.setJavalares(super.getJavalares() - 15);
        }
        else{
            System.out.println("(✿ ๑ ◕ ︵ ◕ ๑)   -'Te hacen falta javalares unu'");
        }
    }

    //Trabajo realizado
    /*  Crea un entero para calcular el trabajo de la manera deseada y lo retorna.
    No recibe parámetros.*/
    public int trabajo_realizado(){
        int trabajo = super.getProductividad() * 3 + 3;
        return trabajo;
    }
    
}
