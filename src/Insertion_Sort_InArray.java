import java.util.Arrays;

public class Insertion_Sort_InArray {

    public static void main(String[] args) {
    /*
           In Insertion sort there are two parts sorted part and
           unsorted part, we compare sorted elements with unsorted
           element and makes space for small element.
     */
        int [] a = {55,28,65,43,98,12,70};
        System.out.println("**** Sorting By Using Insertion Sort****\n");
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int [] a){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j=i+1; j>0; j--){
                if (a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
//                else {
//                    break;
//                }
            }
        }
    }
}
