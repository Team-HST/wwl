package item2.leeyp;

public class BuilderTest {
	public static void main(String[] args) {
		Member member = new Member.Builder("QWER1234", "¾Ï¿ç¸Ç").
									email("QWER1234@naver.com").
									age(17).build();
		System.out.println(member);
	}
}

class Member {
	private final String id;
	private final String name;
	private final String email;
	private final String sex;
	private final int age;
	
	public static class Builder {
		private String id;
		private String name;
		private String email = "";
		private String sex = "";
		private int age = 0;
		
		public Builder(String id, String name) {
			if ("".equals(id) || id == null) {
				throw new IllegalArgumentException("============== ID VALUE IS REQUIRED");
			}
			if ("".equals(name) || name == null) {
				throw new IllegalArgumentException("============== NAME VALUE IS REQUIRED");
			}
			this.id = id;
			this.name = name;
		}
		
		public Builder email(String val) {
			email = val;
			return this;
		}
		public Builder sex(String val) {
			sex = val;
			return this;
		}
		public Builder age(int val) {
			age = val;
			return this;
		}
		
		public Member build() {
			return new Member(this);
		}
	}
	
	private Member(Builder builder) {
		id = builder.id;
		name = builder.name;
		email = builder.email;
		sex = builder.sex;
		age = builder.age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", sex=" + sex + ", age=" + age + "]";
	}
}
