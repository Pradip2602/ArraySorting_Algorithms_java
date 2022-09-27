public class Bubble_Sort_InArray {
    public static void sort(int[] a){
        // first loop will be the used for do pass over the array.
        for (int i = 0; i <a.length-1; i++) {
            /* 2nd loop  used for  check the number and swap.
               - a[j] --> current element
                 a[j-1] --> previous element
               it starts from 1st element and check the last element
                 is large then swap the elements position
             */
            for(int j=1; j<a.length; j++){
                if (a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
    /* In bubble sort we compare first elements with second element
       and greater number will be swapped till the end of array.
    * */
        int[] a = {20,65,75,10,60,40,25};
        System.out.println("****Sorting By Using Bubble sort**** ");
        sort(a);
    }
}
