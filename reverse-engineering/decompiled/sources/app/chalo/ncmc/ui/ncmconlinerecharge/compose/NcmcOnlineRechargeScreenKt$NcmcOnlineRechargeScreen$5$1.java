package app.chalo.ncmc.ui.ncmconlinerecharge.compose;

import androidx.compose.material3.SheetState;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState;
import app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeSuccessBottomSheetType;
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
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1", f = "NcmcOnlineRechargeScreen.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 141}, m = "invokeSuspend", v = 1)
final class NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ NCMCOnlineRechargeViewState $viewState;
    int label;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6418a;

        static {
            int[] iArr = new int[NcmcOnlineRechargeSuccessBottomSheetType.values().length];
            try {
                iArr[NcmcOnlineRechargeSuccessBottomSheetType.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NcmcOnlineRechargeSuccessBottomSheetType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NcmcOnlineRechargeSuccessBottomSheetType.WITH_OPTION_TO_TRANSFER_TO_OFFLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6418a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1(NCMCOnlineRechargeViewState nCMCOnlineRechargeViewState, SheetState sheetState, Continuation continuation) {
        super(2, continuation);
        this.$viewState = nCMCOnlineRechargeViewState;
        this.$modalBottomSheetState = sheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1(this.$viewState, this.$modalBottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r5.show(r4) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r5.hide(r4) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
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
            goto L5b
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            app.chalo.ncmc.ui.ncmconlinerecharge.NCMCOnlineRechargeViewState r5 = r4.$viewState
            app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeSuccessBottomSheetType r5 = r5.q
            int[] r1 = app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1.WhenMappings.f6418a
            int r5 = r5.ordinal()
            r5 = r1[r5]
            if (r5 == r3) goto L48
            if (r5 == r2) goto L35
            r1 = 3
            if (r5 != r1) goto L2f
            goto L35
        L2f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L35:
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 != 0) goto L5b
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r2
            java.lang.Object r5 = r5.show(r4)
            if (r5 != r0) goto L5b
            goto L5a
        L48:
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            boolean r5 = r5.isVisible()
            if (r5 == 0) goto L5b
            androidx.compose.material3.SheetState r5 = r4.$modalBottomSheetState
            r4.label = r3
            java.lang.Object r5 = r5.hide(r4)
            if (r5 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.ncmconlinerecharge.compose.NcmcOnlineRechargeScreenKt$NcmcOnlineRechargeScreen$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
