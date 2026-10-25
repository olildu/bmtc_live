package app.chalo.juspay;

import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/juspay/JuspaySignatureRemoteException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "errorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JuspaySignatureRemoteException extends Exception {
    private final GenericChaloErrorResponse errorResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspaySignatureRemoteException(GenericChaloErrorResponse genericChaloErrorResponse, String msg) {
        super(msg);
        Intrinsics.i(msg, "msg");
        this.errorResponse = genericChaloErrorResponse;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final GenericChaloErrorResponse getErrorResponse() {
        return this.errorResponse;
    }
}
