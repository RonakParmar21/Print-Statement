import java.util.*;

public class Print {
    Scanner sc = new Scanner(System.in);

    public void firstProgram() {
        System.out.println("Hello World!");
    }

    // Write a Program to print Your Personal Details like Name, Address, City,
    // Pincode, PhoneNo etc.
    public void personalDetails() {
        System.out.println("=================================================================");
        System.out.println("Personal Details....");
        System.out.println("Name : Parmar Ronak");
        System.out.println("Address : Opp. Rayway Station Bagasara Road Bhalgam(Bilkha)");
        System.out.println("PinCode : 362110");
        System.out.println("Phone No : 1234567890");
    }

    // Write a Program to print the following string. (Use of Escape Sequence for “
    // ” DOUBLE QUATE) Someone Said “Nothing is Impossible in this World”.
    public void doubleQuate() {
        System.out.println("=================================================================");
        System.out.println("Qouble Quate...");
        System.out.println("\"Nothig is Impossible in this World!\"");
    }

    // Write a C Program to print the following string. (Use of Escape Sequence for
    // ‘ ’ SINGLE QUATE) Someone Said ‘God is Great’.
    public void singleQuate() {
        System.out.println("=================================================================");
        System.out.println("Single Quate...");
        System.out.println("\'Nothing is Impossible in this World!\'");
    }

    // Write a program that will read two numeric values & print those values.
    public void getValuePrint() {
        System.out.println("=================================================================");
        System.out.println("Get Value And Print Them...");
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("First Value is : " + num1);
        System.out.println("Second Value is : " + num2);
    }

    // Write a Program to accept Dollar and convert it into Rupees. (1 Dollar = 45
    // Rupees)
    public void conDollarTORuppes() {
        System.out.println("=================================================================");
        System.out.println("Convert Dollar to Rupees...");
        System.out.println("Enter Dollar : ");
        int dollar = sc.nextInt();

        int rupees = dollar * 45;
        System.out.println("Rupees is : " + rupees);
    }

    // Write a Program to accept Rupees and convert it into Paise. (1 Rupees = 100
    // Paise)
    public void conRupeesToPaise() {
        System.out.println("=================================================================");
        System.out.println("Convert Rupees to Paise...");
        System.out.println("Enter Rupees : ");
        int rupees = sc.nextInt();
        int paise = rupees * 100;
        System.out.println("Paise is : " + paise);
    }

    // Write a Program to get Liter and convert it into MiliLiter. (1 Liter = 1000
    // MiliLiter)
    public void conLiterToMililiter() {
        System.out.println("=================================================================");
        System.out.println("Convert Liter to MiliLiter...");
        System.out.println("Enter Liter : ");
        int litter = sc.nextInt();
        int mililiter = litter * 1000;

        System.out.println("MiliLiter is : " + mililiter);
    }

    // Write a Program to get Fahrenheit and convert it into Celsius. ( C = (f-32) /
    // 1.8 )
    public void conFahrenheitToCelsius() {
        System.out.println("=================================================================");
        System.out.println("Convert Fahrenheit To Celsius...");
        System.out.println("Enter Fahrenheit : ");
        float fahrenheit = sc.nextFloat();
        float celsius = ((fahrenheit - 32) / 1.8f);

        System.out.println("Celsius is : " + celsius);
    }

    // Write a Program to accept Kilometer and convert it into meter and centimeter.
    // (1 KM = 1000 Meter and 1 Meter = 100 CM)
    public void conKmToMeterAndCentimeter() {
        System.out.println("=================================================================");
        System.out.println("Convert KM to Meter and cm...");
        System.out.println("Enter Kilometer : ");
        int km = sc.nextInt();

        int meter = km * 1000;
        int cm = meter * 100;

        System.out.println("Meter is : " + meter);
        System.out.println("Centimeter is : " + cm);
    }

    // Write a Program to get Dollar and convert it into pounds. ( 2 Dollar = 1
    // Pound )
    public void conDollarToPound() {
        System.out.println("=================================================================");
        System.out.println("Convert Dolla to Pound...");
        System.out.println("Enter Dollar : ");
        int dollar = sc.nextInt();

        int pound = dollar / 2;

        System.out.println("Pound is : " + pound);
    }

    // Write a Program to get two values and display addition, subtraction,
    // Multiplication and division.
    public void basicCalculator() {
        System.out.println("=================================================================");
        System.out.println("Basic Calculator...");
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int sub, div;
        if (num1 > num2) {
            sub = num2 - num1;
            div = num2 / num1;
        } else {
            sub = num1 - num2;
            div = num1 / num2;
        }
        int mul = num1 * num2;

        System.out.println("Addition is : " + sum);
        System.out.println("Subtraction is : " + sub);
        System.out.println("Multiplication is : " + mul);
        System.out.println("Divition is : " + div);
    }

    // Write a Program to accept any number and print its square and cube.
    public void squareCube() {
        System.out.println("=================================================================");
        System.out.println("Square and Cube...");
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        double square = n * n;
        double cube = n * n * n;

        System.out.println("Square is : " + square);
        System.out.println("Cube is : " + cube);
    }

    // Input thages of three students and print their average, with a suitable
    // message. Hint : The average could be a decimal.
    public void averageOf3Student() {
        System.out.println("=================================================================");
        System.out.println("Average of 3 Student...");
        System.out.println("Enter First Student's Age : ");
        int a1 = sc.nextInt();
        System.out.println("Enter Second Student's Age : ");
        int a2 = sc.nextInt();
        System.out.println("Enter Third Student's Age : ");
        int a3 = sc.nextInt();

        int sum = a1 + a2 + a3;
        float avg = sum / 3f;

        System.out.println("Average of Three Student is : " + avg);
    }

    // Write a Program to accept radius and calculate Area of Circle and print it
    // Area = 3.14 r2
    public void calAreaOfCircle() {
        System.out.println("=================================================================");
        System.out.println("Calculate Area of Circle...");
        System.out.println("Enter Radius : ");
        int r = sc.nextInt();

        double area = 3.14 * (r * r);
        System.out.println("Area of Circle is : " + area);
    }

    // Write a Program to get radius and calculate and display the circumference of
    // a circle. Circumference = 2 3.14 r
    public void circumferenceOfCircle() {
        System.out.println("=================================================================");
        System.out.println("Calculate Circumference of Circle...");
        System.out.println("Enter R : ");
        int r = sc.nextInt();

        double area = 2 * 3.14 * r;
        System.out.println("Circumference of Circle is : " + area);
    }

    // Write a Program to get appropriate inputs and calculate Simple Interest and
    // display it. I = PRN / 100
    public void simpleInterest() {
        System.out.println("=================================================================");
        System.out.println("Calculate Simple Interest...");
        System.out.println("Enter Price");
        double p = sc.nextDouble();
        System.out.println("Enter Rate : ");
        double r = sc.nextDouble();
        System.out.println("Enter Year : ");
        double n = sc.nextDouble();

        // double mul = p*r*n;
        double si = (p * r * n) / 100;
        System.out.println("Simple Interest is : " + si);
    }

    // Write a Program to accept appropriate inputs and calculate Compound Interest
    // and display it. A = P(1 + R/100) N
    public void compoundInterest() {
        System.out.println("=================================================================");
        System.out.println("Calculate Compound Interest...");
        System.out.println("Enter Price : ");
        double p = sc.nextDouble();
        System.out.println("Enter Rate : ");
        double r = sc.nextDouble();
        System.out.println("Enter Year : ");
        double n = sc.nextDouble();

        double ci = p * Math.pow(1 + r / 100, n) - p;
        System.out.println("Compound Interest is : " + ci);
    }

    // Write a Program to get any two values and swap them or exchange them.(With
    // the help of third variable & without using third variable)
    public void swapValue() {
        System.out.println("=================================================================");
        System.out.println("Swap Value With Using Third Variable...");
        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Swapping Num1 is : " + num1);
        System.out.println("Swapping Num2 is : " + num2);

        System.out.println("=================================================================");
        System.out.println("Swapping Without Third Variable....");
        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;

        System.out.println("Swapping Num1 is : " + num1);
        System.out.println("Swapping Num2 is : " + num2);
    }

    // Rajesh’s basic salary is input through the keyboard. His dearness allowance
    // is 40% of basic salary, and house rent allowance is 20% of basic salary.
    // Write a program to calculate his gross salary.
    public void grossSalary() {
        System.out.println("=================================================================");
        System.out.println("Calculate Gross Salary...");
        System.out.println("Gross Salary...");
        System.out.println("Enter Basic Salary : ");
        double bs = sc.nextInt();

        double da = (bs * 40) / 100;
        double hr = (bs * 20) / 100;

        double gs = bs - da - hr;
        System.out.println("Gross Salary is : " + gs);
    }

    // Write a program to accept price of an item and calculate 23 % depreciation.
    public void depreciationOfPrice() {
        System.out.println("=================================================================");
        System.out.println("Calculate Depreciation...");
        System.out.println("Enter Price : ");
        int p = sc.nextInt();

        float dep = (p * 23) / 100;
        System.out.println("Depreciaiton is : " + dep);
    }

    // Write a program to accept sale amount and calculate 7.5 % discount.
    public void discountOfAmount() {
        System.out.println("=================================================================");
        System.out.println("Calculate Discount...");
        System.out.println("Enter Sale Amount : ");
        int sa = sc.nextInt();

        double dis = (sa * 7.5) / 100;
        System.out.println("Discount is : " + dis);
    }

    // Write a Program to accept any real number and store it integer part in
    // variable x and fraction part in y and display them. Input : n = 123.75 Output
    // : x = 123 y = 75
    public void realAndFraction() {
        System.out.println("=================================================================");
        System.out.println("Real and Fraction Part of Real Number...");
        System.out.println("Enter Real Number : ");
        float n = sc.nextFloat();

        int a = (int) n;
        int b = (int)((n - a) * 100);

        System.out.println("Real Part is : " + a);
        System.out.println("Fraction Part is : " + b);
    }

    public static void main(String argsp[]) {
        Print p = new Print();

        p.firstProgram();
        p.personalDetails();
        p.doubleQuate();
        p.singleQuate();
        p.getValuePrint();
        p.conDollarTORuppes();
        p.conRupeesToPaise();
        p.conLiterToMililiter();
        p.conFahrenheitToCelsius();
        p.conKmToMeterAndCentimeter();
        p.conDollarTORuppes();
        p.basicCalculator();
        p.squareCube();
        p.averageOf3Student();
        p.calAreaOfCircle();
        p.circumferenceOfCircle();
        p.simpleInterest();
        p.compoundInterest();
        p.swapValue();
        p.grossSalary();
        p.depreciationOfPrice();
        p.discountOfAmount();
        p.realAndFraction();
    }
}