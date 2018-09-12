import java.util.Map;
import java.util.TreeMap;

/* Manager
 작고 많이 쓰이는 객체를 공유하여 사용
    ex) 문서 편집기에서 각 글자들 스타일과 글자크기는 공유, 위치는 개별로
*/
public class FlyweightFactory {
    Map<String, Flyweight> pool;

    public FlyweightFactory() {
        pool = new TreeMap<>();
    }
    public FlyweightFactory(Map<String, Flyweight> pool) {
        this.pool = pool;
    }

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = pool.get(key);
        if(flyweight == null){
            flyweight = new Flyweight(key);
            pool.put(key, flyweight);
            System.out.println("새로 생성 "+ key);
        }else{
            System.out.println("재사용 "+ key);
        }
        return flyweight;
    }


}
