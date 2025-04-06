
public class Produttore implements Runnable{
	
	private MessageQueue buffer;
	private int delay;
	private String identity;
	
	public Produttore(String id, MessageQueue buffer, int delay) {
		this.buffer= buffer;
		this.delay= delay;
		this.identity= id;
	}
	
	@Override
	public void run() {	
		int i=1;
		while(true) {
			Message m= new Message(identity, "wait"+i+": " + delay);
			buffer.send(m);
System.out.println("---"+identity);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i++;
		}
	}
}
