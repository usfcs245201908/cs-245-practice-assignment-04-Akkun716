public class SelectionSort implements SortingAlgorithm
{
    public void sort(int [] a)
    {
        //Loops through the array until the last point since it must be sorted
        for(int start = 0; start < a.length - 1; start++)
        {
            //Sets the starting content as the minimum
            int min  = start;
            //Searches through the rest of the list past start to find a new minimum number (sets index)
            for(int i = start; i < a.length; i++)
            {
                if(a[i] < a[min])
                {
                    min = i;
                }
            }
            //Switches their placement
            int temp = a[start];
            a[start] = a[min];
            a[min] = temp;
        }
    }
}
