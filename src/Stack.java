public class Stack< T > {

    private Coordinates firstNode;

    public void push(Coordinates newCoordinates) {
        if (!isEmpty()) {
            newCoordinates.next = firstNode;
        }
        firstNode = newCoordinates;
    }

    public Coordinates pop() {
        Coordinates r = firstNode;
        if (!isEmpty()) {
            firstNode = firstNode.next;
        }
        return r;
    }

    public Coordinates peek() {
        Coordinates r = firstNode;
        return r;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public boolean isFull() {
        Coordinates newCoordinates = new Coordinates(0, 0);
        return false;
    }

    public static boolean pathExists(char[][] labirinto, Coordinates start, Coordinates end) {
        Stack<Coordinates> stack = new Stack<>();
        stack.push(start);

        labirinto[start.getX()][start.getY()] = 'E';
        labirinto[end.getX()][end.getY()] = 'S';

        while (!stack.isEmpty()) {
            Coordinates current = stack.pop();

            System.out.println("Coordenada atual: " + current.getX() + ", " + current.getY());
            System.out.println("");

            for (char[] i: labirinto) {
                System.out.println(i);
            }


            if (current.getX() == end.getX() && current.getY() == end.getY()) {
                System.out.println("FIM");
                return true;
            } else {
                // Se a peça pode se mover pra cima e nao encoutrou aquela casa ainda:
                if (labirinto[current.getX() - 1][current.getY()] != '-' && labirinto[current.getX() - 1][current.getY()] != '#') {
                    Coordinates nextCoordinates = new Coordinates(current.getX() - 1, current.getY());
                    System.out.println("Moveu pra cima");
                    stack.push(nextCoordinates);
                    labirinto[current.getX() - 1][current.getY()] = '-';
                }

                // Se a peça pode se mover pra direita e nao encoutrou aquela casa ainda:
                if (labirinto[current.getX()][current.getY() + 1] != '-' && labirinto[current.getX()][current.getY() + 1] != '#') {
                    Coordinates nextCoordinates = new Coordinates(current.getX(), current.getY() + 1);
                    System.out.println("Moveu pra direita");
                    stack.push(nextCoordinates);
                    labirinto[current.getX()][current.getY() + 1] = '-';
                }

                // Se a peça pode se mover pra baixo e nao encoutrou aquela casa ainda:
                if (labirinto[current.getX() + 1][current.getY()] != '-' && labirinto[current.getX() + 1][current.getY()] != '#') {
                    Coordinates nextCoordinates = new Coordinates(current.getX() + 1, current.getY());
                    System.out.println("Moveu pra baixo");
                    stack.push(nextCoordinates);
                    labirinto[current.getX() + 1][current.getY()] = '-';
                }

                // Se a peça pode se mover pra esquerda e nao encoutrou aquela casa ainda:
                if (labirinto[current.getX()][current.getY() - 1] != '-' && labirinto[current.getX()][current.getY() - 1] != '#') {
                    Coordinates nextCoordinates = new Coordinates(current.getX(), current.getY() - 1);
                    System.out.println("Moveu pra esquerda");
                    stack.push(nextCoordinates);
                    labirinto[current.getX()][current.getY() - 1] = '-';
                }

            }
        }
        return false;
    }
}