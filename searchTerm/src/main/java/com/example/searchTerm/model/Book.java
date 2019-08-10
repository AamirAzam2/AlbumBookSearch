package com.example.searchTerm.model;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;


@JsonIgnoreProperties(value = { "kind","totalitems" })
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	private int totalitems;
	private List<BookItems> items;
	private String Kind;
	
}
