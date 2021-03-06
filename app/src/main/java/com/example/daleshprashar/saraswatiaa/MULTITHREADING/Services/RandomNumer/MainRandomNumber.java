package com.example.daleshprashar.saraswatiaa.MULTITHREADING.Services.RandomNumer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainRandomNumber extends AppCompatActivity {

   // private static final String TAG=ClientSideMainActivity.class.getSimpleName();
    private Context mContext;

    public static final int GET_RANDOM_NUMBER_FLAG =0;
    private boolean mIsBound;
    private int randomNumberValue;

    Messenger randomNumberRequestMessenger, randomNumberReceiveMessenger;

    private Intent serviceIntent;

    private TextView textViewRandomNumber;
    private Button buttonBindService,buttonUnBindService,buttonGetRandomNumber;

    class kHandler extends Handler
    {
        @Override
        public void handleMessage(Message msg) {
            randomNumberValue =0;
            switch (msg.what) {
                case GET_RANDOM_NUMBER_FLAG:
                    randomNumberValue =msg.arg1;
                    textViewRandomNumber.setText("Random Number: "+ randomNumberValue);
                    break;
                default:
                    break;
            }
            super.handleMessage(msg);
        }


        ServiceConnection randomNumberServiceConnection = new ServiceConnection() {
            @Override
            public void onServiceDisconnected(ComponentName arg0) {
                randomNumberRequestMessenger=null;
                randomNumberReceiveMessenger=null;
                mIsBound = false;
            }
            @Override
            public void onServiceConnected(ComponentName arg0, IBinder binder) {
                randomNumberRequestMessenger=new Messenger(binder);
                //randomNumberReceiveMessenger=new Messenger(new RecieveRandomNumberHandler());
                mIsBound=true;
            }
        };
    }


    private void bindToRomoteService(){
       // bindService(serviceIntent, randomNumberServiceConnection, BIND_AUTO_CREATE);
        Toast.makeText(mContext,"Service bound",Toast.LENGTH_SHORT).show();
    }

    private void unbindFromRemoteSevice(){
     //   unbindService(randomNumberServiceConnection);
        mIsBound=false;
        Toast.makeText(mContext,"Service Unbound",Toast.LENGTH_SHORT).show();
    }

    private void fetchRandomNumber(){
        if (mIsBound == true) {
            Message requestMessage=Message.obtain(null, GET_RANDOM_NUMBER_FLAG);
            requestMessage.replyTo=randomNumberReceiveMessenger;
            try {
                randomNumberRequestMessenger.send(requestMessage);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }else{
            Toast.makeText(mContext,"Service Unbound, can't get random number",Toast.LENGTH_SHORT).show();
        }
    }




}
