package com.example.afalasekoya.thehackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.nexmo.client.NexmoClient;
import com.nexmo.client.auth.AuthMethod;
import com.nexmo.client.auth.TokenAuthMethod;
import com.nexmo.client.sms.SmsSubmissionResult;
import com.nexmo.client.sms.messages.TextMessage;

public class MainActivity extends AppCompatActivity {

    String API_KEY="8c8d22ec";
    String API_SECRET="b1ef8aaa2d9c960b";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testbutton()

    {
        AuthMethod auth = new TokenAuthMethod(API_KEY, API_SECRET);
        NexmoClient client = new NexmoClient(auth);
        System.out.println(FROM_NUMBER);

        SmsSubmissionResult[] responses = client.getSmsClient().submitMessage(new TextMessage(
                FROM_NUMBER,
                TO_NUMBER,
                "Hello from Nexmo!"));
        for (SmsSubmissionResult response : responses) {
            System.out.println(response);
        }

    }

}
