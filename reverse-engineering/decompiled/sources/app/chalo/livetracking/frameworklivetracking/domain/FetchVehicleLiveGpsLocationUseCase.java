package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.frameworklivetracking.data.repository.LiveTrackingFrameworkRepository;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/FetchVehicleLiveGpsLocationUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchVehicleLiveGpsLocationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4323a;
    public final LiveTrackingFrameworkRepository b;
    public final BasicInfoContract c;

    public FetchVehicleLiveGpsLocationUseCase(CityProvider cityProvider, LiveTrackingFrameworkRepository liveTrackingFrameworkRepository, BasicInfoContract basicInfoContract) {
        this.f4323a = cityProvider;
        this.b = liveTrackingFrameworkRepository;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r11 == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.domain.FetchVehicleLiveGpsLocationUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, ContinuationImpl continuationImpl) {
        FetchVehicleLiveGpsLocationUseCase$isStaleData$1 fetchVehicleLiveGpsLocationUseCase$isStaleData$1;
        if (continuationImpl instanceof FetchVehicleLiveGpsLocationUseCase$isStaleData$1) {
            fetchVehicleLiveGpsLocationUseCase$isStaleData$1 = (FetchVehicleLiveGpsLocationUseCase$isStaleData$1) continuationImpl;
            int i = fetchVehicleLiveGpsLocationUseCase$isStaleData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchVehicleLiveGpsLocationUseCase$isStaleData$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchVehicleLiveGpsLocationUseCase$isStaleData$1 = new FetchVehicleLiveGpsLocationUseCase$isStaleData$1(this, continuationImpl);
            }
        } else {
            fetchVehicleLiveGpsLocationUseCase$isStaleData$1 = new FetchVehicleLiveGpsLocationUseCase$isStaleData$1(this, continuationImpl);
        }
        Object objC = fetchVehicleLiveGpsLocationUseCase$isStaleData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchVehicleLiveGpsLocationUseCase$isStaleData$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            fetchVehicleLiveGpsLocationUseCase$isStaleData$1.J$0 = j;
            fetchVehicleLiveGpsLocationUseCase$isStaleData$1.label = 1;
            objC = this.c.c(fetchVehicleLiveGpsLocationUseCase$isStaleData$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = fetchVehicleLiveGpsLocationUseCase$isStaleData$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(((int) ((((Number) objC).longValue() - j) / ((long) 1000))) >= 900);
    }
}
