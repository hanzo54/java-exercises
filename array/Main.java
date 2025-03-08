public class Main
{
    public static void main(String a[])
    {
        int x [][]= new int [3][4];


        
        for(int i =0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                x [i] [j]=(int)(Math.random() * 10);
            }
 
        }

        for(int i =0; i<3;i++)
            {
            for(int j=0;j<4;j++)
                {
                    System.out.print(x [i][j] + " ");
                }
            System.out.println();
            }

        for (int n[] : x)
        {
            for(int m: n)
                {
                    System.out.print(m+" ");
                }
                System.out.println();
        }
    }    
}
