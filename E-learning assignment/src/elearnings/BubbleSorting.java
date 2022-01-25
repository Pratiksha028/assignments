package elearnings;

public class BubbleSorting {

	public static void main(String[] args) {
	     int[] array= {78,22,18,4,17};
	     bubbleSort(array);
	     for(int i=0;i<array.length;i++){
	        System.out.println(array[i]);
	}
}
	public static void bubbleSort(int[] array){
        int len = array.length;
        int temp = 0;
        for(int i=0;i<len;i++){
            for (int j=1;j<(len);j++){
                if(array[j-1]>array[j]){
                temp = array[j-1];
                array[j-1]= array[j];
                array[j]= temp;
                }
            }
        }
    }
}
