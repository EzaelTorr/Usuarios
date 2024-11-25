package com.trainibit.usuarios.entity;

import jakarta.persistence.Column;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;



@Getter
public class AuditableRecord  {
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDate createdat;

    @Column(name = "updated_at", nullable = false)
    private LocalDate updatedat;

    @ColumnDefault("true")
    @Column(name = "active", nullable = false)
    private Boolean active = false;

    public LocalDate getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDate createdat) {
        this.createdat = createdat;
    }

    public LocalDate getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(LocalDate updatedat) {
        this.updatedat = updatedat;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}



