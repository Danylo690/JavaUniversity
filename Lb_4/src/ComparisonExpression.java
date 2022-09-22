public class ComparisonExpression implements Expression {
	protected int data1;
	protected int data2;
	
	public ComparisonExpression(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public void interpret(Context context) {
		context.setOutput(data1 > data2);
	}
}
