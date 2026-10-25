package app.chalo.usecase;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.IsLocationMandatoryForUserUseCase", f = "IsLocationMandatoryForUserUseCase.kt", l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 120, WebSocketProtocol.PAYLOAD_SHORT}, m = "getLocationAbTestingConfig", v = 1)
final class IsLocationMandatoryForUserUseCase$getLocationAbTestingConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IsLocationMandatoryForUserUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsLocationMandatoryForUserUseCase$getLocationAbTestingConfig$1(IsLocationMandatoryForUserUseCase isLocationMandatoryForUserUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = isLocationMandatoryForUserUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
