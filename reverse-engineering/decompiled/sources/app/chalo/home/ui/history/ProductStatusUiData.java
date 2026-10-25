package app.chalo.home.ui.history;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.nf1;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/ProductStatusUiData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductStatusUiData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f3443a;
    public final ChaloColorToken b;
    public final String c;
    public final String d;

    public ProductStatusUiData(IconType iconType, ChaloColorToken bgColor, String infoText, String str) {
        Intrinsics.i(bgColor, "bgColor");
        Intrinsics.i(infoText, "infoText");
        this.f3443a = iconType;
        this.b = bgColor;
        this.c = infoText;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductStatusUiData)) {
            return false;
        }
        ProductStatusUiData productStatusUiData = (ProductStatusUiData) obj;
        return this.f3443a == productStatusUiData.f3443a && Intrinsics.d(this.b, productStatusUiData.b) && Intrinsics.d(this.c, productStatusUiData.c) && Intrinsics.d(this.d, productStatusUiData.d);
    }

    public final int hashCode() {
        IconType iconType = this.f3443a;
        int iE = nf1.e(z40.b(this.b, (iconType == null ? 0 : iconType.hashCode()) * 31, 31), 31, this.c);
        String str = this.d;
        return iE + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductStatusUiData(iconType=");
        sb.append(this.f3443a);
        sb.append(", bgColor=");
        sb.append(this.b);
        sb.append(", infoText=");
        return r30.i(sb, this.c, ", ctaText=", this.d, ")");
    }
}
