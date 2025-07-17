import React from 'react'

const FormComponent = (props) => {
    
    const{handleChange,handleSubmit,formData}=props



    return (
        <>

            <form onSubmit={handleSubmit}>
                <p>
                    <label>Title</label><br />
                    <input type="text"
                        name="title"
                        value={formData.title}
                        onChange={handleChange} />
                </p>
                <p>
                    <label>Price</label><br />
                    <input type="text"
                        name="price"
                        value={formData.price}
                        onChange={handleChange} />
                </p>

                <p>
                    <label>Description</label><br />
                    <input type="text"
                        name="desc"
                        value={formData.desc}
                        onChange={handleChange} />
                </p>
                <input type="submit" />
            </form>
        </>
    )
}

export default FormComponent;