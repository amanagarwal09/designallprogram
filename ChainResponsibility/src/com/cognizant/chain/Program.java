package com.cognizant.chain;

public class Program {
	public static void main(String[] args) {
		ILeaveRequestHandler iLeave1 = new Supervisor();
		ILeaveRequestHandler iLeave2 = new ProjectManager();
		ILeaveRequestHandler iLeave3 = new HR();

		iLeave1.nextHandler(iLeave2);
		iLeave2.nextHandler(iLeave3);

		LeaveRequest leaveRequest00 = new LeaveRequest("Avik", 5);
		iLeave1.HandelRequest(leaveRequest00);
		LeaveRequest leaveRequest01 = new LeaveRequest("Avik2", 1);
		iLeave1.HandelRequest(leaveRequest01);
		LeaveRequest leaveRequest02 = new LeaveRequest("Avik3", 6);
		iLeave1.HandelRequest(leaveRequest02);
		LeaveRequest leaveRequest03 = new LeaveRequest("Avik4", -1);
		iLeave1.HandelRequest(leaveRequest03);
	}
}
