import React from "react";
import { useParams } from "react-router-dom";
const Number = () => {
    const { num } = useParams()

    const typeOf = isNaN(num)

    return (
        <>
            {typeOf ? (
                <p >
                    The word is: {num}
                </p>
            ) : (
                <p>
                    The number is: {num}
                </p>
            )}
        </>
    )
}
export default Number