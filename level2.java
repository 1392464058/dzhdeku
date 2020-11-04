import java.io.IOException;
import java.util.Scanner;

public class jisuan {

    public interface Calculate {
         double calculate(double x, char operate, double y);

    }

    public static void main(String[] args) throws IOException {
        System.out.print("请输入你的运算数x");
        Scanner ccc = new Scanner(System.in);
        double x = ccc.nextInt();
        System.out.print("请输入你的运算符号");
        char a=(char)System.in.read();
        char operate =a;

        System.out.print("请输入你的运算数y");
        int y = ccc.nextInt();
        switch (operate) {
            case '+': {
                System.out.print("x+y=" + (x + y));
                break;
            }
            case '-': {
                System.out.print("x-y=" + (x - y));
                break;
            }
            case '*': {
                System.out.print("x*y=" + (x * y));
                break;
            }
            case '/': {
                System.out.print("x/y=" + (x / y));
                break;
            }


        }
    }
}
