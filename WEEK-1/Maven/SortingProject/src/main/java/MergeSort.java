import java.util.*;
public class MergeSort{
        public static void main(String args[]){
                final Scanner obj=new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int size=obj.nextInt();
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                  arr[i]=(int)(Math.random()*100+1); //takes random number as input
                }
				MergeSort mergesortObj=new MergeSort();
                mergesortObj.mergesort(arr,0,arr.length-1);
                System.out.println(" SORTED ORDER : \n");
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"\t");
                }       
        }
		// this method sort the input array by diving the array
        void mergesort(int[] arr,int lowerIndex,int higherIndex){
                int middleIndex=(lowerIndex+higherIndex)/2;
                if(lowerIndex>=higherIndex)
                        return;
                else{
                        mergesort(arr,lowerIndex,middleIndex);
                        mergesort(arr,middleIndex+1,higherIndex);
                        merge(arr,lowerIndex,middleIndex,higherIndex);
                }
        }
		//this will merge the array
        void merge(int arr[],int l,int m,int h)
        {
				//l=lowerIndex, m=middleIndex, h=higherIndex
                int i,j,k=0;
                int n1=m-l+1;
                int n2=h-m;
                int copy1[]=new int[n1];
                int copy2[]=new int[n2];
                for( i=0;i<copy1.length;i++){
                        copy1[i]=arr[l+i];
                }
                for(j=0;j<copy2.length;j++){
                        copy2[j]=arr[m+1+j];
                }
               sortPartofArray(copy1,copy2,arr,l);
        }
		
		
		//sorting the part of the original array using two copy arrays.
		void sortPartofArray(int copy1[],int copy2[],int arr[],int lowerIndex){
		// i is index of copy1 array
		// j is index of copy2 array
		// k is index of original array
			int i=0,j=0,k=lowerIndex;
                while(i<copy1.length && j<copy2.length){
                        if(copy1[i]<copy2[j]){
                                arr[k]=copy1[i];
                                i++;
                                k++;
                        }
                        else{
                                arr[k]=copy2[j];
                                j++;
                                k++;
                        }
                        
                }
                while(i<copy1.length){ // copying remaining copy1 array elements
                        arr[k]=copy1[i];
                        i++;
                        k++;
                }
                while(j<copy2.length){ // copying remaining copy2 array elements
                        arr[k]=copy2[j];
                        j++;
                        k++;
                        
                }
		}
       
        
}
