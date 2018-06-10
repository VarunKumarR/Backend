package com.niit.dao;

import java.util.List;

import com.niit.model.Supplier;

public interface SupplierDAO {


	public boolean addSupplier(Supplier Supplier);
	public Supplier getSupplier(int SupplierId);
	public boolean deleteSupplier(Supplier Supplier);
	public boolean updateSupplier(Supplier Supplier);
	public List<Supplier> getSuppliers();
}
