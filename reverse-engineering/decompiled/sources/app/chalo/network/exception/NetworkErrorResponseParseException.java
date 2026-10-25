package app.chalo.network.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/network/exception/NetworkErrorResponseParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "errorMessage", "Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkErrorResponseParseException extends Exception {
    private final String errorMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkErrorResponseParseException(String errorMessage) {
        super(errorMessage);
        Intrinsics.i(errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
    }
}
