package com.shutterbug.corrupt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.lolololololol.R;

public class l {

	private OnClickListener snesCorruptListen = new OnClickListener()
	{

		@Override
		public void onClick(View p1){
			EditText inFile = (EditText) findViewById(R.id.file_name);
			String inFileName = inFile.getText().toString();
			EditText outFile = (EditText) findViewById(R.id.output_name);
			String outFileName = outFile.getText().toString();
			EditText stepBox = (EditText) findViewById(R.id.step);
			String stepBoxText = stepBox.getText().toString();
			EditText startBox = (EditText) findViewById(R.id.start);
			String startBoxText = startBox.getText().toString();
			EditText stopBox = (EditText) findViewById(R.id.stop);
			stopBoxText = stopBox.getText().toString();
			int stopBoxInt = Integer.parseInt(stopBoxText);
			EditText typeValueBox = (EditText) findViewById(R.id.type_value);
			String typeValueBoxText = typeValueBox.getText().toString();
			if(checkedPrgType == R.id.ShiftButton){
				prgType = "-h";
			}
			else if(checkedPrgType == R.id.SwapButton){
				prgType = "-w";
			}
			else if(checkedPrgType == R.id.SetButton){
				prgType = "-t";
			}
			else if(checkedPrgType == R.id.RandomButton){
				prgType = "-r";
			}
			else if(checkedPrgType == R.id.RotateLeftButton){
				prgType = "--bitshift-left";
			}
			else if(checkedPrgType == R.id.RotateRightButton){
				prgType = "--bitshift-right";
			}
			else if(checkedPrgType == R.id.AndButton){
				prgType = "--logical-and";
			}
			else if(checkedPrgType == R.id.OrButton){
				prgType = "--logical-or";
			}
			else if(checkedPrgType == R.id.XorButton){
				prgType = "--logical-xor";
			}
			else if(checkedPrgType == R.id.ComplementButton){
				prgType = "--logical-complement";
			}
			else if(checkedPrgType == R.id.AddButton){
				prgType = "-a";
			
			if(stopBoxInt == 0){
				stopBoxInt = Integer.MAX_VALUE;
				stopBoxText = Integer.toString(stopBoxInt);
			}
}
