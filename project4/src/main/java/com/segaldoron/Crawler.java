package com.segaldoron;

import com.google.inject.Guice;
import com.google.inject.Inject;

public abstract class Crawler {
	
	private String url;
	private String crawlTarget;
	private final CrawlerLogger logger;
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new CrawlerModule());
	}
	
	@Inject
	public Crawler(CrawlerLogger logger) {
		this.logger = logger;
	}
	
	public String getCrawlTarget() {
		return crawlTarget;
	}

	public void setCrawlTarget(String crawlTarget) {
		this.crawlTarget = crawlTarget;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public void start() {
		
	}
	
	
}
