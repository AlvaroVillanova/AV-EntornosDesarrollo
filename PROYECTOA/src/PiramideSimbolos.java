

public class PiramideSimbolos{



    public static void main(String[] args){


        if (args.length!=2){

            System.out.println("Numero de argumentos introducidos incorrecto. ");

        }else if(args.length==2){

            int numero=Integer.parseInt(args[0]);
            String caracter=args[1];
            int ancho=numero;

            for (int i=0; i<numero; i++){
                System.out.println(" ");
                
                for (int j=ancho; j<numero; j++){
                    System.out.print(caracter);

                }
                ancho-=1;
            }

        }
    }
}