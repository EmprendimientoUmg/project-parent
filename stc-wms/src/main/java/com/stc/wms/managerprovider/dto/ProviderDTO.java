package com.stc.wms.managerprovider.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProviderDTO {
    private Integer idProveedor;
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;
    private String contacto;
    private String email;
    private String status;
}
