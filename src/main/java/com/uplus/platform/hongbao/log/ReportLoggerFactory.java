package com.uplus.platform.hongbao.log;

import org.apache.log4j.Logger;

public class ReportLoggerFactory {
	
	private static final String HongBaoLog = "hongbaoLog";
	
	public static Logger getReportDebugLogger() {
		return Logger.getLogger(HongBaoLog);
	}
}
