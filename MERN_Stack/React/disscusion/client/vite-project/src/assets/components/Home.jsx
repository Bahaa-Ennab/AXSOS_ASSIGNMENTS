const MessageForm = (props) => {

    console.log(props.message);
    return  (
        <>
        <ul>
            { props.message.map( (item, i) => 
                <li key={ i }>{ item }</li> ) }
        </ul>        </>
    )

};
    
export default MessageForm;