<template>
  <div class="row">
    <slot></slot>
  </div>
</template>

<style scoped>
.row {
  margin: 20px;
  display:flex;
  flex-wrap: wrap;
  justify-content: center;
  width: 100%;
}
</style>
