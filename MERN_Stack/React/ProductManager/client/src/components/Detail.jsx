import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { Link, useParams } from "react-router-dom";
    
const Detail = (props) => {
    const [product, setProduct] = useState({})
    const { id } = useParams();
    
    useEffect(() => {
        axios.get('http://localhost:8000/api/product/' +id)
            .then(res => setProduct(res.data))
            .catch(err => console.error(err));
    }, []);
    
    return (
        <>
        <div>
            <p>Title: {product.title}</p>
            <p>Price: {product.price}</p>
            <p>Description: {product.desc}</p>

        </div>
        <div style={{width:'200px',display:'flex',justifyContent:'space-evenly'}}>
        <Link to={'/product'}>Go Back</Link>
        <Link to={'/product/'+product._id+'/edit'}>Edit</Link></div>
        
        </>
    )
}
    
export default Detail;