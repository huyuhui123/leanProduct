package com.huyuhui.leanproduct.framework.spring.structureDesign.newTest;

/**
 * @author: cody
 * @create: 2025/02/23
 **/

public class CompanyKYCReportService implements ReportService {

    

    @Override
    public void insert(ReportDTO reportDTO) {
        
        CompanyKYCReportDTO companyKYCReportDTO = (CompanyKYCReportDTO)reportDTO;
        CompanyKYCReport companyKYCReport = new CompanyKYCReport();
        companyKYCReport.setName("华为");
        companyKYCReport.setStatus(0);
        save(companyKYCReport);
    }
    
    void save(CompanyKYCReport companyKYCReport){
        
    }
}
