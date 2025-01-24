
public class ArrayOperations {
	
	private int[] arr;
	
	public ArrayOperations(int[] arr) {
		this.arr = arr;
	}
	
	public boolean isEven(int index) {
		if(index < 0 || index >= arr.length) {
			throw new IndexOutOfBoundsException("Index must be 0 to " + (arr.length - 1));
		}
		return arr[index] % 2 == 0;
	}
	
}
