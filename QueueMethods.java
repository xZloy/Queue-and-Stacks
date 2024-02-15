
public class QueueMethods {
    Node op;

    public QueueMethods() {
        op = null;
    }

    public boolean isStackEmpty() {
        if (op == null) {
            return true;
        } else {
            return false;
        }
    }

    public void pushQueue(int item) {
        Node queue;
        queue = new Node(item, null);
        if (isStackEmpty()) {
            op = queue;
        } else {
            Node temporalQueue = op;
            while (temporalQueue.getNext() != null) {
                temporalQueue = temporalQueue.getNext();
            }
            temporalQueue.setNext(queue);
        }
        System.out.println("Dato insertado correctamente LI");
    }

    public void popQueue() {
        if (!isStackEmpty()) {
            op = op.getNext(); // Se recorre o avanza al siguiente nodo
            int fifo = op.getData();
            System.out.println(
                    "Segun la estructura de una cola/queue (FIFO) se elimino el primer dato ingresado");
        }
    }

    public void showQueue() {
        Node tempStack = op;
        int contador = 0;
        if (!isStackEmpty()) {
            System.out.println("Objetos/Items de la cola/queue\n");
            do {
                contador++;
                System.out.println("Posicion: " + contador + " => Dato: " + tempStack.getData() + "\n");
                tempStack = tempStack.getNext();
            } while (tempStack != null);
        }
    }

}
