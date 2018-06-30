package me.jdocter.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel // indicates class is parcelable
public class Movie {

    // values from API
    String title;
    String overview;
    String posterPath; // not full url
    String backdropPath;
    Double voteAverage;

    // no-arg, empty constructor for parceler
    public Movie() {}

    // initiate from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() { return backdropPath; }

    public Double getVoteAverage() { return voteAverage; }
}
