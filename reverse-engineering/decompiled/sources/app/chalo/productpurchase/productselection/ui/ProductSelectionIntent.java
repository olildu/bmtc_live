package app.chalo.productpurchase.productselection.ui;

import app.chalo.constants.Source;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.superpass.data.models.entities.SuperPass;
import defpackage.n21;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "", "InitializationIntent", "RetryFetchIntent", "ProductClickedIntent", "RecentBookingsSeeAllClickedIntent", "RecentBookingItemClickedIntent", "PassRenewConfirmationDialogClickIntent", "RecentMTicketErrorDialogOkayClickedIntent", "MTicketDisabledRouteDialogContinueClickedIntent", "MTicketDisabledRouteDialogCancelClickedIntent", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$InitializationIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$MTicketDisabledRouteDialogCancelClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$MTicketDisabledRouteDialogContinueClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$PassRenewConfirmationDialogClickIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$ProductClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RecentBookingItemClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RecentBookingsSeeAllClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RecentMTicketErrorDialogOkayClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RetryFetchIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$InitializationIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8677a;
        public final Source b;
        public final Source c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public InitializationIntent(boolean z, Source source, Source previousScreenSource, String str, boolean z2, boolean z3) {
            Intrinsics.i(source, "source");
            Intrinsics.i(previousScreenSource, "previousScreenSource");
            this.f8677a = z;
            this.b = source;
            this.c = previousScreenSource;
            this.d = str;
            this.e = z2;
            this.f = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return this.f8677a == initializationIntent.f8677a && this.b == initializationIntent.b && this.c == initializationIntent.c && Intrinsics.d(this.d, initializationIntent.d) && this.e == initializationIntent.e && this.f == initializationIntent.f;
        }

        public final int hashCode() {
            int iF = nf1.f(this.c, nf1.f(this.b, (this.f8677a ? 1231 : 1237) * 31, 31), 31);
            String str = this.d;
            return ((((iF + (str == null ? 0 : str.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitializationIntent(isFromProductGroupHook=");
            sb.append(this.f8677a);
            sb.append(", source=");
            sb.append(this.b);
            sb.append(", previousScreenSource=");
            sb.append(this.c);
            sb.append(", targetConfigId=");
            sb.append(this.d);
            sb.append(", showPremiumBusProducts=");
            return n21.h(sb, this.e, ", showPremiumBusProductsOnly=", this.f, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$MTicketDisabledRouteDialogCancelClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MTicketDisabledRouteDialogCancelClickedIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MTicketDisabledRouteDialogCancelClickedIntent f8678a = new MTicketDisabledRouteDialogCancelClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$MTicketDisabledRouteDialogContinueClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MTicketDisabledRouteDialogContinueClickedIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MTicketDisabledRouteDialogContinueClickedIntent f8679a = new MTicketDisabledRouteDialogContinueClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$PassRenewConfirmationDialogClickIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassRenewConfirmationDialogClickIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8680a;
        public final boolean b;
        public final SuperPass c;
        public final BookableSuperPassConfiguration d;

        public PassRenewConfirmationDialogClickIntent(boolean z, boolean z2, SuperPass pass, BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            Intrinsics.i(pass, "pass");
            this.f8680a = z;
            this.b = z2;
            this.c = pass;
            this.d = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassRenewConfirmationDialogClickIntent)) {
                return false;
            }
            PassRenewConfirmationDialogClickIntent passRenewConfirmationDialogClickIntent = (PassRenewConfirmationDialogClickIntent) obj;
            return this.f8680a == passRenewConfirmationDialogClickIntent.f8680a && this.b == passRenewConfirmationDialogClickIntent.b && Intrinsics.d(this.c, passRenewConfirmationDialogClickIntent.c) && Intrinsics.d(this.d, passRenewConfirmationDialogClickIntent.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((((this.f8680a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = this.d;
            return iHashCode + (bookableSuperPassConfiguration == null ? 0 : bookableSuperPassConfiguration.hashCode());
        }

        public final String toString() {
            StringBuilder sbR = nf1.r("PassRenewConfirmationDialogClickIntent(isPositiveBtnClick=", ", lShouldRedirectToConfirmation=", ", pass=", this.f8680a, this.b);
            sbR.append(this.c);
            sbR.append(", bookableSuperPassConfiguration=");
            sbR.append(this.d);
            sbR.append(")");
            return sbR.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$ProductClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductClickedIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductConfigResponseAppModel f8681a;

        public ProductClickedIntent(ProductConfigResponseAppModel productConfigResponseAppModel) {
            this.f8681a = productConfigResponseAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductClickedIntent) && Intrinsics.d(this.f8681a, ((ProductClickedIntent) obj).f8681a);
        }

        public final int hashCode() {
            return this.f8681a.hashCode();
        }

        public final String toString() {
            return "ProductClickedIntent(config=" + this.f8681a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RecentBookingItemClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentBookingItemClickedIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSelectionComponent.RecentItemsType f8682a;

        public RecentBookingItemClickedIntent(ProductSelectionComponent.RecentItemsType recentItemsType) {
            this.f8682a = recentItemsType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecentBookingItemClickedIntent) && Intrinsics.d(this.f8682a, ((RecentBookingItemClickedIntent) obj).f8682a);
        }

        public final int hashCode() {
            return this.f8682a.hashCode();
        }

        public final String toString() {
            return "RecentBookingItemClickedIntent(recentBookingItem=" + this.f8682a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RecentBookingsSeeAllClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentBookingsSeeAllClickedIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecentBookingsSeeAllClickedIntent f8683a = new RecentBookingsSeeAllClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RecentBookingsSeeAllClickedIntent);
        }

        public final int hashCode() {
            return 672041838;
        }

        public final String toString() {
            return "RecentBookingsSeeAllClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RecentMTicketErrorDialogOkayClickedIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecentMTicketErrorDialogOkayClickedIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecentMTicketErrorDialogOkayClickedIntent f8684a = new RecentMTicketErrorDialogOkayClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent$RetryFetchIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryFetchIntent extends ProductSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFetchIntent f8685a = new RetryFetchIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryFetchIntent);
        }

        public final int hashCode() {
            return -518298624;
        }

        public final String toString() {
            return "RetryFetchIntent";
        }
    }
}
