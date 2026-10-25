package app.chalo.location;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/location/LastKnownLocationProvider;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LastKnownLocationProvider {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LastKnownLocationStorage f5133a;
    public final CoroutineContext b;
    public final Function1 c;
    public final MutexImpl d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R*\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lapp/chalo/location/LastKnownLocationProvider$Companion;", "", "", "PREFS_NAME", "Ljava/lang/String;", "SETTINGS_NAME", "STORAGE_KEY_LATITUDE", "STORAGE_KEY_LONGITUDE", "STORAGE_KEY_TIMESTAMP", "STORAGE_KEY_SNAPSHOT", "", "DEFAULT_MAX_AGE_MS", "J", "", "DEFAULT_DECIMALS", "I", "", "MIN_UPDATE_DISTANCE_METERS", "F", "MIN_UPDATE_INTERVAL_MS", "TAG", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "defaultClock", "Lkotlin/jvm/functions/Function1;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        new LastKnownLocationProvider$Companion$defaultClock$1(1, null);
    }

    public LastKnownLocationProvider(LastKnownLocationStorage lastKnownLocationStorage, CoroutineContext ioContext, Function1 function1) {
        Intrinsics.i(ioContext, "ioContext");
        this.f5133a = lastKnownLocationStorage;
        this.b = ioContext;
        this.c = function1;
        this.d = MutexKt.a();
    }

    public static double b(double d, int i) {
        if (i <= 0) {
            return Math.rint(d);
        }
        double dPow = Math.pow(10.0d, i);
        return Math.rint(d * dPow) / dPow;
    }

    public static Object c(LastKnownLocationProvider lastKnownLocationProvider, LatLng latLng, ContinuationImpl continuationImpl) throws Throwable {
        Object objG = BuildersKt.g(lastKnownLocationProvider.b, new LastKnownLocationProvider$update$2(lastKnownLocationProvider, null, latLng, null), continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, long j, ContinuationImpl continuationImpl) throws Throwable {
        LastKnownLocationProvider$getCoarseLatLng$1 lastKnownLocationProvider$getCoarseLatLng$1;
        if (continuationImpl instanceof LastKnownLocationProvider$getCoarseLatLng$1) {
            lastKnownLocationProvider$getCoarseLatLng$1 = (LastKnownLocationProvider$getCoarseLatLng$1) continuationImpl;
            int i2 = lastKnownLocationProvider$getCoarseLatLng$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lastKnownLocationProvider$getCoarseLatLng$1.label = i2 - Integer.MIN_VALUE;
            } else {
                lastKnownLocationProvider$getCoarseLatLng$1 = new LastKnownLocationProvider$getCoarseLatLng$1(this, continuationImpl);
            }
        } else {
            lastKnownLocationProvider$getCoarseLatLng$1 = new LastKnownLocationProvider$getCoarseLatLng$1(this, continuationImpl);
        }
        Object objG = lastKnownLocationProvider$getCoarseLatLng$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lastKnownLocationProvider$getCoarseLatLng$1.label;
        if (i3 == 0) {
            ResultKt.b(objG);
            lastKnownLocationProvider$getCoarseLatLng$1.I$0 = i;
            lastKnownLocationProvider$getCoarseLatLng$1.label = 1;
            objG = BuildersKt.g(this.b, new LastKnownLocationProvider$getRawLatLng$2(this, j, null), lastKnownLocationProvider$getCoarseLatLng$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = lastKnownLocationProvider$getCoarseLatLng$1.I$0;
            ResultKt.b(objG);
        }
        LatLng latLng = (LatLng) objG;
        if (latLng == null) {
            return null;
        }
        double dB = b(latLng.f5134a, i);
        double dB2 = b(latLng.b, i);
        String message = "coarse lookup hit decimals=" + i;
        Intrinsics.i(message, "message");
        return new LatLng(dB, dB2);
    }
}
