package com.mixedcs.SpringProject.company;

import java.util.List;

public interface CompanyService {

    public List<Company> getAllCompany();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}
