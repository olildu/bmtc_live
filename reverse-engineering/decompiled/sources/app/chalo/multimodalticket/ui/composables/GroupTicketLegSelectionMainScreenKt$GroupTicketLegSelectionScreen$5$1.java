package app.chalo.multimodalticket.ui.composables;

import androidx.compose.material3.SheetState;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionViewState;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
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
@DebugMetadata(c = "app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$5$1", f = "GroupTicketLegSelectionMainScreen.kt", l = {105, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 117}, m = "invokeSuspend", v = 1)
final class GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ GroupTicketLegSelectionViewState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$5$1(GroupTicketLegSelectionViewState groupTicketLegSelectionViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$state = groupTicketLegSelectionViewState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$5$1(this.$state, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$5$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r6.hide(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r6.show(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r6.show(r5) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            if (r1 == r4) goto L18
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L6c
        L1c:
            kotlin.ResultKt.b(r6)
            app.chalo.multimodalticket.ui.GroupTicketLegSelectionViewState r6 = r5.$state
            app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType r6 = r6.f
            app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType$None r1 = app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType.None.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r6, r1)
            if (r1 == 0) goto L3e
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            boolean r6 = r6.isVisible()
            if (r6 == 0) goto L6c
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            r5.label = r4
            java.lang.Object r6 = r6.hide(r5)
            if (r6 != r0) goto L6c
            goto L6b
        L3e:
            boolean r1 = r6 instanceof app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType.PassengerSelection
            if (r1 == 0) goto L55
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            boolean r6 = r6.isVisible()
            if (r6 != 0) goto L6c
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            r5.label = r3
            java.lang.Object r6 = r6.show(r5)
            if (r6 != r0) goto L6c
            goto L6b
        L55:
            boolean r6 = r6 instanceof app.chalo.multimodalticket.ui.uistates.GroupTicketLegSelectionBottomSheetUIStateType.Error
            if (r6 == 0) goto L6f
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            boolean r6 = r6.isVisible()
            if (r6 != 0) goto L6c
            androidx.compose.material3.SheetState r6 = r5.$modalBottomSheetState
            r5.label = r2
            java.lang.Object r6 = r6.show(r5)
            if (r6 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        L6f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.multimodalticket.ui.composables.GroupTicketLegSelectionMainScreenKt$GroupTicketLegSelectionScreen$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
