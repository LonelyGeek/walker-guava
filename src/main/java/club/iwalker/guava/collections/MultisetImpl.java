package club.iwalker.guava.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Created by Administrator on 2017/1/17.
 */
public class MultisetImpl {

    public static void main(String[] args) {

        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("d");
        multiset.add("a");
        multiset.add("a");
        multiset.add("d");
        multiset.add("a");
        multiset.add("a");
        multiset.add("d");
        multiset.add("a");
        System.out.println(multiset.count("a"));
        System.out.println(multiset.count("d"));
        multiset.setCount("a", 0);

        System.out.println(multiset.entrySet().size());
    }
}
