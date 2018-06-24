package com.example.daleshprashar.saraswatiaa.MVP.Hello;

public class helloPresenterImpl implements Contractor.presenterHello{

    private Contractor.modelHello modelHello;
    private Contractor.viewHello viewHello;
    @Override
    public void onClick() {
       String data=  modelHello.getData();
       viewHello.passDataHello(data);
    }


}
