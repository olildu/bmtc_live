package app.chalo.usecase;

import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/FetchCurrentLocationUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchCurrentLocationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloLocationManager f10174a;
    public final CityProvider b;

    public FetchCurrentLocationUseCase(ChaloLocationManager chaloLocationManager, CityProvider cityProvider) {
        this.f10174a = chaloLocationManager;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        FetchCurrentLocationUseCase$invoke$1 fetchCurrentLocationUseCase$invoke$1;
        CityAppModel cityAppModel;
        if (continuationImpl instanceof FetchCurrentLocationUseCase$invoke$1) {
            fetchCurrentLocationUseCase$invoke$1 = (FetchCurrentLocationUseCase$invoke$1) continuationImpl;
            int i = fetchCurrentLocationUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchCurrentLocationUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchCurrentLocationUseCase$invoke$1 = new FetchCurrentLocationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchCurrentLocationUseCase$invoke$1 = new FetchCurrentLocationUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchCurrentLocationUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchCurrentLocationUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            fetchCurrentLocationUseCase$invoke$1.Z$0 = z;
            fetchCurrentLocationUseCase$invoke$1.label = 1;
            objA = this.f10174a.a(fetchCurrentLocationUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = fetchCurrentLocationUseCase$invoke$1.Z$0;
            ResultKt.b(objA);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        if (latLngA != null) {
            CityProvider cityProvider = this.b;
            CityAppModel cityAppModel2 = (CityAppModel) cityProvider.b().getValue();
            if (cityAppModel2 != null && CityAppModelKt.b(cityAppModel2, latLngA)) {
                return latLngA;
            }
            if (z && (cityAppModel = (CityAppModel) cityProvider.b().getValue()) != null) {
                return cityAppModel.d;
            }
        }
        return null;
    }
}
