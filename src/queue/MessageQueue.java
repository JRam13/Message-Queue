package queue;

import java.util.Vector;

public class MessageQueue {
	
	private Vector<Message> msgs;
	private int nSize;
	
	// ============================================================
	// CONSTRUCTOR
	// ============================================================
	public MessageQueue() {
		msgs = new Vector<Message>();
	}
	
	// ============================================================
	// METHODS
	// ============================================================
	public void clear() {
		msgs.clear();
		setnSize(0);
	}
	
	public void addMsg(Message msg) {
		msgs.add(msg);
		nSize++;

	}
	
	public Message popMsg() {
		if (isEmpty()) {
			throw new NullPointerException("Queue is empty");

		} else {
			Message msg = msgs.get(0);
			msgs.remove(0);
			nSize--;
			return msg;
		}

	}
	
	public boolean isEmpty(){
		if(nSize == 0){
			return true;
		}
		return false;
	}

	public int getnSize() {
		return nSize;
	}

	public void setnSize(int nSize) {
		this.nSize = nSize;
	}
	
	public void peek(){
		System.out.println("Printing out Queue: ");
		System.out.print("Order: ");
		System.out.println();
		for (int i = 0; i < nSize; i++) {
			System.out.println(i+1 +") " +  msgs.get(i).getMessage() );
		}
		System.out.println();
	}
	
}
