//Lily Li
//Period 2
//2/15/18
//Merge & Partition Sorts
public class MethodArrays2 {
	public static void main (String args[]) {
		String[] list1 = {"Alpha","Charlie","Echo"}, list2 = {"Beta","Delta"};
		
		for(String s: merge(list1,list2)) {
			System.out.println(s);
		}
		System.out.println("YOO");
		
	}
	
	public static String[] merge (String[] list1, String[] list2) {
		int diff = list1.length - list2.length, newIndex = 0;
		String[] newArr = {};
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
				}
			}
		}
		return newArr;
	}
	
	public static int partition (int[] list) {
		int pIndex = 0, checkIndex = list.length;
		while(pIndex != checkIndex) {
			if(list[pIndex])
		}
		
		return pIndex;
	
	}
}
