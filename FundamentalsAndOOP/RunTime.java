abstract class Figure {
    double dim1, dim2;
    Figure(double dim1, double dim2){
        this.dim1 = dim1; this.dim2 = dim2;
    }
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    double area(){
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    double area(){
        return dim1 * dim2 / 2;
    }
}

class RunTime{
    public static void main(String[] args){
        Figure figure = new Rectangle(5, 6);
        System.out.println(figure.area());
        figure = new Triangle(5, 6);
        System.out.println(figure.area());
    }
}