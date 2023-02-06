package dailycoding;

public class D_16_IsIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }

    private static boolean isIsogram(String str) {

        /*
		boolean 타입 리턴
		공백이없는 string
		빈 문자열 -> true
		대소문자 구별 x
		중복되는 알파벳이 있으면 -> false
		중복되는 알파벳이 없으면 -> 아이소그램 -> true

		문자열의 각 요소를 어떻게 비교할수있을까?
		string 타입의 문자열 str 의 각 요소를 비교해야함
		charAt(0) 부터 charAt(str.length -1) 을 비교
		같은 값이 있는지 여부를 조사

		for (int i=0; i<str.length -1; i++) {
		    if (charAt(i) == charAt(i+1)) {
		    return false;
		    }

		}
		요소 전부를 비교할수없음 -> 연속된 두요소만 비교하는 함수인것이 문제
		연속된 요소만 비교하지 않으려면 i , i+1 을 사용하면 안됨
		str.length == 5 인 문자열이라면
		chatAt(0) ~ charAt(4) 모두 비교해야함
	    인덱스 0의 1234 와 일치여부  i = 0 , j = 0
		인덱스 1의 234 일치여부
		인덱스 2의 34 일치여부
		인덱스 3의 4 일치여부

		이중 for 문을 사용하면 해결될까?
		for(int i=0; i<str.length -1; i++) {
		    for(int j=i; j<str.length-1; j++) {
		        if(str.charAt(i)==str.charAt(j)) { return false; }
		    }
		}
		return true;


		*/

        //빈 문자열 -> true
        if (str.length() == 0) {
            return true;
        }

        //알파벳 대소문자 구분 없으므로 대문자로 통일
        str = str.toUpperCase();

        //알파벳 중복여부 판별
        //중복이 없으면 -> true
        for (int i = 0; i < str.length() - 1; i++) {
            for(int j = i; j < str.length() -1; j++) {
                char a = str.charAt(i);
                char b = str.charAt(j);
                if(str.charAt(i) == str.charAt(j+1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
