import java.util.Scanner;

public class P22 {
    public static void main(String[] args)
    {
        int[][] met = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int met1 = 0;
        // for metrix 1
        for(int i=1; i<=3; i++)
        {
            for(int j=1; j<=3; j++)
            {
                System.out.println("enter value for row no" +i +" "+j);
                met1 = sc.nextInt();
            }
        }
        for(int i=0; i<=met1;)
        {
            System.out.print(" "+i);

        }
        // // for metrix 2
        // for(int i=0; i<=9; i++)
        // {
        //     System.out.println("enter value for cols no" +i);
        //     int met2 = sc.nextInt();
        // }

        // print metrix 1
    }
    
}