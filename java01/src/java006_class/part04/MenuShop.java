package java006_class.part04;

/*
 * [분식점 푸로그램]
 * 1. 메뉴명
 * 2. 가격
 * 3. 주문갯수
 * 4. 계산
 * 
 * 객체 속성: 메뉴명, 가격, 주문갯수
 * 객체 동작: 계산하다
 * 
 *    메뉴명   가격    주문갯수
 *  떡볶이    2000     3
 *  김말이     500     4
 *  오뎅      300     3
 */
public class MenuShop {
	String menu; // 메뉴명
	int price; // 가격
	int cnt; // 주문 갯수
	
	int count() {
		return price * cnt;
	} // count
	
	void display() {
		System.out.println("메뉴명 : " + menu);
		System.out.println("가격 : " + price);
		System.out.println("주문갯수 : " + cnt);
		System.out.println("금액 : " + count());
	}
	
	
}
