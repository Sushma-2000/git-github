package p;
import java.util.*;
public class Count_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sorted[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max = Arrays.stream(a).max().getAsInt();
		int count[]=new int[max+1];
		for(int i=0;i<n;i++)
		{
			count[a[i]]++;
		}
		for(int i=1;i<=max;i++)
		{
			count[i]=count[i]+count[i-1];
		}
		for(int i=n-1;i>=0;i--)
		{
			count[a[i]]=count[a[i]]-1;
			sorted[count[a[i]]]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(sorted[i]);
		}
	}

}
