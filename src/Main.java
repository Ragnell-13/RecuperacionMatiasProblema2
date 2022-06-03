import Contabilidad.LibroCuentas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibroCuentas cuentas = new LibroCuentas();

        String option ="";
        Scanner leer = new Scanner(System.in);

        while (!option.equals("Q")) {
            System.out.println(
                    "Seleccione una opción: " +
                    " \n 1.- Añadir un gasto: " +
                    " \n 2.- Ver lista de gastos: " +
                    " \n 3.- Calcular gasto total: " +
                    " \n Q.- Salir del programa");
            option = leer.nextLine().toUpperCase();

            switch (option){
                case "1":
                    cuentas.push(leer.nextInt());

                    break;

                case "2":
                    cuentas.mostrarGastos();

                    break;

                case "3":
                    cuentas.totalCalc();
                    break;

                default:

                    break;
            }

        }

    }
}
