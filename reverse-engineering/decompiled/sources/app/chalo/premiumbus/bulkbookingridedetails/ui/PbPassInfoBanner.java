package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.home.data.mappers.BannerStatus;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbPassInfoBanner;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbPassInfoBanner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IconType f6935a;
    public final String b;
    public final BannerStatus c;
    public final String d;
    public final PbPassInfoBannerCtaType e;

    public PbPassInfoBanner(IconType iconType, String message, BannerStatus bannerStatus, String str, PbPassInfoBannerCtaType pbPassInfoBannerCtaType) {
        Intrinsics.i(iconType, "iconType");
        Intrinsics.i(message, "message");
        Intrinsics.i(bannerStatus, "bannerStatus");
        this.f6935a = iconType;
        this.b = message;
        this.c = bannerStatus;
        this.d = str;
        this.e = pbPassInfoBannerCtaType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbPassInfoBanner)) {
            return false;
        }
        PbPassInfoBanner pbPassInfoBanner = (PbPassInfoBanner) obj;
        return this.f6935a == pbPassInfoBanner.f6935a && Intrinsics.d(this.b, pbPassInfoBanner.b) && this.c == pbPassInfoBanner.c && Intrinsics.d(this.d, pbPassInfoBanner.d) && Intrinsics.d(this.e, pbPassInfoBanner.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + nf1.e(this.f6935a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PbPassInfoBannerCtaType pbPassInfoBannerCtaType = this.e;
        return iHashCode2 + (pbPassInfoBannerCtaType != null ? pbPassInfoBannerCtaType.hashCode() : 0);
    }

    public final String toString() {
        return "PbPassInfoBanner(iconType=" + this.f6935a + ", message=" + this.b + ", bannerStatus=" + this.c + ", ctaName=" + this.d + ", ctaType=" + this.e + ")";
    }
}
