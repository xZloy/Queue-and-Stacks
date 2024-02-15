
public class StackMethods {
    Node op;

    public StackMethods() {
        op = null;
    }

    public boolean isStackEmpty() {
        if (op == null) {
            return true;
        } else {
            return false;
        }
    }

    public void pushStack(int data) {
        Node stack;
        stack = new Node(data, null);
        if (isStackEmpty()) {
            op = stack;
        } else {
            Node temporalStack = op;
            while (temporalStack.getNext() != null) {
                temporalStack = temporalStack.getNext();
            }
            temporalStack.setNext(stack);
        }
        System.out.println("Dato insertado correctamente LI");
    }

    public void popStack() {
        Node tStack = op;
        int lifo = 0;
        if (!isStackEmpty()) {
            if (op.getNext() == null) {
                op = null;
            } else {
                while (tStack.getNext().getNext() != null) {
                    tStack = tStack.getNext();
                    lifo = tStack.getData();
                }
                System.out.println(
                        "Segun la estructura de una pila/stack (LIFO) se elimino el ultimo dato ingresado");
                tStack.setNext(null);
            }
        }
    }

    public void showStack() {
        Node tempStack = op;
        int contador = 0;
        if (!isStackEmpty()) {
            System.out.println("Objetos/Items de la pila/Stack\n");
            do {
                contador++;
                System.out.println("Posicion: " + contador + " => Dato: " + tempStack.getData() + "\n");
                tempStack = tempStack.getNext();
            } while (tempStack != null);
        }
    }

}
