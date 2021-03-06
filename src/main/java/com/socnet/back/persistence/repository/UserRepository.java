package com.socnet.back.persistence.repository;

import com.socnet.back.persistence.model.PostModel;
import com.socnet.back.persistence.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by днс on 17.11.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Transactional
    UserModel findByEmail(String email);
}
