package club.iwalker.guava.basic;

import com.google.common.base.Throwables;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ThrowableImpl {

    public static void main(String[] args) throws Exception {


        /*
        RuntimeException propagate(Throwable) 如果Throwable是Error或RuntimeException，直接抛出；否则把Throwable包装成RuntimeException抛出。返回类型是RuntimeException，所以你可以像上面说的那样写成throw Throwables.propagate(t)，Java编译器会意识到这行代码保证抛出异常。
        void propagateIfInstanceOf(Throwable, Class<X extends Exception>) throws X	Throwable类型为X才抛出
        void propagateIfPossible(Throwable)	Throwable类型为Error或RuntimeException才抛出
        void propagateIfPossible(Throwable, Class<X extends Throwable>) throws X	Throwable类型为X, Error或RuntimeException才抛出
         */
        Exception exception = new Exception();
        exception.setStackTrace(new StackTraceElement[]{new StackTraceElement("declaringClass", "methodName",
                "fileName", 5), new StackTraceElement("declaringClass", "methodName",
                "fileName", 10)});
        Throwables.propagateIfPossible(exception, Exception.class);

        // TODO: 2017/1/16 继续学习
    }
}
