package club.iwalker.guava.basic;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/16.
 */
public class OrderingImpl {
    public static void main(String[] args) {

        Ordering<String> byLengthOrdering = new Ordering<String>() {

            public int compare(String left, String right) {

                return Ints.compare(left.length(), right.length());

            }

        };



        System.out.println(byLengthOrdering.natural());

        System.out.println(byLengthOrdering.compare("abcde1", "edcba"));

        Ordering<Foo> ordering = Ordering.natural().nullsFirst().onResultOf(new Function<Foo, Comparable>() {
            public String apply(Foo foo) {
                return foo.sortedBy;
            }
        });



        List<Foo> list = new ArrayList<>();
        list.add(new Foo("name5", 15));
        list.add(new Foo("name2", 12));
        list.add(new Foo("name7", 17));
        list.add(new Foo("name4", 14));
        list.add(new Foo("name9", 19));
        list.add(new Foo("name1", 11));
        list.add(new Foo("name3", 13));
        Iterable<Foo> iterable = list;
        System.out.println(ordering.isOrdered(iterable));
    }
}


class Foo {

    Foo(){}

    Foo(String sortedBy,
            int notSortedBy) {
        this.sortedBy = sortedBy;
        this.notSortedBy = notSortedBy;
    }

    @Nullable
    String sortedBy;
    int notSortedBy;
}
