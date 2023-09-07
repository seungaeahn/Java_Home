package Practice;
import java.util.ArrayList;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 3-1)ArrayList 이용해서 빨 주 노 초 파 남 보
		수정 3회 1,3,5 ->블랙, 브라운, 그린 수정 
		더하기 2회 ->주황, [옐로우],파랑,[연한파랑] 
		향상된 for문 이용해서 색상 출력하기
		최후출력 빨 파 보

		 */
				ArrayList<String> colors = new ArrayList<>();
				System.out.println("colors: " + colors); 
				
				//요소추가
				colors.add("빨");
				colors.add("주");
				colors.add("노");
				colors.add("초");
				colors.add("파");
				colors.add("남");
				colors.add("보");
				
				//요소 수정하기
				colors.set(1, "블랙");
				colors.set(3, "브라운");
				colors.set(5, "그린");
				
				System.out.println("수정체크: " + colors);
				
				//요소 더하기 
				colors.add(1,"옐로우");
				colors.add(7,"연한파랑");
				
				System.out.println("수정체크: " + colors);
				
				
				//ArrayList 순회해서 요소 출력 
				System.out.println("모든 색상 목록");
				//for(요소의데이터타입 변수명 : ArrayList변수명) {
				for (String color :colors) {
					System.out.println(color);
				}
				
				colors.remove(1);
				colors.remove(1);
				colors.remove(1);
			    colors.remove(1);
			    colors.remove(2);
			    colors.remove(2);
				System.out.println("최종출력: " + colors);
				
				
				
	}

}
