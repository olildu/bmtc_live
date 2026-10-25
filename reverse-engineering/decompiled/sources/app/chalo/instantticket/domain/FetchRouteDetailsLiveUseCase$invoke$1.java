package app.chalo.instantticket.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.domain.FetchRouteDetailsLiveUseCase", f = "FetchRouteDetailsLiveUseCase.kt", l = {45, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50, 51, 55, EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, EACTags.DEPRECATED, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 120}, m = "invoke", v = 1)
final class FetchRouteDetailsLiveUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchRouteDetailsLiveUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRouteDetailsLiveUseCase$invoke$1(FetchRouteDetailsLiveUseCase fetchRouteDetailsLiveUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fetchRouteDetailsLiveUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, false, this);
    }
}
