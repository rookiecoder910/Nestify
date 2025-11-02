import com.example.nestify.data.ListingDto
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.from
import io.github.jan.supabase.postgrest.query.Returning

class ListingRepository(private val supabase: SupabaseClient) {


     // Fetches all listings from the database.

    suspend fun getAllListings(): List<ListingDto> {
        return supabase
            .from("listings")
            .select()
            .decodeList<ListingDto>()
    }


     // Fetches a single listing by its unique ID.

    suspend fun getListingById(id: Int): ListingDto? {
        return supabase
            .from("listings")
            .select {
                filter {
                    eq("id", id)
                }
            }
            .decodeSingleOrNull<ListingDto>()
    }


     // Fetches all listings that match a specific category.

    suspend fun getListingsByCategory(category: String): List<ListingDto> {
        return supabase
            .from("listings")
            .select {
                filter {
                    eq("category", category)
                }
            }
            .decodeList<ListingDto>()
    }


    //Searches for listings where the title contains the search query (case-insensitive).

    suspend fun searchListings(query: String): List<ListingDto> {
        return supabase
            .from("listings")
            .select {
                filter {
                    ilike("title", "%$query%")
                }
            }
            .decodeList<ListingDto>()
    }


     // Inserts a new listing into the database.

    suspend fun insertListing(listing: ListingDto): ListingDto {
        return supabase
            .from("listings")
            .insert(listing) {
                select()
            }
            .decodeSingle<ListingDto>()
    }


      //Updates an existing listing.

    suspend fun updateListing(id: Int, listing: ListingDto): ListingDto {
        return supabase
            .from("listings")
            .update(listing) {
                filter {
                    eq("id", id)
                }
                select()
            }
            .decodeSingle<ListingDto>()
    }


      //Deletes a listing from the database.

    suspend fun deleteListing(id: Int) {
        supabase
            .from("listings")
            .delete {
                filter {
                    eq("id", id)
                }
            }
    }
}