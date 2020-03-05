package com.hwua.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chapel {
    private Integer id;
    private String name;
    private String content;
    private String pictureurl;
}
