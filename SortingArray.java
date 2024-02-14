import java.util.Scanner;
public class SortingArray {
    int t;
    public void Swap(int [] La, int j){
        t = La[j];
        La[j] = La[j+1];
        La[j+1] = t;
    }
    public static void main(String[] args)
    {   
        // int item = La[k];
        SortingArray sa = new SortingArray();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();  // ----size of an array

        int La[] = new int[n];

        // ---store all the elements of an array----

        System.out.println("Now you can enter the array elements : ");
        for(int i = 0;i<n;i++){
            La[i] = sc.nextInt();
        }
        // --- print all the elements of an array ----

        System.out.print( "these are the elements of an array : ");
        for(int i = 0;i<n;i++){
            System.out.print(La[i] + "  ");
        }

        // ----- sorting algorithm of array elements -----

        System.out.println("\nhere is sorted array : ");
        for(int k = 1; k<=n-1; k++)
        {

            int j = 1;
            while(j<=n-k)
            {   
                if(La[j] > La[j+1])
                {
                    sa.Swap(La, j);
                }
                j = j+1;
            }
        }
        // -----------------------------------------------------------------
        for(int i = 0;i<n;i++){
            System.out.print(La[i] + "  ");
        }
    }
}
