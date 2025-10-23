package lab.microservice.receipt.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.databind.JsonNode;

import lab.microservice.receipt.Dtos.PaymentDto;

@FeignClient(name = "payment-service")
public interface PaymentClient {
    @GetMapping("/payments/{id}")
    JsonNode getPaymentByPaymentId(@PathVariable("id") Long id);

    @GetMapping("/payments/user/{id}")
    PaymentDto getPaymentByUserId(@PathVariable("id") Long id);

    @GetMapping("/payments/reserve/{reserveId}")
    PaymentDto getPaymentByReserveId(@PathVariable("reserveId") Long id);
    
}
