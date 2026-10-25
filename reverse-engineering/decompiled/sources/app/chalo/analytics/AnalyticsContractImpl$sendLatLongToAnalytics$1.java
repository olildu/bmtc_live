package app.chalo.analytics;

import app.chalo.location.LastKnownLocationProvider;
import app.chalo.location.LatLng;
import app.chalo.utils.chalologger.ChaloLog;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.analytics.AnalyticsContractImpl$sendLatLongToAnalytics$1", f = "AnalyticsContractImpl.kt", l = {171}, m = "invokeSuspend", v = 1)
final class AnalyticsContractImpl$sendLatLongToAnalytics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    int label;
    final /* synthetic */ AnalyticsContractImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsContractImpl$sendLatLongToAnalytics$1(AnalyticsContractImpl analyticsContractImpl, double d, double d2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = analyticsContractImpl;
        this.$latitude = d;
        this.$longitude = d2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticsContractImpl$sendLatLongToAnalytics$1(this.this$0, this.$latitude, this.$longitude, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticsContractImpl$sendLatLongToAnalytics$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                LastKnownLocationProvider lastKnownLocationProvider = this.this$0.h;
                LatLng latLng = new LatLng(this.$latitude, this.$longitude);
                this.label = 1;
                if (LastKnownLocationProvider.c(lastKnownLocationProvider, latLng, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            ChaloLog.c("AnalyticsContract", "failed to cache analytics lat long", e);
        }
        return Unit.f17538a;
    }
}
