package app.chalo.checkout.ui.screen.postpayment;

import defpackage.b3;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.q7;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "", "InstantTicket", "SuperPass", "PremiumReserveTicket", "OndcTicket", "MetroTicket", "MTicket", "MultiModalGroupTicket", "OtherProduct", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$InstantTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$MTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$MetroTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$MultiModalGroupTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$OndcTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$OtherProduct;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$PremiumReserveTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$SuperPass;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PostPaymentSuccessProductType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$InstantTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InstantTicket extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1583a;

        public InstantTicket(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f1583a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InstantTicket) && Intrinsics.d(this.f1583a, ((InstantTicket) obj).f1583a);
        }

        public final int hashCode() {
            return this.f1583a.hashCode();
        }

        public final String toString() {
            return vo1.B("InstantTicket(bookingId=", this.f1583a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$MTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MTicket extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1584a;
        public final List b;
        public final double c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final boolean k;

        public MTicket(String mTicketId, List passengerTypeList, double d, String bookingTime, String expirationTime, String cityName, String agency, String str, String str2, String str3, boolean z) {
            Intrinsics.i(mTicketId, "mTicketId");
            Intrinsics.i(passengerTypeList, "passengerTypeList");
            Intrinsics.i(bookingTime, "bookingTime");
            Intrinsics.i(expirationTime, "expirationTime");
            Intrinsics.i(cityName, "cityName");
            Intrinsics.i(agency, "agency");
            this.f1584a = mTicketId;
            this.b = passengerTypeList;
            this.c = d;
            this.d = bookingTime;
            this.e = expirationTime;
            this.f = cityName;
            this.g = agency;
            this.h = str;
            this.i = str2;
            this.j = str3;
            this.k = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MTicket)) {
                return false;
            }
            MTicket mTicket = (MTicket) obj;
            return Intrinsics.d(this.f1584a, mTicket.f1584a) && Intrinsics.d(this.b, mTicket.b) && Double.compare(this.c, mTicket.c) == 0 && Intrinsics.d(this.d, mTicket.d) && Intrinsics.d(this.e, mTicket.e) && Intrinsics.d(this.f, mTicket.f) && Intrinsics.d(this.g, mTicket.g) && Intrinsics.d(this.h, mTicket.h) && Intrinsics.d(this.i, mTicket.i) && Intrinsics.d(this.j, mTicket.j) && this.k == mTicket.k;
        }

        public final int hashCode() {
            int iB = r30.b(this.f1584a.hashCode() * 31, 31, this.b);
            long jDoubleToLongBits = Double.doubleToLongBits(this.c);
            return nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((iB + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j) + (this.k ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbH = q7.h("MTicket(mTicketId=", this.f1584a, ", passengerTypeList=", ", totalFare=", this.b);
            sbH.append(this.c);
            sbH.append(", bookingTime=");
            sbH.append(this.d);
            cb0.t(sbH, ", expirationTime=", this.e, ", cityName=", this.f);
            cb0.t(sbH, ", agency=", this.g, ", upTripRouteId=", this.h);
            cb0.t(sbH, ", upTripStartStopId=", this.i, ", upTripEndStopId=", this.j);
            sbH.append(", isFreeRide=");
            sbH.append(this.k);
            sbH.append(")");
            return sbH.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$MetroTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MetroTicket extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1585a;

        public MetroTicket(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f1585a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetroTicket) && Intrinsics.d(this.f1585a, ((MetroTicket) obj).f1585a);
        }

        public final int hashCode() {
            return this.f1585a.hashCode();
        }

        public final String toString() {
            return vo1.B("MetroTicket(bookingId=", this.f1585a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$MultiModalGroupTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiModalGroupTicket extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1586a;

        public MultiModalGroupTicket(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f1586a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiModalGroupTicket) && Intrinsics.d(this.f1586a, ((MultiModalGroupTicket) obj).f1586a);
        }

        public final int hashCode() {
            return this.f1586a.hashCode();
        }

        public final String toString() {
            return vo1.B("MultiModalGroupTicket(bookingId=", this.f1586a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$OndcTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OndcTicket extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1587a;

        public OndcTicket(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f1587a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OndcTicket) && Intrinsics.d(this.f1587a, ((OndcTicket) obj).f1587a);
        }

        public final int hashCode() {
            return this.f1587a.hashCode();
        }

        public final String toString() {
            return vo1.B("OndcTicket(bookingId=", this.f1587a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$OtherProduct;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OtherProduct extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OtherProduct f1588a = new OtherProduct();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$PremiumReserveTicket;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumReserveTicket extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1589a;

        public PremiumReserveTicket(String str) {
            this.f1589a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PremiumReserveTicket) && Intrinsics.d(this.f1589a, ((PremiumReserveTicket) obj).f1589a);
        }

        public final int hashCode() {
            return this.f1589a.hashCode();
        }

        public final String toString() {
            return vo1.B("PremiumReserveTicket(bookingId=", this.f1589a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType$SuperPass;", "Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentSuccessProductType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuperPass extends PostPaymentSuccessProductType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1590a;
        public final String b;
        public final String c;
        public final int d;
        public final boolean e;

        public SuperPass(String qrCode, String str, String passId, int i, boolean z) {
            Intrinsics.i(qrCode, "qrCode");
            Intrinsics.i(passId, "passId");
            this.f1590a = qrCode;
            this.b = str;
            this.c = passId;
            this.d = i;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperPass)) {
                return false;
            }
            SuperPass superPass = (SuperPass) obj;
            return Intrinsics.d(this.f1590a, superPass.f1590a) && Intrinsics.d(this.b, superPass.b) && Intrinsics.d(this.c, superPass.c) && this.d == superPass.d && this.e == superPass.e;
        }

        public final int hashCode() {
            return ((nf1.e(nf1.e(this.f1590a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31) + (this.e ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("SuperPass(qrCode=", this.f1590a, ", tone=", this.b, ", passId=");
            cb0.o(this.d, this.c, ", numOfTrips=", ", isPremiumBusPass=", sbE);
            return b3.g(")", sbE, this.e);
        }
    }
}
