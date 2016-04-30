package com.sungjun.news.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
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
