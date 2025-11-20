package SingletonPattern.homework1;

import java.util.List;

public class SingletonTest {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        // test: 인스턴스 로그 확인
        logger1.log("App started");

        // 2. 인스턴스 비교
        boolean isSame1_2 = (logger1 == logger2);
        boolean isSame2_3 = (logger2 == logger3);

        if (isSame1_2 && isSame2_3) {
            System.out.println("동일한 인스턴스 입니다.");
        } else {
            System.out.println("인스턴스가 동일하지 않습니다.");
        }

        // 3. 메모리 주소비교(hashCode)를 통한 간접 확인(객체 주소 확인)
        System.out.println("logger1 =" + logger1.hashCode());
        System.out.println("logger2 =" + logger2.hashCode());
        System.out.println("logger3 =" + logger3.hashCode());

        // 4. 로그 저장 및 포맷 검증 테스트
        System.out.println("로그 저장 및 포맷 검증 테스트 실행");
        logger1.info("앱 초기화 완료");
        logger2.warn("설정 파일 로드 지연");
        logger2.error("DB 연결 실패");

        // 5. 로그 저장 및 조회 테스트 / logger1과 logger2는 동일한 객체 참조
        List<String> allLogs = logger2.getLogs(); // getLogs를 통해서
        System.out.println("총 기록 로그 수 : " + allLogs.size());
        // logger1에 저장된 로그도 저장함
        System.out.println("전체 로그 내용");
        for (String log : allLogs) {
            System.out.println(log);
        }

        // 6. 확장 검증 (FileAdapter 추가)
        FileAdapter fileAdapter = new FileAdapter();
        logger1.addObserver(fileAdapter);

        System.out.println("새 FileAdapter 추가");
        logger1.log("파일 저장 채널 추가 후 테스트 로그");
    }
}
