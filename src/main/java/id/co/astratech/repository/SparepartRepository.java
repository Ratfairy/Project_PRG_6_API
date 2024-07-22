package id.co.astratech.repository;

import id.co.astratech.model.SparepartModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SparepartRepository extends JpaRepository<SparepartModel, Integer>
{

}
