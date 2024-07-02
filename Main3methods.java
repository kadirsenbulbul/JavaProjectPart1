public class Main3methods{

    public static int  add(int a,int b) //we use static so we can use this method in main
    {
       // System.out.println("Toplamlari: " + (a + b));
        return(a+b);
    }
    public static int add(int a,int b, int c){ //Overloading
        return (a + b + c);
    }
public static void main(String[] args) {
    int total = add(10, 20);
    System.out.println("Total: " + total);
    System.out.println(add(10, 20, 30)); //overloaded method

    




}

}