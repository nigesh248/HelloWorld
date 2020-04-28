package codepath.demos.helloworlddemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HelloWorldActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);	
	}

	
	
	
	
	

	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_hello_world, menu);
			int i=1,m=0;
			i=+1;
		return true; 
		
	}

}
