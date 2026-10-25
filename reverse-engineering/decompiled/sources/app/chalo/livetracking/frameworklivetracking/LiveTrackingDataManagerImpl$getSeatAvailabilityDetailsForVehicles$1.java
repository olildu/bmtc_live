package app.chalo.livetracking.frameworklivetracking;

import app.chalo.livetracking.routedetails.data.model.app.response.SeatAvailabilityAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/livetracking/routedetails/data/model/app/response/SeatAvailabilityAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1", f = "LiveTrackingDataManagerImpl.kt", l = {230, 235, 237}, m = "invokeSuspend", v = 1)
final class LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1 extends SuspendLambda implements Function2<FlowCollector<? super SeatAvailabilityAppModel>, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $seatAvailabilityId;
    final /* synthetic */ long $timeIntervalInMillis;
    final /* synthetic */ Function0<List<String>> $updatedVehicleNumberList;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LiveTrackingDataManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1(LiveTrackingDataManagerImpl liveTrackingDataManagerImpl, int i, Function0 function0, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = liveTrackingDataManagerImpl;
        this.$seatAvailabilityId = i;
        this.$updatedVehicleNumberList = function0;
        this.$timeIntervalInMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1 liveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1 = new LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1(this.this$0, this.$seatAvailabilityId, this.$updatedVehicleNumberList, this.$timeIntervalInMillis, continuation);
        liveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1.L$0 = obj;
        return liveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[PHI: r1
      0x0068: PHI (r1v1 kotlinx.coroutines.flow.FlowCollector) = 
      (r1v2 kotlinx.coroutines.flow.FlowCollector)
      (r1v2 kotlinx.coroutines.flow.FlowCollector)
      (r1v11 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:19:0x0057, B:21:0x0065, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r5, r8) == r0) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r9)
        L16:
            r9 = r1
            goto L37
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r9)
            goto L68
        L28:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r9)
            goto L53
        L30:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
        L37:
            app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl r1 = r8.this$0
            app.chalo.livetracking.frameworklivetracking.domain.GetSeatAvailabilityUseCase r1 = r1.b
            int r5 = r8.$seatAvailabilityId
            kotlin.jvm.functions.Function0<java.util.List<java.lang.String>> r6 = r8.$updatedVehicleNumberList
            java.lang.Object r6 = r6.invoke()
            java.util.List r6 = (java.util.List) r6
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r1 = r1.a(r5, r6, r8)
            if (r1 != r0) goto L50
            goto L74
        L50:
            r7 = r1
            r1 = r9
            r9 = r7
        L53:
            app.chalo.utils.ChaloUseCaseResult r9 = (app.chalo.utils.ChaloUseCaseResult) r9
            boolean r5 = r9 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r5 == 0) goto L68
            app.chalo.utils.ChaloUseCaseResult$Success r9 = (app.chalo.utils.ChaloUseCaseResult.Success) r9
            java.lang.Object r9 = r9.f10419a
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L68
            goto L74
        L68:
            long r5 = r8.$timeIntervalInMillis
            r8.L$0 = r1
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r5, r8)
            if (r9 != r0) goto L16
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManagerImpl$getSeatAvailabilityDetailsForVehicles$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
