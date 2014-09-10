package com.segaldoron;

public class TestContent {
	
	public String get(String contentType) {
		String content;
		System.out.println(contentType);
		
		switch (contentType) {
			case "about":
				content  = "{code: \"ok\", body: \"about page json view\"}";
				break;
			case "contact":
				content  = "{code: \"ok\", body: \"contact page json view\"}";
				break;
			case "home":
				content  = "{code: \"ok\", body: \"hpme page json view\"}";
				break;
			default: 
				content  = "default page";
				break;
		}
		return content;
	}
}
