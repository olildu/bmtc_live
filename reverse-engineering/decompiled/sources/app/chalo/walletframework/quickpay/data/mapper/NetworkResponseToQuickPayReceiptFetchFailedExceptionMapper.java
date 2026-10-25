package app.chalo.walletframework.quickpay.data.mapper;

import app.chalo.network.config.ChaloJson;
import app.chalo.network.exception.NetworkErrorResponseParseException;
import app.chalo.network.model.ChaloError;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.network.rest.response.NetworkResponse;
import app.chalo.walletframework.quickpay.data.exception.QuickPayReceiptFetchFailedException;
import defpackage.t8;
import kotlin.Metadata;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/data/mapper/NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper {
    public static QuickPayReceiptFetchFailedException a(NetworkResponse networkResponse) {
        Object objB;
        String str;
        GenericChaloErrorResponse genericChaloErrorResponse;
        String str2 = networkResponse.c;
        if (str2 != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str2, BuiltinSerializersKt.c(ChaloError.INSTANCE.serializer()));
            } catch (Exception e) {
                networkResponse.g.b(new NetworkErrorResponseParseException(t8.g(ChaloError.class, e.getMessage(), str2)));
                objB = null;
            }
        } else {
            objB = null;
        }
        ChaloError chaloError = (ChaloError) objB;
        GenericChaloErrorResponse genericChaloErrorResponse2 = chaloError != null ? chaloError.f6493a : null;
        if (chaloError == null || (genericChaloErrorResponse = chaloError.f6493a) == null || (str = genericChaloErrorResponse.b) == null) {
            str = "Something went wrong";
        }
        return new QuickPayReceiptFetchFailedException(genericChaloErrorResponse2, str);
    }
}
