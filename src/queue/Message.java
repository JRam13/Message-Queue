package queue;

public abstract class Message {
	protected String message;
	MessageQueue queue;

	public Message() {
		queue = new MessageQueue();
	}
	
	public abstract void addMessage(String msg);
	
	public abstract String getMessage();

}
