package BuilderPattern.homework1;

//
public interface Builder {
    Builder select(String... columns);
    Builder from(String table);
    Builder where(String condition);
    Builder orderBy(String column);  // DESC
    Builder orderBy(String column, String direction);  // ASC
    Builder limit(int count);
    String build();
}
