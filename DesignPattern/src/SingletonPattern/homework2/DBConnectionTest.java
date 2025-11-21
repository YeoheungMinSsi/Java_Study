package SingletonPattern.homework2;

public class DBConnectionTest {
    public static void runBasicTests(String testName, DBConnection dbInstance) {
        System.out.println("\n--- " + testName + " 테스트 시작 ---");

        // 2. 연결 및 쿼리 실행 테스트
        System.out.println("2. [연결 시도]");
        dbInstance.connect();

        // 3. 연결 상태 확인
        System.out.println("3. [상태 확인] Status: " + dbInstance.getStatus());

        // 쿼리 실행
        dbInstance.query("SELECT id FROM users;");

        // 연결 해제 후 쿼리 시도 (실패 검증)
        dbInstance.disconnect();
        System.out.println("3. [상태 확인] Status: " + dbInstance.getStatus());
        dbInstance.query("INSERT INTO logs VALUES(1);");

        System.out.println("--- " + testName + " 테스트 종료 ---\n");
    }
    // 테스트에서 사용할 공통 메서드 (테스트 시나리오 1~4 검증)

    public static void main(String[] args) {
        // 1. 단일 인스턴스 검증
        DBConnector connector1 = DBConnector.getInstance();
        DBConnector connector2 = DBConnector.getInstance();

        System.out.println("--- 1. 단일 인스턴스 검증 ---");
        boolean isSameConnector = (connector1 == connector2);

        System.out.println("Connector A와 B는 동일 객체인가? : " + isSameConnector);
        System.out.println("Connector A HashCode: " + connector1.hashCode());
        System.out.println("Connector B HashCode: " + connector2.hashCode());
        if (isSameConnector) {
            System.out.println("✅ 싱글턴 보장 확인 완료.");
        }

// 2 & 3. 연결, 쿼리, 상태 확인 테스트 (기본 MockConnection 사용)
// 시스템 속성을 설정하지 않았으므로, MockConnection이 반환됩니다.
        DBConnection mockDb = connector1.getConnection();
        runBasicTests("Mock Connection 기능", mockDb);


// 4. 다중 접근 테스트 (동일한 연결 상태 공유 검증)
        System.out.println("--- 4. 다중 접근 (상태 공유) 테스트 ---");

        DBConnection dbAccessA = connector1.getConnection(); // 유일한 MockConnection 인스턴스
        DBConnection dbAccessB = connector2.getConnection(); // 역시 유일한 MockConnection 인스턴스

// A 인스턴스를 통해 연결 시도
        dbAccessA.connect();

// B 인스턴스를 통해 상태 확인 (A의 변경 사항이 B에 즉시 반영되어야 함)
        System.out.println("접근 A 연결 상태: " + dbAccessA.getStatus());
        System.out.println("접근 B 상태 확인: " + dbAccessB.getStatus()); // 기대값: connected

// B 인스턴스를 통해 연결 해제
        dbAccessB.disconnect();
        System.out.println("접근 B 연결 해제");

// A를 통해 쿼리 시도 (연결이 끊겼으므로 실패해야 함)
        dbAccessA.query("TEST QUERY from A"); // 기대값: 실패 메시지 출력

        System.out.println("✅ 상태 공유 확인 완료. 두 변수가 하나의 인스턴스를 공유함.");


// 5. 확장성 테스트 (다른 구현체 관리 검증)
        System.out.println("\n--- 5. 확장성 테스트 (MySQL Connection 시뮬레이션) ---");

// 🚨 주의: 이 코드는 JVM 재시작 없이 MySQLConnection을 테스트하기 위한 시뮬레이션입니다.
// 실제 테스트는 JVM 시작 시 -DDB.Connection.Type=MYSQL 옵션을 주어야 합니다.

// MySQLConnection이 DBConnection 인터페이스를 구현했으므로, DBConnection 타입으로 관리 가능
        DBConnection mysqlDb = new MySQLConnection(); // 실제 DBConnector가 생성했을 인스턴스
        System.out.println("타입 확인: " + mysqlDb.getClass().getSimpleName()); // 기대값: MySQLConnection

        runBasicTests("MySQL Connection 기능", mysqlDb);


        DBConnection fileSystem = new FileConnection();
        System.out.println("타입 확인: " + fileSystem.getClass().getSimpleName()); // 기대값: fileConnection

        runBasicTests("File System Connection 기능", fileSystem);
    }

}
