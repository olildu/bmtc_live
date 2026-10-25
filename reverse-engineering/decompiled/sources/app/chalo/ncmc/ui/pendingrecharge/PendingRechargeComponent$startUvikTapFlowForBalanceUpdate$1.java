package app.chalo.ncmc.ui.pendingrecharge;

import app.chalo.ncmc.data.appmodel.IntentHashAppModel;
import app.chalo.ncmc.data.appmodel.IntentHashAppModelKt;
import app.chalo.ncmc.domain.GenerateUvikIntentHashUseCase;
import app.chalo.ncmc.domain.UvikIntentHashFailureReason;
import app.chalo.ncmc.uvik.UvikServiceType;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.va;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.pendingrecharge.PendingRechargeComponent$startUvikTapFlowForBalanceUpdate$1", f = "PendingRechargeComponent.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "invokeSuspend", v = 1)
final class PendingRechargeComponent$startUvikTapFlowForBalanceUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UvikServiceType $serviceType;
    int label;
    final /* synthetic */ PendingRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingRechargeComponent$startUvikTapFlowForBalanceUpdate$1(PendingRechargeComponent pendingRechargeComponent, UvikServiceType uvikServiceType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pendingRechargeComponent;
        this.$serviceType = uvikServiceType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PendingRechargeComponent$startUvikTapFlowForBalanceUpdate$1(this.this$0, this.$serviceType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PendingRechargeComponent$startUvikTapFlowForBalanceUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            PendingRechargeComponent pendingRechargeComponent = this.this$0;
            pendingRechargeComponent.getClass();
            pendingRechargeComponent.E0(new va(z, 12));
            GenerateUvikIntentHashUseCase generateUvikIntentHashUseCase = this.this$0.o;
            UvikServiceType uvikServiceType = this.$serviceType;
            this.label = 1;
            obj = generateUvikIntentHashUseCase.a(uvikServiceType, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            PendingRechargeComponent pendingRechargeComponent2 = this.this$0;
            pendingRechargeComponent2.getClass();
            pendingRechargeComponent2.E0(new va(false, 12));
            KotlinToastManagerKt.a(this.this$0.q, ((UvikIntentHashFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f6251a, ToastLength.LONG);
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            PendingRechargeComponent pendingRechargeComponent3 = this.this$0;
            UvikServiceType uvikServiceType2 = this.$serviceType;
            IntentHashAppModel intentHashAppModel = (IntentHashAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            pendingRechargeComponent3.getClass();
            BuildersKt.d(pendingRechargeComponent3.j, null, null, new PendingRechargeComponent$initiateUvikTap$1(pendingRechargeComponent3, IntentHashAppModelKt.a(intentHashAppModel, uvikServiceType2), null), 3);
        }
        return Unit.f17538a;
    }
}
