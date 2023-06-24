package Ternary_Search;

public class ternarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int ternarySearch(int[] a, int target) 
    {
        int s=0;
        int e=a.length-1;
        while(s<=e)
        {
            System.out.println("start= "+s);
            System.out.println("end= "+e);
            int m1=s+(e-s)/3; System.out.println("mid1= "+m1);
            int m2=e-(e-s)/3; System.out.println("mid2= "+m2);
            if(target==a[m1])
            return a[m1];
            
            if(target==a[m2])
            return a[m2];

            if(target<a[m1]) 
            e=m1-1;

            if(target>a[m2])
            s=m2+1;

            else
            s=m1+1;
            e=m2-1;
        }
        return -1;
    }
}
