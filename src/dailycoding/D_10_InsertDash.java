package dailycoding;

public class D_10_InsertDash {
    public static void main(String[] args) {
        String output = insertDash("454793");
        System.out.println(output); // --> 4547-9-3
    }

    public static String insertDash(String str) {
        // TODO:
        // 연속된 2개의 숫자가 홀수인지의 여부를 확인
        // 홀수이면 "-" 추가
        // 홀수가 아니면 그냥 넘어감 (0도 짝수)

        // 숫자문자열의 길이는 상관이없나?
        // 문자열의 각 요소 사이에 - 를 어떻게 넣나
        // 문자열 사이에 넣으려면 각 문자열이 홀수인지 알아야하는데 charAt을 쓰는건가
        // charAt(i) -> i 조건을 설정해서 ?
        //      -> i , i+1 모두 홀수이면 사이에 "-" 입력
        //      charAt(i) && charAt(i+1) % 2 == 1 -> "-"
        // 홀수 사이에 "-" 입력한 걸 킵?하고 다음 거에도 적용 -> += 로 해결
        // 짝수일경우 적어야함 -> else 로 해결
        // 홀수가 연속으로 중복 리턴되는 경우 해결


        String result;
        result = "";
        for (int i = 0; i < str.length()-1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i + 1);
            int c = str.charAt(i);
            int d = str.charAt(i + 1);
            int e = '0';

            if (((str.charAt(i) - '0') % 2 == 1) && ((str.charAt(i + 1) - '0') % 2 == 1)) {
                result += str.charAt(i) + "-";
            } else {
                result += str.charAt(i);
            }
        }
        result += str.charAt(str.length() - 1);

        return result;
    }
}
