package com.kr.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
public class Member {
    
	@Id
	@Column(name = "ID")
    private String id;
	
	@Column(name = "NAME")
    private String username;
	
    private int age;

    // Getter, Setter
    public String getId() {
        return id;
    }

	public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
	
    @Override
	public String toString() {
		return "Member [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
    
}
