package com.android.yarn_app

// General classes, used in the app

enum class ColorName {
    BLACK,
    BLUE,
    BROWN,
    GRAY,
    GREEN,
    MULTIPLE,
    ORANGE,
    OTHER,
    PINK,
    PURPLE,
    RED,
    WHITE,
    YELLOW
}


enum class Material {
    COTTON,
    POLYARCYLENE,
    WOOL
}


// TODO: consider how to represent (50% A, 50% B) vs (50% A, 30% B, 20% C)
data class MaterialCombination(val combination: Array<Pair<Int, Material>>) {}