
package Sorting_Part_2;
public class Merge_Sort {
    public static void main(String[] args) {
        Sol s = new Sol();
        int [] arr = { 5,4,3,2,10 };
        s.sortMerge( arr,0,5 );
    }
}
class Sol{
    public void sortMerge( int [] arr, int low , int high ){
        if ( low >= high ) return;
        int mid = ( low + high ) / 2;
        sortMerge( arr , low , mid );
        sortMerge( arr , mid + 1, high );
//        merge( arr , low , mid , high );
        for ( int i : arr ){
            System.out.println(i + " ");
        }
    }
    public void merge(int [] arr , int low , int mid , int high){
        int [] temp = new int[arr.length];
        int i = 0;
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(left < right){
                temp[i] = left;
                left++;
            }else{
                temp[i] = right;
            }
            i++;
        }
        for (int j = low; j < high; j++) {
            arr[j] = temp[j - low];
        }
    }
}
