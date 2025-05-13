<script>
    import { onMount } from "svelte";
    import Calculator from "../lib/Calculator.svelte";

    let message = null;

    async function callApi() {
        const res = await fetch("http://localhost:8080/api/hello");
        if (!res.ok) message = "Error: " + res.status;
        else {
            message = await res.text();
        }
    }

    onMount(async () => {
        await callApi();
    });
</script>

<center><Calculator></Calculator></center>
<h2>{message}</h2>
