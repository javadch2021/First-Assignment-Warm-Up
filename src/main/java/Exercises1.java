public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public static long factorial(int n) {
        // TODO
        int ans =1;
        for(int i =1;i<n+1;i++){
            ans*=i;
        }
        return ans;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public static long fibonacci(int n) {
        // TODO
        long i = 0;
        long j = 1;
        for (int k = 0; k < n; k++){
            long temp = i;
            i = j;
            j += temp;
        }
        return i;
    }


    public char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i+1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {

    }

}