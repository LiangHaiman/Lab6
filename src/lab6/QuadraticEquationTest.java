package lab6;

import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();

        // 创建对象+调用构造方法
        QuadraticEquation qe = new QuadraticEquation(a, b, c);

        // 获取判别式结果
        double judge = qe.getDiscriminant();

        if (judge > 1){
            System.out.printf("%.3f %.3f\n", qe.getRoot1(), qe.getRoot2());
        } else if (judge < 0.0001 && judge > -0.0001){
            System.out.printf("%.3f\n", qe.getRoot1());
        } else {
            System.out.printf("The equation has no roots");
        }
    }
}