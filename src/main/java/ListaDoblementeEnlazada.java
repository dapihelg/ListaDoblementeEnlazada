public class ListaDoblementeEnlazada {
    public static void main(String[] args) {
        ListaDoblementeEnlazada milista = new ListaDoblementeEnlazada();
        milista.agregar(1);
        milista.agregar(2);
        milista.agregar(3);
        milista.agregar(4);
        milista.agregar(5);

        milista.encuentraEimprime(5);

    }
    public static class Nodo {
        public int dato;
        public Nodo anterior;
        public Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    public Nodo inicio;
    public Nodo fin;

    public ListaDoblementeEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = fin;
            fin = nuevoNodo;
        }
    }

    public void encuentraEimprime(int dato) {
        Nodo nodoActual = inicio;

        while (nodoActual != null && nodoActual.dato != dato) {
            nodoActual = nodoActual.siguiente;
        }

        if (nodoActual == null) {
            System.out.println("El elemento no se encuentra en la lista.");
        } else {
            if (nodoActual.anterior != null) {
                System.out.println("Elemento anterior: " + nodoActual.anterior.dato);
            } else {
                System.out.println("No hay elemento anterior.");
            }

            System.out.println("Elemento actual: " + nodoActual.dato);

            if (nodoActual.siguiente != null) {
                System.out.println("Elemento siguiente: " + nodoActual.siguiente.dato);
            } else {
                System.out.println("No hay elemento siguiente.");
            }
        }
    }
}
