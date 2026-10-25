package app.chalo.chalobususerprofile.ui.compose;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyUiStateFactory", f = "ChaloBusUserProfileSurveyUiStateFactory.kt", l = {40, 43, 57, EACTags.APPLICATION_IMAGE, 72, 85, 95, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 124}, m = "buildUiState", v = 1)
final class ChaloBusUserProfileSurveyUiStateFactory$buildUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChaloBusUserProfileSurveyUiStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusUserProfileSurveyUiStateFactory$buildUiState$1(ChaloBusUserProfileSurveyUiStateFactory chaloBusUserProfileSurveyUiStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chaloBusUserProfileSurveyUiStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
