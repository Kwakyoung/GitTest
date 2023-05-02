package pack01.thread;

public class EX06_YoutubeThread extends Thread {
	EX06_YoutubeThread(){
		setName("yotube");
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(getName()+" 동영상 재생중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
