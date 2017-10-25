package com.mygdx.game;

import android.os.Bundle;
import android.widget.Toast;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	public  AndroidCreateAccount androidCreateAccount;
	@Override
	protected void onCreate (Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		androidCreateAccount=new AndroidCreateAccount(this);
		MainClass mainClass= new MainClass();
		mainClass.setCreateAccount(androidCreateAccount);
		initialize(mainClass, config);

//		GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//				.requestIdToken(getString(R.string.default_web_client_id))
//				.requestEmail()
//				.build();
	}
}
