package id.co.astratech.repository;
import id.co.astratech.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

}
