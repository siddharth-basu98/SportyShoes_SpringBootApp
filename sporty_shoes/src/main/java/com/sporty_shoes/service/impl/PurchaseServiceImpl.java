package com.sporty_shoes.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sporty_shoes.model.Purchase;
import com.sporty_shoes.repository.PurchaseRepository;
import com.sporty_shoes.service.PurchaseService;


@Service
public class PurchaseServiceImpl implements PurchaseService {
	
	
	@Autowired
	private PurchaseRepository purchaseRepository ; 

	@Override
	public Purchase addPurchase(Purchase purchase) {
		return purchaseRepository.save(purchase) ; 
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		return purchaseRepository.save(purchase) ; 
	}

	@Override
	public void DeletePurchase(int id) {
		purchaseRepository.deleteById(id);
	}

	@Override
	public List<Purchase> getAllPurchases() {
		return purchaseRepository.findAll() ; 
	}

	@Override
	public Purchase getPurchaseById(int id) {
		return purchaseRepository.findById(id).get() ; 
	}

	@Override
	public List<Purchase> getAllPurchasesByDate(LocalDateTime date) {
		return purchaseRepository.findByDate(date) ; 
	}

	@Override
	public List<Purchase> getAllPurchasesByUser(int userid) {
		return purchaseRepository.findByUser(userid) ; 
	}

	@Override
	public List<Purchase> getAllPurchasesByProduct(int productid) {
		return purchaseRepository.findByProduct(productid) ; 
	}

}
