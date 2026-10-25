package app.chalo.datastore;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/datastore/NoOpRouteAvailabilityBannerStore;", "Lapp/chalo/datastore/RouteAvailabilityBannerStore;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoOpRouteAvailabilityBannerStore implements RouteAvailabilityBannerStore {
    @Override // app.chalo.datastore.RouteAvailabilityBannerStore
    public final Object a(String str, Continuation continuation) {
        return null;
    }

    @Override // app.chalo.datastore.RouteAvailabilityBannerStore
    public final Object b(String str, ContinuationImpl continuationImpl) {
        return null;
    }

    @Override // app.chalo.datastore.RouteAvailabilityBannerStore
    public final Object c(String str, String str2, String str3, Continuation continuation) {
        return Unit.f17538a;
    }
}
