package patttern.strategy;

/**
 * @author: fanbopeng
 * @Date: 2019/3/10 19:09
 * @Description:
 */
public class Test {


    public static void main(String[] args) {
        CDplayer cDplayer=new CDplayer("步步高");
        cDplayer.setCd(new DzqCD());
        cDplayer.play();
    }

}
