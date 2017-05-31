package com.rehi.piggybank;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class Nvl extends EvalFunc<String> {

	public String exec(Tuple inputA) throws IOException {
		try {
			String inputVal = (String) inputA.get(0);
			String defaultVal = (String) inputA.get(1);

			if (inputVal == null || inputVal.length() == 0) {
				return defaultVal;
			}

			return inputVal;
		} catch (Exception e) {
			// Throwing an exception will cause the task to fail.
			throw new IOException("Something bad happened!", e);
		}
	}
}