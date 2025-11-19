package ProtoTypePattern.homework2;

public class Position {
    public double x;
    public double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Position 객체를 복제하는 메서드(깊은 복제)
    public Position clonePosition(){
        return new Position(this.x, this.y);
    }

    @Override
    public String toString(){
        return String.format("(X: %.1f, Y: %.1f)", this.x, this.y);
    }
}
