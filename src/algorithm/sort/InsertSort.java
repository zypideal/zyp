package algorithm.sort;

public class InsertSort {

    public static void sort(int[] a){
        if(a == null || a.length == 0 ){
            throw new NullPointerException();
        }

        sort(a, 0, a.length-1);
    }

    public static void sort(int[] a, int from, int to){
        for(int i = from + 1; i <= to; i++){
            int j = i;
            while (j > from && less(a[j], a[j-1])){
                swap(a,j-1, j);
                j--;
            }
        }
    }


    public static boolean less(int m, int n){
        return m < n ? true : false;
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args){
        int[] a = {1,7,4,6,8,2,5,1,6,3};
        sort(a);

        for(int i : a){
            System.out.println(i);
        }
    }
}
