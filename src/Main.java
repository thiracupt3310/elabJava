// elab-source: Main.java
// elab-mainclass: Main ===> main class

import java.util.Scanner;

/**
 * Created by 708 on 9/13/2018.
 */
public class Main {
    public static void main(String[] args) {
        // 1. รับ input
        // 2. สร้าง Object
        // 3. ส่งคำให้ Object
        // 4. แสดงผลลัพธ์ Object

        // ไม่ทำใน main
        // 1. การคำนวณ
        // 2. การเปรีบยเทียบ

        // ไม่ทำใน Model
        // 1. รับ input
        // 2. print

        //รับ input

        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        Fraction fraction1 = new Fraction(a, b);
        Fraction fraction2 = new Fraction(c, d);
        Fraction result = fraction1.add(fraction2);
        System.out.println(result.toString());
    }
}
