package innerclasses;

//: innerclasses/Sequence.java
// Holds a sequence of Objects.

//In a single outer class you can have several inner classes, each of
//which implements the same interface or inherits from the same
//class in a different way. 


public class Sequence2 {
	
	private Object[] items;
	private int next = 0;

	public Sequence2(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}
	
	Selector getSequenceSelector() {
		return new Selector() {
			private int i = 0;

			public boolean end() {
				return i == items.length;
			}

			public Object current() {
				return items[i];
			}

			public void next() {
				if (i < items.length)
					i++;
			}
			
		};
	}

	Selector getReverseSelector() {
		return new Selector() {
			private int i = 0;

			public boolean end() {
				return i == items.length;
			}

			public Object current() {
				return items[items.length-1-i];
			}

			public void next() {
				if (i < items.length)
					i++;
			}
			
		};
	}
	


	public static void main(String[] args) {
		Sequence2 sequence = new Sequence2(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
//		Selector selector = sequence.getSequenceSelector();
		Selector selector = sequence.getReverseSelector();
		
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
} 


/*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
