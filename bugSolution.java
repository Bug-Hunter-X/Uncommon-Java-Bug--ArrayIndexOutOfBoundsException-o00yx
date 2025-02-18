public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // This line will still throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
            System.out.println("Valid indices are between 0 and " + (arr.length -1));
        }
    }
} 