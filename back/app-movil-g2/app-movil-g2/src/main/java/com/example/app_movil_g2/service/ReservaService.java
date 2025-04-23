package com.example.app_movil_g2.service;

import com.example.app_movil_g2.model.Reserva;
import com.example.app_movil_g2.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> listar() {
        return reservaRepository.findAll();
    }

    public Reserva guardar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Optional<Reserva> obtener(Long id) {
        return reservaRepository.findById(id);
    }

    public void eliminar(Long id) {
        reservaRepository.deleteById(id);
    }
}
