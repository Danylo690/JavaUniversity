public class AndExpression implements Expression {
	protected Expression expressionA;
	protected Expression expressionB;

	public AndExpression(Expression expressionA, Expression expressionB) {
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}

	@Override
	public void interpret(Context context) {
		boolean result = (Boolean)context.getExpressionResult(expressionA) 
						&& (Boolean)context.getExpressionResult(expressionB);
		context.setOutput(result);
	}
}
