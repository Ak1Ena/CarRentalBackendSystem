package lab.microservice.payment.Dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentEventDto {
    private Long reserveId;
    private Long paymentId;
    private String status;
    private String paymentMethod;
    private String event;
    private String paidAt;
    private Long userId;
    private String username;
    private BigDecimal total;
    
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public Long getReserveId() {
        return reserveId;
    }
    public void setReserveId(Long reserveId) {
        this.reserveId = reserveId;
    }
    public Long getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
    }
    public String getPaidAt() {
        return paidAt;
    }
    public void setPaidAt(String paidAt) {
        this.paidAt = paidAt;
    }

    
    

    
    
    
}
