package com.cognizant.chain;

public class Supervisor implements ILeaveRequestHandler {
	private ILeaveRequestHandler iLeaveRequestHandler;

	@Override
	public void nextHandler(ILeaveRequestHandler handelReq) {
		iLeaveRequestHandler = handelReq;
	}

	@Override
	public void HandelRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() >= 1 && leaveRequest.getLeaveDays()<3) {
			System.out.println("Supervisor Approved leave for - "+leaveRequest.getEmployee());
		}else {
			iLeaveRequestHandler.HandelRequest(leaveRequest);
		}
	}
}
