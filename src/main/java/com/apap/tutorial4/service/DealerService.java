package com.apap.tutorial4.service;

import java.util.List;
import java.util.Optional;

import com.apap.tutorial4.model.DealerModel;
import com.apap.tutorial4.repository.DealerDb;

/**
 * DealerService
 */
public interface DealerService {
	Optional<DealerModel> getDealerDetailById(Long id);
	
	void addDealer(DealerModel dealer);

	void deleteDealer(DealerModel dealer);
	
	List<DealerModel> getAllDealer();

	DealerDb allDealer();

	void updateDealer(long id, Optional<DealerModel> dealer);
}
