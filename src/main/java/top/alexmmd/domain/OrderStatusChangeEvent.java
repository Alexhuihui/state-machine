package top.alexmmd.domain;

/**
 * 订单状态改变事件
 *
 * @author 汪永晖
 * @creatTime 2021/5/25 16:23
 */
public enum OrderStatusChangeEvent {
    // 支付，发货，确认收货
    PAYED, DELIVERY, RECEIVED;
}
