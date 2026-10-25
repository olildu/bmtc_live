package app.chalo.location;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2", f = "ChaloLocationManagerImpl.kt", l = {166, 175, 177}, m = "invokeSuspend", v = 1)
final class ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2 extends SuspendLambda implements Function3<FlowCollector<? super LocationManagerResult.LocationUpdateStatus>, LocationManagerResult.LocationUpdateStatus, Continuation<? super Unit>, Object> {
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChaloLocationManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2(ChaloLocationManagerImpl chaloLocationManagerImpl, Continuation continuation) {
        super(3, continuation);
        this.this$0 = chaloLocationManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2 chaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2 = new ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2(this.this$0, (Continuation) obj3);
        chaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2.L$0 = (FlowCollector) obj;
        chaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2.L$1 = (LocationManagerResult.LocationUpdateStatus) obj2;
        return chaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046 A[PHI: r4
      0x0046: PHI (r4v3 long) = (r4v1 long), (r4v2 long), (r4v5 long) binds: [B:15:0x003e, B:24:0x007a, B:7:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[PHI: r4
      0x0070: PHI (r4v2 long) = (r4v3 long), (r4v3 long), (r4v4 long) binds: [B:19:0x005f, B:21:0x006d, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:16:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            long r4 = r10.J$0
            kotlin.ResultKt.b(r11)
            goto L46
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            long r4 = r10.J$0
            kotlin.ResultKt.b(r11)
            goto L70
        L23:
            kotlin.ResultKt.b(r11)
            goto L3e
        L27:
            kotlin.ResultKt.b(r11)
            java.lang.Object r11 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r1 = r10.L$1
            app.chalo.location.LocationManagerResult$LocationUpdateStatus r1 = (app.chalo.location.LocationManagerResult.LocationUpdateStatus) r1
            r5 = 0
            r10.L$0 = r5
            r10.label = r4
            java.lang.Object r11 = r11.emit(r1, r10)
            if (r11 != r0) goto L3e
            goto L7c
        L3e:
            app.chalo.location.ChaloLocationManagerImpl r11 = r10.this$0
            app.chalo.contract.BasicInfoContract r11 = r11.b
            long r4 = r11.e()
        L46:
            kotlin.coroutines.CoroutineContext r11 = r10.getContext()
            boolean r11 = kotlinx.coroutines.JobKt.h(r11)
            kotlin.Unit r1 = kotlin.Unit.f17538a
            if (r11 == 0) goto L7d
            app.chalo.location.ChaloLocationManagerImpl r11 = r10.this$0
            app.chalo.contract.BasicInfoContract r11 = r11.b
            long r6 = r11.e()
            long r6 = r6 - r4
            r8 = 5000(0x1388, double:2.4703E-320)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L70
            app.chalo.location.ChaloLocationManagerImpl r11 = r10.this$0
            kotlinx.coroutines.flow.SharedFlowImpl r11 = r11.g
            r10.J$0 = r4
            r10.label = r3
            java.lang.Object r11 = r11.emit(r1, r10)
            if (r11 != r0) goto L70
            goto L7c
        L70:
            r10.J$0 = r4
            r10.label = r2
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.b(r6, r10)
            if (r11 != r0) goto L46
        L7c:
            return r0
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.location.ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
