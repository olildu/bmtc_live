package app.chalo.livetracking.routedetails.domain;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/GetNearestStopToCurrentLocationUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNearestStopToCurrentLocationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4432a;
    public final ChaloLocationManager b;

    public GetNearestStopToCurrentLocationUseCase(ChaloLocationManager chaloLocationManager, CityProvider cityProvider) {
        this.f4432a = cityProvider;
        this.b = chaloLocationManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        GetNearestStopToCurrentLocationUseCase$invoke$1 getNearestStopToCurrentLocationUseCase$invoke$1;
        Object obj;
        if (continuationImpl instanceof GetNearestStopToCurrentLocationUseCase$invoke$1) {
            getNearestStopToCurrentLocationUseCase$invoke$1 = (GetNearestStopToCurrentLocationUseCase$invoke$1) continuationImpl;
            int i = getNearestStopToCurrentLocationUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getNearestStopToCurrentLocationUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getNearestStopToCurrentLocationUseCase$invoke$1 = new GetNearestStopToCurrentLocationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getNearestStopToCurrentLocationUseCase$invoke$1 = new GetNearestStopToCurrentLocationUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getNearestStopToCurrentLocationUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getNearestStopToCurrentLocationUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            getNearestStopToCurrentLocationUseCase$invoke$1.L$0 = list;
            getNearestStopToCurrentLocationUseCase$invoke$1.label = 1;
            objA = this.b.a(getNearestStopToCurrentLocationUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) getNearestStopToCurrentLocationUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        if (locationAppModelA == null) {
            return new ChaloUseCaseResult.Failure(StopNotAvailableError.LOCATION_NOT_AVAILABLE);
        }
        LatLng latLngA = locationAppModelA.a();
        CityAppModel cityAppModel = (CityAppModel) this.f4432a.b().getValue();
        if (!(cityAppModel != null ? CityAppModelKt.b(cityAppModel, latLngA) : false)) {
            return new ChaloUseCaseResult.Failure(StopNotAvailableError.INVALID_LOCATION);
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dA = latLngA.a(((StopAppModel) next).c);
                do {
                    Object next2 = it.next();
                    double dA2 = latLngA.a(((StopAppModel) next2).c);
                    if (Double.compare(dA, dA2) > 0) {
                        next = next2;
                        dA = dA2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        StopAppModel stopAppModel = (StopAppModel) obj;
        return stopAppModel != null ? new ChaloUseCaseResult.Success(stopAppModel) : new ChaloUseCaseResult.Failure(StopNotAvailableError.STOP_NOT_AVAILABLE);
    }
}
