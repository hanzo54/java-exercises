public class pole2 {
    public static void main(String a[])
    {
        
        int x[][]= new int [3][]; //tolik kolik bude hranatých závorek tolik bude dimenzí
        
        x [0]= new int [3];
        x [1]= new int [2];
        x [2]= new int [4];


        
        for(int i =0; i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                x [i] [j]=(int)(Math.random() * 10);
            }
 
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
