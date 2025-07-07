import React, { useState } from 'react';
const FormComponent = (props) => {
    const [color, setColor] = useState("");
    const [height, setHeight] = useState("");
    const [width, setWidth] = useState("");
    const [hasBeenSubmitted, setHasBeenSubmitted] = useState(false);
    const [arr, setArr] = useState([]);
    const createBox = (e) => {
        e.preventDefault()

        const newBox = { color, height, width }
        const updatedArr = [...arr, newBox];
        setArr(updatedArr);
        arr.push(newBox)
        props.passMessage(updatedArr);
        console.log(arr);
        setColor("")
        setHeight("")
        setWidth("")

        setHasBeenSubmitted(true);
    }

    return (
        <>
            <form onSubmit={createBox}>
                {
                    hasBeenSubmitted ?
                        <h3>Thank you for submitting the form!</h3> :
                        <h3>Welcome, please submit the form.</h3>
                }
                <div>
                    <label>color: </label>
                    <input type="text" onChange={(e) => setColor(e.target.value)} value={color}/>
                </div>
                <div>
                    <label>width: </label>
                    <input type="number" onChange={(e) => setWidth(e.target.value)} value={width} />
                </div>
                <div>
                    <label>height: </label>
                    <input type="number" onChange={(e) => setHeight(e.target.value)} value={height} />
                </div>
                <div>
                    <input type="submit" value="create box" />
                </div>
            </form>

        </>
    )

}
export default FormComponent
