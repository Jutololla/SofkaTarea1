package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner (System.in); //Creación de un objeto Scanner
        String userName;
        String userPhoneNumber;
        String userAge;

        System.out.println("Por favor ingrese su nombre de usuario");
        userName = inputScanner.nextLine ();
        System.out.println("Por favor ingrese su numero de telefono");
        userPhoneNumber = inputScanner.nextLine ();
        System.out.println("Por favor ingrese su edad");
        userAge = inputScanner.nextLine ();

        System.out.println("Bienvenido señor "+userName+", es un placer para nosotros contar con una persona de "+userAge+" años.");
        System.out.println("Próximamente nos comunicaremos con usted al numero "+userPhoneNumber+"\nFeliz día");
    }
}
