package app.chalo.productactivation.ui;

import app.chalo.constants.Source;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent;", "", "InitializationIntent", "ActivateClickedIntent", "ConfirmActivationIntent", "BackToHomeScreenIntent", "DismissDialogIntent", "BottomSheetNegativeButtonClickedIntent", "ReportProblemClickedIntent", "ViewSummaryIntent", "ViewRideReceiptIntent", "TrackUpsellRideClickedIntent", "SetUpProfileBtnClickedIntent", "UserProfileBannerShownIntent", "RouteDetailsToggleClickedIntent", "Lapp/chalo/productactivation/ui/ProductActivationIntent$ActivateClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$BackToHomeScreenIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$BottomSheetNegativeButtonClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$ConfirmActivationIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$DismissDialogIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$InitializationIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$ReportProblemClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$RouteDetailsToggleClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$SetUpProfileBtnClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$TrackUpsellRideClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$UserProfileBannerShownIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$ViewRideReceiptIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent$ViewSummaryIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductActivationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$ActivateClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivateClickedIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActivateClickedIntent f8031a = new ActivateClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivateClickedIntent);
        }

        public final int hashCode() {
            return -1803117714;
        }

        public final String toString() {
            return "ActivateClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$BackToHomeScreenIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackToHomeScreenIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackToHomeScreenIntent f8032a = new BackToHomeScreenIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$BottomSheetNegativeButtonClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BottomSheetNegativeButtonClickedIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BottomSheetNegativeButtonClickedIntent f8033a = new BottomSheetNegativeButtonClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$ConfirmActivationIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmActivationIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloUserBookingType f8034a;

        public ConfirmActivationIntent(ChaloUserBookingType chaloUserBookingType) {
            this.f8034a = chaloUserBookingType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmActivationIntent) && Intrinsics.d(this.f8034a, ((ConfirmActivationIntent) obj).f8034a);
        }

        public final int hashCode() {
            return this.f8034a.hashCode();
        }

        public final String toString() {
            return "ConfirmActivationIntent(bookingType=" + this.f8034a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$DismissDialogIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissDialogIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissDialogIntent f8035a = new DismissDialogIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissDialogIntent);
        }

        public final int hashCode() {
            return 387325228;
        }

        public final String toString() {
            return "DismissDialogIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$InitializationIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8036a;
        public final String b;
        public final String c;
        public final String d;
        public final Long e;
        public final boolean f;
        public final Source g;
        public final BannerUiDataAppModel h;
        public final String i;
        public final PremiumBusUpsellRideOutcome j;

        static {
            PremiumBusUpsellRideOutcome.Companion companion = PremiumBusUpsellRideOutcome.INSTANCE;
        }

        public InitializationIntent(String id, String type, String subType, String str, Long l, boolean z, Source source, BannerUiDataAppModel bannerUiDataAppModel, String str2, PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome) {
            Intrinsics.i(id, "id");
            Intrinsics.i(type, "type");
            Intrinsics.i(subType, "subType");
            this.f8036a = id;
            this.b = type;
            this.c = subType;
            this.d = str;
            this.e = l;
            this.f = z;
            this.g = source;
            this.h = bannerUiDataAppModel;
            this.i = str2;
            this.j = premiumBusUpsellRideOutcome;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f8036a, initializationIntent.f8036a) && Intrinsics.d(this.b, initializationIntent.b) && Intrinsics.d(this.c, initializationIntent.c) && Intrinsics.d(this.d, initializationIntent.d) && Intrinsics.d(this.e, initializationIntent.e) && this.f == initializationIntent.f && this.g == initializationIntent.g && Intrinsics.d(this.h, initializationIntent.h) && Intrinsics.d(this.i, initializationIntent.i) && Intrinsics.d(this.j, initializationIntent.j);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.f8036a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.e;
            int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31;
            Source source = this.g;
            int iHashCode3 = (iHashCode2 + (source == null ? 0 : source.hashCode())) * 31;
            BannerUiDataAppModel bannerUiDataAppModel = this.h;
            int iHashCode4 = (iHashCode3 + (bannerUiDataAppModel == null ? 0 : bannerUiDataAppModel.hashCode())) * 31;
            String str2 = this.i;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome = this.j;
            return iHashCode5 + (premiumBusUpsellRideOutcome != null ? premiumBusUpsellRideOutcome.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("InitializationIntent(id=", this.f8036a, ", type=", this.b, ", subType=");
            cb0.t(sbE, this.c, ", walletId=", this.d, ", quickpayActivationExpiryTimestampInMillis=");
            sbE.append(this.e);
            sbE.append(", isAfterFreshPurchase=");
            sbE.append(this.f);
            sbE.append(", source=");
            sbE.append(this.g);
            sbE.append(", bannerUiData=");
            sbE.append(this.h);
            sbE.append(", discountPrice=");
            sbE.append(this.i);
            sbE.append(", upsellRideOutcome=");
            sbE.append(this.j);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$ReportProblemClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReportProblemClickedIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8037a;

        public ReportProblemClickedIntent(String str) {
            this.f8037a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportProblemClickedIntent) && Intrinsics.d(this.f8037a, ((ReportProblemClickedIntent) obj).f8037a);
        }

        public final int hashCode() {
            return this.f8037a.hashCode();
        }

        public final String toString() {
            return vo1.B("ReportProblemClickedIntent(source=", this.f8037a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$RouteDetailsToggleClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDetailsToggleClickedIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteDetailsToggleClickedIntent f8038a = new RouteDetailsToggleClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteDetailsToggleClickedIntent);
        }

        public final int hashCode() {
            return 1619715252;
        }

        public final String toString() {
            return "RouteDetailsToggleClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$SetUpProfileBtnClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetUpProfileBtnClickedIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetUpProfileBtnClickedIntent f8039a = new SetUpProfileBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SetUpProfileBtnClickedIntent);
        }

        public final int hashCode() {
            return -1760821419;
        }

        public final String toString() {
            return "SetUpProfileBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$TrackUpsellRideClickedIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackUpsellRideClickedIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TrackUpsellRideClickedIntent f8040a = new TrackUpsellRideClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TrackUpsellRideClickedIntent);
        }

        public final int hashCode() {
            return -2009176299;
        }

        public final String toString() {
            return "TrackUpsellRideClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$UserProfileBannerShownIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserProfileBannerShownIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserProfileBannerShownIntent f8041a = new UserProfileBannerShownIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserProfileBannerShownIntent);
        }

        public final int hashCode() {
            return 1102957253;
        }

        public final String toString() {
            return "UserProfileBannerShownIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$ViewRideReceiptIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewRideReceiptIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewRideReceiptIntent f8042a = new ViewRideReceiptIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewRideReceiptIntent);
        }

        public final int hashCode() {
            return -1604203339;
        }

        public final String toString() {
            return "ViewRideReceiptIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationIntent$ViewSummaryIntent;", "Lapp/chalo/productactivation/ui/ProductActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewSummaryIntent extends ProductActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewSummaryIntent f8043a = new ViewSummaryIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewSummaryIntent);
        }

        public final int hashCode() {
            return -1774095813;
        }

        public final String toString() {
            return "ViewSummaryIntent";
        }
    }
}
