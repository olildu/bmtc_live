package app.chalo.livetracking.universalsearch.data.repository;

import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiRequestModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/repository/TrackingRepository;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TrackingRepository {
    Object a(AutoCompleteResultApiRequestModel.Default r1, ContinuationImpl continuationImpl);

    Object b(AutoCompleteResultApiRequestModel.Default r1, ContinuationImpl continuationImpl);

    Object c(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl);

    Object d(AutoCompleteResultApiRequestModel.Place place, ContinuationImpl continuationImpl);
}
