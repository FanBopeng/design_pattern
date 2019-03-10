package patttern.strategy.strategy2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: fanbopeng
 * @Date: 2019/3/10 19:21
 * @Description:
 */
public class CommonQuery {


    public <T> void query(Class<T> clazz, HashMap<String, Object>  queryParams){

        String className = clazz.getSimpleName();
        StringBuilder sb=new StringBuilder();
        sb.append("select * from "+className+"where 1=1");

        Set<Map.Entry<String, Object>> set = queryParams.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            sb.append(entry.getKey()+"="+entry.getValue().toString());

        }

        String sql=sb.toString();

    }

}
