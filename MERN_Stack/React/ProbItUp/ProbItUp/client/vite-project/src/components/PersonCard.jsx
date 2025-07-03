import React, { useState } from 'react';

const PersonComponent = ({firstname,lastname,age,haircolor}) =>{
    const [count, setCount] = useState(age);   // use descriptive names for the state variable (count) and initial value(0)
    const [color,setColor] = useState(haircolor);
    const handleColor = (e) => {
        setColor(e.target.value);
    }
    const handleClick = () => {
        setCount(count + 1);
    }
    return(
        <>
        <h1>{firstname}, {lastname} </h1>
        <p>Age: {count}</p>  <button onClick={ handleClick }>Click Me</button>
        <p style={{ background: color }}>Hair Color:{color}</p> <input type="text" onChange={handleColor}/>
        </>
    )
}
export default PersonComponent;