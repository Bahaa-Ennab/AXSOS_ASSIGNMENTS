const DisplayComponent = (props) => {
    return (
        <>
            <main style={{ display: "flex" }}>
                {props.message.map((item, index) => (

                    <div
                        key={index}
                        style={{
                            backgroundColor: item.color,
                            width: item.width + "px",
                            height: item.height + "px",
                            margin: "10px",
                        }}
                    ></div>
                ))}
            </main>
        </>
    );
};

export default DisplayComponent;
