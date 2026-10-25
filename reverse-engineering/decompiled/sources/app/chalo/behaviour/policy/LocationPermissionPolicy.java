package app.chalo.behaviour.policy;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/behaviour/policy/LocationPermissionPolicy;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationPermissionPolicy {
    public static final LocationPermissionPolicy b = new LocationPermissionPolicy(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1008a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/behaviour/policy/LocationPermissionPolicy$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public LocationPermissionPolicy(boolean z) {
        this.f1008a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocationPermissionPolicy) && this.f1008a == ((LocationPermissionPolicy) obj).f1008a;
    }

    public final int hashCode() {
        return this.f1008a ? 1231 : 1237;
    }

    public final String toString() {
        return cb0.k("LocationPermissionPolicy(shouldProactivelyRequestOnHomeScreen=", ")", this.f1008a);
    }
}
