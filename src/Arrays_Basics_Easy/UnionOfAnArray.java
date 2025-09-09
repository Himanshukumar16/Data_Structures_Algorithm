package Arrays_Basics_Easy;

public class UnionOfAnArray {
    public void unionOfAnArray(int[] arr1, int[] arr2) {

//        By Set : TC-> O(n1 + n2) , SC -> O(n1+n2)..

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

//        Set<Integer> unionArr = new LinkedHashSet<>();

//        while (i < n1 && j < n2) {

//            if (arr1[i] < arr2[j]) {
//                unionArr.add(arr1[i]);
//                i++;
//            }
//
//            else if (arr1[i] > arr2[j]) {
//                unionArr.add(arr2[j]);
//                j++;
//            }
//
//            else if (arr1[i] == arr2[j]) {
//                unionArr.add(arr1[i]);
//                i++;
//                j++;
//            }
//        }

//        while (i < n1) {
//            unionArr.add(arr1[i]);
//            i++;
//        }

//        while (j < n2) {
//            unionArr.add(arr2[j]);
//            j++;
//        }

//        ArrayList<Integer> arr = new ArrayList<>();
//        j = 0;

//        for( Object k : unionArr.toArray()){
//            arr.add((int)k);
//            j++;
//        }

//        System.out.println(arr);


//        By ArrayList : TC -> O((n1 + n2)^2) , SC -> O(n1 + n2)...

//        int n1 = arr1.length;
//        int n2 = arr2.length;
//        int i = 0;
//        int j = 0;
//        ArrayList<Integer> unionArr2 = new ArrayList<>();
//        while (i < n1 && j < n2) {
//            if (arr1[i] <= arr2[j]) {
//                if ((unionArr2.isEmpty() || !(unionArr2.indexOf(arr1[i]) == unionArr2.size() - 1))) {
//                    unionArr2.add(arr1[i]);
//                }
//                i++;
//            } else if (arr1[i] > arr2[j]) {
//                if ((!(unionArr2.indexOf(arr2[j]) == unionArr2.size() - 1)) || unionArr2.isEmpty()) {
//                    unionArr2.add(arr2[j]);
//                }
//                j++;
//            }
//        }
//        while (i < n1) {
//            if ((unionArr2.isEmpty() || !(unionArr2.indexOf(arr1[i]) == unionArr2.size() - 1))) {
//                unionArr2.add(arr1[i]);
//            }
//            i++;
//        }
//        while (j < n2) {
//            if ((!(unionArr2.indexOf(arr2[j]) == unionArr2.size() - 1)) || unionArr2.isEmpty()) {
//                unionArr2.add(arr2[j]);
//            }
//            j++;
//        }
//        System.out.println(unionArr2);


//        By Map : TC-> O(n1 + n2), SC-> O(n1 + n2)...

//        Map<Integer,Integer> map = new LinkedHashMap<>();
//        while(i < n1 && j < n2){
//            if(arr1[i] <= arr2[j]){
//                map.putIfAbsent(arr1[i],1);
//                i++;
//            }
//            else if(arr1[i] > arr2[j]){
//                map.putIfAbsent(arr2[j],1);
//                j++;
//            }
//        }
//        while(i < n1) {
//            map.putIfAbsent(arr1[i],1);
//            i++;
//        }
//        while(j < n2) {
//            map.putIfAbsent(arr2[j],1);
//            j++;
//        }
//        int ind = 0;
//        int[] arr = new int[map.size()];
//        for(int k : map.keySet()){
//            arr[ind] = k;
//            ind++;
//            System.out.println(k);
//        }
//        for(int k : arr) {
//            System.out.println(k);
//        }
    }
}
