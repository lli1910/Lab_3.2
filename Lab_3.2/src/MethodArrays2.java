//Lily Li
//Period 2
//2/15/18
//Merge & Partition Sorts
public class MethodArrays2 {
	public static void main (String args[]) {
		String[] list1 = {};
	
	}
	
	public static String[] merge (String[] list1, String[] list2) {
		int diff = list1.length - list2.length;
		String[] newArr = {};
		for(int i = 0; i < list1.length + diff; i++) {
			for(int j = i; j < list2.length + diff; j++) {
				if(list1[i] < list2[j]) {
					newArr += list1[i];
				}
			}
		}
	}
	
	//public static int partition (int[] list) {
		
	//}
}
