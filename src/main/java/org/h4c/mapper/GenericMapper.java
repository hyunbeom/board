package org.h4c.mapper;

import java.util.List;

import org.h4c.vo.WebCriteria;

public interface GenericMapper<V, K> {

	public void create(V vo);
	
	public V read(K key);
	
	public void update(V vo);
	
	public void delete(K key);

	public List<V> getList(WebCriteria cri);
}
