pc.jar:	Main.class MessageQueue.class Message.class Produttore.class Consumatore.class manifest.mf
	jar cmf manifest.mf pc.jar *.class

Main.class:	Main.java
	javac Main.java

MessageQueue.class:	MessageQueue.java
	javac MessageQueue.java

Message.class:	Message.java
	javac Message.java

Produttore.class:	Produttore.java
	javac Produttore.java


Consumatore.class:	Consumatore.java
	javac Consumatore.java
