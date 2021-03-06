/**
 * Copyright (C) 2000-2016 Atomikos <info@atomikos.com>
 *
 * LICENSE CONDITIONS
 *
 * See http://www.atomikos.com/Main/WhichLicenseApplies for details.
 */

package com.atomikos.icatch.provider;

import java.util.Properties;

import com.atomikos.icatch.RecoveryService;
import com.atomikos.icatch.SysException;
import com.atomikos.icatch.TransactionService;
import com.atomikos.icatch.admin.LogControl;

public interface TransactionServiceProvider extends TransactionService {
  
    void init(Properties properties) throws SysException;

    LogControl getLogControl();
    
    RecoveryService getRecoveryService();

	void shutdown(long maxWaitTime);
    
}
