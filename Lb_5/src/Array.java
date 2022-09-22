public class Array {
	private int[] array;
	private int countDif = 0;
	private final int len = 10;
	
	public Array() {
		array = new int[10];
	}
	public Array(int[] array) {
		this.array = array;
	}
	
	public void calculate() {
		for(int i = 1; i < array.length; i++) {
			if(array[0] != array[i] && array[array.length-1] != array[i]) {
				countDif++;
			}
		}
	}
	
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public int getCountDif() {
		return countDif;
	}
	public void setCountDif(int countDif) {
		this.countDif = countDif;
	}
	public int getLen() {
		return len;
	}
}
