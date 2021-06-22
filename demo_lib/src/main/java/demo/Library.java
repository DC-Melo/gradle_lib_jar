package demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    /**
    * <p>This is a simple description of the method. . . </p>
    * @return the date left
    * @since 1.0
    */
    public String getDCDate() {
        // 获取不同格式化风格和中国环境的日期
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
        // 获取不同格式化风格和中国环境的时间
        DateFormat df5 = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.CHINA);
        DateFormat df6 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
        DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df8 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        // 将不同格式化风格的日期格式化为日期字符串
        String date1 = df1.format(new Date());
        String date2 = df2.format(new Date());
        String date3 = df3.format(new Date());
        String date4 = df4.format(new Date());
        // 将不同格式化风格的时间格式化为时间字符串
        String time1 = df5.format(new Date());
        String time2 = df6.format(new Date());
        String time3 = df7.format(new Date());
        String time4 = df8.format(new Date());
        // 输出日期
        System.out.println("SHORT：" + date1 + " " + time1);
        System.out.println("FULL：" + date2 + " " + time2);
        System.out.println("MEDIUM：" + date3 + " " + time3);
        System.out.println("LONG：" + date4 + " " + time4);
        return date1;
    }
    /**
    * <p>This is a simple description of the method. . .
    * <a href="http://www.supermanisthegreatest.com">Superman!</a>
    * </p>
    * @param incomingDamage the amount of incoming damage
    * @return the amount of health hero has after attack
    * @see <a href="http://www.link_to_jira/HERO-402">HERO-402</a>
    * @since 1.0
    */
    public int successfullyAttacked(int incomingDamage) {
        // do things
        return 0;
    }
}
