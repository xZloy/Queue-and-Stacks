import java.util.Scanner;

public class Menu {
    public static void main(String args[]) {
        QueueMethods q = new QueueMethods();
        StackMethods s = new StackMethods();
        Scanner reader = new Scanner(System.in);
        int opt = 0, data = 0;
        do {
            System.out.println(
                    "Ingrese la opcion de su conveniencia: \n 1. Push queue \n 2. Push stack \n 3. Pop queue \n 4. Pop stack \n 0. Salir \n");
            opt = reader.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ingresa un dato numerico: \n");
                    data = reader.nextInt();
                    q.pushQueue(data);
                    break;
                case 2:
                    System.out.println("Ingresa un dato numerico: \n");
                    data = reader.nextInt();
                    s.pushStack(data);
                    break;
                case 3:
                    q.popQueue();
                    q.showQueue();
                    break;
                case 4:
                    s.popStack();
                    s.showStack();
                case 0:
                    System.out.println("Camara rin llanta =)");
                    break;
                default:
                    System.out.println("ERROR: Opcion fuera del rango");
                    break;
            }
        } while (opt != 0);
    }

}
