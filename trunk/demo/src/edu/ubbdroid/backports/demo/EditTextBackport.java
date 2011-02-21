/*
 * Copyright (C) 2011 The UBBdroid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.ubbdroid.backports.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import edu.ubbdroid.android.widget.EditText;

/**
 * Example Activity demonstrating the backported EditText.
 * @author Janos Levai
 *
 */
public class EditTextBackport extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edittext);
		
		final android.widget.EditText original = (android.widget.EditText) findViewById(R.id.original);
		final EditText backport = (EditText) findViewById(R.id.backport);
		
		Button btEnable = (Button) findViewById(R.id.btEnable);
		btEnable.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				original.setEnabled(true);
				backport.setEnabled(true);
			}
		});
		
		Button btDisable = (Button) findViewById(R.id.btDisable);
		btDisable.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				original.setEnabled(false);
				backport.setEnabled(false);
			}
		});
	}
}
