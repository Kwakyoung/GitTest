package pack01.thread;

public class Ex06_MelonThread extends Thread{
	public Ex06_MelonThread() {
		setName("Melon");
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(getName()+"음악을 재생중");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
