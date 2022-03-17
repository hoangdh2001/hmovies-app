package com.codingtok.hmovies.ui.related

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codingtok.common.MultipleStatusView
import com.codingtok.hmovies.R
import com.codingtok.hmovies.data.model.Movie
import com.codingtok.hmovies.databinding.RelatedMovieFragmentBinding
import com.codingtok.hmovies.ui.base.BaseListAdapter
import com.codingtok.hmovies.ui.base.refresh.BaseRefreshFragment
import com.codingtok.hmovies.ui.widget.OnItemClickListener
import dagger.hilt.android.AndroidEntryPoint

private const val ARG_MOVIE_ID = "movieId"

@AndroidEntryPoint
class RelatedMovieFragment :
    BaseRefreshFragment<RelatedMovieFragmentBinding, RelatedMovieViewModel, Movie.Slim>() {

    private var movieId: Int? = null

    companion object {
        @JvmStatic
        fun newInstance(movieId: Int) =
            RelatedMovieFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_MOVIE_ID, movieId)
                }
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            movieId = it.getInt(ARG_MOVIE_ID)
        }
    }

    override val viewModel: RelatedMovieViewModel by viewModels()
    override val layoutId: Int = R.layout.related_movie_fragment

    override fun setupRefresh() {
        super.setupRefresh()
        movieId?.let { viewModel.firstLoad(it) }
    }

    override fun handleLoading(isLoading: Boolean) {

    }

    override fun handleErrorMessage(message: String?) {

    }

    override val recyclerView: RecyclerView
        get() = viewBinding.recommendationsRecyclerview
    override val listAdapter: BaseListAdapter<Movie.Slim, out ViewDataBinding> by lazy {
        RelatedMovieListAdapter(onItemClickListener = mOnItemClicK)
    }

    private val mOnItemClicK: OnItemClickListener = object : OnItemClickListener {
        override fun onItemClick(obj: Any?, position: Int) {
        }
    }
    override val mLayoutStatusView: MultipleStatusView
        get() = viewBinding.layoutStatusView

    override fun getLayoutManager(): RecyclerView.LayoutManager = GridLayoutManager(context, 3, RecyclerView.VERTICAL, false)


    override fun lazyLoad() {

    }

    override fun handleRefresh(isRefreshing: Boolean) {

    }

    override fun handleEmpty(isEmptyList: Boolean) {

    }
}