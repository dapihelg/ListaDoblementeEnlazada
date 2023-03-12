public class ListaDobleEnlazada {
    Nodo inicio;
    Nodo fin;

    public static void main(String[] args) {

    }

    public ListaDobleEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.anterior = fin;
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    public boolean buscar(int dato) {
        Nodo nodoActual = inicio;

        while (nodoActual != null) {
            if (nodoActual.dato == dato) {
                return true;
            }
            nodoActual = nodoActual.siguiente;
        }

        nodoActual = fin;

        while (nodoActual != null) {
            if (nodoActual.dato == dato) {
                return true;
            }
            nodoActual = nodoActual.anterior;
        }

        return false;
    }
}
