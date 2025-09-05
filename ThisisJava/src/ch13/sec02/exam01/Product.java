package ch13.sec02.exam01;

// 제네릭 타입
// note : 여기서 타입 파라미터르를 사용하는 이유는 Product에 다양한 종류와 모델 제품을 저장하기 위함
public class Product <K, M> {
    // 필드
    private K kind;
    private M model;

    // 메소드
    public K getKind() {return this.kind;}
    public M getModel() {return this.model;}
    public void setKind(K kind) {this.kind = kind;}
    public void setModel(M model) {this.model = model;}
}
