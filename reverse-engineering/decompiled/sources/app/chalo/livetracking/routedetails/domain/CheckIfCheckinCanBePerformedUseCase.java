package app.chalo.livetracking.routedetails.domain;

import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.network.NetworkStateManagerKt;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.GpsState;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/domain/CheckIfCheckinCanBePerformedUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfCheckinCanBePerformedUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkStateManager f4426a;
    public final ChaloLocationManager b;

    public CheckIfCheckinCanBePerformedUseCase(NetworkStateManager networkStateManager, ChaloLocationManager chaloLocationManager) {
        this.f4426a = networkStateManager;
        this.b = chaloLocationManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        CheckIfCheckinCanBePerformedUseCase$invoke$1 checkIfCheckinCanBePerformedUseCase$invoke$1;
        if (continuationImpl instanceof CheckIfCheckinCanBePerformedUseCase$invoke$1) {
            checkIfCheckinCanBePerformedUseCase$invoke$1 = (CheckIfCheckinCanBePerformedUseCase$invoke$1) continuationImpl;
            int i = checkIfCheckinCanBePerformedUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIfCheckinCanBePerformedUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIfCheckinCanBePerformedUseCase$invoke$1 = new CheckIfCheckinCanBePerformedUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkIfCheckinCanBePerformedUseCase$invoke$1 = new CheckIfCheckinCanBePerformedUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = checkIfCheckinCanBePerformedUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIfCheckinCanBePerformedUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!NetworkStateManagerKt.a(this.f4426a)) {
                return new ChaloUseCaseResult.Failure(CheckinNotAvailableReason.NO_INTERNET);
            }
            checkIfCheckinCanBePerformedUseCase$invoke$1.label = 1;
            objB = this.b.b(checkIfCheckinCanBePerformedUseCase$invoke$1);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return objB != GpsState.ENABLED ? new ChaloUseCaseResult.Failure(CheckinNotAvailableReason.GPS_DISABLED) : new ChaloUseCaseResult.Success(Boolean.TRUE);
    }
}
