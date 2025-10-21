package com.opendecimal.openmt.model;

public class ApplicationHeaderInput extends ApplicationHeader {

    public final Direction direction = Direction.I;

    private String receiverBic12;

    private DeliveryMonitoring deliveryMonitoring;

    private String timeoutPeriod;

    public String getReceiverBic12() {
        return receiverBic12;
    }

    public void setReceiverBic12(String receiverBic12) {
        this.receiverBic12 = receiverBic12;
    }

    public DeliveryMonitoring getDeliveryMonitoring() {
        return deliveryMonitoring;
    }

    public void setDeliveryMonitoring(DeliveryMonitoring deliveryMonitoring) {
        this.deliveryMonitoring = deliveryMonitoring;
    }

    public String getTimeoutPeriod() {
        return timeoutPeriod;
    }

    public void setTimeoutPeriod(String timeoutPeriod) {
        this.timeoutPeriod = timeoutPeriod;
    }

    public enum MessagePriority {
        S, U, N;
    }

    public enum DeliveryMonitoring {
        // Non-delivery warning
        WARN(1),
        // Delivery notification
        NOTICE(2),
        // Need both
        BOTH(3);

        private final int label;
        DeliveryMonitoring(int label) {
            this.label = label;
        }
        public int getLabel() {
            return this.label;
        }
    }
}
