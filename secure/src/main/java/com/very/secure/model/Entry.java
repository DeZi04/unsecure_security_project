package com.very.secure.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Entry {
	@Id
	@GeneratedValue
	private Long id;
	private String val;
}
