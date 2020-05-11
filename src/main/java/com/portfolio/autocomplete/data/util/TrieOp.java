package com.portfolio.autocomplete.data.util;

import java.util.ArrayList;
import java.util.List;

public class TrieOp {
	
	TrieNode node;
	
	public TrieOp() {
		this.node = new TrieNode('\u0000');
	}
	
	public void addNode(final String word) {
		if(word == null) return;
		TrieNode temp = node;
		for(char ch:word.toCharArray()) {
			if(temp.children.containsKey(ch)) {
				temp = temp.children.get(ch);
			} else {
				temp.children.put(ch, new TrieNode(ch));
			}
		}
		temp.isEndWord = true;
	}
	
	public List<String> getSamePrefixWords(final String word){
		TrieNode temp = node;
		for(char ch: word.toCharArray()) {
			if(temp.children.containsKey(ch)) temp = temp.children.get(ch);
		}
		
		TrieNode currentNode = getPrefixNode(word);
		List<String> commonPrefixList = new ArrayList<String>();
		dfs(currentNode, commonPrefixList, word, '\u0000');
		
		return null;	
	}

	private TrieNode getPrefixNode(String word) {
		TrieNode temp = node;
		for(char ch:word.toCharArray()) {
			if(temp.children.containsKey(ch)) temp = temp.children.get(ch);
			else return null;
		}
		return temp;
	}

	private void dfs(TrieNode currentNode, List<String> commonPrefixList, String str, char currentChar) {
		//add the current char to the word
		str += currentChar;
		//base case for recursive dfs
		if(currentNode.isEndWord) commonPrefixList.add(str);
		for(TrieNode each: currentNode.children.values())
			dfs(each, commonPrefixList, str, currentNode.val);
	}

}
