package com.scaleapp.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupResponseDto {

    private int id;

    private String number;

    private int quantity;
}
