import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i+=2)
        {
            sum += arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i=0; i<arr.length; i++)
        {
            reversedArray[i] = arr[arr.length-1-i];
        }
        return reversedArray;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        return null;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> ans = new ArrayList<List<String>>();
        for (int i=0; i<names.length; i++)
        {
            List<String> sub = new ArrayList<String>();
            for (int j=0; j<names.length+1; j++)
            {
               sub.add(names[i][j]);
            }
            ans.add(sub);
        }
        return ans;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> prime = new ArrayList<Integer>();
        int number = n;
        for (int i=2; i<=n; i++)
        {
            if (number % i == 0)
            {
                while (number % i == 0)
                {
                    number /= i;
                }
                prime.add(i);
            }
        }
        return prime;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> ans = new ArrayList<String>();
        String word = "";
        for (int i=0; i<line.length(); i++)
        {
            if ((line.charAt(i)>=65 && line.charAt(i)<=90) || (line.charAt(i)>=97 && line.charAt(i)<=122))
            {
                word += line.charAt(i);
                if (!((line.charAt(i+1)>=65 && line.charAt(i+1)<=90) || (line.charAt(i+1)>=97 && line.charAt(i+1)<=122)))
                {
                    ans.add(word);
                    word = "";
                }
            }
        }
        return ans;
    }
}
