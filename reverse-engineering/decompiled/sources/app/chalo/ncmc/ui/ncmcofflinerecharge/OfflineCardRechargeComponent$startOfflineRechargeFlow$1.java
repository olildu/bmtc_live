package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import defpackage.im0;
import defpackage.ln0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$startOfflineRechargeFlow$1", f = "OfflineCardRechargeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeComponent$startOfflineRechargeFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OfflineCardRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$startOfflineRechargeFlow$1(OfflineCardRechargeComponent offlineCardRechargeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offlineCardRechargeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeComponent$startOfflineRechargeFlow$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        OfflineCardRechargeComponent$startOfflineRechargeFlow$1 offlineCardRechargeComponent$startOfflineRechargeFlow$1 = (OfflineCardRechargeComponent$startOfflineRechargeFlow$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        offlineCardRechargeComponent$startOfflineRechargeFlow$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.E0(new ln0(7));
        OfflineCardRechargeComponent offlineCardRechargeComponent = this.this$0;
        OfflineCardRechargeViewState offlineCardRechargeViewState = (OfflineCardRechargeViewState) offlineCardRechargeComponent.f.getValue();
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = offlineCardRechargeViewState.b;
        if (ncmcCardRechargeConfigAppModel != null) {
            long jB = offlineCardRechargeComponent.l.b(offlineCardRechargeViewState.o);
            offlineCardRechargeComponent.r0(OfflineCardRechargeSideEffect.HideKeyboard.f6398a);
            offlineCardRechargeComponent.E0(new im0(25));
            AnalyticsContractImplKt.b(offlineCardRechargeComponent.w, "ncmc tnc accepted loading", Source.NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN, OfflineCardRechargeContractKt.a(offlineCardRechargeViewState, null), false, 24);
            BuildersKt.d(offlineCardRechargeComponent.j, null, null, new OfflineCardRechargeComponent$initiateOfflineRecharge$2(offlineCardRechargeComponent, jB, offlineCardRechargeViewState, ncmcCardRechargeConfigAppModel, null), 3);
        }
        return Unit.f17538a;
    }
}
