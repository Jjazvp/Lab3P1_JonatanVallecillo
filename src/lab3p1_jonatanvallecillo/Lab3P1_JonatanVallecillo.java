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
                            if(distrito == 1){
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
                            }else if(distrito == 11){
                                int masc = rand.nextInt(2);
                                int fem = rand.nextInt(2);
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
                            }else{
                                int masc = rand.nextInt(2);
                                int fem = rand.nextInt(2);
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
                            }
                            System.out.println("Desea continuar? si (1) no (otro)");
                            continuar = zoro.nextInt();
                            System.out.println();
                            
                        }else{
                            System.out.println("Ingreso un distrito innexistente");
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
                            while(turnos <= 5 || palabra == adivinar){
                                System.out.println("Adivinar palabra: ");
                                System.out.print("Ingrese palabra: ");
                                adivinar = zoro1.nextLine();
                                System.out.println();
                                turnos ++;
                            }
                        }else{
                            System.out.println("La palabra que ingreso no tiene el tamahno correcto");
                            System.out.println();
                        }
                        
                        if(palabra == adivinar){
                            System.out.println("Ha ganado la partida!");
                        }else{
                            System.out.println("");
                        }
                        
                    }
            }
        }
    }
    
}
