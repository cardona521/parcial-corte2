<template>
  <ion-item>
    <ion-label>Fecha y hora</ion-label>
    <ion-datetime
      display-format="YYYY-MM-DD HH:mm"
      v-model="fechaHora"
      @ionChange="$emit('update:fechaHora', fechaHora)"
    ></ion-datetime>
  </ion-item>
</template>

<script setup>
import { ref } from 'vue';
const fechaHora = ref('');
</script>
