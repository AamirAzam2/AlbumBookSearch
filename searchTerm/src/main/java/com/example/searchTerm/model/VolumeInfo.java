package com.example.searchTerm.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(value = {"subtitle"})
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class VolumeInfo {
	
	private String title;
	private String subtitle;
	private List authors;
	private String printType;

}
