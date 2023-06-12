package com.example.finalassignment;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class SignUpRequest extends StringRequest {
    final static private String URL = "http://sangwon8895.dothome.co.kr/SignUp.php";
    private Map<String, String> map;

    public SignUpRequest(String id, String pwd, String name, int age, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("id", id);
        map.put("pwd", pwd);
        map.put("name", name);
        map.put("age", age + "");
    }

    @Nullable
    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
