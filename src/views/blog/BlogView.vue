<template>
  <div class="fade-in">
	<BlogComponent date="17/02/2026" title="Running away from Spotify (or Apple Music if you are weird like that)">
      <template #body>
         <el-row :justify="'center'" class="header-color">
             <el-col :span="20">
	             <p>
	             	It is well known the continuous abuses the music industry and streaming music services such as Spotify or Apple music carry out on artists (1).  
	             	It also seems like specially Spotify has been banking on AI generated music, filling its catalogue with slop (2). In my journey to run away from the eternal wheel of SaaS and subscriptions I decided to look into self-hosted music server alternatives.
	             </p>
	             <p>
				 	I stumbled upon Lightweight Music Server (3) (LMS for friends) which had Subsonic API support, meaning that it is compatible with most open source music players out there. 
				 	For players, I chose Substreamer (4) for my mobile player (since I am stuck with iPhone until I figure out a nice phone to use with postmarketOS) and Supersonic (5) for my desktop player. You can use any player that supports the Subsonic API though so feel free to experiment and tell me why I am wrong.
	             </p>
	             <h2>Setting up LMS</h2>
	             <p>
	             	In order to set up Lightweight Music Server you will need the following (for my specific setup). I recommend you run some Linux distro, I run my LMS in a Steam Deck (arch):
         	 	 </p>
         	 	 <ul>
         	 	 	<li>A machine with Podman/Docker installed (I will use podman in this tutorial). </li>
         	 	 	<li>Some songs to test with.</li>
         	 	 	<li>Time</li>
         	 	 </ul>
         	 	 <p>
         	 	 	Once you have all of this set up let’s set up a directory named lms from which we will be working:
         	 	 </p>
         	 	 <samp>
         	 	 	>> mkdir lms && cd lms
         	 	 </samp>
         	 	 <p> 
         	 	 	We also need to create an ArtistInfo dir in which you can define the data of the artists if you wish (this step is optional).
         	 	 </p>
         	 	 <samp>
         	 	 	>> mkdir ArtistInfo
         	 	 </samp>
         	 	 <p>
         	 	 	In here, create a file named docker-compose.yaml, which will be used to run the LMS container. Create it with the following contents:
         	 	 </p>
<pre>
<code>
version: 3.8
services:
  lms:
    image: docker.io/epoupon/lms:latest
   	container_name: lms
   	restart: unless-stopped
   	network_mode: "host"
   	user: 1000:1000
      userns_mode: keep-id
      volumes:
      	- &ltfull path to your music dir&gt:/music:ro
       	- &ltfull path to your data dir&gt:/var/lms:rw
       	- &ltfull path to your ArtistInfo dir&gt:/ArtistInfo:ro
x-podman:
  in_pod: false
</code>
</pre>
         	 	 <p>
         	 	 	After this, we can run our docker-compose by executing:
         	 	 </p>
         	 	 <samp>
         	 	 	>> podman compose up 
         	 	 </samp>
         	 	 <p>
         	 	 > NOTE: if you wish to not have the server close when you close the terminal run `podman compose up -d` so it runs in detached mode
         	 	 </p>
         	 	 <p>
         	 	 	This will run our container and display the logs, if everything went according to plan we should be able to access our server by going to <a href="http://localhost:5082">http://localhost:5082</a>. Here we can create our admin user and run a scan of our songs:
         	 	 </p>
         	 	 <div style="display: flex; justify-content: space-evenly;">
         	 	 	<img src="../../assets/blog/17-02-2026/lms_create_account.png" style="width:500px; max-width:80%">
         	 	 	<img src="../../assets/blog/17-02-2026/lms_scan_songs.png" style="width:500px; max-width:80%">
         	 	 </div>
         	 	 <p>
         	 	 	After running this scan we will see our songs pop up in the main menu and we can even play them!
         	 	 </p>
          	 	 <img src="../../assets/blog/17-02-2026/lms_play_song.png" style="width:500px; max-width:80%">
             </el-col>
         </el-row>
       </template>
       <template #references>
	       <el-col :span="20">
	       <ul>
	         <li>(1) Spotify is abusive towards musicians both rich and poor, and here is why | Ashley Jana <a href="https://ashleyjanamusic.medium.com/spotify-is-abusive-towards-musicians-both-rich-and-poor-and-here-is-why-a34792353f02">https://ashleyjanamusic.medium.com/spotify-is-abusive-towards-musicians-both-rich-and-poor-and-here-is-why-a34792353f02</a></li>
	         <li>(2) Spotify is paying out ai artist that spam the platform with ai made albums and abuse the system  <a href="https://www.reddit.com/r/musicians/comments/1r2e4fa/spotify_is_paying_out_ai_artist_that_spam_the/">https://www.reddit.com/r/musicians/comments/1r2e4fa/spotify_is_paying_out_ai_artist_that_spam_the/</a></li>
	         <li>(3) Lightweight Music Server's Github Page  <a href="https://github.com/epoupon/lms">https://github.com/epoupon/lms</a></li>
	         <li>(4) Substreamer's Main Page  <a href="https://substreamerapp.com/">https://substreamerapp.com/</a></li>
	         <li>(5) Supersonic’s Github Page  <a href="https://github.com/dweymouth/supersonic">https://github.com/dweymouth/supersonic</a></li>
	       </ul>
	       </el-col>
       </template>
    </BlogComponent>
    <br>
    <br>  
    <BlogComponent date="28/01/2026" title="I'm doing a talk about permacomputing! (in future tense)">
      <template #body>
          <el-row :justify="'center'" class="header-color">
              <el-col :span="20">
              <p>
                I recently got an opportunity (thanks to my friend Anastasiia) to propose a talk to the people at <a href="https://futurefrontend.com/speakers/#dar-o-guti-rrez-mori">Future Frontend</a>(1) in Finland, and it got accepted! I am very lucky to get this opportunity, now I just gotta figure out the hard part: knowing what I am going to talk about specifically. I know I want to talk about permacomputing (and how I am slowly getting into it) and just show to the world the multiple ways you can do computing differently (cause I am so <i>different and special</i> lmao). 
              </p>
              <img src="../../assets/blog/28-01-2026/breaking-machine1.gif">
              <p>
                On a bit of a more personal note, this is a bit of a weird post I am writing after taking the decision to not attend Malaga Jam Weekend 20 because of personal reasons (stress and rent). The thing is I am very excited to try to find a different path from everything I have gotten surrounded with in the last year, the industry is exhausting (yes, already). 
              </p>
              <p>
                I have always struggled with creativity as I think the creative process is something that is very unnatural to me and I have a bit of a complex when moving in such cool ambients such as the indie videogame industry or possibly permacomputing forums but I will do my best, I think the result is worth it. BTW recently found out my new favorite person (in a career way), check them out at <a href="https://www.todepond.com/">https://www.todepond.com/</a> as they create incredibly cool stuff (2) and I aspire to do a fraction of what they do.
              </p>
              <p class="small-text">Might private this post if I ever have to look for a job lmao so do not be surprised if it disappears.</p>
              </el-col>
          </el-row>
      </template>
       <template #references>
        <el-col :span="20">
        <ul>
          <li>(1) Future Frontend Website <a href="https://futurefrontend.com">https://futurefrontend.com/</a></li>
          <li>(2) Talk about the Tadi Web | Lu Wilson <a href="https://www.youtube.com/watch?v=73mEhS0gxgI">https://www.youtube.com/watch?v=73mEhS0gxgI</a></li>
        </ul>
        </el-col>
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
code {
  text-align:left;
  display:block;
  margin: 5px;
}
pre {
  border: 1px black solid;
}
samp {
  text-align:left;
  display:block;
  border: 1px black solid;
}
h2 {
  font-family: 'Courier New', Courier, monospace;
  text-align: left;
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
