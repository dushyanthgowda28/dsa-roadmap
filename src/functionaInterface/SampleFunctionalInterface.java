package functionaInterface;

@FunctionalInterface
interface Calculate {
    int add(int a, int b);
}

public class SampleFunctionalInterface {

    public static void main(String[] args) {
        Calculate calculate = new Calculate() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Addition " + calculate.add(2, 3));

        SquareNumber squareNumber = new SquareNumber() {
            @Override
            public int square(int a) {
                return a * a;
            }
        };

        System.out.println("Square of a number " + squareNumber.square(10));

        SquareNumber squareNumber1 = (a) -> a * a;
        System.out.println("Square of a number using lambda " + squareNumber1.square(10));

    }
}
