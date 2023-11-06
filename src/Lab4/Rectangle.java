package Lab4;

public class Rectangle {
    Rectangle(int w, int l){
        this.width = w;
        this.length = l;
    }
    private int width;
    private int length;

    public int CalculatePerimeter(){return 2*width + 2*length;}
    public int CalculateArea(){return width*length;}

    public void setWidth(int newWidth){this.width = newWidth;}
    public void setLength(int newLength){this.length = newLength;}
    public int getWidth(){return this.width;}
    public int getLength(){return this.length;}
}
