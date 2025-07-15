import React from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';
    
const ProductList = (props) => {
    const { batata } = props;

    const deleteProduct = (productId) => {
        axios.delete('http://localhost:8000/api/product/' + productId)
            .then(res => {
                batata(productId)
            })
            .catch(err => console.error(err));
    }
    return (
        <>
        <h1>All Products</h1>
        <div>
            {props.products.map( (product) =>
                 <div>
                 <Link to={`/product/${product._id}`}><h2>{product.title}</h2></Link>
                 <button onClick={(e)=>{deleteProduct(product._id)}}> Delete </button>
                    </div>
            )}
        </div>
        </>
    )
}
    
export default ProductList;