package com.dottorsoft.SimpleBlockChain.util;

import java.util.LinkedHashMap;

import com.dottorsoft.SimpleBlockChain.core.Block;
import com.dottorsoft.SimpleBlockChain.core.TransactionOutput;
import java.util.HashMap;

public class Parameters {
	
	public static int difficulty = 2;
	
	public static LinkedHashMap<String,Block> blockchain = new LinkedHashMap<String, Block>();
        
        public static HashMap<String,TransactionOutput> UTXOs = new HashMap<String,TransactionOutput>();

}
