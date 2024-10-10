package edu.unimagdalena.reservadevuelo.services;

import edu.unimagdalena.reservadevuelo.dto.ReservaDto;
import edu.unimagdalena.reservadevuelo.dto.VueloDto;
import edu.unimagdalena.reservadevuelo.entities.Reserva;
import edu.unimagdalena.reservadevuelo.entities.Vuelo;

import java.util.List;
import java.util.Optional;

public interface ReservaService {
    ReservaDto guardarReserva(ReservaDto reservaDto);
    Optional<ReservaDto> buscarReservaPorId(Long id);
    List<ReservaDto> buscarReservas();
    List<ReservaDto> buscarReservasPorCliente(Long clienteId);
    List<ReservaDto> buscarReservasPorVuelo(Long vueloId);
    ReservaDto agregarVueloReserva(Long reservaId, VueloDto vueloDto);
    Optional<ReservaDto> actualizarReserva(Long id, ReservaDto reservaDto);
    void eliminarReserva(Long id);
}
