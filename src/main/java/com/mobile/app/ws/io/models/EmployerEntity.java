package com.mobile.app.ws.io.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employers")
public class EmployerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	@Column(nullable = false, unique = true, length = 30)
	private String EmployerId;
	
	@Column(nullable = false, length = 30)
	private String firstName;
	
	@Column(nullable = false, length = 15)
	private String lastName;
	
	@Column(nullable = false, length = 30)
	private String email;
	private String jobTitle;
	private String imageUrl;
	
	@Column(nullable = false, length = 11, updatable = false)
	private String employerCode;
	
	@OneToMany(mappedBy = "employerDetails", cascade = CascadeType.ALL)
	private List<PhoneEntity> phones;
	
	private LocalDateTime createOn;
	private LocalDateTime updateOn;
	
}






