package BuilderPattern.homework1;

import java.util.List;

public class StandardSqlFormatter implements SqlFormatter{

    @Override
    public String formatValue(Object value){
        // 값이 없는 경우 null을 반환
        if(value == null){
            return "NULL";
        }

        // String 타입인 경우: 작은 따옴표로 묶음
        if (value instanceof String){
            return "'" + value + "'";
        }

        // 숫자, boolean 등 다른 기본 타입은 문자열 그대로 반환
        return value.toString();
    }

    @Override
    public String formatColumns(List<String> columns){
        if(columns.isEmpty()){
            return "";  // 값이 없으면 빈 문자열 반환
        }
        return "(" + String.join(", ", columns) + ")";  // 쉼표와 공백으로 요소 연결
    }

    @Override
    public String formatInsertQuery(String table, List<String> columns, List<Object> values){
        // 유효성 검증
        if(table == null || table.isEmpty())
            throw new IllegalArgumentException("테이블 이름이 없습니다.");
        if(values.isEmpty())
            throw new IllegalArgumentException("값이 없습니다.");

        // 쿼리 조합 시작 부분
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(table);

        // 컬럼 구문 추가 (formatColumns 메서드 재사용)
        String columnPart = formatColumns(columns);
        if(!columnPart.isEmpty()){
            sb.append(" ").append(columnPart);
        }

        // Value 추가
        sb.append(" VALUES (");

        for(int i = 0; i < values.size(); i++){
            if (i > 0)
                sb.append(", ");  // ,을 구분하여 값을 넣음
            // String 형태로 반환
            sb.append(formatValue(values.get(i)));
        }

        // 쿼리 끝
        sb.append(");");

        return sb.toString();

    }

}
