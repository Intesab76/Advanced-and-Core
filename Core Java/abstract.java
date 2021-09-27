import java.util.*;

interface Area {
    float square(int side);

    float rectangle(int length, int breadth);
}

abstract class CalcArea implements Area {
    @Override
    public float square(int a) {
        return a * a;
    }

    @Override
    public float rectangle(int len, int width) {
        return len * width;
    }
}

class CallAbstract extends CalcArea {

    // CallAbstract() {
    // super();
    // }

}

class Main {
    public static void main(String Intesab[]) {

        CallAbstract callAbstract = new CallAbstract();
        Scanner scanner = new Scanner(System.in);

        int length, breadth;
        int squareSide;

        System.out.println("\n Enter the length and breadth of the rectangle ::\n");
        length = scanner.nextInt();
        breadth = scanner.nextInt();

        System.out.println("\n Length is ::  " + length + "\n Breadth is :: " + breadth);

        System.out.println("\n Enter the length of square side ::\n");
        squareSide = scanner.nextInt();

        System.out.println("\n Side of the square is :: " + squareSide);

        System.out.println("\n Area of the rectangle is :: " + callAbstract.rectangle(length, breadth));
        System.out.println("\n Area of the square is :: " + callAbstract.square(squareSide));

        scanner.close();

    }
}
