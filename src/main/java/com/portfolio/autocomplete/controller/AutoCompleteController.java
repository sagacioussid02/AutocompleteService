package com.portfolio.autocomplete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.autocomplete.model.Suggestions;
import com.portfolio.autocomplete.service.AutoCompleteService;

@RestController
@RequestMapping("suggest")
public class AutoCompleteController {
	
	@Autowired
	AutoCompleteService autoCompleteService;
	
	@GetMapping(path = "/{word}", produces = {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
	   })
	public ResponseEntity<Suggestions> getSuggestions(@PathVariable String word){
		return autoCompleteService.getSuggestions(word) == null? new ResponseEntity<Suggestions>(HttpStatus.NO_CONTENT):
			new ResponseEntity<Suggestions>(autoCompleteService.getSuggestions(word), HttpStatus.ACCEPTED);
	}

}
