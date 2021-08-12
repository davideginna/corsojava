package exception;

public class MainException {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
            System.out.println(i);
            int[] arr = new int[1];
            System.out.println(arr[1]);
        } catch (RuntimeException runtimeException) {
            throw new RuntimeException(runtimeException);
        }
        /*catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            throw new RuntimeException(arrayIndexOutOfBoundsException);
        }*/

    }
}
