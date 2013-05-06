package queue;

public class ReplyMsg extends Message {
	

	@Override
	public void addMessage(String msg) {
		message = msg;
		
	}

	@Override
	public String getMessage() {
		return message;
	}

}
