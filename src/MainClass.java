import ball.Ball;
import ball.Container;
import bookclass.Author;
import bookclass.Book;
import complex.MyComplex;
import employee.Employee;
import geometry.Circle;
import geometry.MyPoint;
import geometry.MyTriangle;
import geometry.Rectangle;
import polynom.MyPolynomial;


public class MainClass {
    public static void main(String[] args) {

        System.out.println("--------Circle--------");
        Circle circle = new Circle(15.0);
        System.out.println(circle.getColor());
        circle.setColor("yellow");
        System.out.println(circle);
        System.out.println(circle.calculateArea());

        System.out.println("--------Rectangle--------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("--------Employee--------");
        Employee employee = new Employee(0, "Christopher", "Columbus", 50000);
        System.out.println(employee.getName());
        System.out.println(employee.raiseSalary(10));
        System.out.println(employee);

        System.out.println("--------Book class--------");
        Author[] authors = {new Author("Wilhelm Grimm", 'm'), new Author("Jacob Grimm", 'm')};
        Book book = new Book("Fairy tails", authors, 800);
        System.out.println(book);
        System.out.println(book.getAuthorNames());

        System.out.println("--------My point class--------");
        MyPoint p1 = new MyPoint();
        p1.setXY(5, 5);
        System.out.println(p1.distance(5,4));
        MyPoint p2 = new MyPoint(2,1);
        System.out.println(p2.distance(p1));
        System.out.println(p2.distance());
        MyPoint p3 = new MyPoint();

        System.out.println("--------My triangle--------");
        MyTriangle myTriangle = new MyTriangle(p1, p2, p3);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
        MyTriangle myTriangle1 = new MyTriangle(0,0,6,0,3,3);
        System.out.println(myTriangle1.getType());

        System.out.println("--------My complex--------");
        MyComplex myComplex = new MyComplex(5,2);
        MyComplex myComplex1 = myComplex.conjugate();
        System.out.println(myComplex.subtractNew(myComplex1));
        System.out.println(myComplex.multiply(myComplex1));
        myComplex.setValue(1.5,1.5);
        System.out.println(myComplex.magnitude());

        System.out.println("--------My polynomial--------");
        MyPolynomial myPolynomial=new MyPolynomial(new double[] {4,1,5,2.5,8});
        System.out.println(myPolynomial);
        System.out.println(myPolynomial.evaluate(1));
        MyPolynomial myPolynomial1=new MyPolynomial(new double[] {3,6,2});
        System.out.println(myPolynomial1.add(myPolynomial));
        MyPolynomial myPolynomial2=new MyPolynomial(new double[] {1,1,1});
        System.out.println(myPolynomial1.multiply(myPolynomial2));

        System.out.println("--------Ball--------");
        Ball ball=new Ball(4,16,2,2,1);
        Container container = new Container(0,0,20,20);
        while (container.collides(ball.tryToMoveBall())) {
            ball.move();
            System.out.println(ball);
        }
        ball.reflectVertical();
        while (container.collides(ball.tryToMoveBall())) {
            ball.move();
            System.out.println(ball);
        }

    }

}
