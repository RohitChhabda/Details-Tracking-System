package com.developerstalk.dts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developerstalk.dts.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
