package com.android.yarn_app

// The YarnItem class - to be used in creating the new item screen and the item details screen

// The data describing the item
data class YarnItemData(
    val manufacturer: String,  // TODO: create a data class for manufacturer details from DB
    val barcode: String,  // numbers can start with 0
    val colorNumber: String,  // numbers can start with 0
    val colorName: ColorName,
    val lengthMeters: Int,  // TODO: in the future, support yards?
    val weightGrams: Int,  // TODO: in the future, support oz?
    val mainMaterial: Material,  // TODO: in the future, use MaterialCombination
    val price: Float  // price per this item (code, length, weight)
)

// TODO: validations of item types and values when getting them from screen

// A class that contains the data of an item along with its current amount and methods to change it
class YarnItem(private val itemData: YarnItemData) {
    private var amount = 0

    // add 1 to amount
    fun increaseAmount() {amount += 1}
    // subtract 1 from amount
    fun decreaseAmount() {amount -= 1}
    // return the details of the item
    fun getItemDetails(): YarnItemData {return itemData}


    // TODO: save details to DB
    // TODO: get details from DB
}