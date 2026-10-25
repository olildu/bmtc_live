package app.chalo.appsupport;

import androidx.compose.material3.SheetState;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appsupport.BookingHelpScreenUIKt$BookingHelpScreenUI$3$1", f = "BookingHelpScreenUI.kt", l = {EACTags.DISPLAY_IMAGE, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY}, m = "invokeSuspend", v = 1)
final class BookingHelpScreenUIKt$BookingHelpScreenUI$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ BookingHelpScreenViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookingHelpScreenUIKt$BookingHelpScreenUI$3$1(BookingHelpScreenViewState bookingHelpScreenViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$viewState = bookingHelpScreenViewState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BookingHelpScreenUIKt$BookingHelpScreenUI$3$1(this.$viewState, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BookingHelpScreenUIKt$BookingHelpScreenUI$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r5.show(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r5.hide(r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
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
            goto L4a
        L19:
            kotlin.ResultKt.b(r5)
            app.chalo.appsupport.uistate.BookingHelpScreenViewState r5 = r4.$viewState
            app.chalo.appsupport.uistate.BookingHelpBottomSheetUIStateType r5 = r5.e
            boolean r1 = r5 instanceof app.chalo.appsupport.uistate.BookingHelpBottomSheetUIStateType.Generic
            if (r1 == 0) goto L2f
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r3
            java.lang.Object r5 = r5.show(r4)
            if (r5 != r0) goto L4a
            goto L49
        L2f:
            app.chalo.appsupport.uistate.BookingHelpBottomSheetUIStateType$None r1 = app.chalo.appsupport.uistate.BookingHelpBottomSheetUIStateType.None.b
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r5 == 0) goto L4d
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L4a
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r2
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        L4d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appsupport.BookingHelpScreenUIKt$BookingHelpScreenUI$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
