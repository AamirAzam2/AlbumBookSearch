package com.example.searchTerm.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(value = { "resultCount"})
@Getter 
@Setter 
@NoArgsConstructor
@AllArgsConstructor
public class AlbumResult {
	
	private String resultCount;
	private List<Album> results;

}
