
public class Main {
	public static void main(String[] args) {
		MessageQueue mq= new MessageQueue(2);
		Thread produttore= new Thread(new Produttore("PR1", mq, 3100));
		Thread produttore1= new Thread(new Produttore("PR2", mq, 2010));
		Thread produttore2= new Thread(new Produttore("PR3", mq, 1020));
		Thread consumatore= new Thread(new Consumatore(mq, 500));
		
		produttore.start();
		produttore1.start();
		produttore2.start();
		consumatore.start();
	}
}
