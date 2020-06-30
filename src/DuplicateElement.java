public class DuplicateElement {
    // This is a program to find the duplicate values of an array of integer values
        public static void main(String[] args) {

            //Initialize array
            int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
            System.out.println("Duplicate elements in given array: ");
            //Searches for duplicate element
            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j])// if element is duplicated
                        System.out.println(arr[j]);
            }
        }
    }
}
