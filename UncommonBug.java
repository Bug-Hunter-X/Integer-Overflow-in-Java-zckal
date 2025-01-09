public class UncommonBug {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        i++;
        System.out.println(i); // Output: -2147483648

        long l = Long.MAX_VALUE;
        l++;
        System.out.println(l); // Output: -9223372036854775808
    }
}