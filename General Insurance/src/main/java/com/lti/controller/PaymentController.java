package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Payment;
import com.lti.service.PaymentService;



@RestController
@CrossOrigin
@RequestMapping("/pay")
public class PaymentController {
@Autowired
private PaymentService paymentservice;


//http://localhost:8282/pay//payment
@PostMapping("/payment")
public Payment makePayment(@RequestBody Payment p) {
	Payment payment = paymentservice.payment(p);
	return payment;
}
}