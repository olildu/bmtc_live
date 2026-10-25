package app.chalo.location;

import app.chalo.utils.chalologger.ChaloLog;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/location/LatLng;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.LastKnownLocationProvider$getRawLatLng$2", f = "LastKnownLocationProvider.kt", l = {71, 76}, m = "invokeSuspend", v = 1)
final class LastKnownLocationProvider$getRawLatLng$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super LatLng>, Object> {
    final /* synthetic */ long $maxAgeMillis;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LastKnownLocationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastKnownLocationProvider$getRawLatLng$2(LastKnownLocationProvider lastKnownLocationProvider, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lastKnownLocationProvider;
        this.$maxAgeMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LastKnownLocationProvider$getRawLatLng$2(this.this$0, this.$maxAgeMillis, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LastKnownLocationProvider$getRawLatLng$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LastKnownLocationProvider lastKnownLocationProvider;
        StoredLocation storedLocation;
        StoredLocation storedLocation2;
        long jLongValue;
        long j;
        long j2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            LastKnownLocationStorage lastKnownLocationStorage = this.this$0.f5133a;
            this.label = 1;
            obj = lastKnownLocationStorage.c(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            storedLocation = (StoredLocation) this.L$2;
            lastKnownLocationProvider = (LastKnownLocationProvider) this.L$1;
            storedLocation2 = (StoredLocation) this.L$0;
            ResultKt.b(obj);
        }
        jLongValue = ((Number) obj).longValue();
        long j3 = this.$maxAgeMillis;
        int i2 = LastKnownLocationProvider.e;
        lastKnownLocationProvider.getClass();
        j = storedLocation.c;
        if (j > 0) {
            j2 = jLongValue - j;
            if (j2 < 0) {
                StringBuilder sbG = i71.g(j2, "Clock skew detected while reading cache age=", " now=");
                sbG.append(jLongValue);
                sbG.append(" stored=");
                sbG.append(j);
                ChaloLog.c("LastKnownLocation", sbG.toString(), null);
            } else if (0 <= j2 && j2 <= j3) {
                return new LatLng(storedLocation2.f5160a, storedLocation2.b);
            }
        }
        String message = "raw lookup stale for maxAge=" + this.$maxAgeMillis;
        Intrinsics.i(message, "message");
        return null;
        StoredLocation storedLocation3 = (StoredLocation) obj;
        if (storedLocation3 == null) {
            String message2 = "raw lookup missing for maxAge=" + this.$maxAgeMillis;
            Intrinsics.i(message2, "message");
            return null;
        }
        lastKnownLocationProvider = this.this$0;
        Function1 function1 = lastKnownLocationProvider.c;
        this.L$0 = storedLocation3;
        this.L$1 = lastKnownLocationProvider;
        this.L$2 = storedLocation3;
        this.label = 2;
        Object objInvoke = function1.invoke(this);
        if (objInvoke != coroutineSingletons) {
            storedLocation = storedLocation3;
            obj = objInvoke;
            storedLocation2 = storedLocation;
            jLongValue = ((Number) obj).longValue();
            long j4 = this.$maxAgeMillis;
            int i3 = LastKnownLocationProvider.e;
            lastKnownLocationProvider.getClass();
            j = storedLocation.c;
            if (j > 0) {
                j2 = jLongValue - j;
                if (j2 < 0) {
                    StringBuilder sbG2 = i71.g(j2, "Clock skew detected while reading cache age=", " now=");
                    sbG2.append(jLongValue);
                    sbG2.append(" stored=");
                    sbG2.append(j);
                    ChaloLog.c("LastKnownLocation", sbG2.toString(), null);
                } else if (0 <= j2) {
                    return new LatLng(storedLocation2.f5160a, storedLocation2.b);
                }
            }
            String message3 = "raw lookup stale for maxAge=" + this.$maxAgeMillis;
            Intrinsics.i(message3, "message");
            return null;
        }
        return coroutineSingletons;
    }
}
