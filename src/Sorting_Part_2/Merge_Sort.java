// tc -> O(NlogN); sc -> N ;
package Sorting_Part_2;
public class Merge_Sort {
    public static void main(String[] args) {
        Sol s = new Sol();
        int [] arr = {5,2,3,1};
        s.sortMerge( arr,0, arr.length - 1);
        for ( int k : arr ){
            System.out.println(k + " ");
        }
    }
}
class Sol{
    public void sortMerge( int [] arr, int low , int high ){
        if ( low >= high ) return;
        int mid = ( low + high ) / 2;
        sortMerge( arr , low , mid );
        sortMerge( arr , mid + 1, high );
        merge( arr , low , mid , high );
    }
    public void merge(int [] arr , int low , int mid , int high){
        int [] temp = new int[arr.length];
        int i = 0;
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp[i] = arr[left];
                left++;
                i++;
            }else{
                temp[i] = arr[right];
                right++;
                i++;
            }
        }
        while (left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }
        while (right <= high){
            temp[i] = arr[right];
            right++;
            i++;
        }
        for (int j = low; j <= high; j++) {
            arr[j] = temp[j - low];
        }
    }
}
