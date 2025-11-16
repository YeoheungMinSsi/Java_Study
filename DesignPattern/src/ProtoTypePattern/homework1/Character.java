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
    private List<String> skillList;

    public Character(String name, int level, double hp, double attackPower,
                     double defensePower, List<String> skillList) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
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
                clonedSkills  // 깊은 복제된 리스트 전달
        );
        return clonedCharacter;
    }

    @Override
    public String toString(){
        return String.format(
                "캐릭터: %s (Lv.%d HP: %.1f, 공격력: %.1f), 스킬: %s",
                name, level, hp, attackPower, skillList
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
    public List<String> getSkillList(){
        // 내부 리스트의 복사본인 새 ArrayList를 생성하여 반환 / 내부 데이터 보호
        return new ArrayList<>(skillList);
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
    public void setSkillList(List<String> skillList){
        this.skillList = skillList;
    }
}
