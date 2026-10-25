package app.chalo.home.ui;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/PremiumBusNotificationViewState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusNotificationViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3177a;
    public final boolean b;

    public /* synthetic */ PremiumBusNotificationViewState() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusNotificationViewState)) {
            return false;
        }
        PremiumBusNotificationViewState premiumBusNotificationViewState = (PremiumBusNotificationViewState) obj;
        return Intrinsics.d(this.f3177a, premiumBusNotificationViewState.f3177a) && this.b == premiumBusNotificationViewState.b;
    }

    public final int hashCode() {
        String str = this.f3177a;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return xs.k("PremiumBusNotificationViewState(cityName=", this.f3177a, ", isLoading=", ")", this.b);
    }

    public PremiumBusNotificationViewState(String str, boolean z) {
        this.f3177a = str;
        this.b = z;
    }
}
