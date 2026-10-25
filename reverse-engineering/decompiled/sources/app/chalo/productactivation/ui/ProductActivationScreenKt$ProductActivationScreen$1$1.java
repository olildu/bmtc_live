package app.chalo.productactivation.ui;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.State;
import androidx.compose.ui.spatial.RectListKt;
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
@DebugMetadata(c = "app.chalo.productactivation.ui.ProductActivationScreenKt$ProductActivationScreen$1$1", f = "ProductActivationScreen.kt", l = {RectListKt.BitOffsetForGesturable, 67}, m = "invokeSuspend", v = 1)
final class ProductActivationScreenKt$ProductActivationScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ State<ProductActivationUIState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductActivationScreenKt$ProductActivationScreen$1$1(SheetState sheetState, State state, Continuation continuation) {
        super(2, continuation);
        this.$modalBottomSheetState = sheetState;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductActivationScreenKt$ProductActivationScreen$1$1(this.$modalBottomSheetState, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductActivationScreenKt$ProductActivationScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r5.show(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.hide(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
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
            goto L4e
        L19:
            kotlin.ResultKt.b(r5)
            androidx.compose.runtime.State<app.chalo.productactivation.ui.ProductActivationUIState> r5 = r4.$state$delegate
            java.lang.Object r5 = r5.getValue()
            app.chalo.productactivation.ui.ProductActivationUIState r5 = (app.chalo.productactivation.ui.ProductActivationUIState) r5
            app.chalo.uistate.bottomsheet.BottomSheetStandardContentUiState r5 = r5.c
            if (r5 == 0) goto L3b
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 != 0) goto L4e
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r3
            java.lang.Object r5 = r5.show(r4)
            if (r5 != r0) goto L4e
            goto L4d
        L3b:
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L4e
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r2
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L4e
        L4d:
            return r0
        L4e:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productactivation.ui.ProductActivationScreenKt$ProductActivationScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
