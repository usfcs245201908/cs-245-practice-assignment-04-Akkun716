public class BubbleSort implements SortingAlgorithm
{
    public void sort(int[] a)
    {
        boolean sorted = false;
        //Repeats the moving of respective largest num to respective places
        while(!sorted)
        {
            sorted = true;
            //Moves through array one by one
            for(int i = 0; i < a.length - 1; i++)
            {
                //If the current number is bigger than the next
                if(a[i] > a[i + 1])
                {
                    sorted = false;
                    //Switch their placements
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
