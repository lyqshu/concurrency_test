package yq.test.concurrency.ch03;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by I030518 on 2017-02-18.
 * -Xmx100m -XX:+UseG1GC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps
 */
public class AppMain {
    public static void main(String[] args) throws InterruptedException {
        List<LeakNode> ls = new ArrayList<LeakNode>();
        long i=0;
        while(1==1){
            i++;
            LeakNode leakNode = new LeakNode();
            if(i%10==0){
                ls.add(leakNode);
            }
            sleep(5);
        }
    }
}
