package com.company;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;


public class Main {

    public static void main(String[] args) {
	// write your code here

        ActorSystem system = ActorSystem.create("sample1");
        ActorRef simpleUntypedActor = system.actorOf(Props.apply(SimpleUntypedActor::new),"SimpleActor");
        //message when actor receives integer
        simpleUntypedActor.tell(1);
        //if actor receives the string Jim
        simpleUntypedActor.tell("Jim");
        //if actor receives any other object
        simpleUntypedActor.tell(true);
    }
}
