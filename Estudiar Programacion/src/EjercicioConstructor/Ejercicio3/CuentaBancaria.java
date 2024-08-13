package EjercicioConstructor.Ejercicio3;

import javax.swing.*;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private boolean estado;
    private String claveSeguridad;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldoInicial, boolean estadoInicial, String claveInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.estado = estadoInicial;
        this.claveSeguridad = claveInicial;
    }


    public void consultarSaldo() {
        System.out.println("Su saldo  es de: " + saldo);
    }


    public void retirarEfectivo(double valor) {
        if (!estado) {
            System.out.println("La cuenta está inactiva");
            return;
        }

        if (valor > saldo) {
            System.out.println("no hay suficiente dinero");
        } else {
            saldo -= valor;
            System.out.println("Retiro exitoso, nuevo saldo : " + saldo);
        }
    }


    public void consignarEfectivo(double valor) {
        if (!estado) {
            System.out.println("La cuenta no existe.");
            return;
        }

        saldo += valor;
        System.out.println("Consignación exitosa, nuevo saldo: " + saldo);
    }


    public void cambiarClave() {
        if (!estado) {
            System.out.println("La cuenta no existe");
            return;
        }

        String claveActual = JOptionPane.showInputDialog("Ingrese su clave actual:");
        if (claveActual.equals(claveSeguridad)) {
            String nuevaClave = JOptionPane.showInputDialog("Ingrese la nueva clave:");
            claveSeguridad = nuevaClave;
            System.out.println("Clave cambiada exitosamente");
        } else {
            System.out.println("Clave incorrecta");
        }
    }



    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", estado=" + (estado ? "Activo" : "Inactivo") +
                ", claveSeguridad='" + claveSeguridad + '\'' +
                '}';
    }
}
