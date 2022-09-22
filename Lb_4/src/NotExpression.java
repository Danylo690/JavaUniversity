public class NotExpression implements Expression{
	protected Expression expression;
	
	public NotExpression(Expression expression) {
		this.expression = expression;
	}
	
	@Override
	public void interpret(Context context) {		
		boolean result = !(Boolean)context.getExpressionResult(expression);
		context.setOutput(result);
	}

}
