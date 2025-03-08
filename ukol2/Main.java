import java.util.Arrays;

public class Main 
{
    public static int findBiggest (int[]arr)
    {
        int max = arr[0];
        
        for (int i = 0; i < arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
    
        }
        return max;
    }

    public static int[] sortArray (int []arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i ++)
            {
                for (int j = 0; j < n - 1 - i; j++)
                {
                    if (arr[j] > arr[j+1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }  
    return arr;
    }

    public static void main (String[] args)
    {
        int[] intArray = {7,4,2,6,9,1};

        System.out.println("Find Biggest number: " + findBiggest(intArray));
        System.out.println("Sorted array is:" + Arrays.toString(sortArray(intArray)));
    }
}