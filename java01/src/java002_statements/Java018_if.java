package java002_statements;

/*
 * if(조건식) {
 * 	if(조건식) {
 * 
 * 		}else{
 * 		 if조건식() {
 * 			}
 * 		}
 */

public class Java018_if {

	public static void main(String[] args) {
		boolean member = false; //회원(true) or 비회원(false)
		String grade = "일반"; //회원등급(VIP,일반
		
		if(!member) {
			//회원				
			if(grade=="VIP") {
				System.out.printf("고객님은 %s 이며 %d% 적립\n",grade,30);
			}else {
				System.out.printf("고객님은 %s 이며 %d% 적립\n",grade,10);
			}
			//비회원
		}else {
			System.out.printf("고객님은 %s 이며 %d% 적립\n",grade, 0);
						
		}

	}//end main()

}//end class
