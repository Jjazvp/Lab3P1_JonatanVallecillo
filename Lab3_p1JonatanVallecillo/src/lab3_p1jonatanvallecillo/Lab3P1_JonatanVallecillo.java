package lab3_p1jonatanvallecillo;

import java.util.Scanner;

public class Lab3P1_JonatanVallecillo {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Elija el ejercicio");
        System.out.println("Ejercicio 1");
        System.out.println("Ejercicio 2");
        System.out.println("Ejercicio 3");
        int ejercicio = leer.nextInt();
        while (ejercicio > 0 || ejercicio < 3){
            switch (ejercicio){
                case 1:
                    System.out.println("Sucesiones y mas sucesiones");
                    System.out.print("Diferencia: ");
                    int dif = leer.nextInt();
                    System.out.print("Inicial: ");
                    int ini = leer.nextInt();
                    System.out.print("Cantidad: ");
                    int can = leer.nextInt();
                    int resultado = dif + ini;
                    System.out.print(ini+ ", ");
                    for (int m = 2; m <= can; m++){                         
                        dif += 1;
                        System.out.print(resultado+ ", ");
                        resultado += dif;                                                                               
                    }
                    System.out.println(" ");
                    System.out.println("Que numero desea ver mas adelante en la sucesion?"); 
                    can = leer.nextInt();                  
                    System.out.println("El numero seria: ");                   
                    for (int m = 1; m <= can; m++){                         
                        dif += 1;
                        resultado += dif;                                                                               
                    }
                    System.out.println(resultado);
                
                case 2:
                    System.out.println("Pocket Monsters");
                    System.out.println("Ingrese que modo de pelea pokemon desea:");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- Por rondas");
                    int modo = leer.nextInt();
                    switch (modo){
                        case 1:
                            System.out.println("Estadisticas de los pokemones");
                            System.out.println("Sylveon Vida: 280 Ataque: 80 Defensa: 50%");
                            System.out.println("Gyrados Vida: 300 Ataque: 50 Defensa: 10%");
                            System.out.println("Giratina Vida: 300 Ataque: 70 Defensa: 25%");
                            System.out.println("Dragonita Vida: 250 Ataque: 75 Defensa: 20%");
                            System.out.println(" ");
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon vrs Dragonite");
                            System.out.println("2.- Gyrados vrs Giratina");
                            System.out.println("3.- Dragonite vrs Giratina");
                            System.out.println("4.- Giratina vrs Sylveon");
                            int pelea = leer.nextInt();
                            double vida;
                            double vida2;
                            double defen;
                            double defen2;
                            double ataq;
                            double ataq2;
                            
                            switch(pelea){
                                case 1:
                                    vida = 280.0;
                                    defen = 0.85;
                                    ataq = 80;
                                    vida2 = 250.0;                                    
                                    defen2 = 0.8;                                    
                                    ataq2 = 75;
                                    
                                    for (int i = 1; i > 1; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                                
                                case 2:
                                    vida = 300.0;
                                    defen = 0.9;
                                    ataq = 50;
                                    vida2 = 300.0;                                    
                                    defen2 = 0.75;                                    
                                    ataq2 = 70;
                                    
                                    for (int i = 1; i > 1; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                                    
                                case 3:
                                    vida = 250.0;
                                    defen = 0.80;
                                    ataq = 75;
                                    vida2 = 300.0;                                    
                                    defen2 = 0.75;                                    
                                    ataq2 = 70;
                                    
                                    for (int i = 1; i > 1; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                                case 4:
                                    vida = 300.0;
                                    defen = 0.75;
                                    ataq = 70;
                                    vida2 = 280.0;                                    
                                    defen2 = 0.85;                                    
                                    ataq2 = 80;
                                    
                                    for (int i = 1; i > 1; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                                    
                                    System.out.println(" ");
                            }
                        case 2:
                            System.out.println("Estadisticas de los pokemones");
                            System.out.println("Sylveon Vida: 280 Ataque: 80 Defensa: 50%");
                            System.out.println("Gyrados Vida: 300 Ataque: 50 Defensa: 10%");
                            System.out.println("Giratina Vida: 300 Ataque: 70 Defensa: 25%");
                            System.out.println("Dragonita Vida: 250 Ataque: 75 Defensa: 20%");
                            System.out.println(" ");
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon vrs Dragonite");
                            System.out.println("2.- Gyrados vrs Giratina");
                            System.out.println("3.- Dragonite vrs Giratina");
                            System.out.println("4.- Giratina vrs Sylveon");
                            pelea = leer.nextInt();
                                                        
                            switch(pelea){
                                case 1:
                                    vida = 280.0;
                                    defen = 0.85;
                                    ataq = 80;
                                    vida2 = 250.0;                                    
                                    defen2 = 0.8;                                    
                                    ataq2 = 75;
                                    
                                    for (int i = 1; i < 10; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                                case 2:
                                    vida = 300.0;
                                    defen = 0.9;
                                    ataq = 50;
                                    vida2 = 300.0;                                    
                                    defen2 = 0.75;                                    
                                    ataq2 = 70;
                                    
                                    for (int i = 1; i > 1; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                                    
                                case 3:
                                    vida = 250.0;
                                    defen = 0.80;
                                    ataq = 75;
                                    vida2 = 300.0;                                    
                                    defen2 = 0.75;                                    
                                    ataq2 = 70;
                                    
                                    for (int i = 1; i > 1; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                                    
                                case 4:
                                    vida = 300.0;
                                    defen = 0.75;
                                    ataq = 70;
                                    vida2 = 280.0;                                    
                                    defen2 = 0.85;                                    
                                    ataq2 = 80;
                                                                        
                                    for (int i = 1; i > 1; i++){
                                        System.out.println("------- Ronda "+i+" --------");                                    
                                        System.out.println("Vida de pokemon 1: "+vida);
                                        System.out.println("Vida de pokemon 2: "+ vida2);
                                        System.out.println(" ");
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        vida = vida - (ataq2*defen);
                                        vida2 = vida2 -(ataq*defen2);
                                        System.out.println("Vida pokemon 1: "+vida);
                                        System.out.println("Vida pokemon 2: "+vida2);
                                        
                                        if (vida <= 0){
                                            System.out.println("Vida pokemon 1: 0.0");
                                            System.out.println("Vida pokemon 2: "+ vida2);
                                            System.out.println("Vida pokemon 1: "+vida);
                                            System.out.println("El pokemon 2 Ha sido el ganador");
                                            i = 11;
                                        }else if (vida2 <= 0){
                                            System.out.println("Vida pokemon 1: "+ vida);
                                            System.out.println("Vida pokemon 2: 0.0");
                                            System.out.println("El pokemon 1 Ha sido el ganador");
                                            i = 11;
                                        }
                                    }
                            }
                    }
                    
                case 3:
                    System.out.println("Asterisco en casa!");
                    System.out.println("Ingrese la longitud del cuadrado");
                    int altura = leer.nextInt();
                    int longitud = altura;
                    int contador = 1;
                    while ((altura % 2 == 1) && (altura >= 7) && (contador < altura)){
                        for (int m = 1; m <= altura; m++){
                                for (int n = 1; n <= longitud; n++){
                                    System.out.print(" * ");
                                }              
                            System.out.println(" ");
                        }    
                        contador += 1;
                    }
                            
                            contador += 1;
                        
                        System.out.println(" ");
                    }

            }   
        }
    }

  
