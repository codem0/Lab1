package expression;

import static org.junit.Assert.*;

import java.util.Scanner;
import java.util.Stack;

import org.junit.Test;

public class Junit_test {

	@Test
	public void test() {
		String exp="10+x+y";
		expression2 temp1=new expression2(exp);
		Stack<String> test1=new Stack<>();
		Stack<String> result=temp1.retExpression();
		test1.add("10");
		test1.add("+");
		test1.add("x");
		test1.add("+");
		test1.add("y");
		assertArrayEquals(test1,result);
	}

	private void assertArrayEquals(Stack<String>a,Stack<String> b) {
		// TODO Auto-generated method stub
		int i;
		if(a.size()==b.size()){
			for(i=0;i<a.size();i++){
				if(!a.get(i).equals(b.get(i))){
					System.out.println("not equal");
					break;
				}
			}
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
	}

}
