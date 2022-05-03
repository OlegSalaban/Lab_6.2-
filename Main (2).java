public class Main {
    public static void main(String[] args) {
        Point pointObj = new Point();
        pointObj.x = 5;
        pointObj.y = -10.2;

        Line lineObj = new Line();
        lineObj.x1 = 5;
        lineObj.y1 = -5;
        lineObj.x2 = 22.25;
        lineObj.y2 = 10.8;

        Person personObj = new Person();
        personObj.name = "Max";
        personObj.surname = "Smith";
        personObj.age = 32;

        System.out.println("Class Point. Object: pointObj");
        System.out.println("X = " + pointObj.x);
        System.out.println("Y = " + pointObj.y);
        System.out.println();

        System.out.println("Class Line. Object: lineObj");
        System.out.println("X1 = " + lineObj.x1);
        System.out.println("Y1 = " + lineObj.y1);
        System.out.println("X2 = " + lineObj.x2);
        System.out.println("Y2 = " + lineObj.y2);
        System.out.println();

        System.out.println("Class Person. Object: personObj");
        System.out.println("Name: " + personObj.name);
        System.out.println("Surname: " + personObj.surname);
        System.out.println("Age: " + personObj.age);
    }
}
