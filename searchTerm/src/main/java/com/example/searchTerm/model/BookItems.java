package com.example.searchTerm.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(value = { "id","etag","selfLink","kind"})
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class BookItems {
	
	private VolumeInfo volumeInfo;;
	private String Kind;
	private String id;
	private String etag;
	private String selfLink;
	
}
