public class Rectangle {

    int width;
    int length;
    int area1;
    boolean isSquare;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
        this.area1 = length*width;
        this.isSquare = false;

    }
    int area (){ return length*width;};
    boolean isSquare() {
        if (length == width){
            return true;
        }
        return false;
    }

}

