<script>
  import { Router } from "@mateothegreat/svelte5-router";
  import Home from "./routes/Home.svelte";
  import Sidebar from "./components/Sidebar.svelte";
  import About from "./routes/About.svelte";

  const routes = [
    { path: "/", component: Home },
    { path: "/about", component: About }
  ];
</script>
<Router {routes} />
<div class="flex h-screen">
  <Sidebar />
</div>
