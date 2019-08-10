package com.example.searchTerm.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.searchTerm.model.AlbumResult;
import com.example.searchTerm.model.Album_Book;
import com.example.searchTerm.model.Book;


@Service
public class SearchTermService {



	public AlbumResult getAlbumList(String searchTerm) {
		// TODO Auto-generated method stub
		final String uri = "https://itunes.apple.com/search?term={searchTerm}&limit={count}";
          
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("searchTerm", searchTerm);
	    params.put("count", "5");
	    RestTemplate restTemplate = new RestTemplate();
	    List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
	    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
	    converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
	    messageConverters.add(converter);
	    restTemplate.setMessageConverters(messageConverters);
	    AlbumResult result = restTemplate.getForObject(uri, AlbumResult.class, params);       
	    return result;
		
	}

	public Album_Book getAllInfo(String searchTerm) {
		// TODO Auto-generated method stub
		Book listofBooks = getBookList(searchTerm);
		AlbumResult listofAlbumResult= getAlbumList(searchTerm);
		
		Album_Book album_book = new Album_Book();
		album_book.setBook(listofBooks);
		album_book.setAlbumresult(listofAlbumResult);
		return album_book;
	}

	private Book getBookList(String searchTerm) {
		// TODO Auto-generated method stub
		final String uri = "https://www.googleapis.com/books/v1/volumes?q={searchTerm}&maxResults={count}";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("searchTerm", searchTerm);
	    params.put("count", "5");
	     
	    RestTemplate restTemplate = new RestTemplate();
	    Book result = restTemplate.getForObject(uri, Book.class, params);
	     
         return result;
	}
}