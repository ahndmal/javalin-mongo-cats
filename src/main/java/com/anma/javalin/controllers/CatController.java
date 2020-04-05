package com.anma.javalin.controllers;

import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

public interface CatController {

    void getAllCats(@NotNull Context ctx);
    void getCatByName(@NotNull Context ctx);
    void createCat(@NotNull Context context);
}
