package app.chalo.livetracking.routedetails.domain;

import androidx.compose.ui.spatial.RectListKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.routedetails.domain.GetEtaUiModelForStopFromRtsData", f = "GetEtaUiModelForStopFromRtsData.kt", l = {40, 43, 44, RectListKt.BitOffsetForGesturable, EACTags.APPLICATION_IMAGE}, m = "invoke", v = 1)
final class GetEtaUiModelForStopFromRtsData$invoke$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetEtaUiModelForStopFromRtsData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetEtaUiModelForStopFromRtsData$invoke$1(GetEtaUiModelForStopFromRtsData getEtaUiModelForStopFromRtsData, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = getEtaUiModelForStopFromRtsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(false, 0, null, null, null, this);
    }
}
