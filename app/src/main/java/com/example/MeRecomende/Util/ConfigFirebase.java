package com.example.MeRecomende.Util;

import com.google.firebase.auth.FirebaseAuth;

public class ConfigFirebase {
    private static FirebaseAuth authenticate;

    public static FirebaseAuth FirebaseAuthentication() {
        if (authenticate == null) {
            authenticate = FirebaseAuth.getInstance();
        }
        return authenticate;
    }
}