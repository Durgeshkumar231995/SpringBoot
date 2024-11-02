package com.java.in.di;

import org.springframework.stereotype.Component;

@Component
public class TikTokService implements SocialAppService{

    @Override
    public void getUserFeeds() {
        System.out.println("feeds loaded from TikTok...");
    }
}
