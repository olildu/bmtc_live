package app.chalo.premiumbus.ui.slotselection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory", f = "SlotSelectionScreenUiStateFactory.kt", l = {356, 369, 393, 440, 466, 483, 493, 516, 551, 571, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, TypedValues.MotionType.TYPE_EASING, 646, 652, 657, 673, 710, 709, 728, 739, 754, 757, 763, 777}, m = "createPBSlotSelectionScreenBottomSheetTypeUIState", v = 1)
final class SlotSelectionScreenUiStateFactory$createPBSlotSelectionScreenBottomSheetTypeUIState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SlotSelectionScreenUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotSelectionScreenUiStateFactory$createPBSlotSelectionScreenBottomSheetTypeUIState$1(SlotSelectionScreenUiStateFactory slotSelectionScreenUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = slotSelectionScreenUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(false, null, null, this);
    }
}
