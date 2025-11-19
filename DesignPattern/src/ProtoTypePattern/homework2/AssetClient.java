package ProtoTypePattern.homework2;

public class AssetClient {
    public static void main(String[] args) {
        // AssetLibrary 인스턴스 생성
        AssetLibrary library = new AssetLibrary();
        // 원본 탬플릿(인스턴스) 상태 확인용 복사본
        DesignElement originState = (DesignElement) library.getAsset("DEFAULT_BTN");
        // 새 본사본
        DesignElement copyState = (DesignElement) library.getAsset("DEFAULT_BTN");

        // 복사본 값 수정
        copyState.setId(100);
        copyState.setContent("agree");
        copyState.setStyle("blue, purple");

        // 중첩 객체 수정
        copyState.getPosition().x = 10.0;
        copyState.getPosition().y = 3.0;

        originState.info();
        System.out.println("--------------------");
        copyState.info();

    }
}
