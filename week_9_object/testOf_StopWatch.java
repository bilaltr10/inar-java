package week_9_object;

public class testOf_StopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int [] list =new int[100000];
        fillTheList(list);
       long start= stopWatch.start();
        sortTheList(list);
       long end = stopWatch.end();
        System.out.println("The execution time of sorting 100,000 " +
                "numbers using selection sort : " +stopWatch.getElapsedTime(start,end ));


    }


    public static void  fillTheList(int [] list){
        for (int i = 0; i < list.length; i++) {
            list[i] =(int) (Math.random()*650);

        }
    }

    public static void sortTheList(int [] list){
        for(int i =0 ; i<list.length-1; i++) {
            int currentMin =list[i];
            int indis =i;

            for (int m = i+1; m < list.length; m++) {
                if (currentMin>list[m]) {
                    currentMin = list[m];
                    indis = m;
                }
            }
            if ( indis !=i){
                list[indis]= list[i];
                list[i] = currentMin;
            }


        }









    }
}
