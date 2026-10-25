package app.chalo.chalobususerprofile.ui.compose;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory", f = "ChaloBusUserProfileSurveyUiStateFactory.kt", l = {TypedValues.CycleType.TYPE_WAVE_PERIOD}, m = "timeWithVariabilityStyledUIState", v = 1)
final class ChaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloBusUserProfileSurveyUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyUiStateFactory$timeWithVariabilityStyledUIState$1(ChaloBusUserProfileSurveyUiStateFactory chaloBusUserProfileSurveyUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chaloBusUserProfileSurveyUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(0L, null, this);
    }
}
