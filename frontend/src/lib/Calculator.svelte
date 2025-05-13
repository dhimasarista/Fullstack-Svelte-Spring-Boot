<script lang="js">
    import { display } from "../stores/calculator";
    function append(value) {
        display.update((d) => (d += value));
    }

    function clear() {
        display.set("");
    }

    function calculate() {
        try {
            display.update((d) =>
                Function('"use strict";return (' + d + ")")().toString(),
            );
        } catch (e) {
            display.update((d) => (d += "Error"));
            console.log("Error Calculator: " + e);
        }
    }
</script>

<div class="calculator">
    <input type="text" readonly bind:value={$display} />

    <button on:click={() => append("7")}>7</button>
    <button on:click={() => append("8")}>8</button>
    <button on:click={() => append("9")}>9</button>
    <button on:click={() => append("/")}>÷</button>

    <button on:click={() => append("4")}>4</button>
    <button on:click={() => append("5")}>5</button>
    <button on:click={() => append("6")}>6</button>
    <button on:click={() => append("*")}>×</button>

    <button on:click={() => append("1")}>1</button>
    <button on:click={() => append("2")}>2</button>
    <button on:click={() => append("3")}>3</button>
    <button on:click={() => append("-")}>−</button>

    <button on:click={() => append("0")}>0</button>
    <button on:click={() => append(".")}>.</button>
    <button on:click={() => append("+")}>+</button>
    <button on:click={calculate} class="equal"> = </button>

    <button on:click={clear} class="clear">C</button>
</div>

<style>
    .calculator {
        width: 220px;
        padding: 1rem;
        border: 2px solid #ccc;
        border-radius: 10px;
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        gap: 0.5rem;
        background: #f9f9f9;
    }

    input {
        grid-column: span 4;
        padding: 0.5rem;
        font-size: 1.2rem;
        text-align: right;
    }

    button {
        padding: 0.8rem;
        font-size: 1rem;
        border: none;
        background: #eee;
        cursor: pointer;
        border-radius: 5px;
        color: black;
    }

    button:hover {
        background: #ddd;
    }

    .equal {
        background: #4caf50;
        color: white;
        grid-column: span 2;
    }

    .clear {
        background: #f44336;
        color: white;
        grid-column: span 2;
    }
</style>
