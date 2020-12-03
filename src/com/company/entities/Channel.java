package com.company.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Channel {
    private String name;
    private final Server server;
    private ArrayList<Profile> profiles;

    public Channel(String name, Server server) {
        this.name = name;
        this.server = server;
        profiles = new ArrayList<>();
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

    public void addProfile(Profile profile) {
        profiles.add(profile);
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

    protected void popProfile(Profile profile) {
        profiles.remove(profile);
    }
}
