package com.huyuhui.leanproduct.framework.spring.structureDesign.newTest;

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
