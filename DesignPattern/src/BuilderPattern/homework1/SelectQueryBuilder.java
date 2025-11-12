package BuilderPattern.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectQueryBuilder implements Builder {

    public List<String> selectPart = new ArrayList<>();
    public String fromPart;
    public String wherePart;
    public String orderByPart;
    public int limitPart;

    @Override
    public SelectQueryBuilder select(String... columns) {
//        for(String column : columns) {
//            selectPart.add(column);
//        }
        if(columns.length > 0)  // 간결성
//            selectPart.addAll(List.of(columns));  // 불변 리스트 반환
            selectPart.addAll(Arrays.asList(columns));
        return this;
    }
    @Override
    public SelectQueryBuilder from(String table){
        this.fromPart = table;
        return this;
    }
    @Override
    public SelectQueryBuilder where(String condition){
        this.wherePart = condition;
        return this;
    }
    @Override
    public SelectQueryBuilder orderBy(String column){
        this.orderByPart = column;
        return this;
    }
    @Override
    public SelectQueryBuilder orderBy(String column, String direction){
        this.orderByPart = column + " " + direction;
        return this;
    }
    @Override
    public SelectQueryBuilder limit(int limit){
        this.limitPart = limit;
        return this;
    }
    @Override
    public String build(){
        StringBuilder sb = new StringBuilder();

        if(!selectPart.isEmpty()){  // selectPart가 비워져 있지않다면
            sb.append("SELECT ").append(String.join(", ", selectPart));
        }
        if(fromPart != null){  //fromPart가 비워져 있지 않다면
            sb.append(" FROM ").append(fromPart);
        }
        if(wherePart != null){
            sb.append(" WHERE ").append(wherePart);
        }
        if(orderByPart != null){
            sb.append(" ORDER BY ").append(orderByPart);
        }
        if(limitPart > 0){
            sb.append(" LIMIT ").append(limitPart);
        }

        return sb.toString();
    }

}
