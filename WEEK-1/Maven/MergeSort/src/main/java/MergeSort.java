import java.util.*;
public class MergeSort{
        public static void main(String args[]){
                Scanner obj=new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int n=obj.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++){
                  a[i]=(int)(Math.random()*100+1); //takes random number as input
                }
                mergesort(a,0,a.length-1);
                System.out.println(" SORTED ORDER : \n");
                for(int i=0;i<n;i++){
                        System.out.print(a[i]+"\t");
                }       
        }
        static void mergesort(int[] a,int l,int h){
                int m=(l+h)/2;
                if(l==h)
                        return;
                else{
                        mergesort(a,l,m);
                        mergesort(a,m+1,h);
                        merge(a,l,m,h);
                }
        }
        static void merge(int arr[],int l,int m,int h)
        {
                int i,j,k=0;
                int n1=m-l+1;
                int n2=h-m;
                int l1[]=new int[n1];
                int l2[]=new int[n2];
                for( i=0;i<n1;i++){
                        l1[i]=arr[l+i];
                }
                for(j=0;j<n2;j++){
                        l2[j]=arr[m+1+j];
                }
                i=0;j=0;k=l;
                while(i<n1&&j<n2){
                        if(l1[i]<l2[j])
                        {
                                arr[k]=l1[i];
                                i++;
                                k++;
                        }
                        else
                        {
                                arr[k]=l2[j];
                                j++;
                                k++;
                        }
                        
                }
                while(i<n1){
                        arr[k]=l1[i];
                        i++;
                        k++;
                }
                while(j<n2){
                        arr[k]=l2[j];
                        j++;
                        k++;
                        
                }
        }
       
        
}
