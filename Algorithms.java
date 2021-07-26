
class Search
{
    int[] arr;
    Search(int[] arr)
    {
        this.arr = arr;
    }

    public int linearSearch(int element)
    {
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == element)
            {
                System.out.println("Element: " + element + " is present at Position " + (i+1));
                return i;
            }
        }

        System.out.println("Element not found inside the array!");
        return -1;
    }

    public int binarySearch(int element)
    {
            int left = 0; 
            int right = arr.length - 1; 

            while(left <= right)
            {
                int middle = (left + right) / 2;

                if(element < arr[middle])
                {
                    right = middle - 1; 
                }

                else if(element > arr[middle])
                {

                    left = middle + 1;
                }
                else
                {
                    System.out.println("Element: " + element + " is present at Position " + (middle + 1));
                    return middle;
                }

            }

            System.out.println("Element not found!!");
            return -1;
                

    }

}


class Sorting
{

    int[] arr;

    Sorting(int[] arr)
    {
        this.arr = arr;
    }

    public int[] bubbleSort()
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

        for(int i = 0; i< arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }

        return arr;
    }
}



class Algorithms
{
    public static void main(String args[])
    {
        /*

        // Example for searching.
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Search ls = new Search(arr);
        ls.linearSearch(3);
        ls.binarySearch(4);

        */

        // Example for sorting algorithms

        /*
        // Bubble sort example
        int[] arr = {1,4,2,98,13,7};
        Sorting s = new Sorting(arr);
        s.bubbleSort();
        */
    }
}
