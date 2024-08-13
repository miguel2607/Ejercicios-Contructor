package EjercicioConstructor.Ejercicio3;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("320719891324", 100.000, true, "KBCHVH12");

        String opcion;

            opcion = JOptionPane.showInputDialog("Seleccione una opción:\n" +
                    "1. Consultar Saldo\n" +
                    "2. Retirar Efectivo\n" +
                    "3. Consignar Efectivo\n" +
                    "4. Cambiar Clave\n" +
                    "5. Salir");

            switch (opcion) {
                case "1":
                    cuenta.consultarSaldo();
                    break;

                case "2":
                    String retiro1 = JOptionPane.showInputDialog("¿Cuánto desea retirar?");
                    double retiro = Double.parseDouble(retiro1);
                    cuenta.retirarEfectivo(retiro);
                    break;

                case "3":
                    String consignacion1 = JOptionPane.showInputDialog("¿Cuánto desea consignar?");
                    double consignacion = Double.parseDouble(consignacion1);
                    cuenta.consignarEfectivo(consignacion);
                    break;

                case "4":
                    cuenta.cambiarClave();
                    break;

                case "5":
                    System.out.println("Gracias por usar nuestro banco.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

    }
}
