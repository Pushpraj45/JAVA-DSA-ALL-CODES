public class heapSort {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        heapSort(arr);

//        print
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void heapSort(int arr[]){
//        Step 1 - build maxheap
        int n=arr.length;
        for (int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }

//        Step 2 - push largest at the end
        for(int i=n-1; i>0; i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i); // will increase
        }
    }
    public static void heapify(int arr[], int i, int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxidx=i;

//        we are creating max heap now
        if (left<size &&  arr[left]> arr[maxidx] ){
            maxidx=left;
        }
        if (right<size && arr[right] >arr[maxidx]){
            maxidx=right;
        }
        if (maxidx!=i){
//            swap
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;

            heapify(arr, maxidx, size);
        }
    }
}
