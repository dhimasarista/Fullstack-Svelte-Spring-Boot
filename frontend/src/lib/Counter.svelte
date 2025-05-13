<script>
    import { counter } from "../stores/counter";

    let { title } = $props();

    const increment = () => {
        if ($counter == 10) {
            alert(`You Got ${$counter}`);
            counter.update((c) => (c = -100));
        }

        counter.update((c) => (c += 1));
    };
</script>

<button onclick={increment}>
    {title ?? "Counter"} : {$counter}
</button>
