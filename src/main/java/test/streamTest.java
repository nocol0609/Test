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

        int a = 19 / 7; //2
        int b = 19 % 7; //5
        int c = 7 / 19; //0
        int d = 7 % 18; //6
        int e = 19 / -7; //-2
        int f = -19 / 7; //-2
        int h = -19 % 7; //-5
        int j = 19 % -7; //5

        int d1 = 1 % 18;
        int d2 = 2 % 18;
        int d3 = 3 % 18;
        int d4 = 4 % 18;
        System.out.println(d1 + "£¬" + d2+","+d3 + "£¬" + d4);


        System.out.println(a + "£¬" + b);
        System.out.println(c + "£¬" + d);
        System.out.println(e + "£¬" + f);
        System.out.println(h + "£¬" + j);

    }

}
