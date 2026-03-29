<template>
  <div style="display: flex; width: 100%; flex-wrap: wrap; justify-content: center; flex-direction: row-reverse;">
	<!--<div style="width: 25%; margin: 20px">
      <img src="/img/me.jpg" alt="Me" style="width: 80%; border-radius: 10px" />
    </div>-->
    <div style="width: 70%">
      <h1>Darío Gutiérrez Mori</h1>
      <h2>Mid Platform Engineer</h2>
      <div style="justify-content: center; display: flex; flex-wrap: wrap;">
      	<p> Contact me here: </p>
      	<div style=" width: 50%;justify-content: space-around; display: flex;">
	      	<div style="align-content: center;">
	          <a href="mailto:dariogmori@gmail.com" class="secondary-text">
	            email
	          </a>
	        </div>
	        <div>
	          <a href="https://dariogmori.itch.io/">
	            <div style="display: flex; justify-content: center">
	              <div>
	                <img
	                  src="../../assets/home/itchio.png"
	                  alt="itchio logo"
	                  class="image-display"
	                  style="image-rendering: crisp-edges"
	                />
	              </div>
	            </div>
	          </a>
	        </div>
	        <div>
	          <a href="https://www.linkedin.com/in/dariogmori/">
	            <div style="display: flex; justify-content: center">
	              <div>
	                <img
	                  src="../../assets/home/linkedin.png"
	                  alt="itchio logo"
	                  class="image-display"
	                  style="image-rendering: crisp-edges"
	                />
	              </div>
	            </div>
	          </a>
	        </div>
	        <div>
	          <a href="https://github.com/dariogmori">
	            <div style="display: flex; justify-content: center">
	              <div>
	                <img
	                  src="../../assets/home/github.png"
	                  alt="itchio logo"
	                  class="image-display"
	                  style="image-rendering: crisp-edges"
	                />
	              </div>
	            </div>
	          </a>
	        </div>
        </div>
      </div>
      <div style="justify-content:center; display: flex;">
        <div style="width:83%;">
          <p class="secondary-text">{{ t('home.about-me') }}</p>
        </div>
      </div>
    </div>
    
  </div>
</template>
<script setup lang="ts">
import { isMobile } from '@/scripts/utils'
import { useTranslation } from 'i18next-vue'
const { t } = useTranslation()
</script>
<style scoped>
/* The flip box container - set the width and height to whatever you want. We have added the border property to demonstrate that the flip itself goes out of the box on hover (remove perspective if you don't want the 3D effect */
.flip-box {
  background-color: transparent;
  width: 75%;
}

/* This container is needed to position the front and back side */
.flip-box-inner {
  position: relative;
  width: 100%;
  height: 100%;
  text-align: center;
  transition: transform 0.8s;
  transform-style: preserve-3d;
}

/* Do an horizontal flip when you move the mouse over the flip box container */
.flip-box:hover .flip-box-inner {
  transform: rotateY(180deg);
}

/* Position the front and back side */
.flip-box-front,
.flip-box-back {
  position: absolute;
  width: 100%;
  height: 100%;
  -webkit-backface-visibility: hidden; /* Safari */
  backface-visibility: hidden;
}

/* Style the back side */
.flip-box-back {
  transform: rotateY(180deg);
}
</style>
