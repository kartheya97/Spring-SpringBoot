import { PropTypes } from 'prop-types';
export default function CounterButton({by,incrementMethod,decrementMethod}){

    /* If you want to define styling in jsx you need to put here but recommended way is 
     * to put the stylings in the CSS file.
    const incrementButtonStyle = {
                 fontSize:"30px",
                 backgroundColor:"orange",
                 width:"100px",
                 margin:"10px",
                 color:"white",
                 padding:"15px",
                 borderRadius:"30px"
                };
    */
    return(
        <div className="Counter">
            <div>
               <button className="incrementButton" 
                       onClick={()=>incrementMethod(by)}>
                +{by}
                </button>
                <button className='decrementButton'
                        onClick={()=>decrementMethod(by)}>
                -{by}
                </button>
            </div>
            
        </div>
    )
}

CounterButton.propTypes = {
    by: PropTypes.number
}

CounterButton.defaultProps = {
    by:1
}