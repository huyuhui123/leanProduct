package com.huyuhui.leanproduct.framework.out.spring.structureDesignTest.newTest;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReportTypeEnum {
    COMPANY_KYC(1,"企业kyc")
    ;
    private Integer code;
    private String remark;
}
