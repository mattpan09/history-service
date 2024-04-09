package edu.iu.mppan.historyservice.repository;

import edu.iu.mppan.historyservice.model.PrimesRecord;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrimesHistoryRepository extends CrudRepository<PrimesRecord, Integer> {
    List<PrimesRecord> findAllByCustomer(String customer);
}
