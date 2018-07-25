class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=3;
		int a[]={7,2,3};
		int max=a[0],min=a[0];
		for(int i=0;i<n;i++)
		{
           if(a[i]>max)
           {
           	max=a[i];
           }
           if(a[i]<min)
           {
           	min=a[i];
           }
		}
           	System.out.print(min+" "+max);
	}
}
