<script>
    import { goto } from "@mateothegreat/svelte5-router";
  </script>
  
  <div>
    <button on:click={() => goto('/')} >Home</button>
    <button on:click={() => goto('/about')} >About</button>
  </div>