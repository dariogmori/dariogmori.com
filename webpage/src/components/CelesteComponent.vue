<template>
    <el-card class="card-celeste">
        <el-row justify="space-between">
            <el-col :span="8">
                    <el-row justify="space-evenly">
                        <el-col >
                            <img src="../assets/celeste/icon_celeste.jpg" class="avatar"/>
                            <el-row justify="center" align="middle">
                                <el-col :span="12">
                                    <h1 class="username">Toto</h1>
                                </el-col>
                                <el-col :span="10">
                                    <el-row align="middle">
                                        <el-col :span="14">
                                            <h1 class="counter">x192</h1>
                                        </el-col>
                                        <el-col :span="8">
                                            <img :src="strawberry" class="pixel-art" style="width:100%;" />
                                        </el-col>
                                    </el-row>
                                </el-col>
                            </el-row>
                        </el-col>
                    </el-row>
            </el-col>
            <el-col :span="16" align="top">
                <el-row justify="space-between">
                    <el-col :span="16">
                    </el-col>
                    <el-col :span="8">
                        <el-menu class="el-menu-demo" mode="horizontal" :ellipsis="false"
                            :default-active="active.activeIndex" background-color=#ad914193
                            active-text-color=#250505 text-color=#552d12; style="border-radius:10px; border-style: none; border-width: 2px; padding-left:10px; padding-right:10px; width:fit-content ">
                            <el-row justify="end">
                                <el-col :span="12">
                                    <el-menu-item index="1" @click="active.activeIndex='1'">
                                        <img :src="active.activeIndex === '1' ? heartActive : heartInactive" class="inside-button ">
                                    </el-menu-item>
                                </el-col>
                                <el-col :span="12">
                                    <el-menu-item index="2" @click="active.activeIndex='2'">
                                        <img :src="active.activeIndex === '2' ? goldenActive : goldenInactive" class="inside-button pixel-art">
                                    </el-menu-item>
                                </el-col>
                            </el-row>
                        </el-menu>
                    </el-col>
                </el-row>
                <el-card class="content-celeste">
                    <el-row justify="center" v-if="active.activeIndex==='1'">
                            <el-col :span="3" v-for="index in 8" :key="index">
                                <!--<p class="counter">Ch{{index}}</p>-->
                                <img :src="heartsAside[index-1]? heartBlue : dot" style="width:100%" class="heart pixel-art"/>
                                <img :src="heartsBside[index-1]? heartRed : dot" style="width:100%" class="heart pixel-art"/>
                                <img :src="heartsCside[index-1]? heartYellow : dot" style="width:100%" class="heart pixel-art"/>
                            </el-col>
                    </el-row>
                    <el-row justify="center" v-if="active.activeIndex==='2'">
                            <el-col :span="3" v-for="index in 8" :key="index">
                                <!--<p class="counter">Ch{{index}}</p>-->
                                <img :src="goldenAside[index-1]? goldenIcon : dot" style="width:80%" class="heart"/>
                                <img :src="goldenBside[index-1]? goldenIcon : dot" style="width:80%" class="heart"/>
                                <img :src="goldenCside[index-1]? goldenIcon : dot" style="width:80%" class="heart"/>
                            </el-col>
                    </el-row>
                </el-card>
            </el-col>
        </el-row>
    </el-card>
</template>
<script setup lang="ts">
import { ref, reactive } from 'vue'
import goldenInactive from '@/assets/celeste/golden-strawberry.png'
import goldenActive from '@/assets/celeste/golden-strawberry-active.png'
import heartInactive from '../assets/celeste/heart-web.png'
import heartActive from '../assets/celeste/heart-red-active.png'
import strawberry from '../assets/celeste/strawberry.png'
import heartRed from '../assets/celeste/heart-red.png'
import heartYellow from '../assets/celeste/heart-yellow.png'
import heartBlue from '../assets/celeste/heart-blue.png'
import goldenIcon from '../assets/celeste/golden-strawberry-icon.png'
import dot from '../assets/celeste/dot.png'
const active = reactive({ activeIndex: ref('1') })

const heartsAside = [
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  true
]
const heartsBside = [
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  true
]
const heartsCside = [
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  true
]
const goldenAside = [
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  false
]
const goldenBside = [
  true,
  true,
  false,
  false,
  false,
  false,
  false,
  false
]
const goldenCside = [
  true,
  true,
  true,
  true,
  true,
  true,
  true,
  true
]
</script>
<style scoped>
@import '@/assets/styles/celeste.scss';

.pixel-art{
  image-rendering: crisp-edges;
}
</style>
