package com.company.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Server {
    private String name;
    private ArrayList<Profile> profiles;
    private ArrayList<Channel> channels;

    public Server(String name) {
        this.name = name;
        profiles = new ArrayList<>();
        channels = new ArrayList<>();
    }

    public void addChannel(Channel channel){
        if(channels.contains(channel)){
            throw new IllegalArgumentException("Channel already added!");
        }
        channels.add(channel);
    }

    public void joinedProfile(Profile profile){
        System.out.println("Welcome to the server, " + name + ", " + profile.getNickname());
        profiles.add(profile);
    }

    public void leftServer(Profile profile) {
        System.out.println("Goodbye from " +name + ", " + profile.getNickname());
        profiles.remove(profile);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", profiles=" + profiles.stream().map(Profile::getUsername).collect(Collectors.joining(", "))+
                ", channels=" + channels.stream().map(Channel::getName).collect(Collectors.joining(", ")) +
                '}';
    }
}
