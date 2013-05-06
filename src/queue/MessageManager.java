package queue;

public class MessageManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//setup queue
		MessageQueue queue = new MessageQueue();
		
		//setup message queries
		QueryMsg qmsg = new QueryMsg();
		QueryMsg qmsg2 = new QueryMsg();
		QueryMsg qmsg3 = new QueryMsg();
		
		ReplyMsg rmsg = new ReplyMsg();
		ReplyMsg rmsg2 = new ReplyMsg();
		ReplyMsg rmsg3 = new ReplyMsg();
		
		//add messages to the Messages class
		qmsg.addMessage("Hello, what is your name?");
		rmsg.addMessage("My name is Jonny.");
		qmsg2.addMessage("What do you do?");
		rmsg2.addMessage("I am a programmer.");
		qmsg3.addMessage("What is you favorite class?");
		rmsg3.addMessage("Object Oriented Design!");
		
		//add messages/responses to queues
		queue.addMsg(qmsg);
		queue.addMsg(rmsg);
		queue.addMsg(qmsg2);
		queue.addMsg(rmsg2);
		queue.addMsg(qmsg3);
		queue.addMsg(rmsg3);
		
		//print out entire queue
		queue.peek();
		System.out.println();
		
		//pop all messages from queue
		System.out.println("Popping the Queue: ");
		while(!queue.isEmpty()){
			System.out.println("Size of Queue: " + queue.getnSize());
			System.out.print("Next on Queue: ");
			System.out.println(queue.popMsg().getMessage());
			System.out.println();
		}
		
		

	}

}
