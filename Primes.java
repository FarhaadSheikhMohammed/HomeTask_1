public class Primes 
{
    public static void main(String[] args) 
    {
        int nValues = 50;
        First For Loop:
        for (int i = 2; i <= nValues; i++) 
        {
            int square_root = (int) Math.sqrt(i);
            for (int j = 2; j <= square_root; j++) 
            {
                if (i % j == 0) 
                {
                    continue First For Loop;
                }
            }            
            System.out.println(i);
        }
    }
}