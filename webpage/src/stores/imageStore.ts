import { defineStore } from 'pinia';
import { ref } from 'vue';

export const useImageStore = defineStore('imageStore', () => {
  // State: image URL to store the current image URL
  const imageUrl = ref('');

  // Action: Set the image URL
  function setImageUrl(url: string) {
    imageUrl.value = url;
  }

  return {
    imageUrl,
    setImageUrl
  };
});
