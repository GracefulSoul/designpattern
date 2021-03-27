package gracefulsoul.behavioral.interpreter;

import gracefulsoul.behavioral.interpreter.expression.AndExpression;
import gracefulsoul.behavioral.interpreter.expression.Expression;
import gracefulsoul.behavioral.interpreter.expression.OrExpression;
import gracefulsoul.behavioral.interpreter.expression.TerminalExpression;

public class InterpreterPatternMain {

	// Rule: Robert and John are male
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// Rule: Julie is a married women
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}

}