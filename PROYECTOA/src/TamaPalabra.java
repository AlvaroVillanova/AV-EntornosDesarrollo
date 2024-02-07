import java.util.Scanner;

//Crear funcion que le pases numero y palabra
//Si la palabra tiene mas caracteres que el numero se acorta
//de lo contrario se anaden espacios en blanco.

public class TamaPalabra{



    public static String tamaPalabra(int n, String palabra){

        int longitudPalabra = palabra.length();

        
        if (longitudPalabra <= n){

            for (int i=longitudPalabra; i<n; i++){
                palabra+="-";
            }
        }else if(longitudPalabra>n){
            String aux= "";
            for(int i=0;i<n;i++){
                aux+=palabra.charAt(i);
            }
            palabra= aux;
        }
        return palabra;
    }



    public static void main(String[] args){
        
        String palabra="";
        int numero=0;
        String[] listaPalabras = {"","perro","casa","zanahoria","cardiopatia","venezuela","caca"};
        
        



        Scanner sc= new Scanner(System.in);

        if (args.length==1 && args[0].equals("probando")){

            for (String palabra=)


        }else if(args.length!=2){

            System.out.println("argumentos Incorrectos... ");




        } else{


            palabra=args[1];
            numero=Integer.parseInt(args[0]);

            String nuevaPalabra=tamaPalabra(numero, palabra);

            System.out.println(nuevaPalabra);

    }
}
}