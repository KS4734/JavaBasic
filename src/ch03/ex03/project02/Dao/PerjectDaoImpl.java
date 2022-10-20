package ch03.ex03.project02.Dao;

import java.util.List;

import ch03.ex03.project02.Domain.Worker;

public class PerjectDaoImpl implements PerjectDao{

	private List<Worker> wkList;
	private int wkIdSeq;

	public WorkerDaoImpl(List<Worker> wkList) {
		this.wkList = wkList;
		wkIdSeq = 1;
	}

	@Override
	public List<Worker> getWorkers() {
		return null;
	}

	@Override
	public Worker getWorker(int wkId) {
		return null;
	}

	@Override
	public boolean insertWorker(Worker wk) {
		wk.setWorkerId(wkIdSeq++);
		return wkList.add(wk);
	}

	@Override
	public boolean updateWorker(Worker wk) {
		Worker workker = null;
		
		for ( Worker kk : wkList) {
			if (kk.getWorkerId() == wk.getWorkerId()) {
				workker = kk;
				break;
			}
		}
		workker.setWorkerName(wk.getWorkerName());
		workker.setHireDate(wk.getHireDate());
		
		return false;
	}

	@Override
	public boolean deleteWorker(int wkId) {
		return false;
	}

}
