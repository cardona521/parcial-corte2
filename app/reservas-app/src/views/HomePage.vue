<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>Gestión de Reservas</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content class="ion-padding">
      <FechaHoraPicker @update:fechaHora="reserva.fechaHora = $event" />
      <DatosCliente @update:nombre="reserva.nombre = $event" @update:contacto="reserva.contacto = $event" />
      <MesaSelector @update:mesa="reserva.mesa = $event" />
      <ion-button expand="block" @click="guardarReserva">Guardar Reserva</ion-button>
    </ion-content>
  </ion-page>
</template>

<script setup>
import { ref } from 'vue';
import FechaHoraPicker from '@/components/FechaHoraPicker.vue';
import DatosCliente from '@/components/DatosCliente.vue';
import MesaSelector from '@/components/MesaSelector.vue';
import axios from 'axios';

const reserva = ref({
  fechaHora: '',
  nombre: '',
  contacto: '',
  mesa: '',
});

const guardarReserva = async () => {
  await axios.post('http://localhost:3000/reservas', reserva.value);
  alert('Reserva guardada');
};
</script>
