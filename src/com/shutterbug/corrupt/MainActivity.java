package com.shutterbug.corrupt;

import com.example.lolololololol.R;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.*;
import android.view.View.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {

	static
	{
		System.loadLibrary("md-corrupter");
	}
	
	public String inFileText;
	public String outFileText;
	public Button nes;
	public Button snes;
	public Button nesTypeButton;
	public int checkedPrgType;
	public int checkedChrType;
	public String prgType;
	public String chrType;
	public String nesPrgStepFieldText;
	public String nesPrgStartFieldText;
	public String nesPrgStopFieldText;
	public String nesPrgTypeValueFieldText;
	public String nesChrStepFieldText;
	public String nesChrStartFieldText;
	public String nesChrStopFieldText;
	public String nesChrTypeValueFieldText;
	public String stopBoxText;
	public String stopBoxTextChr;
	public native void callCmdLine(String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9, String param10, String param11); 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nes = (Button)findViewById(R.id.nes);
		snes = (Button)findViewById(R.id.snes);
		nes.setOnClickListener(nesListen);
		snes.setOnClickListener(snesListen);
	}
	private OnClickListener nesListen = new OnClickListener()
	{

		@Override
		public void onClick(View p1)
		{
			setContentView(R.layout.nes);
			Button nesChrTypeButton = (Button)findViewById(R.id.nesChrTypeButton);
			snesTypeButton.setOnClickListener(snesTypeListen);
			Button nesPrgTypeButton = (Button)findViewById(R.id.nesPrgTypeButton);
			Button nesPrgCorruptTypeButton = (Button)findViewById(R.id.nesCorruptButton);
			nesPrgCorruptTypeButton.setOnClickListener(nesCorruptListen);
			EditText nesPrgStepField = (EditText)findViewById(R.id.prg_step);
			EditText nesPrgStartField = (EditText)findViewById(R.id.prg_start);
			EditText nesPrgStopField = (EditText)findViewById(R.id.prg_stop);
			EditText nesPrgTypeValueField = (EditText)findViewById(R.id.type_value);
			EditText nesChrStepField = (EditText)findViewById(R.id.chr_step);
			EditText nesChrStartField = (EditText)findViewById(R.id.chr_start);
			EditText nesChrStopField = (EditText)findViewById(R.id.chr_stop);
			EditText nesChrTypeValueField = (EditText)findViewById(R.id.chr_type_value);
			}
	};
		
		private OnClickListener snesListen = new OnClickListener()
		{

			@Override
			public void onClick(View p1)
			{
				setContentView(R.layout.nes);
				Button nesChrTypeButton = (Button)findViewById(R.id.nesChrTypeButton);
				nesChrTypeButton.setOnClickListener(nesChrTypeListen);
				Button nesPrgTypeButton = (Button)findViewById(R.id.nesPrgTypeButton);
				nesPrgTypeButton.setOnClickListener(nesPrgTypeListen);
				Button nesPrgCorruptTypeButton = (Button)findViewById(R.id.nesCorruptButton);
				nesPrgCorruptTypeButton.setOnClickListener(nesCorruptListen);
				EditText nesPrgStepField = (EditText)findViewById(R.id.prg_step);
				EditText nesPrgStartField = (EditText)findViewById(R.id.prg_start);
				EditText nesPrgStopField = (EditText)findViewById(R.id.prg_stop);
				EditText nesPrgTypeValueField = (EditText)findViewById(R.id.type_value);
				EditText nesChrStepField = (EditText)findViewById(R.id.chr_step);
				EditText nesChrStartField = (EditText)findViewById(R.id.chr_start);
				EditText nesChrStopField = (EditText)findViewById(R.id.chr_stop);
				EditText nesChrTypeValueField = (EditText)findViewById(R.id.chr_type_value);
				}
		};
		
		private OnClickListener nesPrgTypeListen = new OnClickListener()
		{
			@Override
			public void onClick(View p1)
			{
				EditText inFile = (EditText) findViewById(R.id.file_name);
				EditText outFile = (EditText) findViewById(R.id.output_name);
				EditText nesPrgStepField = (EditText)findViewById(R.id.prg_step);
				EditText nesPrgStartField = (EditText)findViewById(R.id.prg_start);
				EditText nesPrgStopField = (EditText)findViewById(R.id.prg_stop);
				EditText nesPrgTypeValueField = (EditText)findViewById(R.id.type_value);
				EditText nesChrStepField = (EditText)findViewById(R.id.chr_step);
				EditText nesChrStartField = (EditText)findViewById(R.id.chr_start);
				EditText nesChrStopField = (EditText)findViewById(R.id.chr_stop);
				EditText nesChrTypeValueField = (EditText)findViewById(R.id.chr_type_value);
				inFileText = inFile.getText().toString();
				outFileText = outFile.getText().toString();
				nesPrgStepFieldText = nesPrgStepField.getText().toString();
				nesPrgStartFieldText = nesPrgStartField.getText().toString();
				nesPrgStopFieldText = nesPrgStopField.getText().toString();
				nesPrgTypeValueFieldText = nesPrgTypeValueField.getText().toString();
				nesChrStepFieldText = nesChrStepField.getText().toString();
				nesChrStartFieldText = nesChrStartField.getText().toString();
				nesChrStopFieldText = nesChrStopField.getText().toString();
				nesChrTypeValueFieldText = nesChrTypeValueField.getText().toString();
				setContentView(R.layout.selecttype);
				Button nesPrgTypeOk = (Button)findViewById(R.id.TypeOk);
				nesPrgTypeOk.setOnClickListener(nesPrgTypeOkListen);
			}			
		};
		
		private OnClickListener nesChrTypeListen = new OnClickListener()
		{
			@Override
			public void onClick(View p1)
			{
				EditText inFile = (EditText) findViewById(R.id.file_name);
				EditText outFile = (EditText) findViewById(R.id.output_name);
				EditText nesPrgStepField = (EditText)findViewById(R.id.prg_step);
				EditText nesPrgStartField = (EditText)findViewById(R.id.prg_start);
				EditText nesPrgStopField = (EditText)findViewById(R.id.prg_stop);
				EditText nesPrgTypeValueField = (EditText)findViewById(R.id.type_value);
				EditText nesChrStepField = (EditText)findViewById(R.id.chr_step);
				EditText nesChrStartField = (EditText)findViewById(R.id.chr_start);
				EditText nesChrStopField = (EditText)findViewById(R.id.chr_stop);
				EditText nesChrTypeValueField = (EditText)findViewById(R.id.chr_type_value);
				inFileText = inFile.getText().toString();
				outFileText = outFile.getText().toString();
				nesPrgStepFieldText = nesPrgStepField.getText().toString();
				nesPrgStartFieldText = nesPrgStartField.getText().toString();
				nesPrgStopFieldText = nesPrgStopField.getText().toString();
				nesPrgTypeValueFieldText = nesPrgTypeValueField.getText().toString();
				nesChrStepFieldText = nesChrStepField.getText().toString();
				nesChrStartFieldText = nesChrStartField.getText().toString();
				nesChrStopFieldText = nesChrStopField.getText().toString();
				nesChrTypeValueFieldText = nesChrTypeValueField.getText().toString();
				setContentView(R.layout.selecttype);
				Button nesChrTypeOk = (Button)findViewById(R.id.TypeOk);
				nesChrTypeOk.setOnClickListener(nesChrTypeOkListen);
			}			
		};
		
		private OnClickListener nesPrgTypeOkListen = new OnClickListener()
		{
			@Override
			public void onClick(View p1)
			{
				RadioGroup prgTypeGroup = (RadioGroup)findViewById(R.id.type);
				checkedPrgType = prgTypeGroup.getCheckedRadioButtonId();
				setContentView(R.layout.nes);
				setContentView(R.layout.nes);
				EditText inFile = (EditText) findViewById(R.id.file_name);
				EditText outFile = (EditText) findViewById(R.id.output_name);
				Button nesChrTypeButton = (Button)findViewById(R.id.nesChrTypeButton);
				nesChrTypeButton.setOnClickListener(nesChrTypeListen);
				Button nesPrgTypeButton = (Button)findViewById(R.id.nesPrgTypeButton);
				nesPrgTypeButton.setOnClickListener(nesPrgTypeListen);
				Button nesPrgCorruptTypeButton = (Button)findViewById(R.id.nesCorruptButton);
				nesPrgCorruptTypeButton.setOnClickListener(nesCorruptListen);
				EditText nesPrgStepField = (EditText)findViewById(R.id.prg_step);
				EditText nesPrgStartField = (EditText)findViewById(R.id.prg_start);
				EditText nesPrgStopField = (EditText)findViewById(R.id.prg_stop);
				EditText nesPrgTypeValueField = (EditText)findViewById(R.id.type_value);
				EditText nesChrStepField = (EditText)findViewById(R.id.chr_step);
				EditText nesChrStartField = (EditText)findViewById(R.id.chr_start);
				EditText nesChrStopField = (EditText)findViewById(R.id.chr_stop);
				EditText nesChrTypeValueField = (EditText)findViewById(R.id.chr_type_value);
				
				inFile.setText(inFileText);
				outFile.setText(outFileText);
				nesPrgStepField.setText(nesPrgStepFieldText);
				nesPrgStartField.setText(nesPrgStartFieldText);
				nesPrgStopField.setText(nesPrgStopFieldText);
				nesPrgTypeValueField.setText(nesPrgTypeValueFieldText);
				nesChrStepField.setText(nesChrStepFieldText);
				nesChrStartField.setText(nesChrStartFieldText);
				nesChrStopField.setText(nesChrStopFieldText);
				nesChrTypeValueField.setText(nesChrTypeValueFieldText);
				
			}			
		};
		
		
		private OnClickListener nesChrTypeOkListen = new OnClickListener()
		{
			@Override
			public void onClick(View p1)
			{
				RadioGroup chrTypeGroup = (RadioGroup)findViewById(R.id.type);
				checkedChrType = chrTypeGroup.getCheckedRadioButtonId();
				setContentView(R.layout.nes);
				setContentView(R.layout.nes);
				EditText inFile = (EditText)findViewById(R.id.file_name);
				EditText outFile = (EditText)findViewById(R.id.output_name);
				Button nesChrTypeButton = (Button)findViewById(R.id.nesChrTypeButton);
				nesChrTypeButton.setOnClickListener(nesChrTypeListen);
				Button nesPrgTypeButton = (Button)findViewById(R.id.nesPrgTypeButton);
				nesPrgTypeButton.setOnClickListener(nesPrgTypeListen);
				Button nesPrgCorruptTypeButton = (Button)findViewById(R.id.nesCorruptButton);
				nesPrgCorruptTypeButton.setOnClickListener(nesCorruptListen);
				EditText nesPrgStepField = (EditText)findViewById(R.id.prg_step);
				EditText nesPrgStartField = (EditText)findViewById(R.id.prg_start);
				EditText nesPrgStopField = (EditText)findViewById(R.id.prg_stop);
				EditText nesPrgTypeValueField = (EditText)findViewById(R.id.type_value);
				EditText nesChrStepField = (EditText)findViewById(R.id.chr_step);
				EditText nesChrStartField = (EditText)findViewById(R.id.chr_start);
				EditText nesChrStopField = (EditText)findViewById(R.id.chr_stop);
				EditText nesChrTypeValueField = (EditText)findViewById(R.id.chr_type_value);

				nesPrgStepField.setText(nesPrgStepFieldText);
				nesPrgStartField.setText(nesPrgStartFieldText);
				nesPrgStopField.setText(nesPrgStopFieldText);
				nesPrgTypeValueField.setText(nesPrgTypeValueFieldText);
				nesChrStepField.setText(nesChrStepFieldText);
				nesChrStartField.setText(nesChrStartFieldText);
				nesChrStopField.setText(nesChrStopFieldText);
				nesChrTypeValueField.setText(nesChrTypeValueFieldText);
				inFile.setText(inFileText);
				outFile.setText(outFileText);
				
			}			
		};
		
		
		private OnClickListener nesCorruptListen = new OnClickListener()
		{

			@Override
			public void onClick(View p1){
				EditText inFile = (EditText) findViewById(R.id.file_name);
				String inFileName = inFile.getText().toString();
				EditText outFile = (EditText) findViewById(R.id.output_name);
				String outFileName = outFile.getText().toString();
				EditText stepBox = (EditText) findViewById(R.id.prg_step);
				String stepBoxText = stepBox.getText().toString();
				EditText startBox = (EditText) findViewById(R.id.prg_start);
				String startBoxText = startBox.getText().toString();
				EditText stopBox = (EditText) findViewById(R.id.prg_stop);
				stopBoxText = stopBox.getText().toString();
				int stopBoxInt = Integer.parseInt(stopBoxText);
				EditText typeValueBox = (EditText) findViewById(R.id.type_value);
				String typeValueBoxText = typeValueBox.getText().toString();
				EditText stepBoxChr = (EditText) findViewById(R.id.chr_step);
				String stepBoxTextChr = stepBoxChr.getText().toString();
				EditText startBoxChr = (EditText) findViewById(R.id.chr_start);
				String startBoxTextChr = startBoxChr.getText().toString();
				EditText stopBoxChr = (EditText) findViewById(R.id.chr_stop);
				stopBoxTextChr = stopBoxChr.getText().toString();
				int stopBoxIntChr = Integer.parseInt(stopBoxTextChr);
				EditText typeValueBoxChr = (EditText) findViewById(R.id.chr_type_value);
				String typeValueBoxTextChr = typeValueBoxChr.getText().toString();
				if(checkedPrgType == R.id.ShiftButton){
					prgType = "-ph";
				}
				else if(checkedPrgType == R.id.SwapButton){
					prgType = "-pw";
				}
				else if(checkedPrgType == R.id.SetButton){
					prgType = "-pt";
				}
				else if(checkedPrgType == R.id.RandomButton){
					prgType = "-pr";
				}
				else if(checkedPrgType == R.id.RotateLeftButton){
					prgType = "--prg-bitshift-left";
				}
				else if(checkedPrgType == R.id.RotateRightButton){
					prgType = "--prg-bitshift-right";
				}
				else if(checkedPrgType == R.id.AndButton){
					prgType = "--prg-logical-and";
				}
				else if(checkedPrgType == R.id.OrButton){
					prgType = "--prg-logical-or";
				}
				else if(checkedPrgType == R.id.XorButton){
					prgType = "--prg-logical-xor";
				}
				else if(checkedPrgType == R.id.ComplementButton){
					prgType = "--prg-logical-complement";
				}
				else if(checkedPrgType == R.id.AddButton){
					prgType = "-pa";
				}
				if(checkedChrType == R.id.ShiftButton){
					chrType = "-ch";
				}
				else if(checkedChrType == R.id.SwapButton){
					chrType = "-cw";
				}
				else if(checkedChrType == R.id.SetButton){
					chrType = "-ct";
				}
				else if(checkedChrType == R.id.RandomButton){
					chrType = "-cr";
				}
				else if(checkedChrType == R.id.RotateLeftButton){
					chrType = "--chr-bitshift-left";
				}
				else if(checkedChrType == R.id.RotateRightButton){
					chrType = "--chr-bitshift-right";
				}
				else if(checkedChrType == R.id.AndButton){
					chrType = "--chr-logical-and";
				}
				else if(checkedChrType == R.id.OrButton){
					chrType = "--chr-logical-or";
				}
				else if(checkedChrType == R.id.XorButton){
					chrType = "--chr-logical-xor";
				}
				else if(checkedChrType == R.id.ComplementButton){
					chrType = "--chr-logical-complement";
				}
				else if(checkedChrType == R.id.AddButton){
					chrType = "-ca";
				}
				
				if(stopBoxInt == 0){
					stopBoxInt = Integer.MAX_VALUE;
					stopBoxText = Integer.toString(stopBoxInt);
				}
				if(stopBoxIntChr == 0){
					stopBoxIntChr = Integer.MAX_VALUE;
					stopBoxTextChr = Integer.toString(stopBoxIntChr);
				}
				
				CheckBox prgChecked = (CheckBox) findViewById(R.id.prg_box);
				CheckBox chrChecked = (CheckBox) findViewById(R.id.chr_box);
				if(prgChecked.isChecked() && chrChecked.isChecked()){
				callCmdLine(inFileName, prgType, "--prg-start", "--prg-stop", "--prg-step", "--out", typeValueBoxText, startBoxText, stopBoxText, stepBoxText, outFileName);
				callCmdLine(outFileName, chrType, "--chr-start", "--chr-stop", "--chr-step", "--out", typeValueBoxTextChr, startBoxTextChr, stopBoxTextChr, stepBoxTextChr, outFileName);
				}
				else if(prgChecked.isChecked()){
					callCmdLine(inFileName, prgType, "--prg-start", "--prg-stop", "--prg-step", "--out", typeValueBoxText, startBoxText, stopBoxText, stepBoxText, outFileName);
					}
					else if(chrChecked.isChecked()){
						callCmdLine(inFileName, chrType, "--chr-start", "--chr-stop", "--chr-step", "--out", typeValueBoxTextChr, startBoxTextChr, stopBoxTextChr, stepBoxTextChr, outFileName);
					}
				}
			
		};
		
		
		private OnClickListener snesTypeListen = new OnClickListener()
		{
			@Override
			public void onClick(View p1)
			{
				EditText inFile = (EditText) findViewById(R.id.file_name);
				EditText outFile = (EditText) findViewById(R.id.output_name);
				EditText nesStepField = (EditText)findViewById(R.id.step);
				EditText nesStartField = (EditText)findViewById(R.id.start);
				EditText nesStopField = (EditText)findViewById(R.id.stop);
				EditText nesTypeValueField = (EditText)findViewById(R.id.type_value);
				inFileText = inFile.getText().toString();
				outFileText = outFile.getText().toString();
				nesPrgStepFieldText = nesStepField.getText().toString();
				nesPrgStartFieldText = nesStartField.getText().toString();
				nesPrgStopFieldText = nesStopField.getText().toString();
				nesPrgTypeValueFieldText = nesTypeValueField.getText().toString();
				setContentView(R.layout.selecttype);
				Button nesChrTypeOk = (Button)findViewById(R.id.TypeOk);
				nesChrTypeOk.setOnClickListener(nesChrTypeOkListen);
			}			
		};
		

	};
	
	private OnClickListener snesTypeOkListen = new OnClickListener()
	{
		@Override
		public void onClick(View p1)
		{
			RadioGroup prgTypeGroup = (RadioGroup)findViewById(R.id.type);
			checkedPrgType = prgTypeGroup.getCheckedRadioButtonId();
			setContentView(R.layout.nes);
			setContentView(R.layout.nes);
			EditText inFile = (EditText) findViewById(R.id.file_name);
			EditText outFile = (EditText) findViewById(R.id.output_name);
			Button nesChrTypeButton = (Button)findViewById(R.id.nesChrTypeButton);
			nesChrTypeButton.setOnClickListener(snesTypeListen);
			Button nesPrgTypeButton = (Button)findViewById(R.id.nesPrgTypeButton);
			Button nesPrgCorruptTypeButton = (Button)findViewById(R.id.nesCorruptButton);
			nesPrgCorruptTypeButton.setOnClickListener(nesCorruptListen);
			EditText StepField = (EditText)findViewById(R.id.step);
			EditText StartField = (EditText)findViewById(R.id.start);
			EditText StopField = (EditText)findViewById(R.id.stop);
			EditText TypeValueField = (EditText)findViewById(R.id.type_value);
			
			inFile.setText(inFileText);
			outFile.setText(outFileText);
			StepField.setText(StepFieldText);
			StartField.setText(StartFieldText);
			StopField.setText(StopFieldText);
			TypeValueField.setText(TypeValueFieldText);
			inFile.setText(inFileText);
			outFile.setText(outFileText);
		}			
	};
	
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
			};
	
				
	
		String file = "/sdcard/romtocorrupt.nes";
		String oper = "--add";
		String operv = "2";
		String start = "-s";
		String startv = "0";
		String stop = "--stop";
		String stopv = "-100";
		String step = "--prg-step";
		String stepv = "512";
		String out = "--out";
		String outv = "/sdcard/romcorrupt.nes";
};};
