/**
 * $Id: AppendMessageResult.java 1831 2013-05-16 01:39:51Z shijia.wxr $
 */
package com.alibaba.rocketmq.store;

/**
 * ����������д����Ϣ���ؽ��
 * 
 * @author vintage.wang@gmail.com shijia.wxr@taobao.com
 */
public class AppendMessageResult {
    // ������
    private AppendMessageStatus status;
    // �����￪ʼд��
    private long wroteOffset;
    // д���ֽ���
    private int wroteBytes;
    // ��ϢID
    private String msgId;
    // ��Ϣ�洢ʱ��
    private long storeTimestamp;
    // д���߼����е�offset���ݽ�1��
    private long logicsOffset;


    public AppendMessageResult(AppendMessageStatus status, long wroteOffset, int wroteBytes, String msgId,
            long storeTimestamp, long logicsOffset) {
        this.status = status;
        this.wroteOffset = wroteOffset;
        this.wroteBytes = wroteBytes;
        this.msgId = msgId;
        this.storeTimestamp = storeTimestamp;
        this.logicsOffset = logicsOffset;
    }


    public boolean isOk() {
        return this.status == AppendMessageStatus.PUT_OK;
    }


    public AppendMessageResult(AppendMessageStatus status) {
        this(status, 0, 0, "", 0, 0);
    }


    public AppendMessageStatus getStatus() {
        return status;
    }


    public void setStatus(AppendMessageStatus status) {
        this.status = status;
    }


    public long getWroteOffset() {
        return wroteOffset;
    }


    public void setWroteOffset(long wroteOffset) {
        this.wroteOffset = wroteOffset;
    }


    public int getWroteBytes() {
        return wroteBytes;
    }


    public void setWroteBytes(int wroteBytes) {
        this.wroteBytes = wroteBytes;
    }


    public String getMsgId() {
        return msgId;
    }


    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }


    public long getStoreTimestamp() {
        return storeTimestamp;
    }


    public void setStoreTimestamp(long storeTimestamp) {
        this.storeTimestamp = storeTimestamp;
    }


    public long getLogicsOffset() {
        return logicsOffset;
    }


    public void setLogicsOffset(long logicsOffset) {
        this.logicsOffset = logicsOffset;
    }
}