import java.util.*;
public class QuickSort{
        public static void main(String args[]){
                Scanner obj=new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int n=obj.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++){
                  a[i]=(int)(Math.random()*100+1);  
                }
                quickSort(a,0,a.length-1);
                System.out.println("SORTED ORDER : \n");
                for(int i=0;i<n;i++){
                        System.out.print(a[i]+"\t");
                }     
        }
        static void quickSort(int A[],int l,int r){
                if(l>=r){
                        return;
                }
                else{
                        int pIndex=partion(A,l,r);
                        quickSort(A,l,pIndex-1);
                        quickSort(A,pIndex+1,r);
                }
        }
        static int partion(int A[],int l,int r){
                int temp;
                int pivot=A[r];
                int Pindex=l;
                for(int i=l;i<r;i++)
                {
                        if(A[i]<=pivot)
                        {
                              temp=A[i];
                                A[i]=A[Pindex];
                                A[Pindex]=temp;
                                Pindex++;
                        }
                }
                temp=A[r];
                A[r]=A[Pindex];
                A[Pindex]=temp;
                return Pindex;
                
        }
}

