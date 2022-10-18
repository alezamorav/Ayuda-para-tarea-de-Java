package javation;

import java.util.Scanner;
import java.util.ArrayList;

public class Javation {
    
    /*
    -----------
    Constructor
    -----------
    */
    public Javation(){

    }


    /*
    ----
    Main
    ----
    */
    public static void main(String args[]){

        //Scanner
        Scanner scan = new Scanner(System.in);

        //Título
        System.out.println("                        -Tired Students Presents-");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("---Javation V: el Comienzo del Retorno de la Venganza de Java: el Juego---");
        System.out.println("--------------------------------------------------------------------------");
        try{System.in.read();}
            catch(Exception e){}
        
        //Comienzo
        //Empezamos con un personaje durmiendo, lo podemos despertar para continuar o dejar que siga durmiendo, no tiene función práctica para la tarea.
        while(true){
            System.out.println("(ᴗ˳ᴗ)   -'zzz...'");
            System.out.println("Despertar? [y/n]");
            String despertar = scan.nextLine();
            if(despertar.equalsIgnoreCase("y")){
                break;
            }else if(despertar.equalsIgnoreCase("n")){
                break;
            }else{
                System.out.println("Oye! Ese input no se acepta!");
                try{System.in.read();}
                    catch(Exception e){}
            }
        }

        System.out.println("(。･o･｡)! !   -*EEEP*");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("( ◕ ‿ ◕)/✿   -'Sorry por eso, no esperaba un nuevo jugador!'");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ◡ ‿ ◡)   -'Ha pasado ~tanto~ tiempo...");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ◕ ‿ ◕)   -'...'");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ◕ ‿ ◕)   -'...'");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ◕ _ ◕)   -'...'");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ⊙ ＿⊙’)   -'Erm...'");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ☉ ｡ ☉)   -'OH!'");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ◕ ▽ ◕)ノ   -'Te doy una gran bienvenida a 'Javation V: el Comienzo del Retorno de la Venganza de Java: el Juego''");
        try{System.in.read();}
            catch(Exception e){}
        System.out.println("(✿ ◕ ‿ ◕)   -'¿Cuál es tu nombre?'");

        //Ingreso de nombre Jugador
        System.out.print("Ingrese su nombre: ");
        String nombre = scan.nextLine();

        //Se crea la clase Jugador 'player' y se le asigna el nombre 'name' ingresado.
        Jugador player = new Jugador(nombre, scan);
        System.out.println("(✿ ◕ ◇ ◕)?   -'" + player.getNombre() + "?'");
        try{System.in.read();}
            catch(Exception e){}

        //Esto es para que el personaje dé un comentario acerca de tu nombre, no tiene ninguna función práctica para la tarea.
        int min = 0;
        int max = 3;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        switch(random_int){

            case 0:
                System.out.println("(✿ ♡ ∀ ♡)   -'Wow! Ese es mi nombre favorito!'");
                try{System.in.read();}
                    catch(Exception e){}
                System.out.println("╰(✿ ^ ⌣ ^)╯♡   -'Vamos a divertirnos mucho!'");
                try{System.in.read();}
                    catch(Exception e){}
                break;

            case 1:
                System.out.println("(✿ ◠ ‿ ◠)   -'Un gusto conocerte!'");
                try{System.in.read();}
                    catch(Exception e){}
                break;

            case 2:
                System.out.println("(✿;・□・）   -'Qué nombre más raro!'");
                try{System.in.read();}
                    catch(Exception e){}
                System.out.println("(✿灬º 艸º灬)   -'Oops, sorry!'");
                try{System.in.read();}
                    catch(Exception e){}
                break;

            case 3:
                System.out.println("(✿╬ Ò ‸ Ó)   -'Oh no! Yo odio ese nombre!'");
                try{System.in.read();}
                    catch(Exception e){}
                System.out.println("(✿ ˘ _ ˘)   -'Respira hondo, debes ser profesional.'");
                try{System.in.read();}
                    catch(Exception e){}
                break;
        }

        System.out.println("ﾟ･ヾ╲(✿ ｡ ◕ ‿ ◕ ｡)╱･ﾟ   -'Ahora estamos listos para comenzar!'");
        try{System.in.read();}
            catch(Exception e){}
        
        //Cominezo real del juego

        //Menu recursivo
        while(true){
            System.out.println("(✿ ◕ ‿ ◕)    -'Qué te gustaría hacer?'");
            try{System.in.read();}
                catch(Exception e){}

            //Menu principal
            System.out.println("-MENU PRINCIPAL-");
            System.out.println("1. Menu Personas.");
            System.out.println("2. Menu Edificios.");
            System.out.println("3. Menu Atracciones.");
            System.out.println("4. Hablar contigo.");
            System.out.println("5. Terminar turno.");
            System.out.println("6. Salir del juego.");

            int selec = scan.nextInt();
            switch(selec){
                case 1: //Menu Personas

                    System.out.println("(✿ ◕ ▽ ◕)ノ    -'Aquí podrás crear personas y decidir qué hacer con ellas.'");
                    System.out.println("(✿ ◕ ‿ ◕)   -'Qué te gustaría hacer?'");
                    try{System.in.read();}
                        catch(Exception e){}

                    System.out.println("-MENU PERSONAS-");
                    System.out.println("1. Crear Persona.");
                    System.out.println("2. Mover Persona.");
                    System.out.println("3. Mejorar Persona.");
                    System.out.println("4. Mostrar Personas.");
                    System.out.println("5. Volver al Menu Principal.");

                    int choice = scan.nextInt();
                    switch(choice){

                        case 1: //Crear Persona

                            System.out.println("(✿ ◕ ‿ ◕)  -'Oh! Quieres crear una persona?'");
                            try{System.in.read();}
                                catch(Exception e){}
                            System.out.println("(✿ ◕ ‿ ◕)  -'Genial!'");
                            try{System.in.read();}
                                catch(Exception e){}

                            System.out.println("(✿ ◕ ‿ ◕)  -'Qué tipo de persona deseas crear?'");
                            try{System.in.read();}
                                catch(Exception e){}

                            System.out.println("-Tipos de Personas-");
                            System.out.println("1. Granjero.");
                            System.out.println("2. Científico.");
                            System.out.println("3. Herrero.");
                            System.out.println("4. Volver.");

                            int tipoP = scan.nextInt();
                            switch(tipoP){
                                case 1: //Crear Granjeros
                                    if (player.getJavalares() > 5){
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre deseas que tenga el granjero?'");
                                        System.out.println("Nombre granjero: ");
                                        scan.nextLine();//Al tener un scan.nextInt() antes se debe consumir el \n que éste deja de ésta manera, se repite varias veces.
                                        String nomG = scan.nextLine();
                                        Persona gran = new Granjero(nomG);
                                        player.agregar_persona(gran);
                                        player.setJavalares(player.getJavalares() - 5);
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado un granjero!'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    else{
                                        System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos suficientes para crear un Granjero.'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    break;
                                    

                                case 2: //Crear Científico
                                    if (player.getJavalares() > 8){
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre deseas que tenga el científico?'");
                                        System.out.println("Nombre científico: ");
                                        scan.nextLine();
                                        String nomC = scan.nextLine();
                                        Persona cien = new Cientifico(nomC);
                                        player.agregar_persona(cien);
                                        player.setJavalares(player.getJavalares() - 8);
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado un científico!'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    else{
                                        System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos suficientes para crear un Científico.'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    break;
                                

                                case 3: //Crear Herrero
                                    if (player.getJavalares() > 6){
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre deseas que tenga el herrero?'");
                                        System.out.println("Nombre herrero: ");
                                        scan.nextLine();
                                        String nomH = scan.nextLine();
                                        Persona herr = new Herrero(nomH);
                                        player.agregar_persona(herr);
                                        player.setJavalares(player.getJavalares() - 6);
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado un herrero!'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    else{
                                        System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos suficientes para crear un Herrero.'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    break;


                                case 4: //Volver
                                    break;

                            }
                            continue;

                        
                        case 2: //Mover Persona
                            System.out.println("(✿ ◕ ‿ ◕)  -'Puedes agregar o quitar personas a distintos lugares!'");
                            try{System.in.read();}
                                catch(Exception e){}
                            System.out.println("(✿ ◕ ‿ ◕)  -'A quién deseas mover?'");
                            System.out.println("Ingrese el nombre de la persona que desea mover: ");

                            scan.nextLine();
                            String perMov = scan.nextLine();

                            System.out.println("(✿ ◕ ‿ ◕)  -'Qué deseas hacer con esta persona?'");
                            try{System.in.read();}
                                catch(Exception e){}
                            System.out.println("-Opciones-");
                            System.out.println("1. Agregar persona.");
                            System.out.println("2. Sacar persona.");
                            System.out.println("3. Volver.");

                            int opcion = scan.nextInt();

                            switch(opcion){
                                case 1: //Agregar Persona
                                    System.out.println("(✿ ◕ ‿ ◕)  -'Donde?'");
                                    System.out.println("Ingrese el nombre del edificio a donde desea mover la persona: ");
                                    scan.nextLine();
                                    String nomEd = scan.nextLine();
                                    for (int i = 0; i < player.getEdificios().size(); i++){
                                        Edificio tmpEdificio = player.getEdificios().get(i);
                                        String tmpNomEd = tmpEdificio.getNombre();
                                        if (tmpNomEd.equals(nomEd)){
                                            for (int j = 0; j < player.getPersonas().size(); j++){
                                                Persona tmpPersona = player.getPersonas().get(j);
                                                String tmpNomPer = tmpPersona.getNombre();
                                                if (tmpNomPer.equals(perMov) && tmpEdificio.getPersonas().size() < tmpEdificio.getCapacidad()){
                                                    tmpEdificio.agregar_persona(tmpPersona);
                                                    player.sacar_persona(tmpNomPer, player.getPersonas());
                                                }
                                                else{
                                                    System.out.println("(✿ ◕ ‿ ◕)  -'No queda espacio en este edificio.'");
                                                }
                                            }
                                        }
                                    }
                                    continue;

                                
                                case 2: //Sacar Persona
                                    for (int i = 0; i < player.getEdificios().size(); i ++){
                                        Edificio tmpEdificio = player.getEdificios().get(i);
                                        ArrayList<Persona> listPer = tmpEdificio.getPersonas();
                                        for (int j = 0; j < listPer.size(); j++){
                                            Persona per = listPer.get(j);
                                            String nomPer = per.getNombre();
                                            if (nomPer.equals(perMov)){
                                                tmpEdificio.sacar_persona(perMov);
                                                player.agregar_persona(per);
                                            }
                                        }
                                    }
                                    System.out.println("(✿ ◕ ‿ ◕)  -'Persona sacada!'");
                                    try{System.in.read();}
                                        catch(Exception e){}
                                    
                                    continue;


                                case 3: //Volver
                                    break;

                            }
                            continue;
                            
                        
                        case 3: //Mejorar Persona
                            System.out.println("(✿ ◕ ‿ ◕)  -'Qué persona deseas mejorar?'");
                            System.out.println("Ingrese el nombre de la persona que desea mejorar: ");
                            scan.nextLine();
                            String nomMej = scan.nextLine();

                            for (int i = 0; i < player.getPersonas().size(); i++){
                                Persona tmpPersona = player.getPersonas().get(i);
                                String tmpNom = tmpPersona.getNombre();
                                if (tmpNom.equals(nomMej)){
                                    tmpPersona.mejorar();
                                }
                            }
                            continue;


                        case 4: //Mostrar Personas
                            System.out.println("(✿ ◕ ‿ ◕)  -'Mostraremos las personas no asignadas a un Edificio!'");
                            try{System.in.read();}
                                catch(Exception e){}
                            for (int i = 0; i < player.getPersonas().size(); i++){
                                Persona tmpPersona = player.getPersonas().get(i);
                                String tmpNom = tmpPersona.getNombre();
                                System.out.println(tmpNom);
                            }
                            continue;

                        
                        case 5: //Volver
                            break;
                            
                    }
                    continue;

                
                case 2: //Menu edificios
                    
                    System.out.println("(✿ ◕ ▽ ◕)ノ    -'Aquí podrás crear edificios y decidir qué hacer con ellos.'");
                    System.out.println("(✿ ◕ ‿ ◕)   -'Qué te gustaría hacer?'");
                    try{System.in.read();}
                        catch(Exception e){}

                    System.out.println("-MENU EDIFICIOS-");
                    System.out.println("1. Crear Edificio.");
                    System.out.println("2. Mejorar Edificio.");
                    System.out.println("3. Mostrar Edificios");;
                    System.out.println("4. Volver al Menu Principal");

                    int choice2 = scan.nextInt();
                    switch(choice2){

                        case 1: //Crear Edificios
                            System.out.println("(✿ ◕ ‿ ◕)  -'Crear edificios te ayudará a generar más recursos!'");
                            try{System.in.read();}
                                catch(Exception e){}
                            System.out.println("(✿ ◕ ‿ ◕)  -'Qué tipo de edificio te gustaría crear?'");
                            System.out.println("-Tipos de Edificios-");
                            System.out.println("1. Granero.");
                            System.out.println("2. Laboratorio.");
                            System.out.println("3. Herrería.");
                            System.out.println("4. Zona Común.");
                            System.out.println("5. Volver.");

                            int tipoE = scan.nextInt();
                            switch(tipoE){

                                case 1: //Granero
                                    if (player.getJavalares() > 10 && player.getHierro() > 5 && player.getTrigo() > 5){
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre deseas que tenga el granero?'");
                                        System.out.println("Ingrese el nombre del granero: ");
                                        scan.nextLine();
                                        String nomGr = scan.nextLine();
                                        Edificio gra = new Granero(nomGr);
                                        player.agregar_edificio(gra);

                                        player.setJavalares(player.getJavalares() - 10);
                                        player.setHierro(player.getHierro() - 5);
                                        player.setTrigo(player.getTrigo() - 5);
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado un granero!'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    else{
                                        System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos necesarios para crear un Granero.'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    continue;

                                case 2: //Laboratorio
                                    if (player.getJavalares() > 30 && player.getHierro() > 10 && player.getTecnologia() > 6){
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre deseas que tenga el laboratorio?'");
                                        System.out.println("Ingrese el nombre del laboratorio: ");
                                        scan.nextLine();
                                        String nomLa = scan.nextLine();
                                        Edificio lab = new Laboratorio(nomLa);
                                        player.agregar_edificio(lab);

                                        player.setJavalares(player.getJavalares() - 30);
                                        player.setHierro(player.getHierro() - 10);
                                        player.setTecnologia(player.getTecnologia() - 6);
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado un laboratorio!'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    else{
                                        System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos necesarios para crear un Laboratorio.'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    continue;
                                
                                case 3: //Herrería
                                    if (player.getJavalares() > 20 && player.getHierro() > 20){
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre deseas que tenga la herrería?'");
                                        System.out.println("Ingrese el nombre de la herrería: ");
                                        scan.nextLine();
                                        String nomHe = scan.nextLine();
                                        Edificio her = new Herreria(nomHe);
                                        player.agregar_edificio(her);

                                        player.setJavalares(player.getJavalares() - 20);
                                        player.setHierro(player.getHierro() - 20);
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado una herrería!'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    else{
                                        System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos necesarios para crear una Herrería.'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    
                                    }
                                    continue;

                                case 4: //Zona Común
                                    if (player.getJavalares() > 15 && player.getHierro() > 3 && player.getTrigo() > 3 && player.getTecnologia() > 3){
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre deseas que tenga la zona común?'");
                                        System.out.println("Ingrese el nombre de la zona común: ");
                                        scan.nextLine();
                                        String nomZC = scan.nextLine();
                                        Edificio zoca = new Laboratorio(nomZC);
                                        player.agregar_edificio(zoca);

                                        player.setJavalares(player.getJavalares() - 15);
                                        player.setHierro(player.getHierro() - 3);
                                        player.setTrigo(player.getTrigo() - 3);
                                        player.setTecnologia(player.getTecnologia() - 3);
                                        System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado una zona común!'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    }
                                    else{
                                        System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos necesarios para crear una Zona Común.'");
                                        try{System.in.read();}
                                            catch(Exception e){}
                                    
                                    }
                                    continue;

                                case 5: // Volver
                                    break;
                            }
                            continue;


                        case 2: //Mejorar Edificio
                            System.out.println("(✿ ◕ ‿ ◕)  -'Qué edificio deseas mejorar?'");
                            System.out.println("Ingrese el nombre del edificio que desea mejorar: ");
                            scan.nextLine();
                            String nomMej = scan.nextLine();

                            for (int i = 0; i < player.getEdificios().size(); i++){
                                Edificio tmpEdificio = player.getEdificios().get(i);
                                String tmpNom = tmpEdificio.getNombre();
                                if (tmpNom.equals(nomMej)){
                                    tmpEdificio.mejorar();
                                }
                            }
                            continue;


                            
                        case 3: //Mostrar Edificios
                            System.out.println("(✿ ◕ ‿ ◕)  -'Mostraremos los nombres de todos los edificios!'");
                            try{System.in.read();}
                                catch(Exception e){}
                            for (int i = 0; i < player.getEdificios().size(); i++){
                                Edificio tmpEdificio = player.getEdificios().get(i);
                                String tmpNomEd = tmpEdificio.getNombre();
                                System.out.println(tmpNomEd);
                            }
                            continue;


                        case 4: //Volver
                            break;
                            
                    }
                    continue;


                case 3: //Menu Atracciones

                    System.out.println("(✿ ◕ ▽ ◕)ノ    -'Aquí podrás crear atracciones!'");
                    System.out.println("(✿ ◕ ‿ ◕)   -'Qué tipo de atracción te gustaría crear?'");
                    try{System.in.read();}
                        catch(Exception e){}

                    System.out.println("-Tipos de Atracciones-");
                    System.out.println("1. Feria.");
                    System.out.println("2. Museo.");
                    System.out.println("3. Javapato.");
                    System.out.println("4. Mostrar Atracciones.");
                    System.out.println("5. Volver al Menu Principal.");

                    int choice3 = scan.nextInt();
                    switch(choice3){
                        case 1: //Feria
                            if (player.getJavalares() > 50 && player.getHierro() > 25 && player.getTrigo() > 25 && player.getTecnologia() > 10){
                                System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre le quieres poner a la feria?'");
                                System.out.println("Ingrese el nombre de la feria: ");
                                scan.nextLine();
                                String nomFe = scan.nextLine();
                                Atraccion ferAt = new Feria(nomFe);
                                Feria fer = (Feria) ferAt;
                                player.agregar_atraccion(fer);
                                player.agregar_feria(fer);

                                player.setJavalares(player.getJavalares() - 50);
                                player.setHierro(player.getHierro() - 25);
                                player.setTrigo(player.getTrigo() - 25);
                                player.setTecnologia(player.getTecnologia() - 10);
                                System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado una feria!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                            }
                            else{
                                System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos necesarios para crear una Feria.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                            }
                            continue;
                            

                        case 2: //Museo
                            if (player.getJavalares() > 50 && player.getHierro() > 30 && player.getTrigo() > 3 && player.getTecnologia() > 30){
                                System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre le quieres poner al museo?'");
                                System.out.println("Ingrese el nombre del museo: ");
                                scan.nextLine();
                                String nomMu = scan.nextLine();
                                Atraccion musAt = new Museo(nomMu);
                                Museo mus = (Museo) musAt;
                                player.agregar_atraccion(mus);
                                player.agregar_museo(mus);

                                player.setJavalares(player.getJavalares() - 50);
                                player.setHierro(player.getHierro() - 30);
                                player.setTrigo(player.getTrigo() - 3);
                                player.setTecnologia(player.getTecnologia() - 30);
                                System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado un museo!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                            }
                            else{
                                System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos necesarios para crear un Museo.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                            }
                            continue;


                        case 3: //Javapato
                            if (player.getJavalares() > 50 && player.getHierro() > 40 && player.getTecnologia() > 20){
                                System.out.println("(✿ ◕ ‿ ◕)  -'Qué nombre le quieres poner al javapato?'");
                                System.out.println("Ingrese el nombre del javapato: ");
                                scan.nextLine();
                                String nomJP = scan.nextLine();
                                Atraccion jpAt = new Javapato(nomJP);
                                Javapato jp = (Javapato) jpAt;
                                player.agregar_atraccion(jp);
                                player.agregar_javapato(jp);

                                player.setJavalares(player.getJavalares() - 50);
                                player.setHierro(player.getHierro() - 40);
                                player.setTecnologia(player.getTecnologia() - 20);
                                System.out.println("(✿ ◕ ‿ ◕)  -'Genial! Has creado un javapato!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                            }
                            else{
                                System.out.println("(✿ ◕ ‿ ◕)  -'No tienes recursos necesarios para crear un Museo.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                            }
                            continue;
                            
                        
                        case 4: //Mostrar Atracciones
                            System.out.println("(✿ ◕ ‿ ◕)  -'Mostraremos los nombres de todas las atracciones!'");
                            try{System.in.read();}
                                catch(Exception e){}
                                
                            for (int i = 0; i < player.getAtracciones().size(); i++){
                                Atraccion tmpAtraccion = player.getAtracciones().get(i);
                                if (tmpAtraccion instanceof Feria){
                                    Feria tmpF = (Feria) tmpAtraccion;
                                    System.out.println(tmpF.getNombre()); 
                                }
                                else if (tmpAtraccion instanceof Museo){
                                    Museo tmpM = (Museo) tmpAtraccion;
                                    System.out.println(tmpM.getNombre());
                                }
                                else if (tmpAtraccion instanceof Javapato){
                                    Javapato tmpJP = (Javapato) tmpAtraccion;
                                    System.out.println(tmpJP.getNombre());
                                }
                            }
                            continue;


                        case 5: //Volver al Menu Principal
                            break;

                    }
                    continue;

                
                case 4: //Relleno, datos curiosos, etc. No tiene función práctica en términos de la tarea.

                    System.out.println("(✿ ◕ ‿ ◕)  -*EH!*");
                    try{System.in.read();}
                        catch(Exception e){}
                    System.out.println("(✿ ◕ ‿ ◕)  -'Q-Quieres hablar conmigo?'");
                    System.out.println("[y/n]: ");

                    scan.nextLine();
                    String ans = scan.nextLine();
                    if(ans.equalsIgnoreCase("y")){

                        System.out.println("(✿ ◕ ‿ ◕)  -'Mmmmmm bueno.... te puedo decir.......'");
                        try{System.in.read();}
                            catch(Exception e){}
                        System.out.println("(✿ ◕ ‿ ◕)  -'Ya sé!'");
                        try{System.in.read();}
                            catch(Exception e){}

                        int min2 = 0;
                        int max2 = 9;
                        int random_int2 = (int)Math.floor(Math.random()*(max2-min2+1)+min2);

                        switch(random_int2){
                            case 0:
                                System.out.println("(✿ ◕ ‿ ◕)  -'Te gusta el nombre 'Javation V: el Comienzo del Retorno de la Venganza de Java: el Juego''"); 
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Yo lo inventé!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Me siento muy orgullosa de esto...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;

                            case 1:
                                System.out.println("(✿ ◕ ‿ ◕)  -'No se supone que te debería decir esto pero...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Mi nombre es Kao!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Espero que lo puedas mantener en secreto...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;
                            
                            case 2:
                                System.out.println("(✿ ◕ ‿ ◕)  -'Oye...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Tu sabes lo que es un Javapato?'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Porque yo no tengo ni idea!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;

                            case 3:
                                System.out.println("(✿ ◕ ‿ ◕)  -'Tu conoces a Patode Hule?'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Yo digo que debería pedirle ayuda a otras personas ya.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Siento que ya lo hemos ayudado lo suficiente, no?'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -Xdxd.");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;

                            case 4:
                                System.out.println("(✿ ◕ ‿ ◕)  -'Sabías tu que mi creadora no tuvo tiempo de revisar el correcto funcionamiento de este juego?'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Es veerdad!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Oh! Me dice que te diga que tengas piedad con ella.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Lo que sea que eso significa...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;

                            case 5:
                                System.out.println("(✿ ◕ ‿ ◕)  -'...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Se me olvidó.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;
                            
                            case 6:
                                System.out.println("(✿ ◕ ‿ ◕)  -'Porqué le puse 'Javation: el Comienzo del Retorno de la Venganza de Java: el Juego'?'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Bueno, porqué no?'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;
                            
                            case 7: 
                                System.out.println("(✿ ◕ ‿ ◕)  -'Tu horóscopo de hoy dice 'te encontrarás con un extraño con un tatuaje de serpiente.' '");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Te recomienda que no le compres sus empanadas.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -' 'Son de ayer, te caerán mal' '");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Qué sabio!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;
                            
                            case 8:
                                System.out.println("(✿ ◕ ‿ ◕)  -'Cuando lees todos mis comentarios, te ganas un premio!'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'El premio es que ahora me conoces lo suficiente como para ser mi amig@.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;

                            case 9:
                                System.out.println("(✿ ◕ ‿ ◕)  -'El otro día leí un artículo que decía que el mundo es una simulación...'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Porqué no podemos vivir en una simulación que tenga cosas más entretenidas, entonces?'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'Como dragones y magia.'");
                                try{System.in.read();}
                                    catch(Exception e){}
                                System.out.println("(✿ ◕ ‿ ◕)  -'O alguien que realmente me quiera, ya sabes, seres mitológicos...'"); //Disclaimer, esto es un meme alkfjksdjg
                                try{System.in.read();}
                                    catch(Exception e){}
                                break;

                        }
                        continue;

                    }else if(ans.equalsIgnoreCase("n")){
                        System.out.println("(✿ ◕ ‿ ◕)  -'O-Oh, okay...'");
                        try{System.in.read();}
                            catch(Exception e){}
                        break;

                    }else{
                        System.out.println("Oye! Ese input no se acepta!");
                        try{System.in.read();}
                            catch(Exception e){}
                    }
                    continue;


                case 5: //Término de turno

                    System.out.println("(✿ ◕ ‿ ◕)  -'Has decidido terminar tu turno.'");
                    try{System.in.read();}
                        catch(Exception e){}
                    System.out.println("(✿ ◕ ‿ ◕)  -'Comenzemos el backstage!'");
                    try{System.in.read();}
                        catch(Exception e){}


                    //Producir recursos
                    int pJavalares = 0;
                    int pHierro = 0;
                    int pTrigo = 0;
                    int pTecnologia = 0;
                    System.out.println("(✿ ◕ ‿ ◕)  -'Generando recursos...'");
                    try{System.in.read();}
                        catch(Exception e){}
                    for (int i = 0; i < player.getEdificios().size(); i++){
                        Edificio tmpEdificio = player.getEdificios().get(i);
                        ArrayList<Integer> tmpList = tmpEdificio.producir();
                        for (int j = 0; j < 4; j++){
                            pJavalares += tmpList.get(j);
                            pHierro += tmpList.get(j);
                            pTrigo += tmpList.get(j);
                            pTecnologia += tmpList.get(j);
                        }
                    }

                    //Creación de lista con todas las personas creadas para facilitar el uso de visitar()
                    ArrayList<Persona> personasTotales = new ArrayList<Persona>();
                    for (int i = 0; i < player.getPersonas().size(); i++){
                        Persona tmpPersona = player.getPersonas().get(i);
                        personasTotales.add(tmpPersona);
                    }
                    for (int i = 0; i < player.getEdificios().size(); i++){
                        Edificio tmpEdificio = player.getEdificios().get(i);
                        for (int j = 0; j < tmpEdificio.getPersonas().size(); j++){
                            Persona tmpPersona = tmpEdificio.getPersonas().get(j);
                            personasTotales.add(tmpPersona);
                        }
                    }

                    //Visitar
                    for (int i = 0; i < player.getAtracciones().size(); i++){
                        Atraccion tmpAtraccion = player.getAtracciones().get(i);
                        pJavalares += tmpAtraccion.visitar(personasTotales);
                    }


                    //Sumar los nuevos valores de recursos a player
                    player.setJavalares(player.getJavalares() + pJavalares);
                    player.setHierro(player.getHierro() + pHierro);
                    player.setTrigo(player.getTrigo() + pTrigo);
                    player.setTecnologia(player.getTecnologia() + pTecnologia);

                    System.out.println("(✿ ◕ ‿ ◕)  -'Listo! Has generado: '");
                    System.out.println("Javalares: " + pJavalares);
                    System.out.println("Hierro: " + pHierro);
                    System.out.println("Trigo: " + pTrigo);
                    System.out.println("Tecnología: " + pTecnologia);
                    try{System.in.read();}
                        catch(Exception e){};


                    //Envejecer y Mostrar personas muertas rip
                    System.out.println("(✿ ◕ ‿ ◕)  -'Pero a qué costo?'");
                    try{System.in.read();}
                        catch(Exception e){};
                    System.out.println("(✿ ◕ ‿ ◕)  -'Es momento de ponernos tristes.'");
                    try{System.in.read();}
                        catch(Exception e){};
                    System.out.println("(✿ ◕ ‿ ◕)  -'Las siguientes personas han muerto, ya que sobrepasaron los 30 años.'");
                    try{System.in.read();}
                        catch(Exception e){};
                    System.out.println("(✿ ◕ ‿ ◕)  -'Pido un minuto de silencio para nuestros vejestorios que ya han partido: '");
                    for (int i = 0; i < personasTotales.size(); i++){
                        Persona tmpPersona = personasTotales.get(i);
                        tmpPersona.envejecer(tmpPersona.getEdad());
                        if (tmpPersona.getEdad() > 30){
                            String tmpNom = tmpPersona.getNombre();
                            System.out.println("(✿ ◕ ‿ ◕)  -'" + tmpNom + ", Rest in RIP in Peace.'");
                            try{player.sacar_persona(tmpNom, player.getPersonas());}
                                catch(Exception e){}
                            try{
                                for (int j = 0; j < player.getEdificios().size(); j++){
                                    Edificio tmpEdificio = player.getEdificios().get(j);
                                    player.sacar_persona(tmpNom, tmpEdificio.getPersonas());
                                }}
                                catch(Exception e){}
                        }
                    }

                    if (player.getJavalares() < 0){
                        System.out.println("(✿ ◕ _ ◕)  -'Lo lamento, pero te has quedado sin javalares.'");
                        System.out.println("(✿ ¬ _ ¬)  -'Me veo obligada a sacarte del juego.'");
                        System.out.println("(✿ ◕ ‿ ◕)ノ''。₀: *゜   -'Adiós! Vuelve pronto! Y sé más responsable la próxima vez!'");
                        break;
                    }
                    else{
                        continue;
                    }

                
                case 6: //Salir del juego
                    System.out.println("(✿ ◕ ‿ ◕)ノ''。₀: *゜   -'Adiós! Vuelve pronto!'");
                    break;

            }

            break;

        }

    }

}