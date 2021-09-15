package com.zds.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhongdongsheng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String name;
}
