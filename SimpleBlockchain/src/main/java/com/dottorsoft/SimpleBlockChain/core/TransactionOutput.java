package com.dottorsoft.SimpleBlockChain.core;

import com.dottorsoft.SimpleBlockChain.Main;
import com.dottorsoft.SimpleBlockChain.util.Parameters;
import com.dottorsoft.SimpleBlockChain.util.StringUtil;
import java.util.Map;

public class TransactionOutput {
	
	public String id;
	public String reciepient; //also known as the new owner of these coins.
	public float value; //the amount of coins they own
	public String parentTransactionId; //the id of the transaction this output was created in
	
	public TransactionOutput(){}
	
	//Constructor
	public TransactionOutput(String reciepient, float value, String parentTransactionId) {
		this.reciepient = reciepient;
		this.value = value;
		this.parentTransactionId = parentTransactionId;
		this.id = StringUtil.applySha256(reciepient+Float.toString(value)+parentTransactionId);
	}
	
	//Check if coin belongs to you
	public boolean isMine(String publicKey) {
		return (publicKey.equals(reciepient));
}
        //Prints transaction ids of wallets
        public void showTransactions(String publicKey)
        {
            TransactionOutput UTXO;

                for (Map.Entry<String, TransactionOutput> item: Parameters.UTXOs.entrySet()){
                    UTXO = item.getValue();
                    if(UTXO.isMine(publicKey)) { //if output belongs to me ( if coins belong to me )
                        System.out.println(UTXO.id);
                    }
                }  
        
        }
}
