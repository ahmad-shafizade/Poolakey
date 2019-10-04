package com.phelat.poolakey

data class PurchaseInfo(
    val orderId: String,
    val purchaseToken: String,
    val payload: String,
    val packageName: String,
    val purchaseState: Int,
    val purchaseTime: Long,
    val productId: String
)
