
public class QuickSort 
{
    public static void main(String[] args) 
    {
        int a[]={4,3,5,1,2};
        quickSort(a, 0, a.length-1);
        for(int i: a)
            System.out.print("--->"+i+" ");
        }
        public static void quickSort(int a[],int l,int h)
        {
            if(l>=h)return;
            int p=a[l];
            int x=partition(a,l,h,p);
            quickSort(a, l, x-1);
            quickSort(a, x+1, h);
        }
        public static int partition(int a[],int l,int h,int p)
        {
        int i=l,j=h;
        while(i<=j)
        {
            while(i<=h && a[i]>=p)i++;
            while(j>=l && a[j]<p)j--;
            if(i>j)break;
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        int x=a[l];
        a[l]=a[j];
        a[j]=x;
        return j;
    }
}
