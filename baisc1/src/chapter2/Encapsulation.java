package chapter2;

// 캡슐화 : 인스턴스 필드와 메서드를 묶어서 필드에 대한 조작을 메서드를 통해서만 하도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음
class Player {
	private String birth;
	private int body;
	private String academic;
	private String career;
	
	public Player(String birth, int body, String academic, String career) {
		this.birth = birth;
		this.body = body;
		this.academic = academic;
		this.career = career;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getBirth() {
		return birth;
	}

	public String getAcademic() {
		return academic;
	}
	
	
	
//	public Player(String birth, int body, String academic, String career) {
//		this.birth = birth;
//		this.body = (body >= 0) ? body : 160;
//		this.academic = academic;
//		this.career = career;
//	}
//	
//	public String getBirth() {
//		return this.birth;
//	}
//	
//	public int getBody() {
//		return this.body;
//	}
//	
//	public String getAcademic() {
//		return this.academic;
//	}
//	
//	public String getCareer() {
//		return this.career;
//	}
//	
//	public void setBody(int body) {
//		this.body = (body >= 0) ? body : 160;
//	}
//	
//	public void setCareer(String career) {
//		this.career = career;
//	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		// Player kjd = new Player();
		// kjd.birth = "2004.04.12. 서울특별시";
		// kjd.body = "176cm, 72kg";
		// kjd.academic = "경북일고등학교";
		// kjd.career = "2023 항정우 양궁 국가대표";
		
		Player kjd = new Player("서울특별시", 176, "경북일고", "국가대표");
		
		System.out.println(kjd.getBirth());
		System.out.println(kjd.getBody());
		
		kjd.setBody(-177);
		System.out.println(kjd.getBody());
		
	}

}






