package lab6;

public class StopWatch {

	
	private long startTime,endTime;

	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		this.endTime = System.currentTimeMillis();
		
	}
	public long getElaspsedTime() {
		return this.endTime - this.startTime;
	}
	
	

}
