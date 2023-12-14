package demo;

import com.snowflake.snowpark_java.*;
import com.snowflake.snowpark_java.DataFrame;

import util.LocalSession;

public class Example {

    public static Long run(Session session) {

        DataFrame df = session.table("information_schema.databases");

        df.limit(10).show();

        return df.count();
    }

    public static void main(String[] args) {
        Session session = LocalSession.getSession();

        Long rows = Example.run(session);

        System.out.println("Number of rows = ");
        System.out.println(rows);
    }
}
