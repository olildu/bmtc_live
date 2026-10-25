package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$initiateOfflineRecharge$2", f = "OfflineCardRechargeComponent.kt", l = {288, 298, 321}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeComponent$initiateOfflineRecharge$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $amountInSubCurrency;
    final /* synthetic */ OfflineCardRechargeViewState $dataState;
    final /* synthetic */ NcmcCardRechargeConfigAppModel $rechargeConfig;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OfflineCardRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$initiateOfflineRecharge$2(OfflineCardRechargeComponent offlineCardRechargeComponent, long j, OfflineCardRechargeViewState offlineCardRechargeViewState, NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offlineCardRechargeComponent;
        this.$amountInSubCurrency = j;
        this.$dataState = offlineCardRechargeViewState;
        this.$rechargeConfig = ncmcCardRechargeConfigAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeComponent$initiateOfflineRecharge$2(this.this$0, this.$amountInSubCurrency, this.$dataState, this.$rechargeConfig, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfflineCardRechargeComponent$initiateOfflineRecharge$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        if (app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent.F0(r4, r5, r6, r7, r9, r13, r10) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$initiateOfflineRecharge$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
