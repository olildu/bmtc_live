package app.chalo.routeselection.data.repository;

import app.chalo.productbooking.common.data.models.api.response.OriginDestinationApiModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.routeselection.data.remote.RouteSelectionRemoteDataSource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/routeselection/data/repository/RouteSelectionRepositoryImpl;", "Lapp/chalo/routeselection/data/repository/RouteSelectionRepository;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteSelectionRepositoryImpl implements RouteSelectionRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteSelectionRemoteDataSource f9177a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/routeselection/data/repository/RouteSelectionRepositoryImpl$Companion;", "", "", "PARAM_FROM_STOP_ID", "Ljava/lang/String;", "PARAM_TO_STOP_ID", "PARAM_MTICKETING_ENABLED", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RouteSelectionRepositoryImpl(RouteSelectionRemoteDataSource routeSelectionRemoteDataSource) {
        this.f9177a = routeSelectionRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.routeselection.data.repository.RouteSelectionRepository
    public final Serializable a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RouteSelectionRepositoryImpl$fetchRoutesForSelectedStops$1 routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1;
        if (continuationImpl instanceof RouteSelectionRepositoryImpl$fetchRoutesForSelectedStops$1) {
            routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1 = (RouteSelectionRepositoryImpl$fetchRoutesForSelectedStops$1) continuationImpl;
            int i = routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1.label = i - Integer.MIN_VALUE;
            } else {
                routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1 = new RouteSelectionRepositoryImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
            }
        } else {
            routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1 = new RouteSelectionRepositoryImpl$fetchRoutesForSelectedStops$1(this, continuationImpl);
        }
        Object objA = routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("fromStopId", str);
            linkedHashMap.put("toStopId", str2);
            linkedHashMap.put("mTicketEnabled", "true");
            routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1.label = 1;
            objA = this.f9177a.a(linkedHashMap, str3, routeSelectionRepositoryImpl$fetchRoutesForSelectedStops$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objA).iterator();
        while (it.hasNext()) {
            OriginDestinationAppModel originDestinationAppModelA = ((OriginDestinationApiModel) it.next()).a(true, true, true, true, (31 & 16) == 0);
            if (originDestinationAppModelA != null) {
                arrayList.add(originDestinationAppModelA);
            }
        }
        return arrayList;
    }
}
