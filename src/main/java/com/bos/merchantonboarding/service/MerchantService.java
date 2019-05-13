package com.bos.merchantonboarding.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bos.merchantonboarding.model.Merchant;

public interface MerchantService extends JpaRepository<Merchant, Integer>{
}
