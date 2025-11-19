package BuilderPattern.homework1;

public interface IInsertBuilder extends Builder {
    IInsertBuilder into(String table);
    IInsertBuilder columns(String... columns);
    IInsertBuilder columns();
    IInsertBuilder values(Object... values);  // note: values에는 다양한 타입이 들어감
    String build();
}
