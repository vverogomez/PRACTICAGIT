import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //EJEMPLO SCANNER

        Scanner sc=new Scanner(System.in);


        //LEER CADENA
        System.out.println("Introduce nombre");
        String nombre=sc.nextLine();
        System.out.println("Nombre: "+nombre);

        //LEER CARACTER
        System.out.println("Introduce un caracter");
        char letra=sc.next().charAt(0);
        System.out.println("Letra: "+letra);

        //LEER ENTERO
        System.out.println("Introduce entero");
        int num=sc.nextInt();
        System.out.println("Numero: "+num);

        //LEER ENTERO LONG
        System.out.println("Introduce un entero long");
        long num2=sc.nextLong();
        System.out.println("Numero: "+num2);

        //LEER DOUBLE
        System.out.println("Introduce decimal");
        double num3=sc.nextDouble();
        System.out.println("Numero decimal: "+num3);




    }
}