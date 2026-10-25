package app.chalo.compose.components.dialogs;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.components.dialogs.ChaloDatePickerKt$ChaloDatePicker$7$1", f = "ChaloDatePicker.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloDatePickerKt$ChaloDatePicker$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Float> $dialogScale$delegate;
    final /* synthetic */ MutableState<IntSize> $dialogSize$delegate;
    final /* synthetic */ Density $localDensity;
    final /* synthetic */ float $screenWidth;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloDatePickerKt$ChaloDatePicker$7$1(Density density, float f, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$localDensity = density;
        this.$screenWidth = f;
        this.$dialogSize$delegate = mutableState;
        this.$dialogScale$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloDatePickerKt$ChaloDatePicker$7$1(this.$localDensity, this.$screenWidth, this.$dialogSize$delegate, this.$dialogScale$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloDatePickerKt$ChaloDatePicker$7$1 chaloDatePickerKt$ChaloDatePicker$7$1 = (ChaloDatePickerKt$ChaloDatePicker$7$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloDatePickerKt$ChaloDatePicker$7$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Density density = this.$localDensity;
        float f = this.$screenWidth;
        MutableState<IntSize> mutableState = this.$dialogSize$delegate;
        MutableState<Float> mutableState2 = this.$dialogScale$delegate;
        PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
        if (Dp.m7283equalsimpl0(f, density.mo401toDpu2uoSUM((int) (mutableState.getValue().m7449unboximpl() >> 32)))) {
            mutableState2.setValue(Float.valueOf(0.9f));
        }
        return Unit.f17538a;
    }
}
