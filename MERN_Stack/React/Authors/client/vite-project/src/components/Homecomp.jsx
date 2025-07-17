import React from 'react'
import { useEffect } from 'react'
import { useState } from 'react'
import { data, Link, redirect, useNavigate, useParams } from 'react-router-dom'
import axios from 'axios'

const Homecomp = () => {
    const [authors, setAuthors] = useState([])
    const [errors, setErrors] = useState([]);
    const { id } = useParams()
    const redirect = useNavigate()

    useEffect(() => {
        axios.get('http://localhost:8000/api/')
            .then(res => { setAuthors(res.data), console.log(res) })
            .catch(err => {
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setErrors(errorArr);
            })
    }
        , [])


        const handleDelete=(id)=>{
            axios.delete(`http://localhost:8000/api/delete/`+ id)
            .then(res=>{
                setAuthors(authors.filter(author=> author._id != id ))
            })
            .catch(err=>console.log(err))
        }
    return (
        <div>
            <h1>FAvoriate autuhors</h1>
            <Link to={`/create`}>
                <button>Create</button>
            </Link>

            <table border="1">
                <thead>
                    <tr>
                        <th>Author</th>
                        <th>Actions Available</th>
                    </tr>
                </thead>
                <tbody>
                    {authors.map((author) => (
                        <tr key={author._id}>
                            <td>{author.name}</td>
                            <td>
                                <Link to={`/edit/${author._id}`}>
                                    <button>Edit</button>
                                </Link>
                                    <button onClick={()=>handleDelete(author._id)}>delete</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>

            {/* Optional: Show errors below if needed */}
            {errors && <div style={{ color: 'red' }}>{errors}</div>}
        </div>

    )
}

export default Homecomp