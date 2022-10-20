package ch03.ex03.project02.Domain;

import java.time.LocalDate;

public class Worker {

	private int workerId;
	private String workerName;
	private LocalDate hireDate;
	
	public Worker(String workerName, LocalDate hireDate) {
		this.workerName = workerName;
		this.hireDate = hireDate;
	}
	
	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return String.format("%2d %-5s %s\n", workerId, workerName, hireDate);
	}
}
