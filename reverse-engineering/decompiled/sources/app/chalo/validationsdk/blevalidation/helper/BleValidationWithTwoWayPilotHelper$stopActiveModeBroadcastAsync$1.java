package app.chalo.validationsdk.blevalidation.helper;

import app.chalo.constants.Source;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$stopActiveModeBroadcastAsync$1", f = "BleValidationWithTwoWayPilotHelper.kt", l = {269, 271}, m = "invokeSuspend", v = 1)
final class BleValidationWithTwoWayPilotHelper$stopActiveModeBroadcastAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Object> $additionalAnalyticsAttributesMap;
    final /* synthetic */ String $reason;
    final /* synthetic */ Source $source;
    int label;
    final /* synthetic */ BleValidationWithTwoWayPilotHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationWithTwoWayPilotHelper$stopActiveModeBroadcastAsync$1(BleValidationWithTwoWayPilotHelper bleValidationWithTwoWayPilotHelper, Source source, Map map, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationWithTwoWayPilotHelper;
        this.$source = source;
        this.$additionalAnalyticsAttributesMap = map;
        this.$reason = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationWithTwoWayPilotHelper$stopActiveModeBroadcastAsync$1(this.this$0, this.$source, this.$additionalAnalyticsAttributesMap, this.$reason, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationWithTwoWayPilotHelper$stopActiveModeBroadcastAsync$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.b(r7)
            goto L59
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            kotlin.ResultKt.b(r7)
            goto L30
        L1c:
            kotlin.ResultKt.b(r7)
            app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper r7 = r6.this$0
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger r7 = r7.b
            app.chalo.constants.Source r1 = r6.$source
            java.util.Map<java.lang.String, java.lang.Object> r4 = r6.$additionalAnalyticsAttributesMap
            r6.label = r2
            java.lang.Object r7 = r7.r(r1, r4, r6)
            if (r7 != r0) goto L30
            goto L58
        L30:
            app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper r7 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r7 = r7.n
            java.lang.Object r7 = r7.getValue()
            kotlin.Pair r7 = (kotlin.Pair) r7
            app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper r1 = r6.this$0
            kotlinx.coroutines.flow.MutableStateFlow r1 = r1.n
            app.chalo.validationsdk.blevalidation.helper.BleActiveModeStatus$Stopped r2 = new app.chalo.validationsdk.blevalidation.helper.BleActiveModeStatus$Stopped
            java.lang.String r4 = r6.$reason
            java.lang.String r5 = " async"
            java.lang.String r4 = defpackage.vo1.A(r4, r5)
            r2.<init>(r4)
            r4 = 0
            kotlin.Pair r7 = kotlin.Pair.c(r7, r2, r4, r3)
            r6.label = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L59
        L58:
            return r0
        L59:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$stopActiveModeBroadcastAsync$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
