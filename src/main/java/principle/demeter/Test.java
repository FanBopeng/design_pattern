package principle.demeter;

/**
 * @author: fanbopeng
 * @Date: 2019/2/14 20:12
 * @Description:
 */
public class Test {


    public static void main(String[] args) {

        BOSS boss =new BOSS();
        TeamLeader teamLeader =new TeamLeader();
        boss.checkNumber(teamLeader);
    }
}
