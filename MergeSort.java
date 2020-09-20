import java.util.*;
public class MergeSort{
	public static void printarray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		mergesort(a,0,n-1);
		System.out.println("Final sorted array is:");
		printarray(a);
		
	}
     
	private static void mergesort(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low<high)
		{
			int mid=(low+high)/2;
			System.out.println("low= "+low+" mid= "+mid+" high= "+high);
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			System.out.println("Merge("+low+","+mid+","+high+")");
			merge(a,low,mid,high);
			System.out.print("array : ");
			printarray(a);
		}
		
	}
	private static void merge(int[] a, int low, int mid,int high) {
		// TODO Auto-generated method stub
		System.out.println("low= "+low+" mid= "+mid+" high= "+high);
		int n1=mid-low+1;
		int n2=high-mid;
		int lower[]=new int[n1];
		int higher[]=new int[n2];
		for(int i=0;i<n1;++i)
		{
		  lower[i]=a[low+i];	
		}
		for(int j=0;j<n2;++j)
		{
			higher[j]=a[mid+j+1];
		}
		int i=0;
		int j=0;
		int k=low;
		while(i<n1&&j<n2)
		{
			if(lower[i]<=higher[j])
			{
				a[k]=lower[i];
				i++;
			}
			else if(higher[j]<=lower[i])
			{
				a[k]=higher[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k]=lower[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=higher[j];
			j++;
			k++;
		}
		
	}
}
