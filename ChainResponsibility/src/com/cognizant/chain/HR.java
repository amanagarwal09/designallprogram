package com.cognizant.chain;

public class HR implements ILeaveRequestHandler {
	private ILeaveRequestHandler iLeaveRequestHandler;

	@Override
	public void nextHandler(ILeaveRequestHandler handelReq) {
		iLeaveRequestHandler = handelReq;
	}

	@Override
	public void HandelRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() > 5) {
			System.out.println("HR Approved leave for - "+leaveRequest.getEmployee());
		}
		else {
			System.out.println("Rejected");
		}
	}
}
