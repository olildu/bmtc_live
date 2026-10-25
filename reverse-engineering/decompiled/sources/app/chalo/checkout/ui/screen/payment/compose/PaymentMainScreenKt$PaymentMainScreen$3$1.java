package app.chalo.checkout.ui.screen.payment.compose;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.State;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.checkout.ui.screen.payment.PaymentViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt$PaymentMainScreen$3$1", f = "PaymentMainScreen.kt", l = {86, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", v = 1)
final class PaymentMainScreenKt$PaymentMainScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ State<PaymentViewState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainScreenKt$PaymentMainScreen$3$1(SheetState sheetState, State state, Continuation continuation) {
        super(2, continuation);
        this.$sheetState = sheetState;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainScreenKt$PaymentMainScreen$3$1(this.$sheetState, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainScreenKt$PaymentMainScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r5.hide(r4) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r5.expand(r4) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L10
        Lc:
            kotlin.ResultKt.b(r5)
            goto L54
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            androidx.compose.runtime.State<app.chalo.checkout.ui.screen.payment.PaymentViewState> r5 = r4.$state$delegate
            java.lang.Object r5 = r5.getValue()
            app.chalo.checkout.ui.screen.payment.PaymentViewState r5 = (app.chalo.checkout.ui.screen.payment.PaymentViewState) r5
            app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType r5 = r5.f
            boolean r1 = r5 instanceof app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType.ChaloPayLowBalanceBottomsheetUiState
            if (r1 != 0) goto L49
            boolean r1 = r5 instanceof app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType.ChaloWalletBlockedBottomsheetUiState
            if (r1 != 0) goto L49
            boolean r1 = r5 instanceof app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType.PaymentStatusBottomSheetUiState
            if (r1 != 0) goto L49
            boolean r1 = r5 instanceof app.chalo.checkout.ui.screen.payment.PaymentBottomSheetUiType.InAppUpiSmsPermissionBottomSheetUiState
            if (r1 == 0) goto L36
            goto L49
        L36:
            if (r5 != 0) goto L43
            androidx.compose.material3.SheetState r5 = r4.$sheetState
            r4.label = r2
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L54
            goto L53
        L43:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L49:
            androidx.compose.material3.SheetState r5 = r4.$sheetState
            r4.label = r3
            java.lang.Object r5 = r5.expand(r4)
            if (r5 != r0) goto L54
        L53:
            return r0
        L54:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.compose.PaymentMainScreenKt$PaymentMainScreen$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
