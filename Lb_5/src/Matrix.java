public class Matrix {
	private double [][] matrix;
	private final int len = 3;
	private int iMaxElem;
	private int jMaxElem;
	
	public Matrix() {
	}
	public Matrix(double[][] matrix){
		this.matrix = matrix;
	}
	
	public double[][] createMatrix() {
		matrix = new double[len][len];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				matrix[i][j] = Math.random()%10;
			}
		}
		return this.matrix;
	}
	public double[][] changeMatrix() {
		findMaxElem(this.matrix);
		if(iMaxElem != 0) {
			swapRows(iMaxElem);
		}
		if(jMaxElem != 0) {
			swapColls(jMaxElem);
		}
		return this.matrix;
	}
	public double findMaxElem(double[][] matrix) {
		double max = matrix[0][0];
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
					iMaxElem = i;
					jMaxElem = j;
				}
			}
		}
		return max;
	}
	public void swapColls(int jPos) {
		for(int i = 0; i < len; i++) {
			for(int j = jPos; j > 0; j--) {
			   double temp = matrix[i][j-1];
		       matrix[i][j-1] = matrix[i][j];
		       matrix[i][j] = temp;
			}
		}
	}
	public void swapRows(int iPos) {
		for(int i = iPos; i > 0; i--) {
		   double temp[] = matrix[i-1];
	       matrix[i-1] = matrix[i];
	       matrix[i] = temp;
		}
	}
	
	public double[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}
	public int getiMaxElem() {
		return iMaxElem;
	}
	public void setiMaxElem(int iMaxElem) {
		this.iMaxElem = iMaxElem;
	}
	public int getjMaxElem() {
		return jMaxElem;
	}
	public void setjMaxElem(int jMaxElem) {
		this.jMaxElem = jMaxElem;
	}
	public int getLen() {
		return len;
	}
}