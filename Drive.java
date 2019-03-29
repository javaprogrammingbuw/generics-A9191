	
public class Drive {	
	
		public static void main(String[] args) {

				Node<Integer> S = new Node<>(new Integer(4));
				DCList<Integer> x =new DCList<>();
				x.add(S);
				x.add(new Node<>(new Integer(6)));
				x.add(new Node<>(new Integer(8)));
				System.out.println(x.size());
				System.out.println(x.getFirst().getValue());
//				x.getClass();
				x.display();
				System.out.println("Last: " + x.getLast().getValue());
				x.removelast();
				x.display();
				System.out.println("Last removed");
				x.removeFirst();
				x.display();
				System.out.println("First removed");
				x.removeFirst();
				x.display();
				System.out.println("First removed");
				x.remove(S);
				x.display();
			}
		}