package id.co.astratech.repository;
import id.co.astratech.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import static id.co.astratech.constant.UserConstant.qGetLogin;


@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

}
