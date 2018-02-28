import java.util.Arrays;

//Lily Li
//Period 2
//2/15/18
//Merge & Partition Sorts
public class MethodArrays2 {
	public static void main (String args[]) {
		//Testing arrays
		String [] test1 = {"apple", "cucumber", "microsoft", "zorro"};
		String [] test2 = {"banana", "cherry", "mahogany", "oreos", "pinata"};
		int[] test3 = {3,4,2,7,12,22,0,1};
		
		String[] mergeResult = merge(test1,test2);
		System.out.println(Arrays.toString(mergeResult)); 
		
		System.out.print("banananananandada");
		//Merge Test
	/*	long start = System.nanoTime();
		String[] mergeResult = merge(test1,test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: "+ time + "nanoseconds");
		System.out.println(Arrays.toString(mergeResult)); 
		//Should print the array with all words in alpha order.
	
		//Partition test
		start = System.nanoTime();
		int pivotFinalPos = partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds");
		System.out.println("Final Pivot Position: " + pivotFinalPos);
		System.out.println(Arrays.toString(test3));
		
	*/	
	}
	
	
	public static String[] merge (String[] list1, String[] list2) {
		int newIndex = 0,left = 0,right = 0;
		String[] newArr = new String[list1.length + list2.length];
		int remaining = Math.abs(list1.length-list2.length);
		
		while(newIndex < newArr.length && left<list1.length - remaining && right< list2.length - remaining)  { //whichever is less, say left is less, then left< list1.length and right is list2.length -remaining.
			if(list1[left].compareTo(list2[right])<0) {
				newArr[newIndex] = list1[left];
				newIndex++;
				left++;
			}
			else if(list2[right].compareTo(list1[left])<0) {
				newArr[newIndex] = list2[right];
				newIndex++;
				right++;
			}
		}	
		
		if(remaining>0) {
			for(int i = left + 1; i<remaining; i++) {
				newArr[newIndex] = list1[i];
				newIndex++;
			}
		}
		return newArr;		
	}
	
	
	public static int partition (int[] list) {
		int pIndex = 0, checkIndex = list.length;
		while(pIndex != checkIndex) {
			if(list[pIndex]>list[checkIndex]) {
				intSwap(list, pIndex, checkIndex);
				checkIndex++;
			} 
		}
		return pIndex;
	}
	
	public static void intSwap(int[]arr, int index1, int index2) {
		int num = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=num;
	}
}
