<template>
  <div class="main-container">
    <img alt="Vue logo" src="../../public/img/me-1.jpg" style="width: 30vh">
    <h1>About Me</h1>
    <p>

    </p>
  </div>
</template>

<style scoped>
@import '../assets/styles/palette.css';
.main-container{
  opacity: 0;
  transform: translateY(-50px);
  animation: fadeFall 0.5s ease-out forwards;
}
@keyframes fadeFall {
  0% {
    opacity: 0;
    transform: translateY(-100px);
  }
  100% {
    opacity: 1;
    transform: translateY(0);
  }
}
</style>

<script setup lang="ts">
</script>
