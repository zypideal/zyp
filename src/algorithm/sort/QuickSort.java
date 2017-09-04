package algorithm.sort;

public class QuickSort {

    public static void  sort(int[] a){
        if(a == null || a.length ==0) {
            throw new NullPointerException();
        }

        sort(a, 0, a.length-1);

    }

    public static void sort(int[] a, int from, int to){
        if(from == to){
            return;
        }

        int index = partition(a, from ,to);

        if(index > from){
            sort(a, from, index-1);
        }

        if(index < to){
            sort(a, index+1, to);
        }
    }

    public static int partition(int[] a, int from, int to){
        int i = from-1;
        int temp = a[to];

        for(int j = from; j < to; j++){
            if(a[j] < temp){
                i++;
                swap(a, i ,j);
            }
        }

        i++;
        swap(a, i, to);

        return i;
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
