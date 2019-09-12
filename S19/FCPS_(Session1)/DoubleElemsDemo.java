public class DoubleElemsDemo{

	public static void main(String[] args){
		
		int[] arr = { 1, 3, 5, 7, 9, 11 };
		
		System.out.print("Original array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		doubleElems(arr);
		System.out.print("\nModified array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void doubleElems(int[] arr){
	
		for(int i = 0; i < arr.length; i++){
			arr[i] *= 2;
		}
	}
}