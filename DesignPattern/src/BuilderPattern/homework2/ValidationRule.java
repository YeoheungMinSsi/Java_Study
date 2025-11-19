package BuilderPattern.homework2;

public class ValidationRule {

    private boolean isRequired;
    private int minLength;
    private int maxLength;
    private String regex;

    // 생성자
    public ValidationRule(boolean isRequired, int minLength, int maxLength, String regex) {
        this.isRequired = isRequired;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.regex = regex;
    }

    public boolean validate(String value) {
        if(this.isRequired) {
            if (value == null || value.isEmpty())  //빈 문자열이라면
                return false;
        }
        if(value == null || value.isEmpty())  // 필수 값아님, 추가 검증 건너뜀
            return true;

        int length = value.length();

        if (this.minLength > 0 && length < this.minLength)
            return false;

        if(this.maxLength > 0 && length > this.maxLength)
            return false;

        if(this.regex != null && !this.regex.isEmpty())
            if(!value.matches(this.regex))
                return false;

        return true;
    }

}
