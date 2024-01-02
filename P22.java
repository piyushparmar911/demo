import java.util.Scanner;

public class P22 {
    public static void main(String args[])
    {
        int[][] met1 = new int[3][3];
        int[][] met2 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        // for metrix 1
        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2; j++)
            {
                System.out.print("enter value for row no" +i +" "+j+": ");
                met1[i][j] = sc.nextInt(); 
            }
        }

        // for metrix 2
        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2; j++)
            {
                System.out.print("enter value for row no" +i +" "+j+": ");
                met2[i][j] = sc.nextInt(); 
            }
        }

        // print for metrix 1
        for(int i=0; i<=2; i++ )
        {
            for(int j=0; j<=2; j++)
            {
                System.out.print(met1[i][j]+" ");
   
            }
            System.out.println("");
        }
        System.out.print("   +   ");

        for(int i=0; i<=2; i++ )
        {
            for(int j=0; j<=2; j++)
            {
                System.out.print(met2[i][j]+" ");
   
            }
            System.out.println("");
        }
        // print for metrix 2

        // // for metrix 2
        // for(int i=0; i<=9; i++)
        // {
        //     System.out.println("enter value for cols no" +i);
        //     int met2 = sc.nextInt();
        // }

        // print metrix 1
    }
    
}