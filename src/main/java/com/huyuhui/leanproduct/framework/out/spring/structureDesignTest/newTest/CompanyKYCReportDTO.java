package com.huyuhui.leanproduct.framework.out.spring.structureDesignTest.newTest;

import lombok.Data;

/**
 * @author: cody
 * @create: 2025/02/23
 **/
@Data
public class CompanyKYCReportDTO implements ReportDTO {
    private String name;
    
    private Integer status;
}
