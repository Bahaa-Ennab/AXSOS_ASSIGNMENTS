import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import axios from 'axios';


export const HomePage = () => {
    const [name, setName] = useState("")
    const [errors, setErrors] = useState([]);
    const redirect = useNavigate()
    const onSubmitHandler = (e) => {
        e.preventDefault();
        axios.post('http://localhost:8000/api/new', {
            name
        }).then(res => {
            console.log(res)
            redirect('/chat', { state: { name } });
        })
            .catch(err => {
                console.log(err.response.data.errors);
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key])
                }
                // Set Errors
                setErrors(errorArr);
            })

    }
    return (
        <>
            <h3>Mern Chat</h3>
            <form onSubmit={onSubmitHandler}>
                <p>
                    <label>name</label><br />
                    <input type="text" onChange={(e) => setName(e.target.value)} value={name} />
                </p>
                <button>create</button>
                {errors.length > 0 && (
                    <div style={{ color: 'red' }}>
                        {errors.map((err, index) => (
                            <p key={index}>{err}</p>
                        ))}
                    </div>
                )}
            </form>
        </>
    )
}
