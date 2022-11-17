package com.example.progmod2beadando.demo.pgmodels;

import com.example.progmod2beadando.demo.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clidata")
@Data
@NoArgsConstructor
public class CliData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "clidata_id")
	private Long cliId;

	@Column(name = "clidata_name")
	private String name;

	@Column(name = "clidata_email")
	private String email;

	@Column(name = "clidata_tel")
	private String tel;

	@Column(name = "clidata_desc")
	private String description;

	@Column(name = "clidata_gen")
	@Enumerated(EnumType.STRING)
	private Gender gender;
}