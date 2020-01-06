import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,7,1,4,9};
		int l=0;
		int r=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					l=arr[i];
					arr[i]=arr[j];
					arr[j]=l;
				}
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		System.out.println(arr[arr.length-2]);
		
		

	}

}
