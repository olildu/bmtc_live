package app.chalo.helper;

import app.chalo.data.ProductBookingBranding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingBrandingResolversKt {
    public static final ProductBookingBranding a(String str, String str2, String str3) {
        if (str != null && !StringsKt.F(str)) {
            return new ProductBookingBranding.AgencyBranding(str);
        }
        ProductBookingBranding.INSTANCE.getClass();
        return ProductBookingBranding.Companion.a(str2, str3);
    }

    public static final ProductBookingBranding b(String city, String agency) {
        Intrinsics.i(city, "city");
        Intrinsics.i(agency, "agency");
        ProductBookingBranding.INSTANCE.getClass();
        ProductBookingBranding productBookingBrandingA = ProductBookingBranding.Companion.a(city, agency);
        ProductBookingBranding.None none = ProductBookingBranding.None.INSTANCE;
        if (!Intrinsics.d(productBookingBrandingA, none)) {
            return productBookingBrandingA;
        }
        if (agency.length() <= 0) {
            agency = null;
        }
        return agency != null ? new ProductBookingBranding.AgencyBrandingText(agency) : none;
    }
}
