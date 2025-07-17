import axios from 'axios'
import React from 'react'
import { useEffect } from 'react'
import { useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const EditCom = () => {
    const {id} = useParams()
    const[name,setName]=useState('')
    const redirect = useNavigate()

    useEffect(()=>{
        axios.get('http://localhost:8000/api/'+ id)
        .then(res=>{setName(res.data.name)})
        .catch(err => console.error(err))
    },[])

   const updateAuthour = e => {
        e.preventDefault();
        axios.patch('http://localhost:8000/api/edit/' + id, {
            name
        })
            .then(res => console.log(res))
            .catch(err => console.error(err));
            redirect('/')
    }

  return (
    <div>
            <h1>Update a Authour</h1>
            <form onSubmit={updateAuthour}>
                <p>
                    <label>name</label><br />
                    <input type="text" 
                    name="name" 
                    value={name} 
                    onChange={(e) => { setName(e.target.value) }} />
                </p>
                <input type="submit" />
            </form>
    </div>    
  )
}

export default EditCom