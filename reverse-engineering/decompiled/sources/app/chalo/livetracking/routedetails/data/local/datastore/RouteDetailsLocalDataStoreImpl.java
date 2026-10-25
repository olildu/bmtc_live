package app.chalo.livetracking.routedetails.data.local.datastore;

import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteAppModelKt;
import app.chalo.datastore.LocalDataStore;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.RouteRecentRepository;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/local/datastore/RouteDetailsLocalDataStoreImpl;", "Lapp/chalo/livetracking/routedetails/data/local/datastore/RouteDetailsLocalDataStore;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsLocalDataStoreImpl implements RouteDetailsLocalDataStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDataStore f4389a;
    public final RecentRepositoryProvider b;
    public final CityProvider c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/local/datastore/RouteDetailsLocalDataStoreImpl$Companion;", "", "", "ROUTE_DETAILS_LOCAL_STORE", "Ljava/lang/String;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RouteDetailsLocalDataStoreImpl(LocalDataStore localDataStore, RecentRepositoryProvider recentRepositoryProvider, CityProvider cityProvider) {
        this.f4389a = localDataStore;
        this.b = recentRepositoryProvider;
        this.c = cityProvider;
    }

    @Override // app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore
    public final Object a(String str, Continuation continuation) {
        return FlowKt.v(this.f4389a.e(PreferencesKeys.stringKey(str)), continuation);
    }

    @Override // app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore
    public final Object b(RouteAppModel routeAppModel, Continuation continuation) {
        RouteRecentRepository routeRecentRepositoryA = this.b.a();
        String strB = CityProviderKt.b(this.c);
        if (strB == null) {
            strB = "";
        }
        Object objF = routeRecentRepositoryA.f(RouteAppModelKt.a(routeAppModel, strB, RecentsSpecialStatus.FAVOURITE), true, (SuspendLambda) continuation);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : Unit.f17538a;
    }

    @Override // app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore
    public final Object c(String str, RecentsSpecialStatus recentsSpecialStatus, ContinuationImpl continuationImpl) {
        RouteRecentRepository routeRecentRepositoryA = this.b.a();
        String strB = CityProviderKt.b(this.c);
        if (strB == null) {
            strB = "";
        }
        return routeRecentRepositoryA.c(recentsSpecialStatus, str, strB, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore
    public final Object d(String str, ContinuationImpl continuationImpl) {
        RouteDetailsLocalDataStoreImpl$removeRouteAsFavourite$1 routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1;
        if (continuationImpl instanceof RouteDetailsLocalDataStoreImpl$removeRouteAsFavourite$1) {
            routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1 = (RouteDetailsLocalDataStoreImpl$removeRouteAsFavourite$1) continuationImpl;
            int i = routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1 = new RouteDetailsLocalDataStoreImpl$removeRouteAsFavourite$1(this, continuationImpl);
            }
        } else {
            routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1 = new RouteDetailsLocalDataStoreImpl$removeRouteAsFavourite$1(this, continuationImpl);
        }
        Object objC = routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.label;
        Unit unit = Unit.f17538a;
        CityProvider cityProvider = this.c;
        RecentRepositoryProvider recentRepositoryProvider = this.b;
        if (i2 == 0) {
            ResultKt.b(objC);
            RouteRecentRepository routeRecentRepositoryA = recentRepositoryProvider.a();
            String strB = CityProviderKt.b(cityProvider);
            if (strB == null) {
                strB = "";
            }
            RecentsSpecialStatus recentsSpecialStatus = RecentsSpecialStatus.FAVOURITE;
            routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.L$0 = str;
            routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.label = 1;
            objC = routeRecentRepositoryA.c(recentsSpecialStatus, str, strB, routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return unit;
        }
        str = (String) routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.L$0;
        ResultKt.b(objC);
        if (((Boolean) objC).booleanValue()) {
            RouteRecentRepository routeRecentRepositoryA2 = recentRepositoryProvider.a();
            String strB2 = CityProviderKt.b(cityProvider);
            String str2 = strB2 != null ? strB2 : "";
            routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.L$0 = null;
            routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1.label = 2;
            if (routeRecentRepositoryA2.b(str, str2, routeDetailsLocalDataStoreImpl$removeRouteAsFavourite$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    @Override // app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore
    public final Object e(String str, String str2, Continuation continuation) {
        Object objG = this.f4389a.g(PreferencesKeys.stringKey(str), str2, continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }
}
