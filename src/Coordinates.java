public class Coordinates {
    public int x, y;
    Coordinates next;
    public Coordinates(int row, int col) {
        this.x = row;
        this.y = col;
        next = null;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setNext(Coordinates newNode) {
        next = newNode;
    }
    public Coordinates getNext() {
        return next;
    }
}