public class Array {
    // This is a  program to sum values of an array.
        public static void main(String[] args) {
            int Array[] = {10,20,30}; // array values

            int sum = 0;
            for (int i=0; i<Array.length; i++)
            { sum = sum + Array[i];} // Sum of array values
            System.out.println("The sum is " + sum);
    }
}
