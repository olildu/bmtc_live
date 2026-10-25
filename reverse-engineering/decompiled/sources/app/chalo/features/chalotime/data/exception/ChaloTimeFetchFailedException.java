package app.chalo.features.chalotime.data.exception;

import androidx.media3.exoplayer.upstream.CmcdData;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lapp/chalo/features/chalotime/data/exception/ChaloTimeFetchFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "genericChaloErrorResponse", "Lapp/chalo/network/model/GenericChaloErrorResponse;", "getGenericChaloErrorResponse", "()Lapp/chalo/network/model/GenericChaloErrorResponse;", "", "shouldRetry", "Z", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeFetchFailedException extends Exception {
    private final GenericChaloErrorResponse genericChaloErrorResponse;
    private final boolean shouldRetry;

    public ChaloTimeFetchFailedException(GenericChaloErrorResponse genericChaloErrorResponse, boolean z) {
        super(genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
        this.genericChaloErrorResponse = genericChaloErrorResponse;
        this.shouldRetry = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }
}
