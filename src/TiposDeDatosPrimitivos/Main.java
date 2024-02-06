package TiposDeDatosPrimitivos;

public class Main {

    public static void main(String[] args) {

        byte entero = 12;

        System.out.println("Numero entero: "+entero);
                  //byte va de -128 a 127 y ocupa 8 bits


        short entero2 = 12456;
        System.out.println("Numero entero 2: "+entero2);

                  //short va de -32768 a 32767 y ocupa 16 bits


        int entero3 = 1245656;
        System.out.println("Numerto entero 3: "+entero3);

                  //int va de -2147483648 a 2147483657 y ocupa 32 bits


        long entero4 = 1245656787;
        System.out.println("Numero entero 4: "+entero4);

                  //long va de -9223372036854775808 a 9223372036854775807 y ocupa 64 bits


        float decimal = 3.45f;
        System.out.println("Numero decimal: "+decimal);

                  //float va de 1.4e-045 a 3.4e+038, ocupa 32 bits y hay que poner una f al final del número
        double  decimal2 = 3.45757837;
        System.out.println("Numero decimal 2: "+decimal2);

                  //double va de 4.9e-324 a 1.8e+308, ocupa 64 bits y no hay que poner nada al final del número


        char caracter = 'a';
        System.out.println("Caracter: "+caracter);

                  //char sirve para cualquier caracter

        boolean decision = true;
        System.out.println("La decision es: "+decision);

                  //boolean sirve para asignar verdadero (true) o falso (false)


    }

}
