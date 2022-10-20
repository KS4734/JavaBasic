package ch03.ex03.project02.Dao;

import java.util.List;

import ch03.ex03.project02.Domain.Worker;

public interface PerjectDao {

	List<Worker> getWorkers();
	Worker getWorker(int wkId);
	
	boolean insertWorker(Worker wk);
	boolean updateWorker(Worker wk);
	boolean deleteWorker(int wkId);
	
}
