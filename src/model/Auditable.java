/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import org.hibernate.envers.Audited;

/**
 *
 * @author HOME
 */
@Audited
@MappedSuperclass
public abstract class Auditable {
    
    @Column(name = "id_auditoria")
    private String idAuditoria;

    @Column(name = "criado_por", nullable = false, updatable = false)
    private String criadoPor;

    @Column(name = "data_criado", nullable = false, updatable = false)
    private Date dataCriado;

    @Column(name = "atualizado_por", nullable = false)
    private String atualizadoPor;

    @Column(name = "data_atualizado", nullable = false)
    private Date dataAtualizado;

    @PrePersist
    private void prePersit() {
        this.idAuditoria = UUID.randomUUID().toString();
        this.dataCriado = new Date();
        this.dataAtualizado = new Date();
        this.criadoPor = "Teste";
        this.atualizadoPor = "Teste";
    }
    
    @PreUpdate
    private void preUpdate() {
        this.dataAtualizado = new Date();
        this.atualizadoPor = "Teste";
    }

    public String getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(String criadoPor) {
        this.criadoPor = criadoPor;
    }

    public String getAtualizadoPor() {
        return atualizadoPor;
    }

    public void setAtualizadoPor(String atualizadoPor) {
        this.atualizadoPor = atualizadoPor;
    }

    public Date getDataCriado() {
        return dataCriado;
    }

    public Date getDataAtualizado() {
        return dataAtualizado;
    }

}
