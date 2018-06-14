import java.util.*;
public class BubbleSort
{
        public static void main(String args[])
        {
                Scanner obj=new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int n=obj.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++)
                {
                  a[i]=(int)(Math.random()*100+1);   //takes random number as input
                }
                bubbleSort(a);
                System.out.println(" SORTED ORDER : \n");
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+"\t");
                }
         }
         static void bubbleSort(int a[])
         {
                for(int i=0;i<a.length-1;i++)
                {
                        for(int j=0;j<a.length-1-i;j++)
                        {
                                if(a[j]>a[j+1])
                                {
                                        int temp=a[j];
                                        a[j]=a[j+1];
                                        a[j+1]=temp;
                                }
                        }
                }
                
         }
 }  