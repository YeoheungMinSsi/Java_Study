package ProtoTypePattern.homework1;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Character implements CharacterPrototype {

    private String name;
    private int level;
    private double hp;
    private double attackPower;
    private double defensePower;
    private double magicPower;
    private List<String> skillList;

    public Character(String name, int level, double hp, double attackPower,
                     double defensePower, double magicPower, List<String> skillList) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.magicPower = magicPower;
        this.skillList = skillList;
    }

    // note: 클래스에 의존하지 않게 하기위해 Character를 매서드 타입에 사용하지 않음
    @Override
    public CharacterPrototype clone() {
        // 참조 타입 필드(skill)의 깊은 복제(새 리스트 생성)
        List<String> clonedSkills = new ArrayList<>(this.skillList);

        // note: 새로운 Character 인스턴스 생성, 원본 데이터를 복사하여 초기화
        Character clonedCharacter = new Character(
                this.name,
                this.level,
                this.hp,
                this.attackPower,
                this.defensePower,
                this.magicPower,
                clonedSkills  // 깊은 복제된 리스트 전달
        );
        return clonedCharacter;

//        return new Character(
//                this.name,
//                this.level,
//                this.hp,
//                this.attackPower,
//                this.defensePower,
//                clonedSkills  // 깊은 복제된 리스트 전달
//        );
    }

    // 상태 출력 메서드
    @Override
    public String toString(){
        return String.format(
                "캐릭터: %s (Lv.%d, HP: %.1f, 공격력: %.1f, 방어력: %.1f, 마법공격력: %.1f), 스킬: %s",
                name, level, hp, attackPower, defensePower, magicPower, skillList
        );
    }

    //Getter
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public double getHp(){
        return hp;
    }
    public double getAttackPower(){
        return attackPower;
    }
    public double getDefensePower(){
        return defensePower;
    }
    public double getMagicPower(){
        return magicPower;
    }
    public List<String> getSkillList(){
        // 내부 리스트의 복사본인 새 ArrayList를 생성하여 반환 / 내부 데이터 보호
        return new ArrayList<>(skillList);
    }
    // 스킬리스트가 추가가 안됌 -> 새 리스트로 추가해서 그런 것 같음
    public void addSkill(String skillName){
        this.skillList.add(skillName);
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setHp(double hp){
        this.hp = hp;
    }
    public void setAttackPower(double attackPower){
        this.attackPower = attackPower;
    }
    public void setDefensePower(double defensePower){
        this.defensePower = defensePower;
    }
    public void setMagicPower(double magicPower){
        this.magicPower = magicPower;
    }
    public void setSkillList(List<String> skillList){
        this.skillList = skillList;
    }
}
