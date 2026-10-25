package app.chalo.tito.manager;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl", f = "TITOUnifiedFlowValidationDataManagerImpl.kt", l = {112, 115, 124}, m = "updateTitoTableOnTitoTapOutDataReceived", v = 1)
final class TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TITOUnifiedFlowValidationDataManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$1(TITOUnifiedFlowValidationDataManagerImpl tITOUnifiedFlowValidationDataManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tITOUnifiedFlowValidationDataManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
