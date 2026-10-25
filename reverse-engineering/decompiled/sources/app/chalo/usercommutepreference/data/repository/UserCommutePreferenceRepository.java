package app.chalo.usercommutepreference.data.repository;

import app.chalo.usercommutepreference.data.remote.request.SaveCommutePreferenceRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.SaveRideRequestApiModel;
import app.chalo.usercommutepreference.data.remote.request.SaveStopPlaceRequestApiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/data/repository/UserCommutePreferenceRepository;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserCommutePreferenceRepository {
    Flow a(String str, String str2);

    Flow b(String str, String str2);

    Object c(String str, String str2, ContinuationImpl continuationImpl);

    Object d(String str, ContinuationImpl continuationImpl);

    Object e(SaveRideRequestApiModel saveRideRequestApiModel, String str, ContinuationImpl continuationImpl);

    Object f(List list, String str, String str2, Continuation continuation);

    Object g(String str, String str2, ContinuationImpl continuationImpl);

    Object h(List list, String str, String str2, Continuation continuation);

    Flow i(String str, String str2, String str3, String str4);

    Object j(SaveCommutePreferenceRequestApiModel saveCommutePreferenceRequestApiModel, String str, ContinuationImpl continuationImpl);

    Object k(SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel, String str, ContinuationImpl continuationImpl);
}
