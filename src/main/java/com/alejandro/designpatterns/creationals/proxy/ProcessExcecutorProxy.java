package com.alejandro.designpatterns.creationals.proxy;

public class ProcessExcecutorProxy implements IProcessExcecutor {

	private SecurityService securityService = new SecurityService();
	private AuditService auditService = new AuditService();
	private DefaultProcessExcecutor defaultExcecutor = new DefaultProcessExcecutor();

	@Override
	public void excecuteProcess(Long idProcess, String user, String password) throws Exception {
		boolean authorized = securityService.authorization(user, password);
		if ( !authorized ) throw new Exception("Unauthorized!!!");
		defaultExcecutor.excecuteProcess(idProcess, user, password);
		auditService.auditServiceUsed(user, defaultExcecutor.getClass().getSimpleName());
	}

}
