package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liuxp
 * @date ：Created in 2019/7/29 16:06
 * @description ：
 */
public class streamTest {

    public static void main(String[] args) {

        List<String> stringList=new ArrayList<String>();
        stringList.add("nocol");
        stringList.add("daisy");
        stringList.add("pzw");
        stringList.stream().forEach(s->System.out.println(s));
    }

}
