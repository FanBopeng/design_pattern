package patttern.simplefacotory;

import principle.singleresponsibilty.Car;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 10:43
 * @Description:
 */
public class Test {


    public static void main(String[] args) {

        VideoFactory factory=new VideoFactory();
        Video video = factory.getVideo("java");

        
    }
}
