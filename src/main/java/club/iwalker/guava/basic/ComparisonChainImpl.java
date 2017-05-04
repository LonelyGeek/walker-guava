package club.iwalker.guava.basic;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

/**
 * Created by Administrator on 2017/1/16.
 */
public class ComparisonChainImpl {
    public static void main(String[] args) {

        Person p1 = new Person("a", "b", 10);
        Person p2 = new Person("f", "g", 10);


        System.out.println(ComparisonChain.start().
                compare(p1.getZipCode(), p2.getZipCode()).
                compare(p1.getFirstName(), p2.getFirstName(), Ordering.natural().nullsLast()).result());

        System.out.println(ComparisonChain.start().
                compare(p1.getZipCode(), p2.getZipCode()).
                compare(p1.getFirstName(), p2.getFirstName(), Ordering.natural().reverse()).result());

        System.out.println(ComparisonChain.start().
                compare(p1.getZipCode(), p2.getZipCode()).
                compare(p1.getFirstName(), p2.getFirstName(), Ordering.usingToString().nullsLast()).result());

//        ComparisonChain.start()

        /*public int compareTo(Foo that) {
        return ComparisonChain.start()
                .compare(this.aString, that.aString)
                .compare(this.anInt, that.anInt)
                .compare(this.anEnum, that.anEnum, Ordering.natural().nullsLast())
                .result();
    }*/

    }
}


class Person {

    private String lastName;
    private String firstName;
    private int zipCode;

    public Person(String lastName, String firstName, int zipCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.zipCode = zipCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}



