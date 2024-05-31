package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("### 시나리오1 ###");
		String juminNum = "190419-3000000";
		System.out.println("7번째 문자 추출 = " + juminNum.charAt(7));
		//추출한 문자를 변수에 저장
		char gender = juminNum.charAt(7);
		if(gender=='1' || gender=='3') {
			System.out.println("남자입니다");
		} else if(gender =='2' || gender=='4'){
			System.out.println("여자입니다");
		} else if(gender =='5' || gender=='6'){
			System.out.println("외국인 입니다");
		} else {
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		}

		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		System.out.println(" ");
		System.out.println("### 시나리오2 ###");
		String email = "hong@daum.net";
		String emailx = "not@naver";
		System.out.println("포함된 문자 확인 : " + email.contains("."));
		if(email.contains("@") && email.contains(".")) {
			System.out.println("이메일 형식입니다");
		} else {
			System.out.println("이메일 확인 요망");
		}
//		System.out.println(email.contains(".") ? "이메일 형식입니다" : "이메일 형식이 아닙니다");

		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		System.out.println(" ");
		System.out.println("### 시나리오3 ###");
		char i = juminNum.charAt(juminNum.indexOf("-")+1);
		System.out.println(i);
		if(i=='3' || i=='1') {
			System.out.println("남자입니다");
		} else if(i =='2' || i=='4'){
			System.out.println("여자입니다");
		} else if(i =='5' || i=='6'){
			System.out.println("외국인 입니다");
		} else {
			System.out.println("주민번호를 잘못 입력하셨습니다.");
		}
		
		System.out.println(" ");
		System.out.println("### 강사님 코딩 ###");
		String jumin = "190419-3000000";
		System.out.println("하이픈 위치찾기 = " + jumin.indexOf("-"));
		int genderIndex = jumin.indexOf("-")+1;
		if(jumin.charAt(genderIndex)=='1' || jumin.charAt(genderIndex)=='3')
		{
			System.out.println("남자");
		} else if(jumin.charAt(genderIndex) =='2' || jumin.charAt(genderIndex)=='4'){
			System.out.println("여자");
		} else if(jumin.charAt(genderIndex)=='5' || jumin.charAt(genderIndex)=='6'){
			System.out.println("외국인");
		} else {
			System.out.println("주민번호를 잘못 입력");
		}
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println(" ");
		System.out.println("### 시나리오4 ###");
		String file = "my.file.images.jpg";
		
		System.out.println(file.lastIndexOf("."));
		System.out.println("파일명 : " + file.substring(0,file.lastIndexOf(".")));
		System.out.println("확장자명 : " + file.substring(file.lastIndexOf(".")+1));
		
		System.out.println(" ");
		System.out.println("### 강사님 코딩 ###");
		String filename = "my.file.images.jpg";
		//파일명 마지막의 .의 위치를 검색
		int dotPoIdx = filename.lastIndexOf(".");
		//.의 위치 다음의 문자열부터 잘라내므로 +1해서 처리
		String fileExt = filename.substring(dotPoIdx+1);
		System.out.println("파일확장자 = " + fileExt);
	}

}
