package com.speakerphone;


import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView myEarPiece;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myEarPiece = (TextView) this.findViewById(R.id.text_SpeakerPhone);

		AudioManager audio = (AudioManager) this
				.getSystemService(Context.AUDIO_SERVICE);
		if (audio.isSpeakerphoneOn()) {
			myEarPiece.setText("Speaker Phone Detected");

		} else {
			myEarPiece.setText("Speaker Phone NOT Detected");

		}
		
	}

}
