package app.chalo.home.ui.history.compose;

import androidx.compose.material3.SheetState;
import app.zophop.homescreen.MyTicketsViewState;
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
@DebugMetadata(c = "app.chalo.home.ui.history.compose.MyTicketsScreenUIKt$MyTicketsScreenUI$2$1", f = "MyTicketsScreenUI.kt", l = {150, 156}, m = "invokeSuspend", v = 1)
final class MyTicketsScreenUIKt$MyTicketsScreenUI$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ MyTicketsViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsScreenUIKt$MyTicketsScreenUI$2$1(MyTicketsViewState myTicketsViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$viewState = myTicketsViewState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsScreenUIKt$MyTicketsScreenUI$2$1(this.$viewState, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsScreenUIKt$MyTicketsScreenUI$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r6.hide(r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r6.show(r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        return r0;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L10
        Lc:
            kotlin.ResultKt.b(r6)
            goto L68
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            app.zophop.homescreen.MyTicketsViewState r6 = r5.$viewState
            app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState r6 = r6.k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "showing bottom sheet "
            r1.<init>(r4)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "message"
            kotlin.jvm.internal.Intrinsics.i(r6, r1)
            app.zophop.homescreen.MyTicketsViewState r6 = r5.$viewState
            app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState r6 = r6.k
            boolean r1 = r6 instanceof app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState.ProductPurchaseBottomSheetUiState
            if (r1 != 0) goto L5d
            boolean r1 = r6 instanceof app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState.TicketsPageInfoBottomSheet
            if (r1 != 0) goto L5d
            boolean r1 = r6 instanceof app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState.MultiModalTicketSelectionBottomSheetUiState
            if (r1 == 0) goto L44
            goto L5d
        L44:
            app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState$None r1 = app.chalo.home.ui.history.uistate.bottomsheet.MyTicketBottomSheetUiState.None.b
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r1)
            if (r6 == 0) goto L57
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            r5.label = r2
            java.lang.Object r6 = r6.hide(r5)
            if (r6 != r0) goto L68
            goto L67
        L57:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L5d:
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            r5.label = r3
            java.lang.Object r6 = r6.show(r5)
            if (r6 != r0) goto L68
        L67:
            return r0
        L68:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.history.compose.MyTicketsScreenUIKt$MyTicketsScreenUI$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
