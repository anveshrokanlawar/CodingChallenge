package com.example.coding.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.coding.model.Pharmacies;

@Repository
public interface PharamaciesRepo extends JpaRepository<Pharmacies, Long>{
	
	@Query(value="SELECT PharmacyName, address,"
			+ "SQRT( POW(69.1 * (Latitude - (:lat)), 2) + "
			+ "POW(69.1 * ((:longi) - Longitude) * COS(Latitude / 57.3), 2)) "
			+ "AS distance  FROM Pharmacies p ORDER BY distance",nativeQuery = true)
	
	List<String> getPharmacy( @Param("lat") Double lat, @Param("longi") Double longi);
}
