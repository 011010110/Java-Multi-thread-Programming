package thread_1.thread_1_3.project_2_currentThreadExt;

public class Run {
	
	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
	}


}
