package cn.cast.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //字符串格式化成date对象
        Date d = sdf.parse("2012-11-11");
        System.out.println(d);

        //date格式化成字符串对象
        String s = sdf.format(new Date());
        System.out.println(s);
    }
}
