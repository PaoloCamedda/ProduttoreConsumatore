import java.util.ArrayList;

public class MessageQueue {
	private ArrayList<Message> queue;
	private int numeroMessaggi;
	
	public MessageQueue(int numeroMessaggi) {
		this.queue= new ArrayList<Message>();
		this.numeroMessaggi= numeroMessaggi;
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public boolean isFull() {
		return queue.size()>=numeroMessaggi;
	}
	
	
	public synchronized void send(Message m) {
		while(isFull()) {
			try {
				wait();
			}
			catch(InterruptedException ex){
				System.out.println("Interrupted Exception");
			}
		}
		//Coda non piena
		queue.add(m);
		System.out.println("C: "+queue.size());
		notifyAll();
	}
	
	public synchronized Message receive() {
		while(isEmpty()) {
			try{
				wait();
			}
			catch (InterruptedException ex){
				System.out.println("Interrupted exception");
			}
		}			
		//Coda non vuota
		Message messaggio= queue.remove(0); 
		notifyAll();
		return messaggio;
	}
}
