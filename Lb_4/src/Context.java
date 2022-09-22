public class Context {
	private Object input;
	private Object output;
	
	public Context(String input) {
		this.input = input;
	}

	public Object getInput() {
		return input;
	}
	public void setInput(Object input) {
		this.input = input;
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object output) {
		this.output = output;
	}

	public Object getExpressionResult(Expression expression)
	{
		expression.interpret(this);
		return output;
	}
}
