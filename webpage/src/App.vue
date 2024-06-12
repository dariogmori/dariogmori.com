<template>
  <nav>
    <router-link to="/about-me">About Me</router-link>
    <button @click="toggleTheme">Toggle Theme</button>
  </nav>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: var(--main-color);
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: var(--main-color);
}

nav a.router-link-exact-active {
  color: var(--main-color);
}
</style>
<script lang="ts">
export default {
  name: 'App',
  data () {
    return {
      theme: 'light' // Default theme
    }
  },
  mounted () {
    // Load theme from local storage if available
    const savedTheme = localStorage.getItem('theme')
    if (savedTheme) {
      this.theme = savedTheme
      document.documentElement.setAttribute('data-theme', this.theme)
    }
  },
  methods: {
    toggleTheme () {
      this.theme = this.theme === 'light' ? 'dark' : 'light'
      document.documentElement.setAttribute('data-theme', this.theme)
      localStorage.setItem('theme', this.theme) // Save the current theme to local storage
    }
  }
}
</script>
