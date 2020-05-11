package com.portfolio.autocomplete.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.portfolio.autocomplete.data.generate.DataGeneration;
import com.portfolio.autocomplete.data.util.TrieOp;
import com.portfolio.autocomplete.model.Suggestions;
import com.portfolio.autocomplete.service.AutoCompleteService;

@Service
public class AutoCompleteServiceImpl implements AutoCompleteService{
	
	TrieOp op = new TrieOp();
	
	public Suggestions getSuggestions(final String word) {
		DataGeneration.generateData(op);
		Suggestions suggestions = new Suggestions();
	    List<String> suggestedWords = op.getSamePrefixWords(word);
	    suggestions.addAll(suggestedWords);
		return suggestions;
	}

}
