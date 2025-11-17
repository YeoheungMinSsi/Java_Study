package ProtoTypePattern.homework1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CharacterManager {
    // note: 단일 스레드 시 HashMap, 다중 스레드라면 ConcurrentDictionary 사용
    private final Map<String, CharacterPrototype> _characters = new ConcurrentHashMap<>();

    private static final CharacterManager INSTANCE = new CharacterManager();

    private CharacterManager(){
        loadPrototypes();
    }

    public static CharacterManager getInstance() {
        return INSTANCE;
    }

    // 탬플릿 생성
    private void loadPrototypes(){
        // note: 전사 탬플릿
        List<String> warriorSkillList = new ArrayList<>(Arrays.asList("방패막기", "강화"));
        Character warriorTemplate = new Character(
                "기사",
                1,
                200.0,
                10.0,
                20.0,
                5.0,
                warriorSkillList
        );
        _characters.put("WARRIOR", warriorTemplate);

        // note: 마법사 탬플릿
        List<String> wizardSkillList = new ArrayList<>(Arrays.asList("파이어볼", "힐"));
        Character wizardTemplate = new Character(
                "마법사",
                1,
                100.0,
                5.0,
                5.0,
                20.0,
                wizardSkillList
        );
        _characters.put("WIZARD", wizardTemplate);

        // note: 궁수 탬프릿
        List<String> ArcherSkillList = new ArrayList<>(Arrays.asList("활쏘기", "단검 투척"));
        Character ArcherTemplate = new Character(
                "궁수",
                1,
                100.0,
                20.0,
                5.0,
                10.0,
                ArcherSkillList
        );
        _characters.put("ARCHER", ArcherTemplate);
    }

    //템플릿 복사하여 새로운 인스턴스 반환하는 메서드
    public CharacterPrototype createCharacter(String key){
        CharacterPrototype template = _characters.get(key);  // HashMap으로 생성하여 get을 사용
        if(template != null){
            return template.clone();
        }
        throw new IllegalArgumentException(key + "탬플릿이 없습니다.");
    }
}
