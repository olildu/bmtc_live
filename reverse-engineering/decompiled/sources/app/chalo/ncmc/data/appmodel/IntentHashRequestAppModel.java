package app.chalo.ncmc.data.appmodel;

import app.chalo.ncmc.uvik.UvikServiceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/IntentHashRequestAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IntentHashRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6149a;
    public final UvikServiceType b;

    public IntentHashRequestAppModel(String phoneNumber, UvikServiceType serviceType) {
        Intrinsics.i(phoneNumber, "phoneNumber");
        Intrinsics.i(serviceType, "serviceType");
        this.f6149a = phoneNumber;
        this.b = serviceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentHashRequestAppModel)) {
            return false;
        }
        IntentHashRequestAppModel intentHashRequestAppModel = (IntentHashRequestAppModel) obj;
        return Intrinsics.d(this.f6149a, intentHashRequestAppModel.f6149a) && this.b == intentHashRequestAppModel.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6149a.hashCode() * 31);
    }

    public final String toString() {
        return "IntentHashRequestAppModel(phoneNumber=" + this.f6149a + ", serviceType=" + this.b + ")";
    }
}
