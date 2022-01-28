import Pagination from "components/Pagination";
import MovieCard from "components/MovieCard";
function Listing(){

    return (
        <> 

        <Pagination />

        <div className="container">
            <div className="row">
                <div className="col-sm-6 col-lg-4 col-x1-3 bm-3">
                 <MovieCard />
                </div>
                <div className="col-sm-6 col-lg-4 col-x1-3 bm-3">
                 <MovieCard />
                </div>
                <div className="col-sm-6 col-lg-4 col-x1-3 bm-3">
                 <MovieCard />
                </div>
                <div className="col-sm-6 col-lg-4 col-x1-3 bm-3">
                 <MovieCard />
                </div>
                <div className="col-sm-6 col-lg-4 col-x1-3 bm-3">
                 <MovieCard />
                </div>
            </div>
       </div>
        </>
    );
}

export default Listing;