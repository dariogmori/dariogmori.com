<template>
  <el-row class="header-color" >
    <el-col :span="16" >
      <h1> Darío Gutiérrez Mori </h1>
      <h3> Mid Platform Engineer</h3>
      <el-row :justify="'space-between'">
        <el-col :span="8">
          <a href="https://dariogmori.itch.io/">
            <el-row :justify="'center'">
              <el-col :span="4">
                <img src="../../assets/home/itchio.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
              </el-col>
            </el-row>
          </a>
        </el-col>
        <el-col :span="8">
          <a href="https://www.linkedin.com/in/dariogmori/">
            <el-row :justify="'center'">
              <el-col :span="4">
                <img src="../../assets/home/linkedin.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
              </el-col>
            </el-row>
          </a>
        </el-col>
        <el-col :span="8">
          <a href="https://github.com/dariogmori">
            <el-row :justify="'center'">
              <el-col :span="4">
                <img src="../../assets/home/github.png" alt="itchio logo" class="image-display" style="image-rendering: crisp-edges;"/>
              </el-col>
            </el-row>
          </a>
        </el-col>
      </el-row>
      <el-row :justify="'center'">
        <el-col :span="20">
          <p>{{ t('home.about-me')}}</p>
        </el-col>
      </el-row>
    </el-col>
    <el-col :span="8" style="margin-top: 10px" align="center">
      <div class="flip-box">
        <div class="flip-box-inner">
          <div class="flip-box-front">
            <img src="/img/me.jpg" alt="Me" style="width: 100%; border-radius: 10px">
          </div>
          <div class="flip-box-back">
            <img src="/img/icon-happy.png" alt="Me" style="width: 100%; border-radius: 10px">
          </div>
        </div>
      </div>
    </el-col>
  </el-row>
</template>
<script setup lang="ts">
import {isMobile} from "@/scripts/utils";
import {useTranslation} from "i18next-vue";
const { t } = useTranslation();
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
.flip-box-front, .flip-box-back {
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