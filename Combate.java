/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalla2;

import java.util.Scanner;

/**
 *
 * @author ale2
 */
public class Combate_Naval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int filas;
        int columnas;
        int usuario[][] = new int[5][5];
        int maquina[][] = new int[5][5];
        int contMaquina = 5;
        int contUsuario = 5;
        int filaAtaque;
        int columnaAtaque;

        for (int i = 0; i < 5; i++) {
            System.out.println("ingresar donde se ubicara cada barco");
            System.out.println("ingresar filas y columnas");
            filas = sc.nextInt();
            columnas = sc.nextInt();
            usuario[filas][columnas] = 1;
        }
        for (int i = 0; i < 5; i++) {
            filas = (int) (Math.random() * 5);
            columnas = (int) (Math.random() * 5);
            maquina[filas][columnas] = 1;
        }
        while (contMaquina > 0 || contUsuario > 0) {
            System.out.println("Ingrese coordenadas de ataque: ");
            System.out.println("Ingrese fila y columnas");
            filaAtaque = sc.nextInt();
            columnaAtaque = sc.nextInt();

            if (maquina[filaAtaque][columnaAtaque] == 1) {
                maquina[filaAtaque][columnaAtaque] = 1;
                contMaquina--;
                System.out.println("Al adversario le quedan " + contMaquina + " barcos ");
            } else {
                System.out.println("Fallaste");
            }
            System.out.println("");
            System.out.println("Es turno del adversario");
            System.out.println("");
            filaAtaque = (int) (Math.random() * 5);
            columnaAtaque = (int) (Math.random() * 5);

            if (usuario[filaAtaque][columnaAtaque] == 1) {
                maquina[filaAtaque][columnaAtaque] = 1;
                contUsuario--;
                System.out.println("Te quedan " + contUsuario + "barcos");
            } else {
                System.out.println("El adversario falló en su ataque");
            }
            if (contUsuario == 0) {
                System.out.println("Perdiste");
                System.out.println("");
                System.out.println("Game Over");
            } else {
                System.out.println("Has ganado");
            }

        }

    }

}
