package app.chalo.livetracking.routedetails.data.repository;

import app.chalo.datastore.RouteAvailabilityBannerStore;
import app.chalo.livetracking.routedetails.data.model.app.RouteAvailabilityBannerDetails;
import app.chalo.livetracking.routedetails.data.parser.RouteAvailabilityBannerParser;
import app.chalo.network.config.ChaloJson;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/repository/RouteAvailabilityBannerRepositoryImpl;", "Lapp/chalo/livetracking/routedetails/data/repository/RouteAvailabilityBannerRepository;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteAvailabilityBannerRepositoryImpl implements RouteAvailabilityBannerRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteAvailabilityBannerStore f4425a;

    public RouteAvailabilityBannerRepositoryImpl(RouteAvailabilityBannerStore routeAvailabilityBannerStore) {
        this.f4425a = routeAvailabilityBannerStore;
    }

    @Override // app.chalo.livetracking.routedetails.data.repository.RouteAvailabilityBannerRepository
    public final Object a(String str, Continuation continuation) {
        if (StringsKt.F(str)) {
            return null;
        }
        return this.f4425a.b(str, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.livetracking.routedetails.data.repository.RouteAvailabilityBannerRepository
    public final Object b(String str, String str2, String str3, Continuation continuation) {
        Object objC = this.f4425a.c(str, str2, str3, continuation);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.routedetails.data.repository.RouteAvailabilityBannerRepository
    public final Serializable c(String str, ContinuationImpl continuationImpl) {
        RouteAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1 routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1;
        Object objD;
        if (continuationImpl instanceof RouteAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1) {
            routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1 = (RouteAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1) continuationImpl;
            int i = routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1.label = i - Integer.MIN_VALUE;
            } else {
                routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1 = new RouteAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1(this, continuationImpl);
            }
        } else {
            routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1 = new RouteAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1(this, continuationImpl);
        }
        Object objA = routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (StringsKt.F(str)) {
                return (Serializable) MapsKt.d();
            }
            routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1.label = 1;
            objA = this.f4425a.a(str, routeAvailabilityBannerRepositoryImpl$getBannerDetailsForCity$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        String str2 = (String) objA;
        if (str2 == null) {
            return (Serializable) MapsKt.d();
        }
        if (StringsKt.F(str2)) {
            objD = MapsKt.d();
        } else {
            try {
                JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str2));
                MapBuilder mapBuilder = new MapBuilder();
                for (Map.Entry entry : jsonObjectG.f18198a.entrySet()) {
                    String str3 = (String) entry.getKey();
                    JsonElement jsonElement = (JsonElement) entry.getValue();
                    JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
                    RouteAvailabilityBannerDetails routeAvailabilityBannerDetailsC = jsonObject != null ? RouteAvailabilityBannerParser.c(jsonObject) : null;
                    if (routeAvailabilityBannerDetailsC != null) {
                        mapBuilder.put(str3, routeAvailabilityBannerDetailsC);
                    }
                }
                objD = mapBuilder.h();
            } catch (Throwable th) {
                String message = "Failed to parse route availability banner JSON: " + th.getMessage();
                Intrinsics.i(message, "message");
                objD = MapsKt.d();
            }
        }
        return (Serializable) objD;
    }
}
