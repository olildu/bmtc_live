package app.chalo.location;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/AppPermissionRequest;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AppPermissionRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5114a;
    public final List b;

    public AppPermissionRequest(List granted, List notGranted) {
        Intrinsics.i(granted, "granted");
        Intrinsics.i(notGranted, "notGranted");
        this.f5114a = granted;
        this.b = notGranted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppPermissionRequest)) {
            return false;
        }
        AppPermissionRequest appPermissionRequest = (AppPermissionRequest) obj;
        return Intrinsics.d(this.f5114a, appPermissionRequest.f5114a) && Intrinsics.d(this.b, appPermissionRequest.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5114a.hashCode() * 31);
    }

    public final String toString() {
        return "AppPermissionRequest(granted=" + this.f5114a + ", notGranted=" + this.b + ")";
    }
}
