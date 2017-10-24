package com.example.whaaazaaap.tsafa_app;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WHAAAZAAAP on 24/10/2017.
 */

public class RegisterRequest extends StringRequest{
    private static final String Register_Request_Url = "http://tsafa-app.000webhostapp.com/Register.php";
    private Map<String,String> params;

    public RegisterRequest(String name, String username, String email, String password, Response.Listener<String>listener){
        super(Method.POST, Register_Request_Url,listener,null);
        params = new HashMap<>();
        params.put("name",name);
        params.put("username",username);
        params.put("password",password);
        params.put("email",email);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
