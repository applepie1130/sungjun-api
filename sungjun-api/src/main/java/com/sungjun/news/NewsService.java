package com.sungjun.news;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class NewsService {
	public Map<String, Object> getSisaRankingNews() {
		return new HashMap<String, Object>();
	}
	
	public Map<String, Object> getSportsRankingNews() {
		return new HashMap<String, Object>();
	}
	
	public Map<String, Object> getEntertainmentRankingNews() {
		return new HashMap<String, Object>();
	}
}
