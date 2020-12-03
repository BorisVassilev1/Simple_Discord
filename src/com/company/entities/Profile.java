package com.company.entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Profile {
    private String username;
    private String nickname;
    private ArrayList<Server> servers;

    public Profile(String username) {
        this.username = username;
        servers = new ArrayList<>();
    }

    public void joinServer(Server server){
        if(server.getProfiles().contains(this)){
            throw new IllegalArgumentException("User has already joined the channel!");
        }
        servers.add(server);
        server.joinedProfile(this);
    }

    public void joinChannel(VoiceChannel channel){
        if(!channel.getServer().getProfiles().contains(this)){
            throw new IllegalArgumentException("User is not in the server yet!");
        }
        if(channel.getProfiles().contains(this)){
            throw new IllegalArgumentException("User already here!");
        }
        channel.joinedChannel(this);
    }

    public void leaveChannel(VoiceChannel channel){
        if(!channel.getProfiles().remove(this)){
            throw new IllegalArgumentException("This profile is not in the channel!");
        }
        channel.leftChannel(this);
    }

    public void leaveServer(Server server){
        if(!server.getProfiles().remove(this)){
            throw new IllegalArgumentException("This profile is not in the server!");
        }
        server.leftServer(this);
    }

    public void sendMessage(TextChannel channel, String s){
        channel.displayMessage(s, this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", servers=" + servers.stream().map(Server::getName).collect(Collectors.joining(", ")) +
                '}';
    }
}
