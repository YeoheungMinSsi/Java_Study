public class ProcessingCode {
    public static void main(String[] args) {

    }
    public static String plusNum(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";

        for(int i = 0; i < code.length(); i++) {


            if(mode == 0){
                if(!String.valueOf(code.charAt(i)).equals("1")){
                    if(i % 2 == 0){
                        ret += String.valueOf(code.charAt(i));
                    }
                }else{
                    mode = 1;
                }
            }else if (mode == 1){
                if(!String.valueOf(code.charAt(i)).equals("1")){
                    if(i % 2 == 1){
                        ret += String.valueOf(code.charAt(i));
                    }
                }else{
                    mode = 0;
                }
            }
        }

        return answer = (ret.isEmpty() ? "EMPTY" : ret);
    }
}
