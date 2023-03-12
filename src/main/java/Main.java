import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dato = 0;
        int datos = 0;
        int i=0;
        int x = 0;
        String resp = "";
        String resp2 = "";

        Scanner in = new Scanner(System.in);
        ListaDobleEnlazada lt = new ListaDobleEnlazada();
        Nodo n = new Nodo(dato);

        System.out.println("Número de datos ");
        datos = in.nextInt();

                for (i = 0; i < datos; i++) {
                    System.out.println("Ingresa el dato: ");
                    dato = in.nextInt();
                    lt.agregar(dato);
                }
                System.out.println("número a buscar: ");
                x = in.nextInt();

                System.out.println(" " + lt.buscar(x) + " ");



    }
}