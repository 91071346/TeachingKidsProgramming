public class Pow1
{
  public static void main(String[] args)
  {
    int base = 3;
    int exponent = 3;
    int result = pow(base, exponent);
    System.out.println("the answer is: " + result);
  }
  public static int pow(int base, int exponent)
  {
    int product = 1;
    for (int i = 0; i < exponent; i++)
    {
      product = product * base;
    }
    return product;
  }
}//end of class
