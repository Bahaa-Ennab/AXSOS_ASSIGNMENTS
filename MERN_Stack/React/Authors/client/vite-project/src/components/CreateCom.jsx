import axios from 'axios';
import React from 'react'
import { useState } from 'react';
import { Link, redirect, useNavigate } from 'react-router-dom';

const CreateCom = () => {

    const [name, setName] = useState("")
    const [errors, setErrors] = useState([]);
    const redirect = useNavigate()
    const onSubmitHandler = (e) => {
        e.preventDefault();
        axios.post('http://localhost:8000/api/new', {
            name
        }).then(res => {
            console.log(res)
            redirect('/')
        })
            .catch(err => {
                console.log(err.response.data.errors);
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setErrors(errorArr);
            })

    }

    return (
        <div>
            <form onSubmit={onSubmitHandler}>
                <p>
                    <label>name</label><br />
                    <input type="text" onChange={(e) => setName(e.target.value)} value={name} />
                </p>
                <button>create</button>
                {errors && <div style={{ color: 'red' }}>{errors}</div>}
            </form>
            <Link to={`/`}>
                <button>cancel</button>
            </Link>
        </div>
    )
}

export default CreateCom