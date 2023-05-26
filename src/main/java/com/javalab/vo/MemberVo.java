/**
 * 
 */
package com.javalab.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberVo {
	
	private String id;
	private String name;
	private int age;
	private String bloodType;
	private String gender;
	
//
//	public MemberVo(String name, int grade) {
//		super();
//		this.name = name;
//		this.grade = grade;
//	}
//
//	public MemberVo() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getGrade() {
//		return grade;
//	}
//
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
//
//	@Override
//	public String toString() {
//		return "MemberVo [name=" + name + ", grade=" + grade + "]";
//	}
//
}