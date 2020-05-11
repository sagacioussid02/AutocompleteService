package com.portfolio.autocomplete.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Suggestions implements Collection<String>{
	
	final List<String> suggestions = new ArrayList<String>();
	
	@Override
	public int size() {
		return suggestions.size();
	}

	@Override
	public boolean isEmpty() {
		return suggestions.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return suggestions.contains(o);
	}

	@Override
	public Iterator<String> iterator() {
		return suggestions.iterator();
	}

	@Override
	public Object[] toArray() {
		return suggestions.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return suggestions.toArray(a);
	}

	@Override
	public boolean add(String e) {
		return suggestions.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return suggestions.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return suggestions.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		return suggestions.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return suggestions.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return suggestions.retainAll(c);
	}

	@Override
	public void clear() {
		suggestions.clear();
	}

}
