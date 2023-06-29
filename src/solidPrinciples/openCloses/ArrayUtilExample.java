package solidPrinciples.openCloses;


/**
 * Following example will illustrates the Open-CLose Principle
 * @author Praveen via  tekCreek Youtube Channel
 *
 */




/**
 * @return  +ve if value1 < value2 Ascending
 * 			-ve if value1 > value2 Descending
 * 			0   if value1 = value2
 *
 */
interface ValueComparator{
	
	int compare(int value1, int value2);
	
}




/**
 * @return Ascending order
 *
 */
class AscendingSort implements ValueComparator{

	@Override
	public int compare(int value1, int value2) {
		// TODO Auto-generated method stub
		return value1- value2;
	}
	
}

/**
 * @return Descending order
 *
 */
class Descendingorder implements ValueComparator{

	@Override
	public int compare(int value1, int value2) {
		// TODO Auto-generated method stub
		return value2- value1;
	}
	
}




/**
 * @author Implementation of Open Close Principle
 *
 */
public class ArrayUtilExample {
	
	public static final void sortArray(int a[], ValueComparator comparator) {
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a.length; j++) {
				if(comparator.compare(a[i], a[j])>0) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
	}

}

class mainOpenClose{
	public static void main(String[] args) {
		int arr[]= {1,4,2,6,3};
		
		ArrayUtilExample.sortArray(arr, new AscendingSort());
		for(int ele : arr) {
			System.out.println(ele);
		}
	
	}
	
}
