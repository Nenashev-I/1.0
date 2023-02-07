/******************************************************************************

Nenashev-I
nenashev25il@gmail.com 
10$
sum a+b
version 1.0

*******************************************************************************/

import java.util.Scanner; // импорт класса Scanner

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // объект класса Scanner
        System.out.println("Введите число А = ");
        int a = scn.nextInt(); // считываем первое введенное число
        System.out.println("Введите число В = ");
        int b = scn.nextInt();
        System.out.println("Сумма = " + (a+b));
    }
}