package com.example.daleshprashar.saraswatiaa.MVP.Hello;

public class Contractor {

    interface viewHello{
        void showHello();

        void passDataHello(String abc);
    }

    interface presenterHello
    {
void onClick();
    }

    interface modelHello
    {
String getData();
    }

}
