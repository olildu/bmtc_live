package app.chalo.livetracking.universalsearch.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.universalsearch.data.model.api.PlaceLocation;
import app.chalo.livetracking.universalsearch.data.repository.TrackingRepository;
import app.chalo.location.LatLng;
import app.chalo.usecase.GetDistinctIdUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/FetchLatLngForPlaceWithPlaceIdUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchLatLngForPlaceWithPlaceIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackingRepository f5016a;
    public final GetDistinctIdUseCase b;
    public final BasicInfoContract c;

    public FetchLatLngForPlaceWithPlaceIdUseCase(TrackingRepository trackingRepository, GetDistinctIdUseCase getDistinctIdUseCase, BasicInfoContract basicInfoContract) {
        this.f5016a = trackingRepository;
        this.b = getDistinctIdUseCase;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        FetchLatLngForPlaceWithPlaceIdUseCase$invoke$1 fetchLatLngForPlaceWithPlaceIdUseCase$invoke$1;
        if (continuationImpl instanceof FetchLatLngForPlaceWithPlaceIdUseCase$invoke$1) {
            fetchLatLngForPlaceWithPlaceIdUseCase$invoke$1 = (FetchLatLngForPlaceWithPlaceIdUseCase$invoke$1) continuationImpl;
            int i = fetchLatLngForPlaceWithPlaceIdUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchLatLngForPlaceWithPlaceIdUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchLatLngForPlaceWithPlaceIdUseCase$invoke$1 = new FetchLatLngForPlaceWithPlaceIdUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchLatLngForPlaceWithPlaceIdUseCase$invoke$1 = new FetchLatLngForPlaceWithPlaceIdUseCase$invoke$1(this, continuationImpl);
        }
        FetchLatLngForPlaceWithPlaceIdUseCase$invoke$1 fetchLatLngForPlaceWithPlaceIdUseCase$invoke$2 = fetchLatLngForPlaceWithPlaceIdUseCase$invoke$1;
        Object objC = fetchLatLngForPlaceWithPlaceIdUseCase$invoke$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchLatLngForPlaceWithPlaceIdUseCase$invoke$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                TrackingRepository trackingRepository = this.f5016a;
                String strA = this.b.a(false);
                if (strA == null) {
                    strA = "";
                }
                String deviceId = this.c.getDeviceId();
                fetchLatLngForPlaceWithPlaceIdUseCase$invoke$2.label = 1;
                objC = trackingRepository.c(str, str2, strA, deviceId, fetchLatLngForPlaceWithPlaceIdUseCase$invoke$2);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            PlaceLocation placeLocation = (PlaceLocation) objC;
            Double d = placeLocation.b;
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            Double d2 = placeLocation.f4979a;
            return new LatLng(dDoubleValue, d2 != null ? d2.doubleValue() : 0.0d);
        } catch (Exception unused) {
            return null;
        }
    }
}
