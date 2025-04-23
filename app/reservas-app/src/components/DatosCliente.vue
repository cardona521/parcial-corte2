<template>
  <ion-list>
    <ion-item>
      <ion-label position="floating">Nombre</ion-label>
      <ion-input v-model="nombre" @ionInput="$emit('update:nombre', nombre)" />
    </ion-item>
    <ion-item>
      <ion-label position="floating">Contacto</ion-label>
      <ion-input v-model="contacto" @ionInput="$emit('update:contacto', contacto)" />
    </ion-item>
  </ion-list>
</template>

<script setup>
import { ref } from 'vue';
const nombre = ref('');
const contacto = ref('');
</script>
