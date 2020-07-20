import java.util.*;
public class SumWeights{
	public static void main(String args[]){
		int a[]={10,36,54,89,12};
		int n=a.length;
		Arrays.sort(a);
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=0;
			int s=(int)Math.sqrt(a[i]);	
			if(s*s==a[i])
			{
				b[i]=b[i]+5;
			}
			if(a[i]%4==0&&a[i]%6==0)
			{
				b[i]=b[i]+4;
			}
			if(a[i]%2==0)
			{
				b[i]=b[i]+3;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("<"+a[i]+","+b[i]+">");
		}
	}
}