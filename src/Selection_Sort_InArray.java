import java.util.Arrays;

public class Selection_Sort_InArray {
    public static void main(String[] args) {
    /*
        In Selection sort we fix the first element in array and compare
        with other element of the array swap with the min element.
     */
        int[] a = {55, 20, 60, 72, 90, 10, 54, 30};
        System.out.println("****Sorting By using selection sort****\n");
        selection(a);
        // calling Arrays.toString() method to print array.
        System.out.println(Arrays.toString(a));

    }
    static void selection(int [] a){
        for (int i = 0; i <a.length ; i++) {
            int min = i ,temp = 0;
            for (int j = i+1; j<a.length; j++){
                if (a[j]<a[min]){
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
