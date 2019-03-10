package patttern.factorymethod;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:43
 * @Description:
 */
public class Test {


    public static void main(String[] args) {

      VideoFactory videoFactory =new JavaVideoFactory();
        Video video = videoFactory.getVideo();
         video.produce();



    }
}
