import React from 'react'
import { useState } from 'react';

function Rating(props) {
    
    const[count, setCount] =useState(0);
    const[rating, setRating] = useState(0);
    const[hover, setHover] = useState(0);

    const ratingChoices = Array.from({ length: 5 }, (_, index) => index + 1);

    const increment = () => setCount(count + 1);

    const decrement = () => setCount(count - 1);

    const feedbackMessages = ['Very Bad', 'Bad', 'Average', 'Good', 'Excellent'];

  return (
    <>
    <div className='rating-container'>
        <h1>{props.heading}</h1>
        <div className='stars'>
            {ratingChoices.map((star) => (
                <span key={star} 
                    className={`star ${star <= (hover || rating) ? 'star-active' : ''}`}
                    onClick={() => setRating(star)}
                    onMouseEnter={() => setHover(star)}
                    onMouseLeave={() => setHover(0)}

                    // onClick={() =>clicked(star)}
                    // onMouseEnter={() => hovered('enter')} 
                    // onMouseLeave={() => hovered('leave')}
                    >
                        {'\u2605'}
                </span>
                ))}
        </div>
        
        <h3>You rated us : {rating}</h3>
        {
            rating > 0 && <p className="feedback">{feedbackMessages[rating - 1]}</p>
        }
        <button className="reset-btn" onClick={() => setRating(0)}>
            Reset
        </button>

        <button className="submit-btn" onClick={() => {
            setRating(0)
            alert("Thanks for rating");
            }
        }>
            Submit
        </button>



    </div>
    <div className='usestate-example'>

        <button className='btn' onClick={() => increment()}>
            Increment
        </button>

        <h3>Count: {count}</h3>

        <button className='btn' onClick={() => decrement()}>
            Decrement
        </button>
    </div>
    </>
  )
}

export default Rating