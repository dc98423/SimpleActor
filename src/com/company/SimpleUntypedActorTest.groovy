package com.company

import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import org.junit.*
import org.junit.contrib.java.lang.system.SystemOutRule;
 class SimpleUntypedActorTest {

     public void testConsoleOutPut
     {
         @Rule
         public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();



         private ActorSystem system = ActorSystem.create("sample1");
         private ActorRef simpleUntypedActor = system.actorOf(Props.apply(SimpleUntypedActor::new), "SimpleActor");

         @Test
         void testOnReceiveInteger() {

             //message when actor receives integer
             simpleUntypedActor.tell(1);
             //if actor receives the string Jim
             assertEquals("This is an integer that equals: 1", systemOutRule.getLog());


         }
         @Test
         void testOnReceiveJim() {

             //message when actor receives integer
             simpleUntypedActor.tell("Jim");
             //if actor receives the string Jim
             assertEquals("Hello Jim!", systemOutRule.getLog());

         }

         @Test
         void testOnReceiveAllOtherObjects() {

             //message when actor receives integer
             simpleUntypedActor.tell(true);
             //if actor receives the string Jim
             assertEquals("This example is too simple for more exceptions.", systemOutRule.getLog());
         }
     }
 }