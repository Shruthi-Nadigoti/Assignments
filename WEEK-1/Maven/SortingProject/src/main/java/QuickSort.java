import java.util.*;
public class QuickSort{
        public static void main(String args[]){
                final Scanner obj=new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int size=obj.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                  arr[i]=(int)(Math.random()*100+1);  
                }
				QuickSort quicksortObj=new QuickSort();
                quicksortObj.quickSort(arr,0,arr.length-1);
                System.out.println("SORTED ORDER : \n");
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"\t");
                }     
        }
		// sort the array by diving array using pivot index
        void quickSort(int arr[],int lowerIndex,int higherIndex){
                if(lowerIndex>=higherIndex){
                        return;
                }
                else{
                        int pivotIndex=partition(arr,lowerIndex,higherIndex);
                        quickSort(arr,lowerIndex,pivotIndex-1);
                        quickSort(arr,pivotIndex+1,higherIndex);
                }
        }
		// sets the pivot element into correct index and returns pivot index
        int partition(int arr[],int lowerIndex,int higherIndex){
                int temp;
                int pivot=arr[higherIndex];
                int PivotIndex=lowerIndex;
                for(int i=lowerIndex;i<higherIndex;i++)
                {
                        if(arr[i]<=pivot)
                        {
								temp=arr[i];
                                arr[i]=arr[PivotIndex];
                                arr[PivotIndex]=temp;
                                PivotIndex++;
                        }
                }
                temp=arr[higherIndex];
                arr[higherIndex]=arr[PivotIndex];
                arr[PivotIndex]=temp;
                return PivotIndex;
                
        }
}

