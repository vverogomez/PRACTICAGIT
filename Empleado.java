package ejercicio6;

public class Empleado {

    //HOLA ESTOY MODIFICANDO EL ARCHIVO
    //MODIFICACION

    private int numeroEmpleado;
    private static int numero=0;

    public Empleado(){
        numero++;
        numeroEmpleado=numero;

    }

    public static int getNumeroEmpleado() {
        return numero;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Empleado.numero = numero;
    }
}


