package com.portfolio.autocomplete.data.util;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	
	char val;
	Map<Character,TrieNode> children;
	boolean isEndWord;
	
	public TrieNode(char val) {
		this.val = val;
		this.children = new HashMap<Character, TrieNode>();
		this.isEndWord = false;
	}
}
