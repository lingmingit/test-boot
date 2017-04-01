package com.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/***
 * 测试spring-boot使用
 * @author LingMin 
 * @date 2016-11-29<br>
 * @version 1.0<br>
 */
@Entity
@Table(name="t_user") 
public class User implements Serializable {

	//
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;
    
    /***
     * 默认构造方法
     */
    public User(){
    }
    
    /***
     * 带参数购置方法
     * @param name
     * @param passWord
     * @param email
     * @param nickName
     * @param regTime
     */
    public User(String name , String passWord , String email , String nickName , String regTime){
    	this.name = name;
    	this.passWord = passWord;
    	this.email = email;
    	this.nickName = nickName;
    	this.regTime = regTime;
    }
  
    public Long getId() {  
        return id;  
    }  
  
    public void setId(Long id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
    
    
  
    /**
	 * 获取passWord<p>
	 * @return  passWord  passWord<br>
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * 设置passWord<p>
	 * @param  passWord  passWord<br>
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	/**
	 * 获取email<p>
	 * @return  email  email<br>
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 设置email<p>
	 * @param  email  email<br>
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取nickName<p>
	 * @return  nickName  nickName<br>
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * 设置nickName<p>
	 * @param  nickName  nickName<br>
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * 获取regTime<p>
	 * @return  regTime  regTime<br>
	 */
	public String getRegTime() {
		return regTime;
	}

	/**
	 * 设置regTime<p>
	 * @param  regTime  regTime<br>
	 */
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	@Override  
    public boolean equals(Object o) {  
        if (this == o) return true;  
        if (o == null || getClass() != o.getClass()) return false;  
  
        User user = (User) o;  
  
        if (id != null ? !id.equals(user.id) : user.id != null) return false;  
  
        return true;  
    }  
  
    @Override  
    public int hashCode() {  
        return id != null ? id.hashCode() : 0;  
    }  
}
