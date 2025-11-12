//package BuilderPattern.homework2;
//
//public class ValidationBuilder implements Builder{
//    public int minLength = 0;
//    public int maxLength = 0;
//    public String regexPart;
//
//    @Override
//    public ValidationBuilder requirement(){
//        return this;
//    }
//    @Override
//    public ValidationBuilder min(int length){
//        this.minLength = length;
//        return this;
//    }
//    @Override
//    public ValidationBuilder max(int length){
//        this.maxLength = length;
//        return this;
//    }
//    @Override
//    public ValidationBuilder pattern(String regex){
//        this.regexPart = regex;
//        return this;
//    }
//
//    @Override
//    public String build(){
//        return this
//    }
//
//
//}
