public class SringAlgorithm {
    public static void main(String[] args) {
        String str = "abcdabcdfgab";
        String fdStr = "ab";

        int orStrLen = str.length();  // 오리지널 스트링
        int fdStrLen = fdStr.length();  // 찾는 단어

        // 전체 문장ㄹ르 char형 배열로 변환
        char[] allString = str.toCharArray();
        // 찾을 단어를 char형 배열로 변환
        char[] searchString = fdStr.toCharArray();

        int i;

        int count = 0;  // 문장에서 찾을려는 개수

        // start는 전체 문장에서 찾는 단어를 빼서 시작 인덱스 구분
        for(int start = 0; start < orStrLen; start++){
            for(i = 0; i < fdStrLen; i++){  // 찾는 단어 대입
                if(allString[start] == searchString[i]){  // 첫 단어 확인
                    if(allString[start + 1] == searchString[i + 1])  // 두번째 단어 확인
                        count++;
                }else break;

            }
        }
        System.out.println("찾은 단어 개수 " + count);
    }
}
