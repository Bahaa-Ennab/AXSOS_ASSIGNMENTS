import React, { useEffect, useState } from 'react'
import axios from 'axios';
import ProductComponent from './ProductComponent';
import ProductList from './ProductList';
export default (props) => {
    const [products, setProducts] = useState([])
    const [loaded, setLoaded] = useState(false);

    useEffect(() => {
        axios.get("http://localhost:8000/api/product")
            .then(res => {
                setProducts(res.data),
                    setLoaded(true)
            })
            .catch(err => console.error(err));
    }, [products]);

        const removeFromDom = productId => {
        setProducts(products.filter(product => product._id != productId));
    }
    return (
        <>
            <ProductComponent />
            <br />
            <hr />
            {loaded && <ProductList products={products} batata={removeFromDom} />}
        </>
    )
}