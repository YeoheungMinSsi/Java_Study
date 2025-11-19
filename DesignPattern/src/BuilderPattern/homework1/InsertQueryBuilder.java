package BuilderPattern.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertQueryBuilder implements IInsertBuilder {
    private String _tablePart;
    private List<String> _columnsPart = new ArrayList<>();
    private List<Object> _valuesPart = new ArrayList<>();

    private final SqlFormatter _formatter = new StandardSqlFormatter();

    @Override
    public InsertQueryBuilder into(String table) {
        this._tablePart = table;
        return this;
    }

    @Override
    public InsertQueryBuilder columns(String... columns) {
        if (columns.length > 0)
            _columnsPart.addAll(Arrays.asList(columns));
        return this;
    }

    @Override
    public InsertQueryBuilder columns() {
        return this;
    }

    @Override
    public InsertQueryBuilder values(Object... values) {
        if (values.length > 0)
            _valuesPart.addAll(Arrays.asList(values));
        return this;
    }

    @Override
    public String build() {
        // note: 테이블 값을 확인(검증)
        if (_tablePart == null || _tablePart.isEmpty()) {
            throw new IllegalArgumentException("INSERT 쿼리문 중 테이블 구문이 비워져 있습니다.");
        }

        // note: 칼럼 값을 추가
        if (_valuesPart.isEmpty()) {  // value에 값이 없는 경우
            throw new IllegalArgumentException("INSERT 쿼리 문 중 VALUE 에 값이 없음");
        }

        // 칼럼과 값의 수 일치 검증
        if (!_columnsPart.isEmpty() && _columnsPart.size() != _valuesPart.size()) {
            throw new IllegalArgumentException("칼럼 수와 값의 수가 맞지않음");
        }

        return _formatter.formatInsertQuery(
                _tablePart,
                _columnsPart,
                _valuesPart
        );
    }
}

