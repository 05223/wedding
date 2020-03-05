package com.hwua.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChapelOV extends Chapel {

    private String pictureurl1;
    private String pictureurl2;
    private String pictureurl3;
    private String pictureurl4;
    private String detail;
}
