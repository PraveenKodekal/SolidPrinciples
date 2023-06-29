package solidPrinciples.openCloses;
//Open for Extensions and closed for modifications
//this id allow you for modifications// (You can modify the ascending order to descending order
// Hence it does not follow Open Close principle
public class ArrayUtils {
	
	/**
	 * @param arr
	 */
	public static void sortArray(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		int [] arr= {1,4,6,2,3};
		ArrayUtils.sortArray(arr);
		for(int ele: arr) {
			System.out.println(ele);
		}
	}

}
 