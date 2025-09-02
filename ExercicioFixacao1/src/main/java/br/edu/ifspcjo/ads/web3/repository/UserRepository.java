package br.edu.ifspcjo.ads.web3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.web3.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}