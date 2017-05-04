package club.iwalker.guava.basic;

import com.google.common.base.Objects;

import static com.google.common.base.Preconditions.*;

/**
 * Created by wangchen on 2016/12/29.
 */
public class PreconditionsImpl {

    public static void main(String[] args) {

        /*
        checkArgument(boolean)	检查boolean是否为true，用来检查传递给方法的参数。	IllegalArgumentException
        checkNotNull(T)	检查value是否为null，该方法直接返回value，因此可以内嵌使用checkNotNull。	NullPointerException
        checkState(boolean)	用来检查对象的某些状态。	IllegalStateException
        checkElementIndex(int index, int size)	检查index作为索引值对某个列表、字符串或数组是否有效。index>=0 && index<size *	IndexOutOfBoundsException
        checkPositionIndex(int index, int size)	检查index作为位置值对某个列表、字符串或数组是否有效。index>=0 && index<=size *	IndexOutOfBoundsException
        checkPositionIndexes(int start, int end, int size)	检查[start, end]表示的位置范围对某个列表、字符串或数组是否有效*	IndexOutOfBoundsException
         */

        /*int i = -1;
        int j = -7;
        checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);

        checkArgument(i < j, "Expected i < j, but %s > %s", i, j);*/

        /*Integer integer = null;

        checkNotNull(integer, "integer must not null");*/

        /*int i = -1;
        int j = -7;
        checkState(i < j, "Expected i < j, but %s > %s", i, j);*/

        checkPositionIndexes(0, 6, 5);

        //jdk Objects.requireNonNull

        

    }

}
