import React, { useState } from "react";

const PokemonFetcher = () => {
    const [pokemonList, setPokemonList] = useState([]);

    const onClickHandler = () => {
        fetch("https://pokeapi.co/api/v2/pokemon")
            .then(response => response.json())
            .then(data => {
                console.log(data.results); 
                setPokemonList(data.results);
            })
            .catch(err => {
                console.error("Fetch error:", err);
            });
    };

    return (
        <div>
            <button onClick={onClickHandler}>Fetch Pokemon</button>
            <ul>
                {pokemonList.map((pokemon, index) => (
                    <li key={index}>{pokemon.name}</li>
                ))}
            </ul>
        </div>
    );
};

export default PokemonFetcher;
