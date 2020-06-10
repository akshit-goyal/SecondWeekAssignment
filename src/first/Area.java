package first;

import java.util.Scanner;

public class Area implements AreaInterface {
    private int length,breadth;

    @Override
    public void setDim(int length, int breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int getArea() {
        return length*breadth;
    }
    public static void main(String[] args)
    {
        Area area = new Area();
        int length,breadth;
        System.out.println("Enter value for length and breadth");
        Scanner sc = new Scanner(System.in);
        try {
            length = sc.nextInt();
            breadth = sc.nextInt();
            area.setDim(length, breadth);
            System.out.println("Area is " + area.getArea());
        }
        catch(Exception ex)
        {
            System.out.println("please provide correct input type [Integer]");
        }
        sc.close();
    }
}
