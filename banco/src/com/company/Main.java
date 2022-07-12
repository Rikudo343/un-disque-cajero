package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Main {


    public static void main(String[] args) {


ArrayList<claves> registro =new ArrayList<>();
registro.add(new claves(1234));
registro.add(new claves(2453));
registro.add(new claves(6754));
registro.add(new claves(5655));
registro.add(new claves(7765));
registro.add(new claves(4489));
registro.add(new claves(7760));
int g;
        Scanner listen = new Scanner(System.in);
        int ping, op, retiro = 0, resultado, eli ;
        boolean a = true;
        dinero cal= new dinero();
        while (a) {
            System.out.println("bienvenido a bancanet ");
            System.out.println("por favor escriba su nip ");
            ping = listen.nextInt();
            sarchgenerica buscar = new sarchgenerica();


            if (  buscar.lineal(registro,new claves(ping) ,true)>=0) {
                System.out.println("que tipo de transaccion desa realisar ");
                System.out.println("1. solisitar su saldo ");
                System.out.println("2. retirar su dinero ");
                System.out.println("3. depositar efectivo ");
                System.out.println("4. salir ");
                op = listen.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("su saldo es: " + dineroobjetc.persona1.dienro);
                        break;
                    case 2:
                        System.out.println("cuanto dinero desea retirar");
                        System.out.println("1.-$50 \n2.-$100 \n3.-$200 \n4.-$500 \n5.-$1000");
                        eli=listen.nextInt();
                            switch (eli){
                                case 1:
                                    retiro = 50;
                                 break;
                                case 2:
                                    retiro = 100;
                                 break;
                                case 3:
                                    retiro = 200;
                                break;
                                case 4:
                                    retiro = 500;
                                break;
                                case 5:
                                    retiro = 1000;
                                    break;
                            }
                        resultado= cal.reta(retiro);
                        System.out.println("su saldo actuel es de "+ resultado);
                        break;
                    case 3:
                        System.out.println("cuanto dinero desea depositar");
                        retiro=listen.nextInt();
                        resultado=cal.suma(retiro);
                        System.out.println("su saldo actuel es de: " +resultado);
                        break;
                    case 4:
                        a=false;
                        break;

                }

            } else {
                System.out.println("se ha introducido un nip incorrecto");

            }
        }

    }
}
