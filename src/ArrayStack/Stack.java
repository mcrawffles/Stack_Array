package ArrayStack;

import java.util.EmptyStackException;

public interface Stack {
	
	public int size();
	public boolean isEmpty();
	public Object top() throws EmptyStackException;
	
	public void push (Object element) throws Exception;
	public Object pop() throws EmptyStackException;
}
