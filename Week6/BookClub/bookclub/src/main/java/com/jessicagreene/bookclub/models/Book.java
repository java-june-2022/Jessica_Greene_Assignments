package com.jessicagreene.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;


@Entity														
@Table(name="books")										
public class Book {
	@Id														
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
    private String title;
	
	@NotBlank
	private String author;
	
    @NotBlank
    private String thoughts;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User postedBy;

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
	public Book() {
	}
    public Book(String title, String author, String thoughts) {
        this.title = title;
        this.author = author;
        this.thoughts = thoughts;
    }
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getThoughts() {
		return thoughts;
	}
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
	public User getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	@PrePersist												//runs the method right before the object is created
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate												//runs a method when the object is modified
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}