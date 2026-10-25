package app.chalo.validationsdk.blevalidation.ui;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.State;
import androidx.media3.extractor.ts.TsExtractor;
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
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt$BleValidationScreen$2$1", f = "BleValidationScreen.android.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS_UHD, 140, 143, 147}, m = "invokeSuspend", v = 1)
final class BleValidationScreen_androidKt$BleValidationScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $bottomsheetStateDismissDisabled;
    final /* synthetic */ SheetState $modalBottomSheetState;
    final /* synthetic */ State<BleValidationState> $viewState$delegate;
    int label;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10608a;

        static {
            int[] iArr = new int[BleValidationBottomsheetType.values().length];
            try {
                iArr[BleValidationBottomsheetType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleValidationBottomsheetType.RIDE_FEEDBACK_BOTTOMSHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleValidationBottomsheetType.PRODUCT_AND_USER_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BleValidationBottomsheetType.NEARBY_DEVICES_PERMISSION_RATIONALE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BleValidationBottomsheetType.TAP_TO_VALIDATE_TUTORIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BleValidationBottomsheetType.POST_VALIDATION_BOTTOMSHEET_FOR_CONDUCTOR_VALIDATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BleValidationBottomsheetType.POST_VALIDATION_BOTTOMSHEET_FOR_TAP_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10608a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationScreen_androidKt$BleValidationScreen$2$1(SheetState sheetState, SheetState sheetState2, State state, Continuation continuation) {
        super(2, continuation);
        this.$modalBottomSheetState = sheetState;
        this.$bottomsheetStateDismissDisabled = sheetState2;
        this.$viewState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationScreen_androidKt$BleValidationScreen$2$1(this.$modalBottomSheetState, this.$bottomsheetStateDismissDisabled, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationScreen_androidKt$BleValidationScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r7.show(r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.show(r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r7.hide(r6) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 == r4) goto L12
            if (r1 == r3) goto L12
            if (r1 != r2) goto L16
        L12:
            kotlin.ResultKt.b(r7)
            goto L6c
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.ResultKt.b(r7)
            goto L61
        L22:
            kotlin.ResultKt.b(r7)
            androidx.compose.runtime.State<app.chalo.validationsdk.blevalidation.ui.BleValidationState> r7 = r6.$viewState$delegate
            java.lang.Object r7 = r7.getValue()
            app.chalo.validationsdk.blevalidation.ui.BleValidationState r7 = (app.chalo.validationsdk.blevalidation.ui.BleValidationState) r7
            app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetType r7 = r7.d
            int[] r1 = app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt$BleValidationScreen$2$1.WhenMappings.f10608a
            int r7 = r7.ordinal()
            r7 = r1[r7]
            switch(r7) {
                case 1: goto L56;
                case 2: goto L4b;
                case 3: goto L4b;
                case 4: goto L40;
                case 5: goto L40;
                case 6: goto L40;
                case 7: goto L40;
                default: goto L3a;
            }
        L3a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L40:
            androidx.compose.material3.SheetState r7 = r6.$bottomsheetStateDismissDisabled
            r6.label = r2
            java.lang.Object r7 = r7.show(r6)
            if (r7 != r0) goto L6c
            goto L6b
        L4b:
            androidx.compose.material3.SheetState r7 = r6.$modalBottomSheetState
            r6.label = r3
            java.lang.Object r7 = r7.show(r6)
            if (r7 != r0) goto L6c
            goto L6b
        L56:
            androidx.compose.material3.SheetState r7 = r6.$modalBottomSheetState
            r6.label = r5
            java.lang.Object r7 = r7.hide(r6)
            if (r7 != r0) goto L61
            goto L6b
        L61:
            androidx.compose.material3.SheetState r7 = r6.$bottomsheetStateDismissDisabled
            r6.label = r4
            java.lang.Object r7 = r7.hide(r6)
            if (r7 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt$BleValidationScreen$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
