package com.deflatedpickle.purplepower.proxy;

import com.deflatedpickle.purplepower.init.ModItems;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.init();
    }
}
