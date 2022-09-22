public class CompoundExpression implements Expression{
	protected int data1;
	protected int data2;

	public CompoundExpression(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public void interpret(Context context) {
		context.setOutput(data1 + data2);
	}
}
