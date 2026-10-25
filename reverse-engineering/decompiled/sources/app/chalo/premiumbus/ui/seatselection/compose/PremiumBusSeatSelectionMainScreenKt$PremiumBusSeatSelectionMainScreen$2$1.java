package app.chalo.premiumbus.ui.seatselection.compose;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.State;
import app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionMainScreenKt$PremiumBusSeatSelectionMainScreen$2$1", f = "PremiumBusSeatSelectionMainScreen.kt", l = {84, 86}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionMainScreenKt$PremiumBusSeatSelectionMainScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ State<PremiumBusSeatSelectionViewState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionMainScreenKt$PremiumBusSeatSelectionMainScreen$2$1(SheetState sheetState, State state, Continuation continuation) {
        super(2, continuation);
        this.$modalBottomSheetState = sheetState;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionMainScreenKt$PremiumBusSeatSelectionMainScreen$2$1(this.$modalBottomSheetState, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionMainScreenKt$PremiumBusSeatSelectionMainScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r5.show(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r5.hide(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
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
            goto L3e
        L19:
            kotlin.ResultKt.b(r5)
            androidx.compose.runtime.State<app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState> r5 = r4.$state$delegate
            java.lang.Object r5 = r5.getValue()
            app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState r5 = (app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionViewState) r5
            app.chalo.premiumbus.ui.seatselection.compose.uistate.PremiumBusSeatSelectionBottomSheetUIState r5 = r5.j
            if (r5 == 0) goto L33
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r3
            java.lang.Object r5 = r5.show(r4)
            if (r5 != r0) goto L3e
            goto L3d
        L33:
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r2
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.seatselection.compose.PremiumBusSeatSelectionMainScreenKt$PremiumBusSeatSelectionMainScreen$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
