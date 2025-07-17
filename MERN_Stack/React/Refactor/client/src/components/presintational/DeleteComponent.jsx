import React from 'react'

export const DeleteComponent = (props) => {
  return (
    <>
        <button onClick={props.handleDelete}> Delete </button>
    </>
  )
}
