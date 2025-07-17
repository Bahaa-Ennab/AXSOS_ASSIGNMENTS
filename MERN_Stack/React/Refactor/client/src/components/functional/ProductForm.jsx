import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { useParams, useNavigate } from "react-router-dom";
import FormComponent from '../presintational/FormComponent';

const ProductForm = (props) => {
    const { id } = useParams();
    const [title, setTitle] = useState('');
    const [price, setPrice] = useState('');
    const [desc, setDesc] = useState('');
    const navigate = useNavigate();
    
        useEffect(() => {
            if(props.type=='update') {
            axios.get('http://localhost:8000/api/product/' + id)
            .then(res => {
                setTitle(res.data.title);
                setPrice(res.data.price);
                setDesc(res.data.desc);
            })
            .catch(err => console.log(err));
        }},[])
    
    
    

    const handleChange = e => {
        switch (e.target.name) {
            case 'title':
                setTitle(e.target.value);
                break;
            case 'price':
                setPrice(e.target.value);
                break;
            case 'desc':
                setDesc(e.target.value);
                break;
            default:
                break;

        }

    }


    const onSubmitHandler = e => {
        //prevent default behavior of the submit
        e.preventDefault();
        //make a post request to create a new person
        axios.post('http://localhost:8000/api/product', {
            title,
            price,
            desc
        })
            .then(res => console.log(res))
            .catch(err => console.log(err))
    }


    const updateProduct = e => {
        e.preventDefault();
        axios.patch('http://localhost:8000/api/product/' + id, {
            title,
            price,
            desc
        })
            .then(res => console.log(res))
            .catch(err => console.error(err));
        navigate('/product')
    }

    return (
        <div>
            {props.type == 'update'?<h1>Update a Product</h1>:''}
            <FormComponent handleSubmit={props.type=='update'?updateProduct:onSubmitHandler} handleChange={handleChange} formData={{ title, price, desc }} />
        </div>
    )
}

export default ProductForm;