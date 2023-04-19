public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        if (n == 0)
        {
           return 1;
        }
        else
        {
            int fact = 1;
            for (int i=1; i<=n; i++)
            {
                fact *= i;
            }
            return fact;
        }
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {

        if (n == 1)
        {
            return 1;
        }
        else if (n == 2)
        {
            return 1;
        }
        else
        {
            long a = 1;
            long b = 1;
            long c = 0;
            for (int i=3; i<=n; i++)
            {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String reversedWord = "";
        for (int i=0; i<word.length(); i++)
        {
            reversedWord += Character.toString(word.charAt(word.length()-1-i));
        }
        return reversedWord;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String newLine = "";
        String reversedLine = "";
        for (int i=0; i<line.length(); i++)
        {
            if (line.charAt(i) != ' ')
            {
                newLine += line.charAt(i);
            }
        }
        newLine = newLine.toLowerCase();
        for (int i=newLine.length()-1; i>=0; i--)
        {
            reversedLine += newLine.charAt(i);
        }
        if (reversedLine.equals(newLine))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *   ****h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char[][] plot = new char[str1.length()][str2.length()];
        for (int i=0; i<str1.length(); i++)
        {
            for (int j=0; j<str2.length(); j++)
            {
                if (str1.charAt(i) == str2.charAt(j))
                {
                    plot[i][j] = '*';
                }
                else
                {
                    plot[i][j] = ' ';
                }
            }
        }
        return plot;
    }
}
