package com.sungjun.news;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news/")
public class NewsController {
	
	@Autowired
	NewsService newsService;
	
	@RequestMapping(
			value="/sisa-rank",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Map<String, Object> getSisaRankingNews() {
		return newsService.getSisaRankingNews();
	}
	
	@RequestMapping(
			value="/sports-rank",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Map<String, Object> getSportsRankingNews() {
		return newsService.getSportsRankingNews();
	}
	
	
	@RequestMapping(
			value="/entertainment-rank",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Map<String, Object> getEntertainmentRankingNews() {
		return newsService.getEntertainmentRankingNews();
	}
}