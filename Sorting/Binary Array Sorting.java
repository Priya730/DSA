class BinarySort
{
    static void binSort(int arr[], int n)
    {
        // add your code here
        int countzeros = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0)
                countzeros++;
        }
        for(int i=0; i<countzeros; i++){
            arr[i] = 0;
        }
        
        for(int i = countzeros; i<n; i++){
            arr[i] = 1;
        }
        /**************
        * No need to print the array
        * ************/
    }
}
