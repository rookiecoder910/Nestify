package com.example.nestify.data

import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

object SupabaseClient {
    val client = createSupabaseClient(
        supabaseUrl = "https://zlfjejqjzqxlgxrhicuu.supabase.co",
        supabaseKey = "public-anon-key"
    ) {
        install(Postgrest)
        install(Auth)
        // install(Storage) // optional, if needed later
    }
}
