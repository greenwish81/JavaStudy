package dailycoding;

public class D_18_NumberSearch {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }

    public static int numberSearch(String str) {
//        수도코드
//        빈 문자열을 입력 받은 경우 0을 리턴
        if (str.length() == 0) {
            return 0;
        }
        
//        문자열에 있는 모든 숫자들을 더해서 저장할 변수를 만든다 -> a
        int sum = 0;
        
//        문자열에 있는 숫자와 공백이 아닌 갯수를 저장할 변수를 만든다 -> b
        int count = 0;

//        for문으로 문자열의 한자리씩을 숫자인지 확인한다
        for (int i = 0; i < str.length(); i++) {

//        숫자면 sum 에 더해준다
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                sum += Integer.valueOf(str.charAt(i) - '0');
            }

//        문자면 count 에 1을 더해준다
            else if (str.charAt(i) != ' ') {
                count += 1;
            };
        }

//        a 를 b 로 나눠서 소숫점 첫째자리에서 반올림한 값을 반환한다
        int result = (int)(Math.round((double) sum / (double) count));
        return result;
    }
}
