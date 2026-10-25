package app.chalo.onboarding.citylocationselection.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent", f = "CityLocationSelectionComponent.kt", l = {493, 496, TypedValues.PositionType.TYPE_TRANSITION_EASING, TypedValues.PositionType.TYPE_DRAWPATH, TypedValues.PositionType.TYPE_SIZE_PERCENT, FrameMetricsAggregator.EVERY_DURATION, 514}, m = "ensureRemoteConfigReadiness", v = 1)
final class CityLocationSelectionComponent$ensureRemoteConfigReadiness$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$ensureRemoteConfigReadiness$1(CityLocationSelectionComponent cityLocationSelectionComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cityLocationSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CityLocationSelectionComponent.F0(this.this$0, this);
    }
}
