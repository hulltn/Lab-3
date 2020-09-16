import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class Main {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numInput; 
    System.out.println("Enter a number to count down or up from:");
    numInput= s.nextInt();
    if (numInput <=0)
    {for(int count = numInput; count <=0; count++)
    {
      System.out.println(count);
    }
    }
    else if (numInput >=0)
    {for(int count = numInput; count >=0; count--)
    {
      System.out.println(count);
    }
    
    }
  }
}