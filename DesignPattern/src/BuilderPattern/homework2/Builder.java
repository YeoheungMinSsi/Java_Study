package BuilderPattern.homework2;

public interface Builder {
    public Builder required();
    public Builder min(int length);
    public Builder max(int length);
    public Builder pattern(String regex);
    ValidationRule build();
}
