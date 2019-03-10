package patttern.simplefacotory;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 20:36
 * @Description:
 */
public  class VideoFactory {

    public  Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)){

            return new JavaCourse();
        }else {

            return new PyCourse();
        }



    }
}
