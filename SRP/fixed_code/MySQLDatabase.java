package warehouse;

import java.util.Map;

public class MySQLDatabase {

    public void insert(String table, Map<String, String> values) {
        // imagine this is actually SQL code here

        System.out.printf("Inserting into %s table: ", table);

        for (Map.Entry<String, String> entry: values.entrySet()) {
            System.out.printf("%s=", entry.getKey());
            System.out.printf("%s ", entry.getValue());
        }

        System.out.println();
    }
}
