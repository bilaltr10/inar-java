package week_9_object;

 class StopWatch {

     private long startTime;
     private long endTime;


     StopWatch(){
         startTime = System.currentTimeMillis();
     }

     long start(){
        return startTime = System.currentTimeMillis();
     }

     long end(){
        return endTime=System.currentTimeMillis();
     }

     long getElapsedTime(long startTime,long endTime){
         return endTime-startTime;
     }



}

