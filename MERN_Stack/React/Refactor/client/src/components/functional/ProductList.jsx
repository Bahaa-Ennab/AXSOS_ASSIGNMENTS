import React from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';
import { DeleteComponent } from '../presintational/DeleteComponent';
    
const ProductList = (props) => {
        const { removeFromDom } = props;
const deleteProduct = (productId) => {
        axios.delete('http://localhost:8000/api/product/' + productId)
            .then(res => {
                removeFromDom(productId)
            })
            .catch(err => console.error(err));
    }
    return (
        <>
        <h1>All Products</h1>
        <div>
            {props.products.map( (product, i) =>
                 <div>
                 <Link to={`/product/${product._id}`}><h2>{product.title}</h2></Link>
                 <DeleteComponent handleDelete={()=>deleteProduct(product._id)} />
                    </div>
            )}
        </div>
        </>
    )
}
    
export default ProductList;