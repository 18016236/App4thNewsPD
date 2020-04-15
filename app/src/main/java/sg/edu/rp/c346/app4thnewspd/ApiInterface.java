package sg.edu.rp.c346.app4thnewspd;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import sg.edu.rp.c346.app4thnewspd.Model.Headlines;

public interface ApiInterface {

    @GET("top-headlines")
    Call<Headlines>getHeadLines(
      @Query("country")String country,
      @Query("apiKey") String apiKey
    );

    @GET("everything")
    Call<Headlines>getSpecificData(
            @Query("q")String query,
            @Query("apiKey") String apiKey
    );
}
