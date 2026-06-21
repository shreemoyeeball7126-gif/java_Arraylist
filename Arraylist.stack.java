package assingment;

import java.util.ArrayList;

class MyStack{
	int data;
	static ArrayList<Integer> list=new ArrayList<>();
	
	public static void push(int data) {
		list.add(data);
	}
	public static int peek() {
		return list.get(list.size()-1);
	}
	public static int pop() {
		if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
		int a=list.get(list.size()-1);
		list.remove(list.size()-1);
		return a;
	}
}

public class next17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack s = new MyStack();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.peek());  // 30
		System.out.println(s.pop());   // 30
		System.out.println(s.peek());

	}

}
