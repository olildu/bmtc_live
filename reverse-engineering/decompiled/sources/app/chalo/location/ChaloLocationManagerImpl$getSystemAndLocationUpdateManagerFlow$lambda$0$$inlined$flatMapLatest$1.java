package app.chalo.location;

import androidx.media3.extractor.ts.PsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.location.ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1", f = "ChaloLocationManagerImpl.kt", l = {192, PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super LocationManagerResult>, LocationManagerResult.LocationPreconditionsStatus, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ChaloLocationManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1(ChaloLocationManagerImpl chaloLocationManagerImpl, Continuation continuation) {
        super(3, continuation);
        this.this$0 = chaloLocationManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1 chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1 = new ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1.L$1 = obj2;
        return chaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.r(r9, r2, r8) == r0) goto L37;
     */
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
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L26
            if (r1 == r2) goto L1a
            if (r1 != r4) goto L12
            kotlin.ResultKt.b(r9)
            goto Lb6
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            java.lang.Object r1 = r8.L$1
            app.chalo.location.ChaloLocationManagerImpl r1 = (app.chalo.location.ChaloLocationManagerImpl) r1
            java.lang.Object r2 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.b(r9)
            goto L4e
        L26:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            java.lang.Object r1 = r8.L$1
            app.chalo.location.LocationManagerResult$LocationPreconditionsStatus r1 = (app.chalo.location.LocationManagerResult.LocationPreconditionsStatus) r1
            app.chalo.location.LocationManagerResult$LocationPreconditionsStatus$SystemConditionsSatisfied r5 = app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.SystemConditionsSatisfied.f5146a
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r1, r5)
            if (r5 == 0) goto L71
            app.chalo.location.ChaloLocationManagerImpl r1 = r8.this$0
            app.chalo.location.ChaloLocationDelegate r5 = r1.c
            r8.L$0 = r9
            r8.L$1 = r1
            r8.label = r2
            java.lang.Object r2 = r5.d()
            if (r2 != r0) goto L4b
            goto Lb5
        L4b:
            r7 = r2
            r2 = r9
            r9 = r7
        L4e:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            app.chalo.location.ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$0$$inlined$map$1 r5 = new app.chalo.location.ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$0$$inlined$map$1
            app.chalo.location.ChaloLocationManagerImpl r6 = r8.this$0
            r5.<init>()
            r1.getClass()
            app.chalo.location.ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1 r9 = new app.chalo.location.ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$1
            r9.<init>(r4, r3)
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 r6 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1
            r6.<init>(r5, r9)
            app.chalo.location.ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2 r9 = new app.chalo.location.ChaloLocationManagerImpl$addLocationUpdateStaleCheckAndRetry$2
            r9.<init>(r1, r3)
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r9 = kotlinx.coroutines.flow.FlowKt.H(r6, r9)
            r7 = r2
            r2 = r9
            r9 = r7
            goto La9
        L71:
            app.chalo.location.LocationManagerResult$LocationPreconditionsStatus$CheckInProgress r2 = app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.CheckInProgress.f5139a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r2 != 0) goto La4
            app.chalo.location.LocationManagerResult$LocationPreconditionsStatus$CheckNotStarted r2 = app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.CheckNotStarted.f5140a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r2 != 0) goto La4
            boolean r2 = r1 instanceof app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.GeneralException
            if (r2 != 0) goto La4
            boolean r2 = r1 instanceof app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.RequestLocationPermission
            if (r2 != 0) goto La4
            app.chalo.location.LocationManagerResult$LocationPreconditionsStatus$ProcessCancelled r2 = app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.ProcessCancelled.f5142a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r2 != 0) goto La4
            boolean r2 = r1 instanceof app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.SettingsResolutionRequired
            if (r2 != 0) goto La4
            app.chalo.location.LocationManagerResult$LocationPreconditionsStatus$SettingsUnavailable r2 = app.chalo.location.LocationManagerResult.LocationPreconditionsStatus.SettingsUnavailable.f5145a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r2 == 0) goto L9e
            goto La4
        L9e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        La4:
            kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 r2 = new kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            r2.<init>(r1)
        La9:
            r8.L$0 = r3
            r8.L$1 = r3
            r8.label = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.r(r9, r2, r8)
            if (r9 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.location.ChaloLocationManagerImpl$getSystemAndLocationUpdateManagerFlow$lambda$0$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
