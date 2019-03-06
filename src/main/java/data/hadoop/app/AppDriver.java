package data.hadoop.app;

import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String[] args) {
        ProgramDriver pgd = new ProgramDriver();

        try {
            pgd.addClass("wordcount", WordCount.class, "");

            pgd.driver(args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
