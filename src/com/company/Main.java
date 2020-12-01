/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
