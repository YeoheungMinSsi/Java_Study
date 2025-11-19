package BuilderPattern.homework1;

import java.util.List;

public interface SqlFormatter {
    String formatValue(Object value);
    String formatColumns(List<String> columns);
    String formatInsertQuery(String table, List<String> columns, List<Object> values);
}
