package BuilderPattern.homework1;

public interface UpdateBuilder extends Builder {
    UpdateBuilder update(String table);
    UpdateBuilder set(String column, Object value);
    UpdateBuilder where(String condition);
    String build();
}
