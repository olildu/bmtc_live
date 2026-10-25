package app.chalo.validationsdk.blevalidation.ui.qrvalidation;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.State;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt$QRValidationScreen$2$1", f = "QRValidationScreen.kt", l = {FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 114, 118}, m = "invokeSuspend", v = 1)
final class QRValidationScreenKt$QRValidationScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SheetState $bottomSheetState;
    final /* synthetic */ State<QRValidationUIState> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationScreenKt$QRValidationScreen$2$1(SheetState sheetState, State state, Continuation continuation) {
        super(2, continuation);
        this.$bottomSheetState = sheetState;
        this.$state$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QRValidationScreenKt$QRValidationScreen$2$1(this.$bottomSheetState, this.$state$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QRValidationScreenKt$QRValidationScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$state$delegate.getValue().d == null) {
                SheetState sheetState = this.$bottomSheetState;
                this.label = 3;
                if (sheetState.hide(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (this.$state$delegate.getValue().d == null) {
                if (this.$bottomSheetState.isVisible()) {
                    SheetState sheetState2 = this.$bottomSheetState;
                    this.label = 1;
                    if (sheetState2.hide(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (this.$bottomSheetState.isVisible()) {
                    return unit;
                }
                SheetState sheetState3 = this.$bottomSheetState;
                this.label = 2;
                if (sheetState3.show(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
