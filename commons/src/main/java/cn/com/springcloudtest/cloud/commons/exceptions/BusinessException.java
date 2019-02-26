package cn.com.springcloudtest.cloud.commons.exceptions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 异常信息
 * 
 * @author qxs
 * @date 2015-9-18
 */
public abstract class BusinessException extends RuntimeException {
	
	private static final long serialVersionUID = -7631087787767221321L;
	
	protected transient final Log log = LogFactory.getLog(getClass());

	public BusinessException(String message){
		super(message);
		if(log.isDebugEnabled()){
        	log.debug(message);
        }
	}
	
	public BusinessException(String message, Throwable cause) {
        super(message, cause);
        if(log.isDebugEnabled()){
        	log.debug(message, cause);
        }
    }
	
	public BusinessException(Throwable cause) {
        super(cause);
        if(log.isDebugEnabled()){
        	log.debug(cause.getMessage(), cause);
        }
    }
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
