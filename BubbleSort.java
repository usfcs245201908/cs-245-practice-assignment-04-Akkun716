public class BubbleSort implements SortingAlgorithm
{
    public void sort(int [] a)
    {
        //Repeats the moving of respective largest num to respective places
        for(int pass = 0; pass < a.length; pass++)
        {
            //Moves through array one by one
            for(int i = 0; i < a.length - 1; i++)
            {
                //If the current number is bigger than the next
                if(a[i] > a[i + 1])
                {
                    //Switch their placements
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
