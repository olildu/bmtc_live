package app.chalo.productpurchase.productselection.ui;

import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.superpass.data.models.entities.SuperPass;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionErrorDialog;", "", "SuperPassRenewError", "RecentMTicketError", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionErrorDialog$RecentMTicketError;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionErrorDialog$SuperPassRenewError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductSelectionErrorDialog {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionErrorDialog$RecentMTicketError;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionErrorDialog;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentMTicketError extends ProductSelectionErrorDialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8675a;
        public final String b;
        public final String c;
        public final Function0 d;
        public final String e;
        public final Function0 f;

        public RecentMTicketError(String str, String str2, String positiveCtaText, String str3, Function0 positiveCtaOnClick, Function0 function0) {
            Intrinsics.i(positiveCtaText, "positiveCtaText");
            Intrinsics.i(positiveCtaOnClick, "positiveCtaOnClick");
            this.f8675a = str;
            this.b = str2;
            this.c = positiveCtaText;
            this.d = positiveCtaOnClick;
            this.e = str3;
            this.f = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentMTicketError)) {
                return false;
            }
            RecentMTicketError recentMTicketError = (RecentMTicketError) obj;
            return Intrinsics.d(this.f8675a, recentMTicketError.f8675a) && Intrinsics.d(this.b, recentMTicketError.b) && Intrinsics.d(this.c, recentMTicketError.c) && Intrinsics.d(this.d, recentMTicketError.d) && Intrinsics.d(this.e, recentMTicketError.e) && Intrinsics.d(this.f, recentMTicketError.f);
        }

        public final int hashCode() {
            String str = this.f8675a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.d.hashCode() + nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c)) * 31;
            String str3 = this.e;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Function0 function0 = this.f;
            return iHashCode3 + (function0 != null ? function0.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("RecentMTicketError(title=", this.f8675a, ", description=", this.b, ", positiveCtaText=");
            sbE.append(this.c);
            sbE.append(", positiveCtaOnClick=");
            sbE.append(this.d);
            sbE.append(", negativeCtaText=");
            sbE.append(this.e);
            sbE.append(", negativeCtaOnClick=");
            sbE.append(this.f);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionErrorDialog$SuperPassRenewError;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionErrorDialog;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuperPassRenewError extends ProductSelectionErrorDialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8676a;
        public final SuperPass b;
        public final String c;
        public final String d;
        public final BookableSuperPassConfiguration e;

        public SuperPassRenewError(boolean z, SuperPass pass, String str, String str2, BookableSuperPassConfiguration bookableSuperPassConfiguration) {
            Intrinsics.i(pass, "pass");
            this.f8676a = z;
            this.b = pass;
            this.c = str;
            this.d = str2;
            this.e = bookableSuperPassConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperPassRenewError)) {
                return false;
            }
            SuperPassRenewError superPassRenewError = (SuperPassRenewError) obj;
            return this.f8676a == superPassRenewError.f8676a && Intrinsics.d(this.b, superPassRenewError.b) && Intrinsics.d(this.c, superPassRenewError.c) && Intrinsics.d(this.d, superPassRenewError.d) && Intrinsics.d(this.e, superPassRenewError.e);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + ((this.f8676a ? 1231 : 1237) * 31)) * 31;
            String str = this.c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BookableSuperPassConfiguration bookableSuperPassConfiguration = this.e;
            return iHashCode3 + (bookableSuperPassConfiguration != null ? bookableSuperPassConfiguration.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperPassRenewError(lShouldRedirectToConfirmation=");
            sb.append(this.f8676a);
            sb.append(", pass=");
            sb.append(this.b);
            sb.append(", title=");
            cb0.t(sb, this.c, ", reason=", this.d, ", bookableSuperPassConfiguration=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }
}
