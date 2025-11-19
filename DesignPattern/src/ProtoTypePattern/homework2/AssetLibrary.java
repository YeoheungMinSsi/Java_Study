package ProtoTypePattern.homework2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AssetLibrary {
    // 탬플릿 인스턴스를 저장하는 저장소
    private final Map<String, DesignElementPrototype> assets = new ConcurrentHashMap<>();

    public AssetLibrary() {
        loadAssetsTemplate();
    }

    // 탬플릿 등록 메서드
    private void loadAssetsTemplate(){
        Position btn = new Position(100, 100);
        DesignElement btnTemplate = new DesignElement(
                1,
                btn,
                100.0,
                "red, yellow",
                "confirm",
                "BUTTON"
        );
        assets.put("DEFAULT_BTN", btnTemplate);
    }

    public DesignElementPrototype getAsset(String key){
        // 키를 통해서 Map에서 원본 탬플릿을 조회
        DesignElementPrototype template = assets.get(key);

        if(template == null){
            throw new IllegalArgumentException("에셋 탬플릿을 찾을 수 없음" + key);
        }

        return template.clone();
    }
}
