
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


}


class Algorithms
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3};

        Search ls = new Search(arr);
        ls.linearSearch(3);
    }
}