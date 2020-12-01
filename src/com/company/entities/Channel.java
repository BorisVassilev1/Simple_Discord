package com.company.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Channel {
    private String name;
    private Server server;
    private ArrayList<Profile> profiles;

    public Channel(String name, Server server) {
        this.name = name;
        this.server = server;
        profiles = new ArrayList<>();
    }

    public void joinedChannel(Profile profile){
        System.out.println(profile.getNickname() + " joined the channel " + name);
        profiles.add(profile);
    }

    public void leftChannel(Profile profile){
        System.out.println(profile.getNickname() + " left " + name);
        profiles.remove(profile);
    }

    public void displayMessage(String s, Profile profile) {
        System.out.println(profile.getNickname() + " said " + s + " in " + name);
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

    public Server getServer() {
        return server;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", server=" + server.getName() +
                ", profiles=" + profiles.stream().map(Profile::getUsername).collect(Collectors.joining(", ")) +
                '}';
    }
}
