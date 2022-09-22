public class Demo {
	public static void main (String[] args){
		String test1 = "Interpreter";
		Context context1 = new Context(test1);
		
		//Тест номер 1 (перевірка contains та equals expressions)
		String data1 = "Interpreter pattern";
		Expression contains1 = new ContainsExpression(data1);
		
		String data2 = "Java";
		Expression contains2 = new ContainsExpression(data2);
		
		Expression equals1 = new EqualsExpression(contains1, contains2);
		
		boolean result = (Boolean)context1.getExpressionResult(equals1);
		System.out.println("Чи містить рядок " + data1 + " та рядок " 
							+ data2 + " підстроку " + test1 );
		System.out.println("Результат: " + result);
		
		//Тест номер 2 (перевірка not та and expressions)
		Expression not1 = new NotExpression(contains2);
		
		Expression and1 = new AndExpression(contains1, not1);
		
		boolean result2 = (Boolean)context1.getExpressionResult(and1);
		System.out.println("Чи містить рядок " + data1 + " підстроку " + test1
							+ " та в одночас рядок " + data2 + " не містить підстроку " + test1);
		System.out.println("Результат: " + result2);
		
		//Тест номер 3 (перевірка compound та comparison expressions)
		int number1 = 200;
		int number2 = 150;
		int number3 = 20;
		
		Expression compound1 = new CompoundExpression(number1, number2);
		Expression compound2 = new CompoundExpression(number1, number3);
		
		Expression comparison1 = new ComparisonExpression((Integer)context1.getExpressionResult(compound1), 
				(Integer)context1.getExpressionResult(compound2));
		
		boolean result3 = (Boolean)context1.getExpressionResult(comparison1);
		System.out.println("Сума чисел " + number1 + " та " + number2
							+ " більша ніж сума чисел " + number1 + " та " + number3);
		System.out.println("Результат: " + result3);
		
		//Тест номер 4 (перевірка or expression)
		Expression comparison2 = new ComparisonExpression(number1, number2);
		Expression comparison3 = new ComparisonExpression(number3, number2);
		
		Expression or1 = new OrExpression(comparison2,comparison3);
		
		boolean result4 = (Boolean)context1.getExpressionResult(or1);
		System.out.println("Число " + number1 + " більше " + number2
							+ " або " + number3 + " більше " + number2);
		System.out.println("Результат: " + result4);
	}
}
