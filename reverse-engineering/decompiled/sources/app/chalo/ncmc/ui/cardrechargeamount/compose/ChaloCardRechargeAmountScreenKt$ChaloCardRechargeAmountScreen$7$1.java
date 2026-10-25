package app.chalo.ncmc.ui.cardrechargeamount.compose;

import androidx.compose.material3.SheetState;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt$ChaloCardRechargeAmountScreen$7$1", f = "ChaloCardRechargeAmountScreen.kt", l = {174, 177}, m = "invokeSuspend", v = 1)
final class ChaloCardRechargeAmountScreenKt$ChaloCardRechargeAmountScreen$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $bottomSheetState;
    final /* synthetic */ ChaloCardRechargeAmountViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardRechargeAmountScreenKt$ChaloCardRechargeAmountScreen$7$1(ChaloCardRechargeAmountViewState chaloCardRechargeAmountViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$viewState = chaloCardRechargeAmountViewState;
        this.$bottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardRechargeAmountScreenKt$ChaloCardRechargeAmountScreen$7$1(this.$viewState, this.$bottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardRechargeAmountScreenKt$ChaloCardRechargeAmountScreen$7$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r5.show(r4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r5.hide(r4) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
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
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.b(r5)
            goto L57
        L19:
            kotlin.ResultKt.b(r5)
            app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState r5 = r4.$viewState
            app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType r5 = r5.j
            boolean r1 = r5 instanceof app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType.ErrorLayout
            if (r1 == 0) goto L4c
            app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType$ErrorLayout r5 = (app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType.ErrorLayout) r5
            app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason r5 = r5.f6286a
            int[] r1 = app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt.WhenMappings.f6309a
            int r5 = r5.ordinal()
            r5 = r1[r5]
            switch(r5) {
                case 1: goto L4c;
                case 2: goto L4c;
                case 3: goto L4c;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L39;
                default: goto L33;
            }
        L33:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L39:
            androidx.compose.material3.SheetState r5 = r4.$bottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 != 0) goto L57
            androidx.compose.material3.SheetState r5 = r4.$bottomSheetState
            r4.label = r3
            java.lang.Object r5 = r5.show(r4)
            if (r5 != r0) goto L57
            goto L56
        L4c:
            androidx.compose.material3.SheetState r5 = r4.$bottomSheetState
            r4.label = r2
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.cardrechargeamount.compose.ChaloCardRechargeAmountScreenKt$ChaloCardRechargeAmountScreen$7$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
