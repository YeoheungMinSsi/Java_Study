package ProtoTypePattern.homework1;

public class GameManager {
    public static void main(String[] args) {
        CharacterManager manager = CharacterManager.getInstance();

        // note: warrior 생성
        Character warrior = (Character) manager.createCharacter("WARRIOR");
        // note: warrior 복사(origin, clone)
        Character originWarrior = (Character) manager.createCharacter("WARRIOR");
        Character cloneWarrior = (Character) manager.createCharacter("WARRIOR");
        // note: 복사왼 warrior 값 수정
        cloneWarrior.setName("김철수 전사");
        cloneWarrior.setHp(400.0);
        // SkillList에 스킬 추가(깊은 복사
        cloneWarrior.addSkill("분노");

        System.out.println("전사 생성");
        System.out.println("warrior = " + warrior);
        System.out.println("김철수 전사 생성");
        System.out.println("cloneWarrior = " + cloneWarrior);
    }

}
