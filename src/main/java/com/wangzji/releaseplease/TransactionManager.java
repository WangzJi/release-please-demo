package com.wangzji.releaseplease;

/**
 * Transaction Manager for distributed transactions
 * Simulates Seata transaction management features
 */
public class TransactionManager {
    
    private boolean autoCommit = true;
    private String transactionId;
    
    /**
     * Begin a new distributed transaction
     * @return transaction ID
     */
    public String begin() {
        this.transactionId = "tx_" + System.currentTimeMillis();
        this.autoCommit = false;
        System.out.println("Transaction started: " + transactionId);
        return transactionId;
    }
    
    /**
     * Commit the current transaction
     */
    public void commit() {
        if (transactionId != null) {
            System.out.println("Transaction committed: " + transactionId);
            cleanup();
        }
    }
    
    /**
     * Rollback the current transaction
     */
    public void rollback() {
        if (transactionId != null) {
            System.out.println("Transaction rolled back: " + transactionId);
            cleanup();
        }
    }
    
    /**
     * Get current transaction status
     * @return true if transaction is active
     */
    public boolean isActive() {
        return transactionId != null && !autoCommit;
    }
    
    private void cleanup() {
        this.transactionId = null;
        this.autoCommit = true;
    }
} 