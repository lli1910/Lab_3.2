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
		
		//Merge Test
		long start = System.nanoTime();
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
	}
	
	
	public static String[] merge (String[] list1, String[] list2) {
		int diff = list1.length - list2.length, newIndex = 0;
		String[] newArr = {};
		
		//use while loop
		for(int i = 0; i < list1.length + diff; i++) {
			for(int j = i; j < list2.length+diff; j++) {
				if(list1[i].compareTo(list2[j])>0) {
					newArr[newIndex] = list1[i];
					newIndex++;
					i++;
					j--;
				}
				else if(list2[j].compareTo(list1[i])>0) {
					newArr[newIndex] = list2[j];
					newIndex++;
					j++;
				}
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
