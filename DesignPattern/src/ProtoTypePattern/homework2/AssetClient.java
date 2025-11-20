package ProtoTypePattern.homework2;

public class AssetClient {
    public static void main(String[] args) {
        // AssetLibrary 인스턴스 생성
        AssetLibrary library = new AssetLibrary();
        // 원본 탬플릿(인스턴스) 상태 확인용 복사본
        DesignElement originDesignState = (DesignElement) library.getAsset("DEFAULT_BTN");
        // 새 본사본
        DesignElement copyDesignState = (DesignElement) library.getAsset("DEFAULT_BTN");


        // 원본 비디오 탬플릿
        VideoElement originVideoState = (VideoElement) library.getAsset("DEFAULT_VIDEO");
        VideoElement copyVideoState = (VideoElement) library.getAsset("DEFAULT_VIDEO");
        // 복사본 값 수정
        copyDesignState.setId(100);
        copyDesignState.setContent("agree");
        copyDesignState.setStyle("blue, purple");

        // 테스트 복사본 값(비디오) 수정
        copyVideoState.setSize(720.0);
        copyVideoState.setContent("study");
        copyVideoState.setStyle("Black");

        // 중첩 객체 수정
        copyDesignState.getPosition().x = 10.0;
        copyDesignState.getPosition().y = 3.0;

        copyVideoState.getPosition().x = 30.0;
        copyVideoState.getPosition().y = 15.0;

        originDesignState.info();
        originVideoState.info();
        System.out.println("--------------------");
        copyDesignState.info();
        copyVideoState.info();

    }
}
