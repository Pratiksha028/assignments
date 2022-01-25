package elearnings;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {3,6,9,12,15};
        int key = 12;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }

public static void binarySearch(int[] arr, int first, int key, int length){

        int mid = (first+length)/2;
        while(first<=length){

            if(arr[mid]<key){

                first = mid + 1;
            } else if(arr[mid]==key){
                System.out.println("Element is found at index :"+mid);
                break;
            }else {

                length=mid-1;
            }
            mid = (first+length)/2;
        }
            if(first>length){
                System.out.println("Element is not found");
            }
}
	}


