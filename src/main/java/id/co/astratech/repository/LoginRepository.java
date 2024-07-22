package id.co.astratech.repository;

import id.co.astratech.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import static id.co.astratech.constant.UserConstant.qGetLogin;

public interface LoginRepository extends JpaRepository<UserModel, Integer>
{
    @Query(value = qGetLogin, nativeQuery = true)
    UserModel findBylogin(@Param("username") String username, @Param("password") String password);
}
