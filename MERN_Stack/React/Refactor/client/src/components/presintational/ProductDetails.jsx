import React from 'react'
import { Link } from 'react-router-dom'

export const ProductDetails = (props) => {

    const{product}=props
    return (
        <>
            <div>
                <p>Title: {product.title}</p>
                <p>Price: {product.price}</p>
                <p>Description: {product.desc}</p>

            </div>
            <div style={{ width: '200px', display: 'flex', justifyContent: 'space-evenly' }}>
                <Link to={'/product'}>Go Back</Link>
                <Link to={'/product/' + product._id + '/edit'}>Edit</Link></div>


        </>
    )
}
