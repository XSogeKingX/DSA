// import java.util.*;
public class MergeSort {
    public static void main(String args[])
    {
        int a[]={4,5,2,3,1,4,2,5,6,1,2,3,4,5,10,8,56,3,23,12,14,15,16,11,45,67,6};
        mergeSort(a,0,a.length-1);
        for(int i:a)
            System.out.print(i+" ");
    }
    public static void mergeSort(int []a,int l,int h)
    {
        if(l>=h)return;
        int m=(l+h)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,h);
        merge(a,l,m,h);
    }
    public static void merge(int a[],int l,int m,int h)
    {
        int k=0,i=l,j=m + 1;
        int ans[]=new int[h-l+1];
        while(i<=m && j<=h)
        {
            if(a[i]>a[j])
                ans[k++]=a[i++];
            else
                ans[k++]=a[j++];   
        }
            while(i<=m)
                ans[k++]=a[i++];
            while(j<=h)
                ans[k++]=a[j++];
        k=0;
        for(int f=l;f<=h;f++)
            a[f]=ans[k++];
    }
}