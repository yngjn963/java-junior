package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		return(arrayStack.remove(len-1));
	}
}

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	/*
	 * 스택 메모리 구조는 스택 자료 구조 형식이다.
	 * 함수를 호출하면 스택 메모리에 지역 변수가 생성된다.
	 * 이때 함수를 호출하면 호출된 함수가 끝날 때까지 해당 함수의 메모리 공간은 계속 남아 있다.
	 * 이렇듯 가장 나중에 호출된 함수와 그 함수의 지역 변수가 사용하는 메모리는 스택 자료 구조와 같은 방식으로 운영된다.
	 */

}
