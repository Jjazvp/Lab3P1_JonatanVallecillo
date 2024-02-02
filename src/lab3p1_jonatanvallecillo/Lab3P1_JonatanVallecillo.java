package lab3p1_jonatanvallecillo;

import java.util.Random;
import java.util.Scanner;


public class Lab3P1_JonatanVallecillo {

    
    public static void main(String[] args) {
        Scanner zoro = new Scanner(System.in);
        Random rand = new Random();
        Scanner zoro1 = new Scanner(System.in);
        
        int menu = 1;
        while(menu == 1){
            System.out.println("---- Menu -----");
            System.out.println("1.- Los Juegos del Hambre");
            System.out.println("2.- Wordle");
            System.out.println("3.- Movimiento de un pendulo");
            System.out.println("4.- Salir");
            System.out.print("Elija su opcion: ");
            int opcion = zoro.nextInt();
            System.out.println();
            
            switch(opcion){
                case 1:
                    int continuar = 1;
                    
                    while(continuar == 1){
                        System.out.println("Bienvenido a los 75 juegos del hambre");
                        System.out.print("Elija distrito donde se seleccionaran los tributos: ");
                        int distrito = zoro.nextInt();
                        System.out.println();
                        if(distrito == 1 || distrito == 11 || distrito == 12){
                            
                            switch(distrito){
                                case 1:
                                    int masc = rand.nextInt(2);
                                    int fem = rand.nextInt(2);
                                    if(masc == 0 && fem == 0){
                                        System.out.println("La tributo fememina es Casmere");
                                        System.out.println("El tributo masculino es Gloss");
                                    }else if(masc == 0 && fem == 1){
                                        System.out.println("La tributo femenina es Glimmer");
                                        System.out.println("El tributo masculino es Gloss");
                                    }else if(masc == 1 && fem == 0){
                                        System.out.println("La tributo femenina es Cashmere");
                                        System.out.println("El tributo masculino es Marvel");
                                    }else{
                                        System.out.println("La tributo femenina es Glimmer");
                                        System.out.println("El tributo masculino es Marvel");
                                    }
                                    break;
                                    
                                case 11: 
                                    masc = rand.nextInt(2);
                                    fem = rand.nextInt(2);
                                    if(masc == 0 && fem == 0){
                                        System.out.println("La tributo fememina es Rue");
                                        System.out.println("El tributo masculino es Finnick Odair");
                                    }else if(masc == 0 && fem == 1){
                                        System.out.println("La tributo femenina es Johana Mason");
                                        System.out.println("El tributo masculino es Finnick Odair");
                                    }else if(masc == 1 && fem == 0){
                                        System.out.println("La tributo femenina es Rue");
                                        System.out.println("El tributo masculino es Thresh");
                                    }else{
                                        System.out.println("La tributo femenina es Johana Mason");
                                        System.out.println("El tributo masculino es Thresh");
                                    }
                                    break;
                                    
                                case 12:
                                    masc = rand.nextInt(2);
                                    fem = rand.nextInt(2);
                                    if(masc == 0 && fem == 0){
                                        System.out.println("La tributo fememina es Katniss Everdeen");
                                        System.out.println("El tributo masculino es Peeta Mellark");
                                    }else if(masc == 0 && fem == 1){
                                        System.out.println("La tributo femenina es Lucy Gray");
                                        System.out.println("El tributo masculino es Peeta Mellark");
                                    }else if(masc == 1 && fem == 0){
                                        System.out.println("La tributo femenina es Katniss Everdeen");
                                        System.out.println("El tributo masculino es Haymich Abernathy");
                                    }else{
                                        System.out.println("La tributo femenina es Lucy Gray");
                                        System.out.println("El tributo masculino es Haymich Abernathy");
                                    }
                                    System.out.println();
                                    break;
                            }
                            System.out.println("Desea continuar? si (1) no (otro)");
                            continuar = zoro.nextInt();
                            System.out.println();
                            
                        }else{
                            System.out.println("Ingreso un distrito innexistente");
                            System.out.println("Intente de nuevo");
                        }
                    }
                    break;
                
                case 2:
                    int size = 1;
                    while(size == 1){
                        System.out.println("Ingrese palabra de 5 caracteres: ");
                        String palabra = zoro1.nextLine();
                        String adivinar = "";
                        int turnos = 0;
                        System.out.println();
                        
                        if (palabra.length() == 5){
                            while(turnos < 6){
                                
                                int longitud = 1;
                                while(longitud == 1){
                                    System.out.println("Adivinar palabra: ");
                                    System.out.print("Ingrese palabra: ");
                                    adivinar = zoro1.nextLine();
                                    
                                    if(adivinar.length() == 5){
                                        longitud = 0;
                                    }else{
                                        System.out.println();
                                        System.out.println("Ingreso una palabra de longitud invalida");
                                        System.out.println("Intente de nuevo (este intento no contara)");
                                        System.out.println();
                                    }
                                }
                                
                                String temporal = "";
                                char letra1 = ' ';
                                char letra2 = ' ';
                                int cont = 0;
                                while(cont < 5){
                                    letra1 = palabra.charAt(cont);
                                    letra2 = adivinar.charAt(cont);
                                    if (letra1 == letra2){
                                        temporal += letra1;
                                    }else{
                                        temporal += "-";
                                    }
                                    cont += 1;
                                }
                                temporal = temporal.toUpperCase();
                                System.out.print("Resultado: "+temporal);
                                System.out.println();
                                turnos ++;
                                System.out.println();
                                
                                int palabraint = 0;
                                int contpalabra = 0;
                                while(contpalabra < palabra.length()-1){
                                    palabraint += palabra.charAt(contpalabra);
                                    contpalabra++;
                                }
                                
                                int adivinarint = 0;
                                int contadivinar = 0;
                                while(contadivinar < adivinar.length()-1){
                                    adivinarint += adivinar.charAt(contadivinar);
                                    contadivinar++;
                                }
                                
                                if(adivinarint == palabraint){
                                    turnos = 8;
                                }
                            }
                        }else{
                            System.out.println("La palabra que ingreso no tiene el tamahno correcto");
                            System.out.println();
                        }
                        
                        if(turnos == 8){
                            System.out.println("Ha ganado la partida!");
                            size = 0;
                        }else{
                            System.out.println("Se ha quedado sin intentos. Ha perdido la partida");
                            size = 0;
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.println("Ingrese la amplitud del movimiento (en metro)");
                    int amp = zoro.nextInt();
                    System.out.println("Segundos en movimientos: ");
                    int seg = zoro.nextInt();
                    int contseg = 0;
                    int contmetros = 1;
                    int vuelta = 1;
                    int pinicial = 0;
                    
                    while (contseg < seg){
                        if(contmetros <= amp){
                            System.out.println("El pendulo esta a "+contmetros+" metros del punto inicial en "+(contseg+1)+" segundos");
                            contmetros+= vuelta;
                            contseg++;
                            if(contmetros == amp){
                                vuelta *= -1;
                            }else if(contmetros == -amp){
                                vuelta *= -1;
                            }
                            
                            if(contmetros == 0){
                                pinicial += 1;
                            }
                        }
                    }
                    System.out.println();
                    System.out.println("El pendulo regreso al punto inicial "+pinicial+" veces en "+seg+" segundos.");
                    System.out.println();
                    break;
                
                case 4:
                    menu = 0;
            }
        }
    }
    
}
