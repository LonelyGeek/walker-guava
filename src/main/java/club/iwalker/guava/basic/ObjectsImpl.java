package club.iwalker.guava.basic;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.math.BigDecimal;

/**
 * Created by wangchen on 2016/12/29.
 */
public class ObjectsImpl {

    public static void main(String[] args) {

        /*System.out.println(Objects.equal("a", "a")); // returns true
        System.out.println(Objects.equal(null, "a")); // returns false
        System.out.println(Objects.equal("a", null)); // returns false
        System.out.println(Objects.equal(null, null)); // returns true

        // Returns "ClassName{x=1}"
        String resStr = MoreObjects.toStringHelper(new ObjectsImpl()).add("x", 1).toString();
        System.out.println(resStr);
        // Returns "MyObject{x=1}"
        resStr = MoreObjects.toStringHelper("MyObject").add("x", 1).toString();
        System.out.println(resStr);*/


        BigDecimal bigDecimal = new BigDecimal(0.082);
        System.out.println(String.valueOf(bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP)));

    }
}


