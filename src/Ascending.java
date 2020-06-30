public class Ascending {
    //This is a  program to enter array and sort the values in ascending order
    public static void main(String[] args) {
        int n, temp;
        int a[] = {1,5,9,7,3,2,4,6,8,10};// initialise the values in array
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) { // to sort the integers in array
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");// Print in ascending order
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ","); }
        System.out.print(a[a.length - 1]);
    }
}