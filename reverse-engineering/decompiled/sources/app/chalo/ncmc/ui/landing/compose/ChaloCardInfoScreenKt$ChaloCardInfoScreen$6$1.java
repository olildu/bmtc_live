package app.chalo.ncmc.ui.landing.compose;

import androidx.compose.material3.SheetState;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt$ChaloCardInfoScreen$6$1", f = "ChaloCardInfoScreen.kt", l = {190, 197}, m = "invokeSuspend", v = 1)
final class ChaloCardInfoScreenKt$ChaloCardInfoScreen$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ ChaloCardInfoViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardInfoScreenKt$ChaloCardInfoScreen$6$1(ChaloCardInfoViewState chaloCardInfoViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$viewState = chaloCardInfoViewState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardInfoScreenKt$ChaloCardInfoScreen$6$1(this.$viewState, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardInfoScreenKt$ChaloCardInfoScreen$6$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r5.hide(r4) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.show(r4) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
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
            goto L61
        L19:
            kotlin.ResultKt.b(r5)
            app.chalo.ncmc.ui.landing.ChaloCardInfoViewState r5 = r4.$viewState
            app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType r5 = r5.u
            app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType$None r1 = app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType.None.f6341a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 == 0) goto L3b
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L61
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r3
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L61
            goto L60
        L3b:
            app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType$NfcTapUnavailable r1 = app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType.NfcTapUnavailable.f6340a
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r5, r1)
            if (r1 != 0) goto L4e
            boolean r5 = r5 instanceof app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType.CardLinking
            if (r5 == 0) goto L48
            goto L4e
        L48:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L4e:
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 != 0) goto L61
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r2
            java.lang.Object r5 = r5.show(r4)
            if (r5 != r0) goto L61
        L60:
            return r0
        L61:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.landing.compose.ChaloCardInfoScreenKt$ChaloCardInfoScreen$6$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
