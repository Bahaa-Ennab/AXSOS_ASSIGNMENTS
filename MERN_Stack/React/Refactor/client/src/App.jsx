import './App.css'
import { Routes, Route } from 'react-router-dom';
import MainComponent from './components/functional/MainComponent'
import Detail from './components/functional/Detail';
import ProductForm from './components/functional/ProductForm';
function App() {

  return (
    <>

      <Routes>
        <Route element={<MainComponent />} path="/product/" />
        <Route element={<Detail />} path="/product/:id" />
        <Route element={<ProductForm type='update'/>} path="/product/:id/edit"/>
      </Routes>
    </>
  )
}

export default App
