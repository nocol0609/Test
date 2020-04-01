package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author £ºliuxp
 * @date £ºCreated in 2018/7/29 16:06
 * @description £º
 */
public class streamTest {

    public static void main(String[] args) {

//        List<String> stringList=new ArrayList<String>();
//        stringList.add("nocol");
//        stringList.add("daisy");
//        stringList.add("pzw");
//        stringList.stream().forEach(s->System.out.println(s));

        int a = 13 / 5;
        int b = 13 % 5;
        int c = 5 / 13;
        int d = 5 % 13;
        int e = 13 / -5;
        int f = -13 / 5;
        int h = -13 % 5;
        int j = 13 % -5;
        System.out.println(a + "£¬" + b);
        System.out.println(c + "£¬" + d);
        System.out.println(e + "£¬" + f);
        System.out.println(h + "£¬" + j);

    }

}
