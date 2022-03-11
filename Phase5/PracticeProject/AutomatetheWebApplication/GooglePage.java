
package com.demo.seleniumspring.page.google;

import com.demo.seleniumspring.annotation.Page;
import com.demo.seleniumspring.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// this is the main page class that uses search componet and search results componet
@Page // using custom annotation created; src/main/java/com/demo/seleniumspring/annotation/Page.java
public class GooglePage extends Base {

    @Autowired
    private SearchComponentsearchComponent;

    @Autowired
    private SearchResultsearchResult;

    @Value("${application.url}")
    private String url;

    //launch website
    public void goToGooglePage(){
this.driver.get(url);
    }

    public SearchComponentgetSearchComponent() {
        return searchComponent;
    }

    public SearchResultgetSearchResult() {
        return searchResult;
    }

    @Override
    public booleanisAt() {
        return this.searchComponent.isAt();
    }

    public void close(){
this.driver.quit();
    }
}

