<template>
  <div class="row">
    <slot></slot>
  </div>
</template>

<style scoped>
.row {
  margin-top:10px;
  margin-bottom: 10px;
  display:flex;
  flex-wrap: wrap;
  justify-content: center;
  width: 100%;
}
</style>
