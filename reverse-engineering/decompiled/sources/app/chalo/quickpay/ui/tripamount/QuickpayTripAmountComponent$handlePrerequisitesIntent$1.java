package app.chalo.quickpay.ui.tripamount;

import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType;
import app.chalo.wallet.ui.access.WalletAccessState;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import defpackage.e01;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handlePrerequisitesIntent$1", f = "QuickpayTripAmountComponent.kt", l = {247}, m = "invokeSuspend", v = 1)
final class QuickpayTripAmountComponent$handlePrerequisitesIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ QuickpayTripAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountComponent$handlePrerequisitesIntent$1(QuickpayTripAmountComponent quickpayTripAmountComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickpayTripAmountComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickpayTripAmountComponent$handlePrerequisitesIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickpayTripAmountComponent$handlePrerequisitesIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        QuickpayTripAmountScreenBottomSheetType quickpayTripAmountScreenBottomSheetType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            MutableStateFlow mutableStateFlow = this.this$0.A.d;
            do {
                value = mutableStateFlow.getValue();
                quickpayTripAmountScreenBottomSheetType = (QuickpayTripAmountScreenBottomSheetType) value;
                if (quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayPrerequisitesBottomSheet) {
                    quickpayTripAmountScreenBottomSheetType = null;
                } else if (!(quickpayTripAmountScreenBottomSheetType instanceof QuickpayTripAmountScreenBottomSheetType.QuickPayConfirmationBottomSheet) && quickpayTripAmountScreenBottomSheetType != null) {
                    throw new NoWhenBranchMatchedException();
                }
            } while (!mutableStateFlow.c(value, quickpayTripAmountScreenBottomSheetType));
            WalletTypeIdentifier walletTypeIdentifier = ((WalletAccessState) this.this$0.m.a()).b;
            if (walletTypeIdentifier == null) {
                return unit;
            }
            this.this$0.E0(new e01(3));
            RefreshQuickPayPrerequisitesUseCase refreshQuickPayPrerequisitesUseCase = this.this$0.t;
            this.label = 1;
            if (refreshQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.this$0.E0(new e01(4));
        this.this$0.J0(QuickpayTripAmountIntent.NextIntent.f8874a);
        return unit;
    }
}
