package app.chalo.location;

import com.google.android.gms.common.api.ResolvableApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/SettingsResolutionException;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsResolutionException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResolvableApiException f5159a;
    public final int b;
    public final String c;

    public SettingsResolutionException(ResolvableApiException exception) {
        Intrinsics.i(exception, "exception");
        ResolvableApiException resolvableApiException = this.f5159a;
        this.b = resolvableApiException != null ? resolvableApiException.getStatusCode() : -1;
        ResolvableApiException resolvableApiException2 = this.f5159a;
        this.c = resolvableApiException2 != null ? resolvableApiException2.getMessage() : null;
        this.f5159a = exception;
    }
}
