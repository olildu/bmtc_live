package app.chalo.productpurchase.passpurchase.ui.confirmation;

import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$handleDateSelectedIntent$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$handleDateSelectedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmSuperPassPurchaseIntent.DateSelectedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$handleDateSelectedIntent$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, ConfirmSuperPassPurchaseIntent.DateSelectedIntent dateSelectedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
        this.$intent = dateSelectedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$handleDateSelectedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$handleDateSelectedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objE;
        Long l;
        Object value;
        ConfirmSuperPassPurchaseDataState confirmSuperPassPurchaseDataState;
        PassValidityInfo passValidityInfo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
            Long l2 = new Long(this.$intent.f8365a);
            PassValidityInfo passValidityInfo2 = ((ConfirmSuperPassPurchaseDataState) this.this$0.f.getValue()).j;
            Long l3 = passValidityInfo2 != null ? passValidityInfo2.b : null;
            confirmSuperPassPurchaseViewModel.getClass();
            Long lD = ConfirmSuperPassPurchaseViewModel.D(l2, l3);
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = this.this$0;
            this.L$0 = lD;
            this.label = 1;
            objE = confirmSuperPassPurchaseViewModel2.E(false, lD, this);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
            l = lD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = (Long) this.L$0;
            ResultKt.b(obj);
            objE = obj;
        }
        String str = (String) objE;
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel3 = this.this$0;
        ConfirmSuperPassPurchaseIntent.DateSelectedIntent dateSelectedIntent = this.$intent;
        MutableStateFlow mutableStateFlow = confirmSuperPassPurchaseViewModel3.e;
        do {
            value = mutableStateFlow.getValue();
            confirmSuperPassPurchaseDataState = (ConfirmSuperPassPurchaseDataState) value;
            passValidityInfo = confirmSuperPassPurchaseDataState.j;
        } while (!mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(confirmSuperPassPurchaseDataState, false, false, null, null, null, str, null, null, passValidityInfo != null ? PassValidityInfo.a(passValidityInfo, l, Long.valueOf(dateSelectedIntent.f8365a)) : null, null, 1467)));
        return Unit.f17538a;
    }
}
