public class FindElemDemo{

	public static void main(String[] args){
		
		int[] arr = { 1, 3, 5, 7, 9, 11 };
		
		System.out.println("11 is located at index: " + findElem(arr, 11));
		System.out.println("2 is not in the array: " + findElem(arr, 2));
		
	}
	
	public static int findElem(int[] arr, int key){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == key){
				return i;
			}
		}
		
		return -1;
	}
}