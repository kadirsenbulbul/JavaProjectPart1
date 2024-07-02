import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
       /*  System.out.println("Hello, World!"); */

       int a = 32;      //Variables
       double b = 3.14;
       float c = 3.14f;
       char d = 'A';
       String test = "Test";
       boolean e  = false;

       System.out.println("a : " + a);
       System.out.println("b : " + b);
       System.out.println("c : " + c);
       System.out.println("d : " + d);
       System.out.println("Test : " + test);
       System.out.println("e : " + e);

       int x = 20;
       int y = 10;
       System.out.println(x+y); //sum of x and y

       int i = 1;
       i++;
       System.out.println(i);

        Scanner scanner = new Scanner(System.in); //adding scanner

        int p,r;

        System.out.println("Write your numbers");
        p = scanner.nextInt();
        r = scanner.nextInt();
        System.out.println(p + r);

        int age = 17;

        if(age<18){ 
            System.out.println("You can't vote");
        }
        else{
            System.out.println("You can vote");
        }

        System.out.println("Process");
        int process = scanner.nextInt(); //Enter your value
        
        if(process == 1){
            System.out.println("process 1");
        }
        else if(process == 2){
            System.out.println("process 2");
        }

        double bki = 26.2;
        if (bki<25){
            System.out.println("Thin");
        }
        else if(bki >= 25 && bki<30){
            System.out.println("Normal");
        }
        else if(bki>30){
            System.out.println("Obese");
        }






    }
}
