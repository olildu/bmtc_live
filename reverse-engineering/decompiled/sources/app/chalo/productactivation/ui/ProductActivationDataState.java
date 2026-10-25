package app.chalo.productactivation.ui;

import app.chalo.constants.Source;
import app.chalo.data.ProductBookingBranding;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.productactivation.data.ActivationProductData;
import app.chalo.userprofile.Gender;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductActivationDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationProduct f8029a;
    public final ActivationProductData b;
    public final ProductActivationDialogType c;
    public final ProductBookingBranding d;
    public final boolean e;
    public final Source f;
    public final BannerUiDataAppModel g;
    public final String h;
    public final Gender i;
    public final boolean j;
    public final PremiumBusUpsellRideOutcome k;
    public final PremiumReserveTicketAppModel l;
    public final boolean m;
    public final boolean n;

    static {
        PremiumBusUpsellRideOutcome.Companion companion = PremiumBusUpsellRideOutcome.INSTANCE;
        ProductBookingBranding.Companion companion2 = ProductBookingBranding.INSTANCE;
        ValidationProduct.Companion companion3 = ValidationProduct.INSTANCE;
    }

    public ProductActivationDataState(ValidationProduct validationProduct, ActivationProductData activationProductData, ProductActivationDialogType productActivationDialogType, ProductBookingBranding brandingType, boolean z, Source source, BannerUiDataAppModel bannerUiDataAppModel, String str, Gender gender, boolean z2, PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome, PremiumReserveTicketAppModel premiumReserveTicketAppModel, boolean z3, boolean z4) {
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(gender, "gender");
        this.f8029a = validationProduct;
        this.b = activationProductData;
        this.c = productActivationDialogType;
        this.d = brandingType;
        this.e = z;
        this.f = source;
        this.g = bannerUiDataAppModel;
        this.h = str;
        this.i = gender;
        this.j = z2;
        this.k = premiumBusUpsellRideOutcome;
        this.l = premiumReserveTicketAppModel;
        this.m = z3;
        this.n = z4;
    }

    public static ProductActivationDataState a(ProductActivationDataState productActivationDataState, ValidationProduct validationProduct, ActivationProductData activationProductData, ProductActivationDialogType.ProductActivationFailedDialog productActivationFailedDialog, ProductBookingBranding productBookingBranding, boolean z, Source source, BannerUiDataAppModel bannerUiDataAppModel, String str, Gender gender, boolean z2, PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome, PremiumReserveTicketAppModel premiumReserveTicketAppModel, boolean z3, int i) {
        ValidationProduct validationProduct2 = (i & 1) != 0 ? productActivationDataState.f8029a : validationProduct;
        ActivationProductData activationProductData2 = (i & 2) != 0 ? productActivationDataState.b : activationProductData;
        ProductActivationDialogType productActivationDialogType = (i & 4) != 0 ? productActivationDataState.c : productActivationFailedDialog;
        ProductBookingBranding brandingType = (i & 8) != 0 ? productActivationDataState.d : productBookingBranding;
        boolean z4 = (i & 16) != 0 ? productActivationDataState.e : z;
        Source source2 = (i & 32) != 0 ? productActivationDataState.f : source;
        BannerUiDataAppModel bannerUiDataAppModel2 = (i & 64) != 0 ? productActivationDataState.g : bannerUiDataAppModel;
        String str2 = (i & 128) != 0 ? productActivationDataState.h : str;
        Gender gender2 = (i & 256) != 0 ? productActivationDataState.i : gender;
        boolean z5 = (i & 512) != 0 ? productActivationDataState.j : z2;
        PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome2 = (i & 1024) != 0 ? productActivationDataState.k : premiumBusUpsellRideOutcome;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel2 = (i & 2048) != 0 ? productActivationDataState.l : premiumReserveTicketAppModel;
        boolean z6 = (i & 4096) != 0 ? productActivationDataState.m : true;
        boolean z7 = (i & 8192) != 0 ? productActivationDataState.n : z3;
        productActivationDataState.getClass();
        Intrinsics.i(brandingType, "brandingType");
        Intrinsics.i(gender2, "gender");
        return new ProductActivationDataState(validationProduct2, activationProductData2, productActivationDialogType, brandingType, z4, source2, bannerUiDataAppModel2, str2, gender2, z5, premiumBusUpsellRideOutcome2, premiumReserveTicketAppModel2, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductActivationDataState)) {
            return false;
        }
        ProductActivationDataState productActivationDataState = (ProductActivationDataState) obj;
        return Intrinsics.d(this.f8029a, productActivationDataState.f8029a) && Intrinsics.d(this.b, productActivationDataState.b) && Intrinsics.d(this.c, productActivationDataState.c) && Intrinsics.d(this.d, productActivationDataState.d) && this.e == productActivationDataState.e && this.f == productActivationDataState.f && Intrinsics.d(this.g, productActivationDataState.g) && Intrinsics.d(this.h, productActivationDataState.h) && this.i == productActivationDataState.i && this.j == productActivationDataState.j && Intrinsics.d(this.k, productActivationDataState.k) && Intrinsics.d(this.l, productActivationDataState.l) && this.m == productActivationDataState.m && this.n == productActivationDataState.n;
    }

    public final int hashCode() {
        ValidationProduct validationProduct = this.f8029a;
        int iHashCode = (validationProduct == null ? 0 : validationProduct.hashCode()) * 31;
        ActivationProductData activationProductData = this.b;
        int iHashCode2 = (iHashCode + (activationProductData == null ? 0 : activationProductData.hashCode())) * 31;
        ProductActivationDialogType productActivationDialogType = this.c;
        int iHashCode3 = (((this.d.hashCode() + ((iHashCode2 + (productActivationDialogType == null ? 0 : productActivationDialogType.hashCode())) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31;
        Source source = this.f;
        int iHashCode4 = (iHashCode3 + (source == null ? 0 : source.hashCode())) * 31;
        BannerUiDataAppModel bannerUiDataAppModel = this.g;
        int iHashCode5 = (iHashCode4 + (bannerUiDataAppModel == null ? 0 : bannerUiDataAppModel.hashCode())) * 31;
        String str = this.h;
        int iHashCode6 = (((this.i.hashCode() + ((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.j ? 1231 : 1237)) * 31;
        PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome = this.k;
        int iHashCode7 = (iHashCode6 + (premiumBusUpsellRideOutcome == null ? 0 : premiumBusUpsellRideOutcome.hashCode())) * 31;
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = this.l;
        return ((((iHashCode7 + (premiumReserveTicketAppModel != null ? premiumReserveTicketAppModel.hashCode() : 0)) * 31) + (this.m ? 1231 : 1237)) * 31) + (this.n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductActivationDataState(validationProduct=");
        sb.append(this.f8029a);
        sb.append(", activationProduct=");
        sb.append(this.b);
        sb.append(", dialogType=");
        sb.append(this.c);
        sb.append(", brandingType=");
        sb.append(this.d);
        sb.append(", showBottomSheet=");
        sb.append(this.e);
        sb.append(", source=");
        sb.append(this.f);
        sb.append(", bannerUiData=");
        sb.append(this.g);
        sb.append(", discountPrice=");
        sb.append(this.h);
        sb.append(", gender=");
        sb.append(this.i);
        sb.append(", showUserProfilingTicketActivationBanner=");
        sb.append(this.j);
        sb.append(", upsellRideOutcome=");
        sb.append(this.k);
        sb.append(", upsellRideTicket=");
        sb.append(this.l);
        sb.append(", hasResolvedUpsellRideTicket=");
        return n21.h(sb, this.m, ", isRouteDetailsSectionToggled=", this.n, ")");
    }
}
