
public class Specific_Value {
    //This is a program to test if an array contains a specific value.
        public static boolean contains(int[] arr, int item) {
            for (int n : arr) {
                if (item == n) {
                    return true;
                }
            }
            return false;
        }
        public static void main(String[] args) {
            int[] my_array1 = {1,2,3,4,5,6,7,8,9,10};
            System.out.println(contains(my_array1, 5));//Test if array contains int 5
            System.out.println(contains(my_array1, 11));//Test if array contains int 11
    }
}
