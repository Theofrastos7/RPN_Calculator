package package1;
import java.util.Stack;

public class RpnCalculator {
	
	static RpnCalculatorGui cg;
	static Stack<Double> st;
	static Operand op;

	
	public static void main(String[] args) {
		
		cg = new RpnCalculatorGui("RPN CALCULATOR");
		st = new Stack<Double>();
		op = new Operand();
		
	}

}
