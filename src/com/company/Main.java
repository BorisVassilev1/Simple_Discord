package com.company;

import com.company.entities.Channel;
import com.company.entities.Profile;
import com.company.entities.Server;

public class Main {

    public static void main(String[] args){
        Profile p1 = new Profile("Peter");
        p1.setNickname("pesho");
        Server s1 = new Server("Cool Boys");
        Server s2 = new Server("School");
        p1.joinServer(s1);
        p1.joinServer(s2);
        Channel c1 = new Channel("Chill Talk", s1);
        Channel c2 = new Channel("Homework", s2);
        p1.joinChannel(c1);
        p1.joinChannel(c2);
        System.out.println(p1.toString());
        p1.sendMessage(c1, "Sup, G!");
        p1.leaveChannel(c1);
        p1.leaveServer(s1);
    }
}
