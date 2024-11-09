package com.embarkx.firstjobapp.company;

import java.util.List;
/**
 * @author vickyaa
 * @date 9/2/24
 * @file CompanyService
 */
public interface CompanyService {
     List<Company> getAllCompanies();

     void createCompany(Company company);

     boolean updateCompany(Company company, Long id);

     boolean deleteCompanyById(Long id);

     Company getCompanyById(Long id);

}
