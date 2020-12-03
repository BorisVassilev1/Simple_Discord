package com.company.entities;

public class TextChannel extends Channel{
    public TextChannel(String name, Server server) {
        super(name, server);
    }

    public void displayMessage(String s, Profile profile) {
        System.out.println(profile.getNickname() + " said " + s + " in " + super.getName());
    }
}
