package BuilderPattern.homework1;

public interface ISelectBuilder extends Builder {
    ISelectBuilder select(String... columns);
    ISelectBuilder from(String table);
    ISelectBuilder where(String... condition);
    ISelectBuilder orderBy(String column);
    ISelectBuilder orderBy(String column, String direction);
    ISelectBuilder limit(int count);
}
