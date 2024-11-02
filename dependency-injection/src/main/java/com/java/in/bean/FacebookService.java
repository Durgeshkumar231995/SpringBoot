package com.java.in.bean;

public class FacebookService implements SocialMediaService{

    @Override
    public void getUserFeeds() {
        System.out.println("loading user feeds from facebook ...");
    }
}
