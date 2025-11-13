package BuilderPattern.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectQueryBuilder implements ISelectBuilder {

    private List<String> _selectParts = new ArrayList<>();
    private String _fromPart;
    // note: where절 테스트 AND 병합 -> 단일 타입으로 안됨
//    public String wherePart;
    private List<String> _whereParts = new ArrayList<>();
    private String _orderByPart;
    private int _limitPart;

    @Override
    public SelectQueryBuilder select(String... columns) {
        if(columns.length > 0)  // 간결성
            _selectParts.addAll(Arrays.asList(columns));
        return this;
    }

    @Override
    public SelectQueryBuilder from(String table){
        this._fromPart = table;
        return this;
    }

    @Override
    public SelectQueryBuilder where(String... condition){
        if (condition.length > 0)  // note: where절 여러번 호출
            _whereParts.addAll(Arrays.asList(condition));
        return this;
    }

    @Override
    public SelectQueryBuilder orderBy(String column){
        this._orderByPart = column + " ASC";
        return this;
    }

    @Override
    public SelectQueryBuilder orderBy(String column, String direction){
        this._orderByPart = column + " " + direction;
        return this;
    }

    @Override
    public SelectQueryBuilder limit(int limit){
        this._limitPart = limit;
        return this;
    }
    @Override
    public String build(){
        StringBuilder sb = new StringBuilder();

        if(!_selectParts.isEmpty()){  // selectPart가 비워져 있지않다면
            sb.append("SELECT ").append(String.join(", ", _selectParts));
        }
        if(_fromPart != null){  //fromPart가 비워져 있지 않다면
            sb.append(" FROM ").append(_fromPart);
        }
        if(!_whereParts.isEmpty()){
            // note: 모든 조건을 " AND " 로 연결함
            sb.append(" WHERE ").append(String.join(" AND ", _whereParts));
        }
        if(_orderByPart != null){
            sb.append(" ORDER BY ").append(_orderByPart);
        }
        if(_limitPart > 0){
            sb.append(" LIMIT ").append(_limitPart);
        }

        return sb.toString();
    }

}
