import React from "react";
import { useParams } from "react-router-dom";
const Styled = () => {
    const { word, color, bcolor } = useParams();

    const typeOf = isNaN(word)


    return (
        <>
            {typeOf ? (
                <p style={{ backgroundColor: bcolor, color: color }}>
                    The word is: {word}
                </p>
            ) : (
                <p style={{ backgroundColor: bcolor, color: color }}>
                    The number is: {word}
                </p>
            )}
        </>
    )
}
export default Styled