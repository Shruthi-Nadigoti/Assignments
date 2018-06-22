import java.util.*;
public class BubbleSort{
        public static void main(String args[]){
                final Scanner obj=new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int size=obj.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                  arr[i]=(int)(Math.random()*100+1);   //takes random number as input
                }
				BubbleSort bubblesortObj=new BubbleSort();
                bubblesortObj.bubbleSort(arr);
                System.out.println(" SORTED ORDER : \n");
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+"\t");
                }
         }
		 //this method sort the array
         void bubbleSort(int arr[]){
                for(int i=0;i<arr.length-1;i++){
                        for(int j=0;j<arr.length-1-i;j++){
                                if(arr[j]>arr[j+1])
										swap(arr,j);
                        }
                }     
         }
		 //this method swap the index with index+1
		 void swap(int arr[],int index){
			int temp=arr[index];
			arr[index]=arr[index+1];
			arr[index+1]=temp;
		 }
 }  