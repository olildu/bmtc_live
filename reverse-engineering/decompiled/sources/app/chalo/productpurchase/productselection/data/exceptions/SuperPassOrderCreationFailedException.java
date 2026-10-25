package app.chalo.productpurchase.productselection.data.exceptions;

import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/exceptions/SuperPassOrderCreationFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "errorCode", "Ljava/lang/Integer;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/Integer;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "b", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassOrderCreationFailedException extends Exception {
    private final Integer errorCode;
    private final GenericChaloErrorResponse genericChaloErrorResponse;

    public SuperPassOrderCreationFailedException(GenericChaloErrorResponse genericChaloErrorResponse, Integer num, String str) {
        super(str);
        this.errorCode = num;
        this.genericChaloErrorResponse = genericChaloErrorResponse;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenericChaloErrorResponse getGenericChaloErrorResponse() {
        return this.genericChaloErrorResponse;
    }
}
