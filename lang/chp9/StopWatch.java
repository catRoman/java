/** =========================
 *         UML Diagram
 *  =========================
 *  - startTime : Long
 *  - endTime : Long
 *  -------------------------
 *  + StopWatch()
 *  + start() : long StartTime
 *  + stop() : long endTime
 *  + getElapsedTime() : Long elapsedTime
 *  + getStartTime() : long
 *  + getEndTime() : long
 */
 

 public StopWatch{
     private long startTime;
     private long endTime;
    
     
     public StopWatch(){
        
        startTime = System.currentTimeMillis();
     }
     public void start(long startTime){
         this.startTime = System.currentTimeMillis();
     }
     public void stop(long endTime){
        this.endTime = System.currentTimeMillis();
     }
     public long getStartTime(){
        return startTime;
     }
     public long getEndTime(){
         return endTime;
     }
     public long getElapsedTime(){
         return getEndTime()-getStartTime();

     }

 }