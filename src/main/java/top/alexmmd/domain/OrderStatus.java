package top.alexmmd.domain;

/**
 * 订单状态
 *
 * @author 汪永晖
 * @creatTime 2021/5/25 16:22
 */
public enum OrderStatus {
    // 待支付，待发货，待收货，已完成
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH;
}
