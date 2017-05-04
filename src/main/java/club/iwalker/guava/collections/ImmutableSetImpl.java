package club.iwalker.guava.collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

import java.util.Collection;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ImmutableSetImpl {


    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "yellow",
            "green",
            "blue",
            "purple");

    class Foo {
       /* Set<Bar> bars;
        Foo(Set<Bar> bars) {
            this.bars = ImmutableSet.copyOf(bars); // defensive copy!
        }*/
    }


    public static void main(String[] args) {
        /*ImmutableSortedSet<String> set = ImmutableSortedSet.of("a", "b", "c", "a", "d", "b");
        set.stream().forEach(o -> {
            System.out.println(o);
        });
*/
        ImmutableSet<String> foobar = ImmutableSet.of("foo", "bar", "baz");
        thingamajig(foobar);

    }



    static void thingamajig(Collection<String> collection) {
        ImmutableList<String> defensiveCopy = ImmutableList.copyOf(collection);
        defensiveCopy.stream().forEach(o -> {
            System.out.println(o);
        });
    }

}
