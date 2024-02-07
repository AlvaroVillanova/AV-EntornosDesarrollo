import java.util.ArrayList;
import java.util.Scanner;

public class ListaPalabrasSalir{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaPalabras = new ArrayList<String>();
        String palabra="";

        System.out.println("Dime palabras para anadir a una lista (escribe salir para terminar el programa.)");

        do{

            System.out.println("Dime una palabra: ");
            listaPalabras.add(palabra);
            palabra=sc.nextLine();


        }while (!palabra.equals("salir"));

        System.out.println("Saliendo... Estas son sus palabras: ");
        System.out.println(listaPalabras);




    }

}
