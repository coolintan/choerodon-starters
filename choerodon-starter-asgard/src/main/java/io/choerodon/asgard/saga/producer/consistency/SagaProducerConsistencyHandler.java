package io.choerodon.asgard.saga.producer.consistency;

/**
 * 保证数据一致性的处理器
 */
public interface SagaProducerConsistencyHandler {

    void beforeTransactionCommit(String uuid);

    void beforeTransactionCancel(String uuid);

    /**
     * 提供给asgard-service回查使用
     * @param uuid 回查的id
     * @return uuid
     */
    String asgardServiceBackCheck(String uuid);


    /**
     * 清除老旧的数据
     * @param time 距现在多久之前的数据将被清除(单位，毫秒)
     */
    void clear(long time);

}
