<template>
  <ion-item>
    <ion-label>Selecciona una mesa</ion-label>
    <ion-select v-model="mesa" @ionChange="$emit('update:mesa', mesa)">
      <ion-select-option v-for="m in mesas" :key="m" :value="m">Mesa {{ m }}</ion-select-option>
    </ion-select>
  </ion-item>
</template>

<script setup>
import { ref } from 'vue';

const mesa = ref('');
const mesas = [1, 2, 3, 4, 5, 6];
</script>
