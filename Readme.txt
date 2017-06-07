CDC-extractor-trigger-based-simulator
Client.java
	- main class
	- set the run duration sun
	- Run Coordinator with queue and session end time
	- Run Checker
	- Wait till Run duration

CoordinatorRunnable.java
1. Get Maximum Sequence Id 
2. Check number of worker thread available 
3. Divide tasks to available worker threads 
4. Execute Workers 
5. Execute Checker ( Checker will continuously check whether the
	  request has expired or not 
6. Wait for workers to finish its task 
7. Record Latency

WorkerRunnable.java
1. Get the range of records which needs to be extracted from database
2. Extract the records from given range
3. For each record 
	3.1 write record to a file
	3.2 get commit time stamp and update upto which time data has been captured
4. Indicate the completion of task by incrementing "completedThread variable

CheckerRunnable.java
1. Listen to the Coordinator for the signal which indicates beginning of request( Which is done by IsInprogress Variable)
2. 	 
