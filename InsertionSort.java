public class InsertionSort implements SortingAlgorithm
{
    public void sort(int [] a)
    {
        //Loops through the array
        for(int i = 0; i < a.length; i++)
        {
            int min = a[i];
            for(int j = i - 1; j >= 0; j--)
            {
                //If the current content is less than the number before, switch their place
                if(a[j] > min)
                {
                    a[j + 1] = a[j];
                    a[j] = min;
                }
            }
        }
    }
}
