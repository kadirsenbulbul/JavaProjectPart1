public class Main2 {
    public static void main(String[] args){
        int op = 2;
        switch(op)  //switch case
        {
            case 1 : 
                System.out.println("Process 1");
                break;
            case 2 :
                System.out.println("Process 2");
                break;
            default:
                System.out.println("Invalid process");
        }
        int i=0;

        while(i<10)
        {
            System.out.println("i : " + i);
            i++;
        }

        for(int j = 0;j < 20; j++)
        {
            System.out.println("j: " + j);
        }
        
        int x = 0;
        while(true){
            x++;
            System.out.println("x:" + x);
            if(x==5){
                break;
            }
           
        }



    }
}
