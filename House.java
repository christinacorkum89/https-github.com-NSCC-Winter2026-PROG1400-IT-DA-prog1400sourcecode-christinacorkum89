import java.util.Scanner;

public class House {
    // Properties (attributes)
    public double length;
    public double width;
    public int numberOfRooms;
    public String color;

    // Constructor
    public House(double length, double width, int numberOfRooms, String color) {
        this.length = length;
        this.width = width;
        this.numberOfRooms = numberOfRooms;
        this.color = color;
    }

    // Print the total area
    public void printTotalArea() {
        double area = length * width;
        System.out.println("This " + color + " house has a total area of " + area + " square feet.");
    }

    // Another method of your choice
    public void describeHouse() {
        System.out.println("This house has " + numberOfRooms + " rooms and is painted " + color + ".");
    }

    // Main method using Scanner instead of args
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter house length: ");
        double length = input.nextDouble();

        System.out.print("Enter house width: ");
        double width = input.nextDouble();

        System.out.print("Enter number of rooms: ");
        int numberOfRooms = input.nextInt();

        System.out.print("Enter house color: ");
        String color = input.next();

        House myHouse = new House(length, width, numberOfRooms, color);

        myHouse.printTotalArea();
        myHouse.describeHouse();
    }
}