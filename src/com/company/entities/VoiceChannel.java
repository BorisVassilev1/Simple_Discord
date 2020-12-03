
package com.company.entities;

public class VoiceChannel extends Channel{

    public VoiceChannel(String name, Server server) {
        super(name, server);
    }

    public void joinedChannel(Profile profile){
        System.out.println(profile.getNickname() + " joined the channel " + super.getName());
        super.addProfile(profile);
    }

    public void leftChannel(Profile profile){
        System.out.println(profile.getNickname() + " left " + super.getName());
        super.popProfile(profile);
    }
}
