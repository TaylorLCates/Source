package com.improving;

import com.improving.Quote;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteClient {

    private final RestTemplate restTemplate;

    public QuoteClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Quote quoteSearch() {
        return restTemplate.getForObject("https://api.kanye.rest/", Quote.class);
    }
}
