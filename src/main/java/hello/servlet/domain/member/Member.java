package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {

    private Long id;
    private String Username;
    private int age;

    public Member(){

    }


    public Member(String username, int age) {
        Username = username;
        this.age = age;
    }
}
