import java.sql.Timestamp;

public class Message {
	private String topic;
	private String body;
	private java.sql.Timestamp timeStamp;
	
	public Message(String topic, String body) {
		this.topic= topic;
		this.body= body;
		this.timeStamp= new Timestamp(System.currentTimeMillis());
	}
	
	public String getTopic() {
		return this.topic;
	}
	
	public String getBody() {
		return this.body;
	}
	
	public Timestamp getTimeStamp() {
		return this.timeStamp;
	}
}
