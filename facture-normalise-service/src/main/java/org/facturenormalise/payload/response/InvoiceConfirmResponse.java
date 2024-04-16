package org.facturenormalise.payload.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class InvoiceConfirmResponse {
    public String dateTime;
    public String qrCode;
    public String codeMECeFDGI;
    public String counters;
    public String nim;
    public String errorCode;
    public String errorDesc;
}
