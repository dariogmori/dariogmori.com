import axios from 'axios'

const axiosInstance = axios.create({
  baseURL: 'https://api.dariogmori.com',
  headers: {
    'Content-type': 'application/json'
  }
})

function getHost () {
  const protocol = window.location.protocol
  const hostname = window.location.hostname

  return hostname
}

export default axiosInstance
