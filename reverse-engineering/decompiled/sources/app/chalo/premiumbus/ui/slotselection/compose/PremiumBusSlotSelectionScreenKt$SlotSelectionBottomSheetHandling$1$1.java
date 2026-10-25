package app.chalo.premiumbus.ui.slotselection.compose;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposerKt;
import app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState;
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
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$SlotSelectionBottomSheetHandling$1$1", f = "PremiumBusSlotSelectionScreen.kt", l = {ComposerKt.providerKey, 208, 209}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionScreenKt$SlotSelectionBottomSheetHandling$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusBottomSheetTypeUIState $bottomSheetState;
    final /* synthetic */ SheetState $modalBottomSheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionScreenKt$SlotSelectionBottomSheetHandling$1$1(PremiumBusBottomSheetTypeUIState premiumBusBottomSheetTypeUIState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = premiumBusBottomSheetTypeUIState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionScreenKt$SlotSelectionBottomSheetHandling$1$1(this.$bottomSheetState, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionScreenKt$SlotSelectionBottomSheetHandling$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r6.show(r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r6.hide(r5) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto Lf
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
        Lf:
            kotlin.ResultKt.b(r6)
            goto L53
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.b(r6)
            goto L3d
        L1f:
            kotlin.ResultKt.b(r6)
            app.chalo.premiumbus.ui.slotselection.PremiumBusBottomSheetTypeUIState r6 = r5.$bottomSheetState
            if (r6 == 0) goto L48
            boolean r6 = app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt.l(r6)
            if (r6 != 0) goto L2d
            goto L48
        L2d:
            dv0 r6 = new dv0
            r1 = 19
            r6.<init>(r1)
            r5.label = r3
            java.lang.Object r6 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(r6, r5)
            if (r6 != r0) goto L3d
            goto L52
        L3d:
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            r5.label = r2
            java.lang.Object r6 = r6.show(r5)
            if (r6 != r0) goto L53
            goto L52
        L48:
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            r5.label = r4
            java.lang.Object r6 = r6.hide(r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$SlotSelectionBottomSheetHandling$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
