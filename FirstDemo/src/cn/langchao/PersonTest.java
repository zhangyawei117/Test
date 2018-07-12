package cn.langchao;

import org.junit.jupiter.api.Test;

public class PersonTest
{
    @Test
    public void test1() {
        Person p1=new Person();
        p1.setName("111");
        System.out.println(p1);
        System.out.println(p1.getId());
        Person p2=new Person();
        p2.setName("222");
        System.out.println(p2);
        System.out.println(p2.getId());
    }
}
