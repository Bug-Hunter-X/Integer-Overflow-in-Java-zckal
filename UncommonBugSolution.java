public class UncommonBugSolution {
    public static void main(String[] args) {
        // Using BigInteger to handle arbitrarily large integers
        BigInteger bigInteger = BigInteger.valueOf(Integer.MAX_VALUE);
        bigInteger = bigInteger.add(BigInteger.ONE);
        System.out.println(bigInteger); // Output: 2147483648

        // Checking for overflow before incrementing
        int i = Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            System.out.println("Integer overflow would occur if incremented");
        } else {
            i++;
            System.out.println(i);
        }
        
        // Using a try-catch block to handle potential exceptions (less ideal)
        try {
            int j = Integer.MAX_VALUE;
            j++;
            System.out.println(j); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Integer overflow occurred");
        }
    }
}