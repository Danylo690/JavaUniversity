public class OrExpression implements Expression {
	protected Expression expressionA;
	protected Expression expressionB;

	public OrExpression(Expression expressionA, Expression expressionB) {
		super();
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}
	
	@Override
	public void interpret(Context context) {
		boolean result = (Boolean)context.getExpressionResult(expressionA) 
						|| (Boolean)context.getExpressionResult(expressionB);
		context.setOutput(result);
	}
}
