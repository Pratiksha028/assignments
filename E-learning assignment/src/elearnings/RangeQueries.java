package elearnings;

public class RangeQueries {
	static int k = 10;
    static int N = 100; 
    static long t[][] = new long[N][k + 1]; 
    static void buildSparseTable(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            t[i][0] = arr[i]; 
        for (int j = 1; j <= k; j++) 
            for (int i = 0; i <= n - (1 << j); i++) 
                t[i][j] = t[i][j - 1] + t[i + (1 << (j - 1))][j - 1]; 
    } 
    static long query(int L, int R) 
    {
        long result= 0; 
        for (int j = k; j >= 0; j--)  
        { 
            if (L + (1 << j) - 1 <= R)  
            { 
                result = result + t[L][j];
                L += 1 << j; 
            } 
        } 
        return result; 
    }
    public static void main(String args[]) 
    { 
        int arr[] = { 3, 7, 2, 7, 3, 9 }; 
        int n = arr.length; 
        buildSparseTable(arr, n); 
        System.out.println(query(0, 2)); 
        System.out.println(query(2, 5)); 
        System.out.println(query(2, 3)); 
    } 


}
