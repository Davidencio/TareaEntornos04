package cuentasBanco;
public class Main {

    public static void main(String[] args) {
        CCuenta cuentaPersonal;
        double saldoActual;

        cuentaPersonal = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaPersonal.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativaCuenta(cuentaPersonal, 0.0F);
    }

	private static void operativaCuenta(CCuenta cuentaPersonal, Float cantidad) {
		
		try {
            cuentaPersonal.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaPersonal.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
