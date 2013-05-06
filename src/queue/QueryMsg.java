package queue;

public class QueryMsg extends Message {
	

	@Override
	public void addMessage(String msg) {
		message = msg;
		
	}

	@Override
	public String getMessage() {
		return message;
	}

}
