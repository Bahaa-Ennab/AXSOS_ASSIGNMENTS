import React, { useState } from "react";

const Tabs = (props) => {
    const [label, setLabel] = useState("")
    const [content, setContent] = useState("")
    const [arr, setArr] = useState([]);
    const [activeTab, setActiveTab] = useState("a"); // tab selected for display


    const createTap = (e) => {
        e.preventDefault()
        const newTap = { label, content }
        const updatedArr = [...arr, newTap]
        setArr(updatedArr)
        console.log(arr);

        setLabel("")
        setContent("")
    }
    const onClickHandler = (item) => {
        setActiveTab(item); // save selected tab to state
    }

    return (
        <main>
            <form onSubmit={createTap}>

                <div>
                    <label>label: </label>
                    <input type="text" onChange={(e) => setLabel(e.target.value)} value={label} />
                </div>
                <div>
                    <label>content: </label>
                    <input type="text" onChange={(e) => setContent(e.target.value)} value={content} />
                </div>
                <div>
                    <input type="submit" value="create tap" />
                </div>
            </form>

            {arr.map((item, i) => (
                <button onClick={() => onClickHandler(item)} key={i}>
                    {item.label}
                </button>))}
            <p>{activeTab.content}</p>
        </main>

    )
};

export default Tabs;