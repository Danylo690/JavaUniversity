public class EqualsExpression implements Expression {
	protected Expression expressionA;
	protected Expression expressionB;
	
	public EqualsExpression(Expression expressionA, Expression expressionB) {
		this.expressionA = expressionA;
		this.expressionB = expressionB;
	}
	
	@Override
	public void interpret(Context context) {
		boolean result = context.getExpressionResult(expressionA) == context.getExpressionResult(expressionB);
		context.setOutput(result);
	}

}
