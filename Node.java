public class Node <T>{
	
	private T data;
	public int position;
	private Node<T> prev, next;
	public Node(T data){
	this.data=data;
	}
	public  T getData(){
	return data;
	}
	
	
	public String toString() {	
		return data.toString();	
	}
	
	public void setNextNode(Node<T> a){
		this.next = a;		
	}
	
	public void setPreviousNode(Node<T> a){
		this.prev = a;	
	}
	
	public Node<T> getNextNode(){
		return next;
	}
	
	public Node<T> getPreviousNode(){
		return prev;
	}
	
	public T getValue(){
		return data;		
	}
	
	public int getPosition(){
		return position;	
	}
}
