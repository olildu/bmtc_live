package app.chalo.electricitybill.data.exceptions;

import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/electricitybill/data/exceptions/ElectricityBillGetPaymentHistoryException;", "", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "errorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectricityBillGetPaymentHistoryException extends Throwable {
    private final GenericChaloErrorResponse errorResponse;

    public ElectricityBillGetPaymentHistoryException(GenericChaloErrorResponse genericChaloErrorResponse, String str) {
        super(str);
        this.errorResponse = genericChaloErrorResponse;
    }
}
