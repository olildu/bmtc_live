package app.chalo.ncmc.ui.entercarddetails.compose;

import androidx.compose.material3.SheetState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt$EnterCardDetailsScreen$3$1", f = "EnterCardDetailsScreen.kt", l = {109, 114}, m = "invokeSuspend", v = 1)
final class EnterCardDetailsScreenKt$EnterCardDetailsScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ EnterCardDetailsViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterCardDetailsScreenKt$EnterCardDetailsScreen$3$1(EnterCardDetailsViewState enterCardDetailsViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$viewState = enterCardDetailsViewState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EnterCardDetailsScreenKt$EnterCardDetailsScreen$3$1(this.$viewState, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EnterCardDetailsScreenKt$EnterCardDetailsScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r5.show(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r5.hide(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
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
            goto L48
        L19:
            kotlin.ResultKt.b(r5)
            app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState r5 = r4.$viewState
            boolean r5 = r5.l
            if (r5 == 0) goto L35
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 != 0) goto L48
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r3
            java.lang.Object r5 = r5.show(r4)
            if (r5 != r0) goto L48
            goto L47
        L35:
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L48
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r2
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L48
        L47:
            return r0
        L48:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt$EnterCardDetailsScreen$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
