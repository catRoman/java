/** =========================
 *         UML Diagram
 *  =========================
 *          StopWatch
 *  -------------------------
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
 

 public class StopWatch{
     private long startTime;
     private long endTime;
    
     
     public StopWatch(){
        
        startTime = System.currentTimeMillis();
     }
     public void start(){
         startTime = System.currentTimeMillis();
     }
     public void stop(){
        endTime = System.currentTimeMillis();
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