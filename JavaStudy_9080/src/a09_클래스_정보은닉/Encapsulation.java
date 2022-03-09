package a09_클래스_정보은닉;

public class Encapsulation {
	private String username; //아이디
	private String password; //비밀번호
	private String provider; //서비스회사 google, kakao, naver
	
	public Encapsulation( String password, String provider) {
		super();
		this.password = password;
		this.provider = provider;
	}
	
	public void setUsername(String username) {   //set 은 값을 대입
		if(provider.equals("kakao")) {
			this.username = username + "@kakao.com";
			
		}else if(provider.equals("google")) {
			this.username = username + "@gmail.com";
			
		}else if (provider.equals("naver")) {
			this.username = username + "@naver.com";
			
		}else {
			this.username = username;			
		}
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getUsername() {			//get은 값을 가져오는
		return username;
		
	}
	
	public void showInfo() {
		System.out.println(username);
		System.out.println(password);
		System.out.println(provider);
		
	}
}
