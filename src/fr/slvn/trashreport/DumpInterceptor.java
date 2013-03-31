package fr.slvn.trashreport;

import android.app.Activity;
import android.os.Bundle;

public class DumpInterceptor extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Close this asap !
		finish();
	}
}
