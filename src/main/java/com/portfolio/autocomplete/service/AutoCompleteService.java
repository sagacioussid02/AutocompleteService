package com.portfolio.autocomplete.service;

import com.portfolio.autocomplete.model.Suggestions;

public interface AutoCompleteService {
	
	public Suggestions getSuggestions(final String word);

}
