
public class Consumatore implements Runnable{
	private MessageQueue buffer;
	private int delay;
	
	public Consumatore(MessageQueue buffer, int delay) {
		this.buffer= buffer;
		this.delay= delay;
	}
	
	@Override
	public void run() {	
		while(true) {
			Message m = buffer.receive();
			System.out.println("Consumatore: {" + m.getTopic() + ", "+m.getBody()+"}");
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
