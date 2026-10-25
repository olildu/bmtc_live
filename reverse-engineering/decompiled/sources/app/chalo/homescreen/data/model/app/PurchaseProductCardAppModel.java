package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/PurchaseProductCardAppModel;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchaseProductCardAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3784a;
    public final String b;
    public final IconType c;
    public final TicketsPageFeature d;

    public PurchaseProductCardAppModel(String str, String str2, IconType iconType, TicketsPageFeature featureType) {
        Intrinsics.i(featureType, "featureType");
        this.f3784a = str;
        this.b = str2;
        this.c = iconType;
        this.d = featureType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseProductCardAppModel)) {
            return false;
        }
        PurchaseProductCardAppModel purchaseProductCardAppModel = (PurchaseProductCardAppModel) obj;
        return Intrinsics.d(this.f3784a, purchaseProductCardAppModel.f3784a) && Intrinsics.d(this.b, purchaseProductCardAppModel.b) && this.c == purchaseProductCardAppModel.c && this.d == purchaseProductCardAppModel.d;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f3784a.hashCode() * 31, 31, this.b);
        IconType iconType = this.c;
        return this.d.hashCode() + ((iE + (iconType == null ? 0 : iconType.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PurchaseProductCardAppModel(title=", this.f3784a, ", desc=", this.b, ", icon=");
        sbE.append(this.c);
        sbE.append(", featureType=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
