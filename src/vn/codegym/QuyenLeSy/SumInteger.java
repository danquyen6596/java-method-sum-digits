package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Input number: ");
        num = scanner.nextInt();
        System.out.println("Sum Digits = "+ sumDigits(num));

    }

    public static int sumDigits(int num){
        int sum=0, num2=0;
        while (true){
                sum += num%10;
                num = num/10;

                if (num/10==0) {
                    sum += num%10;
                    num = num/10;
                    break;
                }
            }
        return sum;
    }
}
