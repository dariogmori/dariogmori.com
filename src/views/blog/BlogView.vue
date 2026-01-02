<template>
  <BlogComponent date="27/12/2025" title="RAM Prices and reclaiming infrastructure ownership">
    <template #body>
        <el-row :justify="'center'" class="header-color">
            <el-col :span="20">
            <p>As you may have heard these past few weeks, we are experiencing a RAM “shortage” (writing this as of December 27th 2025). This crisis has been mainly caused by the increase in demand caused by big corporations aimlessly running to be the first to reach this “AI superproduct” that nobody really wants <i>(1)</i>. </p>
            <br>
            <p>
              Due to this wonderful thing known as “capitalism” it would be stupid to assume that this concentration of resources by these companies will not affect us as individual consumers. It would be even more idiotic to believe that if these corporations decide not to pass this increase in operation costs to us consumers they do it in good faith. It is in their best interest to slowly asphyxiate us rather than shock us with an immediate increase. 
            </p>
            <br>
            <img src="../../assets/blog/27-12-2025/cloud-burning.gif">
            <br>
            <p>
              The entire concept of `cloud computing` completely depends on consumers’ wishes for immediacy (in both scalability and deployability), removing any sense of planning needed while also conveniently removing the concept of ownership from the infrastructure you consume. We are completely in the hands of a few companies that completely control our infrastructure and offer little to no transparency on how their pricing works or how it has changed over time <i>(2)</i>. On the internet you can find how Amazon, for example, does not offer historical data about their pricing while Google’s AI keeps insisting it has been consistently been reduced through the years (offering no sources to back these claims).
            </p>
            <br>
            <p class="citation"> 
              “It’s the market, baby” - someone, somewhere (adam smith, maybe?)
            </p>
            <br>
             <p>
              I really do not want to repeat the overly used phrase of “You will own nothing and be happy”, but cliches exist for a reason, and this is another way capitalism cleverly achieves its goal of disowning the average Joe and concentrating riches among a few powerful actors.
            </p>
            <br>
            <p>
              It is why this is my call to action to you, dear viewer to try to run away from centralised, cloud, externally owned infrastructure (or even services) and try to regain control under your own infrastructure. In the following weeks I will follow this post with other publications about my tinkering with tools such as PostmarketOS <i>(3)</i> or Lightweight Music Server <i>(4)</i> to achieve this for myself and show how easy (or not) it is to achieve this.  
            </p>
            </el-col>
        </el-row>
    </template>   
    <template #references>
      <el-col :span="20">
      <ul>
        <li>(1)RAM production moving away from the average consumer and targeting huge corporations <a href="https://intuitionlabs.ai/articles/ram-shortage-2025-ai-demand">https://intuitionlabs.ai/articles/ram-shortage-2025-ai-demand</a></li>
        <li>(2) RAM prices affecting cloud computing prices (AWS being not transparent about EC2 pricing history) <a href="https://instances.vantage.sh/?id=ca66395bd8a18c9ddd0dcc27ed31b275d5470517">https://instances.vantage.sh/?id=ca66395bd8a18c9ddd0dcc27ed31b275d5470517</a></li>
        <li>(3) PostMarketOS. An open source mobile phone OS. <a href="https://postmarketos.org/">https://postmarketos.org/</a></li>
        <li>(4) Lightweight Music Server. A music server that could be used as an alternative to streaming services. <a href="https://github.com/epoupon/lms">https://github.com/epoupon/lms</a></li>
      </ul>
      </el-col>
    </template>
  </BlogComponent>
</template>

<style scoped>
@import '../../assets/styles/theme.css';
body{
    background-color: white;
}
p {
  font-family: 'Courier New', Courier, monospace;
  font-size: 18px;
  text-align: left;
}
li{
  font-family: 'Courier New', Courier, monospace;
  font-style: italic;
  font-size: 14px;
  text-align: left;
}
ul {
  font-family: 'Courier New', Courier, monospace;
  font-style: italic;
  font-size: 18px;
  text-align: left;
}
.citation {
  font-style: italic;
  text-align: center;
}
@import '../../assets/styles/palette.css';


</style>

<script setup lang="ts">
import { useTranslation } from "i18next-vue";
import { onMounted, reactive } from "vue";
import BlogComponent from "@/components/blog/BlogComponent.vue";
import { el } from "element-plus/es/locales.mjs";


const { t } = useTranslation();
const config = reactive({
  theme: 'light',
  lang: 'es'
})
onMounted(() => {
  const savedTheme = localStorage.getItem('theme')
  const savedLang = localStorage.getItem('lang')
  if (savedTheme) {
    config.theme = savedTheme
    document.documentElement.setAttribute('data-theme', config.theme)
  }
  if( savedLang ) {
    config.lang = savedLang
    document.documentElement.setAttribute('data-lang', config.lang)
  }
})
</script>
