package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scan = new Scanner(System.in);
        int index = 1;
        System.out.print("Number " + index + ": ");
        float n = scan.nextFloat();


        if (n <= 0) {
            System.out.println("No number entered.");
        }else {
            float max = 0;
            while (n > 0) {
                if (n > max) {
                    max = n;
                }
                index++;
                System.out.print("Number " + index + ": ");
                n = scan.nextFloat();
            }

            System.out.println("The largest number is " + String.format("%.2f", max));
        }
    }
    //todo Task 2
    public void stairs() {
        System.out.print("n: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        if (row <= 0) {
            System.out.println("Invalid number!");
        }
        else {
            int number = 1;
            for ( int i=0; i<row;i++ ) {
                for ( int j=0; j<=i;j++){
                    System.out.print(number+" " );
                     number = number + 1;

                }
                System.out.println("");
            }
        }
    }
    //todo Task 3
    public void printPyramid(){
        int row = 6;
        int j ;
        for ( int i=1; i<=row;i++ ) {
            for (int b=row -i;b>0;b--){
                System.out.print(" ");
            }
            for (j = 1; j <= (i * 2) - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
        System.out.print("h: ");
        Scanner scan = new Scanner(System.in);
        int h=scan.nextInt();
        System.out.print("c: ");
        char c=scan.next().charAt(0);

        if(h%2==0){
            System.out.print("Invalid number!");
        }
        else{
            for(int i=1;i<=h/2+1; i++){
                for(int j=h/2;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=i;k>0;k--){
                    System.out.print((char) (c-k+1));
                }
                for(int l=1; l<i; l++){
                    System.out.print((char) (c-l));
                }
                System.out.println();
            }
            for(int i=h/2;i>0;i--){
                System.out.print(" ");
            for(int k=i;k>0;k--) {
                System.out.print((char) (c-k+1));
            }
            for(int l=1;l<i;l++) {
                System.out.print((char) (c-l));
            }
            System.out.println();
        }
        for(int i=h/2;i>0;i--) {
            for (int j = h / 2; j >= i; j--) {
                System.out.println(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.println((char) (c - k + 1));
            }
            for (int l = 1; l < i; l++) {
                System.out.println((char) (c - l));
            }
            System.out.println();
        }
    }
        }


    //todo Task 5
    public void marks(){
            int sum=0;
            int negative = 0;
            int i = 1;
        Scanner scan = new Scanner(System.in);
            boolean isInput = true;

            while (isInput) {

                System.out.print("Mark " + i + ": ");
                int number = scan.nextInt();

                if (number > 0 && number <= 5) {
                    sum = sum + number;
                    i++;

                    if (number == 5) {
                        negative++;

                    }

                } else if (number < 0 || number > 5) {
                    System.out.println("Invalid mark!");

                }

                if (number == 0) {

                    float average;

                    if (i == 1) {
                        average = (float) sum / (i);

                    } else {

                        average = (float) sum / (i - 1);
                    }

                    System.out.printf("Average: %.2f", average);

                    System.out.println();

                    System.out.println("Negative marks: " + negative);

                    isInput = false;
                }
            }

    }

    //todo Task 6
    public void happyNumbers(){
        System.out.print("n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        do {
            sum=0;
            while (n > 0) {
                int c = n % 10;
                sum += c * c;
                n = n / 10;

            }
            n=sum;

        }
        while(sum!=1&&sum!=4);
        if(sum==1) {
            System.out.println("Happy number!");
        }
        if(sum==4){
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}