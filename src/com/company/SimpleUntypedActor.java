
package com.company;
import akka.actor.UntypedActor;
public class SimpleUntypedActor extends UntypedActor {

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof Integer) {
            System.out.println("This is an integer that equals: " + msg);
        } else if (msg == "Jim") {
            System.out.println("Hello Jim!");
        } else {
            System.out.println("This example is too simple for more exceptions.");
        }
    }
}