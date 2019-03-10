package patttern.strategy;

/**
 * @author: fanbopeng
 * @Date: 2019/3/10 19:03
 * @Description:
 */
public class CDplayer {


    private CD cd;
    private String brand;

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public CDplayer(String brand) {
        this.brand = brand;
    }

    public void play(){

        System.out.println(brand+"cd启动");
        cd.sing();


    }

}
