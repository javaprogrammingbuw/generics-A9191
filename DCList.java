import java.util.LinkedHashSet;

		public class DCList<T>{
		private Node<T> head;
		private Node<T> tail;
		private Node<T> initialnod;
		private int h;
		private Node<T> p;
		private int size;
		
		
	public DCList(){
		this.size = 0;
	}
		
	public boolean isEmpty(){
		if (head==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void display(){
		for(Node<T> i = head; i!=null; i=i.getNextNode()){
			System.out.println(i.toString());
		}	
	}	
				
	public void add(int position, Node<T> value){	
		this.size++;
		if(value != null && position<size() && position >=0) {
			if(position==0) {
				value.setNextNode(head);
				head.setPreviousNode(value);
				head = value;
			}
			else{
			Node<T> node = get(position);
			node.getPreviousNode().setNextNode(value);
			value.setPreviousNode(node.getPreviousNode());
			node.setPreviousNode(value);
			value.setNextNode(node);
			value.position= position;
				for(Node<T> i =value.getNextNode(); i!=null; i=i.getNextNode()) {
				i.position ++;
				}
			}
		}
	}			
		
	public void add(Node<T> value){		
		this.size++;
		if(head==null){
			head = value;
			tail = value;			
		}

		else{
			tail.setNextNode(value);
			value.setPreviousNode(tail);
			tail = value;
			tail.position = size()-1;
		}	
	}
		
	public void remove(Node<T> value){
		if (isEmpty()==true){
			System.out.println("The list is empty");
		}
		
		else if (value != null){
		if(value.position<=0 && value.position>size()-1){
			head=tail;
		}
		
		else if(value==head){
			removeFirst();			
		}
		
		else if (value==tail){
			removelast();
		}
		else{
			
		value.getPreviousNode().setNextNode(value.getNextNode());
		value.getNextNode().setPreviousNode(value.getPreviousNode());
			for(Node<T> i = value.getNextNode(); i.getValue()!= null; i=i.getNextNode()){
			i.position--;	
			}

		}	
		}
		
	}
	
	public void removeFirst(){
		
		if (size()<=1){
			head = null;
			tail= null;
		}
		else {
			this.size--;
			head.setNextNode(head.getNextNode().getNextNode());
			head.setPreviousNode(null);
		}
	}
	
	public void removelast(){
		if (size()<=1){
			head = null;
			tail= null;
		}
		else {
			this.size--;
			tail.setPreviousNode(tail.getPreviousNode().getPreviousNode());
			tail.setNextNode(null);
		}
	}		
	
	
	public void clear(){		
		head = null;		
	}
	
	public Node<T> getFirst(){
		return head;
		
	}
	public Node<T> getLast(){
		return tail;
		
	}
	public Node<T> get(int position){
		for(Node<T> i = head; i!=null; i=i.getNextNode()){
			if(i.position == position){	
				p=i;
			}
		}
		return p;		
	}
	
	public int find(T value){
		for(Node<T> i = head; i!=null; i=i.getNextNode())
			if(value == i){
				h = i.getPosition()-1;
			}
		return h;	
	}
	
	public boolean contains(T value){
		
		for(Node<T> i = head; i!=null; i=i.getNextNode()){
				if(value == i){						
				return true;
				}
	   }
		return false;
	}
	public int size(){
			return this.size;		
	}
	}