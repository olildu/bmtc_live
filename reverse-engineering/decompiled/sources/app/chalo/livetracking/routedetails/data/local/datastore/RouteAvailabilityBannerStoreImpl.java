package app.chalo.livetracking.routedetails.data.local.datastore;

import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.RouteAvailabilityBannerStore;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/local/datastore/RouteAvailabilityBannerStoreImpl;", "Lapp/chalo/datastore/RouteAvailabilityBannerStore;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteAvailabilityBannerStoreImpl implements RouteAvailabilityBannerStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f4388a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/local/datastore/RouteAvailabilityBannerStoreImpl$Companion;", "", "", "DATA_STORE_NAME", "Ljava/lang/String;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RouteAvailabilityBannerStoreImpl(LocalDataStore localDataStore) {
        this.f4388a = localDataStore;
    }

    @Override // app.chalo.datastore.RouteAvailabilityBannerStore
    public final Object a(String str, Continuation continuation) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return this.f4388a.f(lowerCase.concat("citySpecificAvailabilityInfo"), (ContinuationImpl) continuation);
    }

    @Override // app.chalo.datastore.RouteAvailabilityBannerStore
    public final Object b(String str, ContinuationImpl continuationImpl) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return this.f4388a.f(lowerCase.concat("cachedVersionCode"), continuationImpl);
    }

    @Override // app.chalo.datastore.RouteAvailabilityBannerStore
    public final Object c(String str, String str2, String str3, Continuation continuation) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        Object objI = this.f4388a.i(CollectionsKt.S(new Pair(lowerCase.concat("citySpecificAvailabilityInfo"), str2), new Pair(lowerCase.concat("cachedVersionCode"), str3)), (ContinuationImpl) continuation);
        return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : Unit.f17538a;
    }
}
