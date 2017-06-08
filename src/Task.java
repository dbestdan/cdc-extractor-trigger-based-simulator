import java.sql.Timestamp;

public class Task {
	private long limit;
	private long offset;
	private Timestamp startTime;
	private Timestamp endTime;
	
	
	
	
	public Task(Timestamp startTime, Timestamp endTime, long limit, long offset) {
		this.limit = limit;
		this.offset = offset;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public long getLimit() {
		return limit;
	}
	public void setLimit(long limit) {
		this.limit = limit;
	}
	public long getOffset() {
		return offset;
	}
	public void offset(long offset) {
		this.offset = offset;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	
	
	
//	private long minSeqID;
//	private long maxSeqID;
//
//	public Task(long min, long max) {
//		this.minSeqID = min;
//		this.maxSeqID = max;
//	}
//	public long getMinSeqID() {
//		return this.minSeqID;
//	}
//	public long getMaxSeqID(){
//		return this.maxSeqID;
//	}
//	
}
