package com.cognizant.chain;

public class ProjectManager implements ILeaveRequestHandler {
	private ILeaveRequestHandler iLeaveRequestHandler;

	@Override
	public void nextHandler(ILeaveRequestHandler handelReq) {
		iLeaveRequestHandler = handelReq;
	}

	@Override
	public void HandelRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() >=3 && leaveRequest.getLeaveDays()<=5) {
			System.out.println("Project Manager Approved leave for - "+leaveRequest.getEmployee());
		} else {
			iLeaveRequestHandler.HandelRequest(leaveRequest);
		}
	}
}
