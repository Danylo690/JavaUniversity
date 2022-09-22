public class ContainsExpression implements Expression{
	protected String data;

	public ContainsExpression(String data) {
		this.data = data;
	}
	
	@Override
	public void interpret(Context context) {
		context.setOutput(data.contains((String)context.getInput()));
	}
}
