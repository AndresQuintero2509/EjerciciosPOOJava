package Cuenta;

public class CuentaApp {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Alejandro");
        Cuenta cuenta2 = new Cuenta("Maria", 2312);

        cuenta1.ingresar(200);
        cuenta2.ingresar(32);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    }
}
