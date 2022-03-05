package com.codingtok.hmovies.data.network.helper.impl

import com.codingtok.hmovies.data.model.Movie
import com.codingtok.hmovies.data.model.Page
import com.codingtok.hmovies.data.network.helper.DiscoverHelper
import com.codingtok.hmovies.data.network.service.discover.Discover
import com.codingtok.hmovies.data.network.service.discover.DiscoverService
import com.codingtok.hmovies.utils.Resource
import com.haroldadmin.cnradapter.NetworkResponse
import javax.inject.Inject

class DiscoverHelperImpl @Inject
constructor(private val discoverService: DiscoverService): DiscoverHelper {

    override suspend fun getMoviesDiscover(
        options: Discover.MovieBuilder,
        languageTag: String?,
        page: Int
    ): Resource<Page<Movie.Slim>> {
        return when(val discoverResponse = discoverService.getMoviesDiscover(options, languageTag, page)) {
            is NetworkResponse.Success -> {
                Resource.success(discoverResponse.body)
            }
            is NetworkResponse.NetworkError -> {
                Resource.error(discoverResponse.error.message)
            }
            is NetworkResponse.ServerError -> {
                Resource.error(discoverResponse.error.message, discoverResponse.body)
            }
            is NetworkResponse.UnknownError -> {
                Resource.error(discoverResponse.error.message)
            }
        }
    }

}