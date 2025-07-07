import React, { useState } from "react";

const Tasks = () => {
    const [description, setDescription] = useState("")
    const [status, setStatus] = useState(false)
    const [arr, setArr] = useState([]);
    const [activeTab, setActiveTab] = useState("");


    const createTask = (e) => {
        e.preventDefault()
        const newTask = { description, status }
        const updatedArr = [...arr, newTask]
        setArr(updatedArr)
        console.log(updatedArr);
        setDescription("")
        setStatus(false)
    }

    const onClickHandler = (item) => {
        setActiveTab(item);
    }

    const onClickDelete = (item) => {
        const updatedArr = arr.filter(task => task !== item);
        setArr(updatedArr);
        if (activeTab === item) setActiveTab(null);
    }

    const onClickDone = (item) => {
        const updatedArr = arr.map(task =>
            task === item ? { ...task, status: true } : task
        );
        setArr(updatedArr);
        setActiveTab({ ...item, status: true });
        console.log(updatedArr);
    }

    return (
        <div>
            <p>craete task</p>
            <form onSubmit={createTask}>
                <div>
                    <label >description : </label>
                    <input type="text" onChange={(e) => setDescription(e.target.value)} value={description} />
                </div>
                <div>
                    <input type="submit" />
                </div>
            </form>
            <div>
                {arr.map((item, i) => (
                    <button
                        onClick={() => onClickHandler(item)}
                        key={i}
                        style={{
                            backgroundColor: item.status ? "lightgreen" : "white",
                        }}
                    >
                        {item.description}
                    </button>
                ))}
            </div>
            {activeTab ?
                <div>
                    <p>settings for {activeTab.description}</p>
                    <button onClick={() => onClickDelete(activeTab)}>delete</button>
                    <button onClick={() => onClickDone(activeTab)}>set done</button>
                </div> : ''
            }
            <div></div>


        </div>
    );
};

export default Tasks;