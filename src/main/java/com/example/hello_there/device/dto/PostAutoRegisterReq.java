package com.example.hello_there.device.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // 해당 클래스에 대한 접근자 생성
@Setter // 해당 클래스에 대한 설정자 생성
@AllArgsConstructor
@NoArgsConstructor
public class PostAutoRegisterReq {
    private String grade;
    private String modelName;
    private double emissionsPerHour;
    private double annualCost;
    private double volume;
    private double maxPowerConsumption;
    private String itemName;
}