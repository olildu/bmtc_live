package app.chalo.checkout.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/data/model/app/InstalledUpiDetailAppModel;", "", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstalledUpiDetailAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1288a;
    public final String b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/data/model/app/InstalledUpiDetailAppModel$Companion;", "", "", "INAI_GENERIC_UPI_APP_CODE", "Ljava/lang/String;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public InstalledUpiDetailAppModel(String appName, String iconUrl, String appCode) {
        Intrinsics.i(appName, "appName");
        Intrinsics.i(iconUrl, "iconUrl");
        Intrinsics.i(appCode, "appCode");
        this.f1288a = appName;
        this.b = iconUrl;
        this.c = appCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledUpiDetailAppModel)) {
            return false;
        }
        InstalledUpiDetailAppModel installedUpiDetailAppModel = (InstalledUpiDetailAppModel) obj;
        return Intrinsics.d(this.f1288a, installedUpiDetailAppModel.f1288a) && Intrinsics.d(this.b, installedUpiDetailAppModel.b) && Intrinsics.d(this.c, installedUpiDetailAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f1288a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return vo1.p(dd.e("InstalledUpiDetailAppModel(appName=", this.f1288a, ", iconUrl=", this.b, ", appCode="), this.c, ")");
    }
}
