package com.sourcmind.alumni.einvoicing.controllers;

import com.sourcmind.alumni.einvoicing.facades.InvoiceFacade;
import com.sourcmind.alumni.einvoicing.payloads.requests.InvoiceRequest;
import com.sourcmind.alumni.einvoicing.payloads.responses.InvoiceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("invoices")
public class InvoiceController {
    private  final InvoiceFacade facade;

    @GetMapping
    public List<InvoiceResponse> readAll() {
        return facade.readAll();
    }

    @PostMapping
    public InvoiceResponse create(@RequestBody  InvoiceRequest request) {
        return facade.create(request);
    }

    @GetMapping("/{uuid}")
    public InvoiceResponse readById(@PathVariable UUID uuid) {
        return facade.readById(uuid);
    }

    @PutMapping("/{uuid}")
    public InvoiceResponse update(@PathVariable UUID uuid, InvoiceRequest request) {
        return facade.update(request);
    }

    @DeleteMapping("/{uuid}")
    public void delete(@PathVariable UUID uuid) {
        facade.delete(uuid);
    }


}
