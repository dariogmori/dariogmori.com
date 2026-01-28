<template>
  <div class="fade-in">
    <BlogComponent date="28/01/2026" title="I'm doing a talk about permacomputing! (in future tense)">
      <template #body>
          <el-row :justify="'center'" class="header-color">
              <el-col :span="20">
              <p>
                I recently got an opportunity (thanks to my friend Anastasiia) to propose a talk to the people at <a href="https://futurefrontend.com/speakers/#dar-o-guti-rrez-mori">Future Frontend</a> in Finland, and it got accepted! I am very lucky to get this opportunity, now I just gotta figure out the hard part: knowing what I am going to talk about specifically. I know I want to talk about permacomputing (and how I am slowly getting into it) and just show to the world the multiple ways you can do computing differently (cause I am so <i>different and special</i> lmao). 
              </p>
              <p>
                On a bit of a more personal note, this is a bit of a weird post I am writing after taking the decision to not attend Malaga Jam Weekend 20 because of personal reasons (stress and rent). The thing is I am very excited to try to find a different path from everything I have gotten surrounded with in the last year, the industry is exhausting (yes, already). 
              </p>
              <p>
                I have always struggled with creativity as I think the creative process is something that is very unnatural to me and I have a bit of a complex when moving in such cool ambients such as the indie videogame industry or possibly permacomputing forums but I will do my best, I think the result is worth it. BTW recently found out my new favorite person (in a career way), check them out at <a href="https://www.todepond.com/">https://www.todepond.com/</a> as they create incredibly cool stuff and I aspire to do a fraction of what they do.
              </p>
              <p class="small-text">Might private this post if I ever have to look for a job lmao so do not be surprised if it disappears.</p>
              </el-col>
          </el-row>
      </template>
    </BlogComponent>
    <br>
    <br>
    <BlogComponent date="27/12/2025" title="RAM Prices and reclaiming infrastructure ownership">
      <template #body>
          <el-row :justify="'center'" class="header-color">
              <el-col :span="20">
              <p>
                As you may have heard these past few weeks, we are experiencing a RAM “shortage” <i>(writing this as of December 27th 2025, welcome to my end of the year rant)</i>.
                This crisis has been mainly caused by the increase in demand caused by big corporations aimlessly running to be 
                the first to reach this <i>“AI superproduct”</i> that nobody really wants or needs<i>(1)</i>.
              </p>
              <p>
                Due to this wonderful thing known as the <i>“free market”</i> it would be stupid to assume that this concentration of resources by these companies will not affect us as individual consumers.
                It would be even more idiotic to believe that if these corporations decide not to pass this increase in operation costs to us consumers they do it in good faith. 
                It is in their best interest to slowly asphyxiate us rather than shock us with an immediate increase. 
              </p>
              <img src="../../assets/blog/27-12-2025/cloud-burning.gif">
              <p>
                The entire concept of cloud computing completely depends on consumers’ wishes for immediacy (in both scalability and deployability), removing any sense of planning needed while also conveniently removing the concept of ownership from the infrastructure you consume. 
                We are completely in the hands of a few companies that completely control our infrastructure and offer little to no transparency on how their pricing works or how it has changed over time <i>(2)</i>. 
                On the internet you can find how Amazon, for example, does not offer historical data about their pricing while Google’s AI keeps insisting it has been consistently been reduced through the years (offering no sources to back these claims).
              </p>
              <br>
              <p class="citation"> 
                “It’s the market, baby” - someone, somewhere (adam smith, maybe?)
              </p>
              <br>
              <p>
                I really do not want to repeat the overly used phrase of “You will own nothing and be happy”, but cliches exist for a reason, and this is another way capitalism cleverly achieves its goal of disowning the average Joe and concentrating riches among a few powerful actors.
              </p>
              <p>
                It is why this is my call to action to you, dear reader to try to run away from centralised, cloud, externally owned infrastructure (and eventually services) and try to regain control of your technological life. 
                In the following weeks I will follow this post with other publications about my tinkering with tools such as PostmarketOS <i>(3)</i> or Lightweight Music Server <i>(4)</i> to achieve this for myself and show how easy (or not) it is to do so.  
              </p>
              </el-col>
          </el-row>
      </template>   
      <template #references>
        <el-col :span="20">
        <ul>
          <li>(1) RAM production moving away from the average consumer and targeting huge corporations <a href="https://intuitionlabs.ai/articles/ram-shortage-2025-ai-demand">https://intuitionlabs.ai/articles/ram-shortage-2025-ai-demand</a></li>
          <li>(2) RAM prices affecting cloud computing prices (AWS being not transparent about EC2 pricing history) <a href="https://instances.vantage.sh/?id=ca66395bd8a18c9ddd0dcc27ed31b275d5470517">https://instances.vantage.sh/?id=ca66395bd8a18c9ddd0dcc27ed31b275d5470517</a></li>
          <li>(3) PostMarketOS. An open source mobile phone OS. <a href="https://postmarketos.org/">https://postmarketos.org/</a></li>
          <li>(4) Lightweight Music Server. A music server that could be used as an alternative to streaming services. <a href="https://github.com/epoupon/lms">https://github.com/epoupon/lms</a></li>
        </ul>
        </el-col>
      </template>
    </BlogComponent>
  </div>
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
.fade-in{
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

.small-text {
  font-size: 8px;
  font-style: italic;
}
</style>

<script setup lang="ts">
import { onMounted, reactive } from "vue";
import BlogComponent from "@/components/blog/BlogComponent.vue";

const config = reactive({
  theme: 'light'
})
onMounted(() => {
  const savedTheme = localStorage.getItem('theme')
  if (savedTheme) {
    config.theme = savedTheme
    document.documentElement.setAttribute('data-theme', config.theme)
  }
})
</script>
