package app.chalo.chalobususerprofile.ui.compose;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory", f = "ChaloBusUserProfileSurveyUiStateFactory.kt", l = {182, 187, 193, 194, 191, ComposerKt.compositionLocalMapKey, ComposerKt.providerValuesKey, 200}, m = "createWorkTimingInputPBUserProfileUIState", v = 1)
final class ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloBusUserProfileSurveyUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyUiStateFactory$createWorkTimingInputPBUserProfileUIState$1(ChaloBusUserProfileSurveyUiStateFactory chaloBusUserProfileSurveyUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chaloBusUserProfileSurveyUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, this);
    }
}
