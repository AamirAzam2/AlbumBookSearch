package com.example.searchTerm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.searchTerm.model.Album_Book;
import com.example.searchTerm.service.SearchTermService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SearchTermController {
	
	@Autowired
	private SearchTermService searchTermService;

	@GetMapping("/v1/api/{searchTerm}")
	@ApiOperation(" Get the list of Album and Book ")
	public Album_Book getAlbum_Book(@PathVariable("searchTerm") String searchTerm){
	
	    return searchTermService.getAllInfo(searchTerm);
	}
	

		
}
