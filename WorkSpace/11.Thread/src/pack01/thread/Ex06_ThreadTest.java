package pack01.thread;

public class Ex06_ThreadTest {
	// YoutubeThread라는 작업을 하나 별도로 만듬.  => 1초에 한번씩 동영상을 재생중입니다. (콘솔)
	// MelonThread라는 작업을 하나 별도로 만듬.	   => 3초에 한번씩 음악을 재생중입니다. (콘솔)
	// ThreadTest에서는 Youtube,melon 각각 실행
	
	// 두개의 기능이 각각 실행되게 처리.
	public static void main(String[] args) {
		Thread threadArr[] = new Thread[2];
		threadArr[0] = new EX06_YoutubeThread();
		threadArr[1] = new Ex06_MelonThread();
		
		for(int i=0; i<threadArr.length; i++) {
			threadArr[i].start();
		}
		
		
		
	}
	
	
}
