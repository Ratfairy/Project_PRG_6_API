package id.co.astratech.repository;

import id.co.astratech.model.LayananModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LayananRepository extends JpaRepository<LayananModel, Integer> {
}
