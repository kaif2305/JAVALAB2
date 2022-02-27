import java.util.*;
public class JAVALAB1B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the nubers : ");
        for (int i = 0; i < array.length; i++)
        {
          
          int num = sc.nextInt();
          array[i] = num;
       }
       int c = 0;
	for(int i = 0; i < array.length; i++)
	{
		if(array[i] % 2 == 0)
			c++;
	}
	
	System.out.println("Number of even numbers : "+c);
	System.out.println("Number of odd numbers  : "+(array.length-c));
}
}