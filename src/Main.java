import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre, raza;

        int edad;
        Scanner teclado = new Scanner(System.in);

        Perro a= new Perro();
        Perro b = new Perro();
        try {
            System.out.println("------Informacion del primer perro------");
            System.out.print("Nombre: ");
            nombre = teclado.nextLine();
            System.out.print("Raza: ");
            raza = teclado.nextLine();
            System.out.print("Edad: ");
            edad = teclado.nextInt();

            a.setNombre(nombre);
            a.setEdad(edad);
            a.setRaza(raza);

            System.out.println("------Informacion del segundo perro------");
            teclado.nextLine();
            System.out.print("Nombre: ");
            nombre = teclado.nextLine();
            System.out.print("Raza: ");
            raza = teclado.nextLine();
            System.out.print("Edad: ");
            edad= teclado.nextInt();

            b.setNombre(nombre);
            b.setEdad(edad);
            b.setRaza(raza);

        } catch (InputMismatchException first){
            System.out.println("El valor ingresado no es valido");
            System.out.println("Intenta de nuevo");
            return;
        }

        System.out.println("El nombre del primer perro es " + a.getNombre() + " tiene " + a.getEdad() + " años y su raza es " + a.getRaza());
        a.comer("croquetas", 359.58);
        a.ladrar();
        System.out.println("El nombre del segundo perro es " + b.getNombre() + " tiene " + b.getEdad() + " años y su raza es " + b.getRaza());
        b.comer("huesos", 590.21);
        b.ladrar();

    }
    }
