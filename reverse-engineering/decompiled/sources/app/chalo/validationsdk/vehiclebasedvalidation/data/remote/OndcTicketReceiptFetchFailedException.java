package app.chalo.validationsdk.vehiclebasedvalidation.data.remote;

import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/data/remote/OndcTicketReceiptFetchFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getGenericChaloErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketReceiptFetchFailedException extends Exception {
    private final GenericChaloErrorResponse genericChaloErrorResponse;

    public OndcTicketReceiptFetchFailedException(GenericChaloErrorResponse genericChaloErrorResponse, String str) {
        super(str);
        this.genericChaloErrorResponse = genericChaloErrorResponse;
    }
}
