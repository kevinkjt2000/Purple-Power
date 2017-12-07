package com.deflatedpickle.purplepower.proxy;

import com.deflatedpickle.purplepower.init.ModItems;

public class ServerProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.init();
    }
}
