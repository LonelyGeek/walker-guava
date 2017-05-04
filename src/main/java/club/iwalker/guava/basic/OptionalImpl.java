package club.iwalker.guava.basic;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;

/**
 * Created by wangchen on 2016/12/29.
 */
public class OptionalImpl {

    public static void main(String[] args) {

        /*

        Optional.of(T)	创建指定引用的Optional实例，若引用为null则快速失败

        Optional.absent()	创建引用缺失的Optional实例

        Optional.fromNullable(T)	创建指定引用的Optional实例，若引用为null则表示缺失



         */

        Optional<Integer> possible = Optional.of(5);
        System.out.println(possible.isPresent());
        System.out.println(possible.get());

        Integer res = possible.get();


        /*

        boolean isPresent()	如果Optional包含非null的引用（引用存在），返回true
        T get()	返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException
        T or(T)	返回Optional所包含的引用，若引用缺失，返回指定的值
        T orNull()	返回Optional所包含的引用，若引用缺失，返回null
        Set<T> asSet()	返回Optional所包含引用的单例不可变集，如果引用存在，返回一个只有单一元素的集合，如果引用缺失，返回一个空集合。

         */


        Optional<Integer> absendOptional = Optional.absent();
        System.out.println(absendOptional.isPresent());
//        System.out.println(absendOptional.get());

        Integer a = null;

        Integer integer = Optional.fromNullable(a).or(5);

        System.out.println(integer);

    }



}
