import './App.css'
import Homecomp from './components/Homecomp'
import { Routes, Route } from 'react-router-dom';
import CreateCom from './components/CreateCom'
import EditCom from './components/EditCom'


function App() {

  return (
    <>
      <Routes>
        <Route path="/" element={<Homecomp />} />
        <Route path="/create" element={<CreateCom />} />
        <Route path="/edit/:id" element={<EditCom />} />
      </Routes>
    </>
  )
}

export default App
