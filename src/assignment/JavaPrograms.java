package assignment;
import java.util.Scanner;

public class JavaPrograms {

    // 1. Display Greetings in three lines
    public static void displayGreetings() {
        System.out.println("Hello!");
        System.out.println("Welcome to Java Programming.");
        System.out.println("Have a great day!");
    }

    // 2. Display Introduction in three lines
    public static void displayIntroduction() {
        System.out.println("My name is Abhishek.");
        System.out.println("I am a Java enthusiast.");
        System.out.println("I love problem-solving.");
    }

    // 3. Find sum and average of two numbers
    public static void sumAndAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double avg = sum / 2;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }

    // 4. Calculate Simple Interest
    public static void calculateSimpleInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double T = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double R = sc.nextDouble();
        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest: " + SI);
    }

    // 5. Find area of circle, rectangle, and triangle
    public static void calculateArea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));

        System.out.print("Enter length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Area of Rectangle: " + (length * breadth));

        System.out.print("Enter base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    // 6. Find perimeter of circle, rectangle, and triangle
    public static void calculatePerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));

        System.out.print("Enter length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)));

        System.out.print("Enter three sides of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Perimeter of Triangle: " + (a + b + c));
    }

    // 7. Compute Volume of Cylinder
    public static void computeCylinderVolume() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius and height of the cylinder: ");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }

    // 8. Convert Fahrenheit to Celsius and Celsius to Fahrenheit
    public static void convertTemperature() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Celsius: " + ((fahrenheit - 32) * 5 / 9));

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit: " + ((celsius * 9 / 5) + 32));
    }

    // 9. Convert Pounds to Kilograms
    public static void convertPoundsToKg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms: " + (pounds * 0.454));
    }

    // 10. Swap two numbers
    public static void swapNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Using temp variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping using temp: " + a + " " + b);

        // Without temp variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without temp: " + a + " " + b);
    }
    public static void acceptDetails(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Nationality: ");
        String nationality = sc.nextLine();
        System.out.printf("Name: %s, Age: %d, Nationality: %s%n", name, age, nationality);
    }
    // Print the number only if it's negative
    public static void printNegativeNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Negative Number Entered: " + num);
        }
    }

    // Compare two integers
    public static void compareNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Numbers are equal.");
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num1 + " < " + num2);
        }
    }

    // Convert ASCII to character
    public static void asciiToChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ASCII value (0-128): ");
        int ascii = sc.nextInt();
        System.out.println("Character: " + (char) ascii);
    }

    // Check even or odd
    public static void checkEvenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }

    // Check leap year
    public static void checkLeapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap ? "Leap Year" : "Not a Leap Year");
    }

    // Find the largest of three numbers
    public static void findLargestNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest Number: " + largest);
    }

    // Determine type of triangle
    public static void findTriangleType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }

    // Simple calculator
    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double result;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num2 != 0 ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operator"); return;
        }
        System.out.println("Result: " + result);
    }

    // Convert number (1-7) to weekday
    public static void numberToWeekday() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(day >= 1 && day <= 7 ? days[day - 1] : "Invalid number");
    }

    // Print multiplication table
    public static void printTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Sum of first n natural numbers
    public static void sumNaturalNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum: " + (n * (n + 1) / 2));
    }

    // Calculate factorial
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    // Find student with highest score
    public static void highestScoringStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String topStudent = "";
        int highestScore = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student score: ");
            int score = sc.nextInt();
            sc.nextLine(); // Consume newline
            if (score > highestScore) {
                highestScore = score;
                topStudent = name;
            }
        }
        System.out.println("Top Student: " + topStudent + " with score " + highestScore);
    }

}

