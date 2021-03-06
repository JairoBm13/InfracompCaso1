package caso1;


public class Server extends Thread{

	//Atributos
	/**
	 * Buffer del cual retirara mensajes
	 */
	private Buffer buffer;
	private int id;

	//Constructor
	public Server(Buffer nBuffer, int nId){
		buffer = nBuffer;
		id=nId;
	}

	//Run
	public void run(){
		synchronized(buffer){
			while(buffer.hayClientes()){
				buffer.responder();
			}
		}
	}
}
