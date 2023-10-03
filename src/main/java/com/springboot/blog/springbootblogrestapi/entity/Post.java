package com.springboot.blog.springbootblogrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.print.DocFlavor.STRING;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="posts",uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class Post {

	private Long  id;
	private String title;
	private String description;
	private String content;
	
}
