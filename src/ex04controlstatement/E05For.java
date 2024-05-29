package ex04controlstatement;

/*
 for문 : 
  while문과 같은 반복문으로 초기값, 조건식, 증감식이 한줄에 이어 반복의 횟수를 명확히 알 수 있는 방복문
   반복의 횟수가 정해져있는 경우 주로 사용
 형식]
  for(초기값; 조건식; 증감식){
  	실행문;
  }
 */

public class E05For {

	public static void main(String[] args) {
		
		// 변수 i가 1부터 5까지 1씩 증가하므로 5번 반복
		for(int i=1; i<=5; i++) {
			System.out.println("i = "+i);
		}
		/*
		  시나리오] 1-100까지의 합을 구하는 프로그램을 for문을 이용하여 작성하시오
		 */
		// 누적합 저장용 변수 선언
		int sum=0;
		// 1-100까지의 구간을 정한 후 변수를 1씩 증가
		for(int j=1; j<=100; j++) {
			// 증가하는 j를 누적해서 합산
			sum += j;
		}
		System.out.println("1-100까즈이 합 : " + sum);
		
		/*
		  시나리오] for문을 이용하여 1-10까지의 정수 중 2의 배수의 합을 구하는 프로그램을 작성하시오
		 */
		// 방법1 : 1-10까지 10번 반복해서 if문을 통해 2의 배수를 찾은 후 누적하여 합산
		int total = 0;
		for(int i =1; i<=10; i++) {
			// 2의 배수인지 확인
			if(i%2==0) {
				// 2의 배수일 때 누적해서 합산
				total += i;
			}
		}
		System.out.println("1-10사이 2의 배수의 합(방법1) : " + total);
		
		// 방법2 : ㅑㄹ문 없이 초기값을 0부터 시작해서 2씩 증가
		total =0 ;
				for(int i=0; i<=10; i+=2) {
					total += i;
				}
		System.out.println("1-10사이 2의 배수의 합(방법2) : " + total);
		
		// for문으로 무한루프를 만들때는 (;;)와 같이 표현
		// while(true)와 동일
		int a = 1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한루프" + a);
			a++;
			// 루프 내에서 a를 증가시키고 1000이 되면 반복문 탈출
			// 반복문에서 break를 만나면 즉시 탈출
			if(a==10) break;
		}
		
		// for문의 끝에 ;를 사용하면 for문과 상관없이 한번만 실행되므로 에러 발생
		for(int i=0; i<=5; i++);{
			System.out.println("어라, 나는 누구, 여긴 어디?");
		}
		/*
		  for문읯 초기식에서 선언된 변수 j는 for문이 종료되는 순간 메모리에서 소멸
		  여기서 사용된 변수 j는 지역변수(Local variable)는 해당 지역(블럭)을 벗어나서 소멸되므로 에러 발생
		 */
		//System.out.println("위 for문에서 선언한 변수 j="+j);
		System.out.println("위 main함수 지역에서 선언한 변수 total=" + total);
		
		/*
		 fot문의 초기값을 외부(넓은 지역, 여기서는 main메소드 지역)에서 선언하면
		 해당 변수는 for문의 안쪽(좁은 지역)에서 사용 가능
		 아래의 선언한 변수i는 main메소드의 지역변수로 선언
		 */
		int i=0;
		for(; i<=5; i++) {
			System.out.println("for문 안에서의 i값 = " + i);
		}
		System.out.println("for문 밖에서의 i값 = " + i);
		/*
		 Java에서 중괄호가 나오면 하나의 지역으로 인식
		 if문, while문 등의 제어문도 하나의 지역을 형성
		 */
		
		/*
		 연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오
		 */
		
		 for(int e=2; e<=9; e++) {
		  System.out.println(e+"단 입니다.");
		 	for(int j=1; j<=9; j++){
		 		System.out.printf("%dx%d=%d ",e,j,(e*j));
		 	}
		 	System.out.println();
		 }
	
		 // 단에 해당하는 for문
		 for(int dan=2; dan<=9; dan++)	{
			 // 수에 해당하는 for문
			 for(int su=1; su<=9; su++)	{
				 // 출력은 되지만 정확한 정렬은 불가
//				 System.out.print(dan+"*"+su+"="+dan*su);
				 // 서식문자를 통해 칸을 미리 확보하여 줄력시 정렬
				 System.out.printf("%dx%d=%2d ",dan,su,(dan*su));
				 // 각 항목을 구분하기 위해 띄어쓰기
				 System.out.print(" ");
			 }
			 // 하나의 단을 모두 출력 후 줄바꿈 처리
			 System.out.println();
		 }
		}

	}

