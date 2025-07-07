import React, { useState } from "react";
import axios from 'axios';

const PokemonFetcher = () => {
    const [pokemonList, setPokemonList] = useState([]);

    const onClickHandler = () => {
        axios.get("https://pokeapi.co/api/v2/pokemon")
            .then(response => {
                console.log(response); 
                setPokemonList(response.data.results);
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
