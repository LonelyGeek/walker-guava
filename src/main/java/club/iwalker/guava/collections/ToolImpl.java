package club.iwalker.guava.collections;

import com.google.common.collect.*;
import com.google.common.primitives.Ints;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/1/17.
 */
public class ToolImpl {

    public static void main(String[] args) {

        //静态工厂方法

        List<String> list = Lists.newArrayList();
        Map<String, String> map = Maps.newHashMap();



        List<String> theseElements = Lists.newArrayList("alpha", "beta", "gamma");


        Set<String> copySet = Sets.newHashSet(theseElements);

        Multiset<String> multiset = HashMultiset.create();


        /*

        concat(Iterable<Iterable>)	串联多个iterables的懒视图*	concat(Iterable...)
        frequency(Iterable, Object)	返回对象在iterable中出现的次数	与Collections.frequency (Collection,   Object)比较；Multiset
        partition(Iterable, int)	把iterable按指定大小分割，得到的子集都不能进行修改操作	Lists.partition(List, int)；paddedPartition(Iterable, int)
        getFirst(Iterable, T default)	返回iterable的第一个元素，若iterable为空则返回默认值	与Iterable.iterator(). next()比较;FluentIterable.first()
        getLast(Iterable)	返回iterable的最后一个元素，若iterable为空则抛出NoSuchElementException	getLast(Iterable, T default)；
        FluentIterable.last()
        elementsEqual(Iterable, Iterable)	如果两个iterable中的所有元素相等且顺序一致，返回true	与List.equals(Object)比较
        unmodifiableIterable(Iterable)	返回iterable的不可变视图	与Collections. unmodifiableCollection(Collection)比较
        limit(Iterable, int)	限制iterable的元素个数限制给定值	FluentIterable.limit(int)
        getOnlyElement(Iterable)	获取iterable中唯一的元素，如果iterable为空或有多个元素，则快速失败	getOnlyElement(Iterable, T default)

         */

        Iterable<Integer> concatenated = Iterables.concat(
                Ints.asList(1, 2, 3),
                Ints.asList(4, 5, 6)); // concatenated包括元素 1, 2, 3, 4, 5, 6
        Integer lastAdded = Iterables.getLast(concatenated);
        System.out.println(lastAdded);//返回iterable的最后一个元素，若iterable为空则抛出NoSuchElementException

        multiset.add("a");
        String theElement = Iterables.getOnlyElement(multiset);//如果set不是单元素集，就会出错了！
        System.out.println(theElement);


        List countUp = Ints.asList(1, 2, 3, 4, 5);
        List countDown = Lists.reverse(countUp); // {5, 4, 3, 2, 1}
        List<List> parts = Lists.partition(countUp, 2);//{{1,2}, {3,4}, {5}}



        Map<String, Integer> left = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> right = ImmutableMap.of("a", 1, "b", 2, "c", 3);
        MapDifference<String, Integer> diff = Maps.difference(left, right);

        System.out.println(diff.entriesInCommon()); // {a=1, b=2, c=3}
        System.out.println(diff.entriesDiffering()); // {}
        System.out.println(diff.entriesOnlyOnLeft()); // {}
        System.out.println(diff.entriesOnlyOnRight()); // {}





        Multiset<String> multiset1 = HashMultiset.create();
        multiset1.add("a", 2);
        Multiset<String> multiset2 = HashMultiset.create();
        multiset2.add("a", 5);
        multiset1.containsAll(multiset2); //返回true；因为包含了所有不重复元素，
        //虽然multiset1实际上包含2个"a"，而multiset2包含5个"a"
        Multisets.containsOccurrences(multiset1, multiset2); // returns false
//        multiset2.removeOccurrences(multiset1); // multiset2 现在包含3个"a"
        multiset2.removeAll(multiset1);//multiset2移除所有"a"，虽然multiset1只有2个"a"
        multiset2.isEmpty(); // returns true





    }
}
