package com.ybq;/*
 * Copyright: 2017 dingxiang-inc.com Inc. All rights reserved.
 */

import com.google.common.base.Optional;


/**
 *
 */
public class GuavaTest {

    public static void main(String[] args) {
        /*Object o1 = new Object();
        Integer integer = Preconditions.checkNotNull(01);
        Optional optional = Optional.of(01);

        Preconditions.checkArgument(false, "xxx不饿能为空");
        System.out.println();
        */



        Optional.of(01).or(01);

    }
}
