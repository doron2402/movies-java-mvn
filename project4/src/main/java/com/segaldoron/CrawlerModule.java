package com.segaldoron;

import com.google.inject.AbstractModule;

public class CrawlerModule extends AbstractModule {

	protected void configure() {
		bind(CrawlerLogger.class).to(Crawler.class);
	}
	
	
}
