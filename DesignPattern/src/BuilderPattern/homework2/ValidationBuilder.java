package BuilderPattern.homework2;

public class ValidationBuilder implements Builder{
    private boolean isRequired = false;
    private int minLength = 0;
    private int maxLength = 0;
    private String regexPart = null;

    @Override
    public ValidationBuilder required(){
            this.isRequired = true;
        return this;
    }
    @Override
    public ValidationBuilder min(int length){
        this.minLength = length;
        return this;
    }
    @Override
    public ValidationBuilder max(int length){
        this.maxLength = length;
        return this;
    }
    @Override
    public ValidationBuilder pattern(String regex){
        this.regexPart = regex;
        return this;
    }

    @Override
    public ValidationRule build(){
        return new ValidationRule(this.isRequired, this.minLength,
                this.maxLength, this.regexPart
        );
    }


}
