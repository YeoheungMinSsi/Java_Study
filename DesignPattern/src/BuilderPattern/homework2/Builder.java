package BuilderPattern.homework2;

public interface Builder {
    public Builder requirement();
    public Builder min(int length);
    public Builder max(int length);
    public Builder pattern(String regex);
    String build();
}
