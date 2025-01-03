package edu.unimagdalena.reservadevuelo.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "vuelos")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String origen;

    @Column(nullable = false)
    private String destino;

    @Column(name = "fecha_salida", nullable = false)
    private LocalDate fechaSalida;

    @Column(name = "hora_salida", nullable = false)
    private LocalTime horaSalida;

    @Column(nullable = false)
    private Duration duracion;

    @Column(nullable = false)
    private int capacidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aeropuerto_id")
    private Aeropuerto aeropuerto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aerolinea_id")
    private Aerolinea aerolinea;

    @ManyToMany(mappedBy = "vuelos")
    private Set<Reserva> reservas;
}
