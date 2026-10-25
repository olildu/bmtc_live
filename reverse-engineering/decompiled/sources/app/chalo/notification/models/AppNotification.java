package app.chalo.notification.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lapp/chalo/notification/models/AppNotification;", "", "PassUpdate", "PaymentDone", "PassApplicationUpdate", "ChaloCardTransactionNotificationEvent", "PremiumBusTripStartedEvent", "PremiumBusTripCancelledOrRescheduledEvent", "BookingSuccessfulEvent", "PremiumBusTripStartDelayedEvent", "PremiumBusTripVehicleChangedEvent", "OndcMetroTicketCancellationEvent", "PunchNotification", "PremiumBusRefundProcessedEvent", "Companion", "Lapp/chalo/notification/models/AppNotification$BookingSuccessfulEvent;", "Lapp/chalo/notification/models/AppNotification$ChaloCardTransactionNotificationEvent;", "Lapp/chalo/notification/models/AppNotification$OndcMetroTicketCancellationEvent;", "Lapp/chalo/notification/models/AppNotification$PassApplicationUpdate;", "Lapp/chalo/notification/models/AppNotification$PassUpdate;", "Lapp/chalo/notification/models/AppNotification$PaymentDone;", "Lapp/chalo/notification/models/AppNotification$PremiumBusRefundProcessedEvent;", "Lapp/chalo/notification/models/AppNotification$PremiumBusTripCancelledOrRescheduledEvent;", "Lapp/chalo/notification/models/AppNotification$PremiumBusTripStartDelayedEvent;", "Lapp/chalo/notification/models/AppNotification$PremiumBusTripStartedEvent;", "Lapp/chalo/notification/models/AppNotification$PremiumBusTripVehicleChangedEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AppNotification {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$BookingSuccessfulEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookingSuccessfulEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6531a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public BookingSuccessfulEvent(String str, String str2, String str3, String str4, String str5) {
            this.f6531a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingSuccessfulEvent)) {
                return false;
            }
            BookingSuccessfulEvent bookingSuccessfulEvent = (BookingSuccessfulEvent) obj;
            return Intrinsics.d(this.f6531a, bookingSuccessfulEvent.f6531a) && Intrinsics.d(this.b, bookingSuccessfulEvent.b) && Intrinsics.d(this.c, bookingSuccessfulEvent.c) && Intrinsics.d(this.d, bookingSuccessfulEvent.d) && Intrinsics.d(this.e, bookingSuccessfulEvent.e);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6531a;
        }

        public final int hashCode() {
            String str = this.f6531a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("BookingSuccessfulEvent(title=", this.f6531a, ", body=", this.b, ", bookingId=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            return vo1.p(sbE, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$ChaloCardTransactionNotificationEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloCardTransactionNotificationEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6532a;
        public final String b;
        public final String c;

        public ChaloCardTransactionNotificationEvent(String str, String str2, String str3) {
            this.f6532a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloCardTransactionNotificationEvent)) {
                return false;
            }
            ChaloCardTransactionNotificationEvent chaloCardTransactionNotificationEvent = (ChaloCardTransactionNotificationEvent) obj;
            return Intrinsics.d(this.f6532a, chaloCardTransactionNotificationEvent.f6532a) && Intrinsics.d(this.b, chaloCardTransactionNotificationEvent.b) && Intrinsics.d(this.c, chaloCardTransactionNotificationEvent.c);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6532a;
        }

        public final int hashCode() {
            String str = this.f6532a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return vo1.p(dd.e("ChaloCardTransactionNotificationEvent(title=", this.f6532a, ", body=", this.b, ", cardInfoJsonString="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$OndcMetroTicketCancellationEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OndcMetroTicketCancellationEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6533a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final OndcCancellationState g;

        public OndcMetroTicketCancellationEvent(String str, String str2, String str3, String str4, String str5, String str6, OndcCancellationState ondcCancellationState) {
            this.f6533a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = ondcCancellationState;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OndcMetroTicketCancellationEvent)) {
                return false;
            }
            OndcMetroTicketCancellationEvent ondcMetroTicketCancellationEvent = (OndcMetroTicketCancellationEvent) obj;
            return Intrinsics.d(this.f6533a, ondcMetroTicketCancellationEvent.f6533a) && Intrinsics.d(this.b, ondcMetroTicketCancellationEvent.b) && Intrinsics.d(this.c, ondcMetroTicketCancellationEvent.c) && Intrinsics.d(this.d, ondcMetroTicketCancellationEvent.d) && Intrinsics.d(this.e, ondcMetroTicketCancellationEvent.e) && Intrinsics.d(this.f, ondcMetroTicketCancellationEvent.f) && this.g == ondcMetroTicketCancellationEvent.g;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6533a;
        }

        public final int hashCode() {
            String str = this.f6533a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            OndcCancellationState ondcCancellationState = this.g;
            return iHashCode6 + (ondcCancellationState != null ? ondcCancellationState.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("OndcMetroTicketCancellationEvent(title=", this.f6533a, ", body=", this.b, ", userId=");
            cb0.t(sbE, this.c, ", bookingId=", this.d, ", productType=");
            cb0.t(sbE, this.e, ", productSubType=", this.f, ", status=");
            sbE.append(this.g);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PassApplicationUpdate;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassApplicationUpdate implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6534a;
        public final String b;
        public final String c;

        public PassApplicationUpdate(String str, String str2, String str3) {
            this.f6534a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassApplicationUpdate)) {
                return false;
            }
            PassApplicationUpdate passApplicationUpdate = (PassApplicationUpdate) obj;
            return Intrinsics.d(this.f6534a, passApplicationUpdate.f6534a) && Intrinsics.d(this.b, passApplicationUpdate.b) && Intrinsics.d(this.c, passApplicationUpdate.c);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6534a;
        }

        public final int hashCode() {
            String str = this.f6534a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return vo1.p(dd.e("PassApplicationUpdate(title=", this.f6534a, ", body=", this.b, ", info="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PassUpdate;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassUpdate implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6535a;
        public final String b;

        public PassUpdate(String str, String str2) {
            this.f6535a = str;
            this.b = str2;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassUpdate)) {
                return false;
            }
            PassUpdate passUpdate = (PassUpdate) obj;
            return Intrinsics.d(this.f6535a, passUpdate.f6535a) && Intrinsics.d(this.b, passUpdate.b);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6535a;
        }

        public final int hashCode() {
            String str = this.f6535a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return vo1.o("PassUpdate(title=", this.f6535a, ", body=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PaymentDone;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaymentDone implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6536a;
        public final String b;
        public final String c;
        public final String d;

        public PaymentDone(String str, String str2, String str3, String str4) {
            this.f6536a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentDone)) {
                return false;
            }
            PaymentDone paymentDone = (PaymentDone) obj;
            return Intrinsics.d(this.f6536a, paymentDone.f6536a) && Intrinsics.d(this.b, paymentDone.b) && Intrinsics.d(this.c, paymentDone.c) && Intrinsics.d(this.d, paymentDone.d);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6536a;
        }

        public final int hashCode() {
            String str = this.f6536a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return r30.i(dd.e("PaymentDone(title=", this.f6536a, ", body=", this.b, ", userProfile="), this.c, ", passInfo=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PremiumBusRefundProcessedEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusRefundProcessedEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6537a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public PremiumBusRefundProcessedEvent(String str, String str2, String str3, String str4, String str5) {
            this.f6537a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusRefundProcessedEvent)) {
                return false;
            }
            PremiumBusRefundProcessedEvent premiumBusRefundProcessedEvent = (PremiumBusRefundProcessedEvent) obj;
            return Intrinsics.d(this.f6537a, premiumBusRefundProcessedEvent.f6537a) && Intrinsics.d(this.b, premiumBusRefundProcessedEvent.b) && Intrinsics.d(this.c, premiumBusRefundProcessedEvent.c) && Intrinsics.d(this.d, premiumBusRefundProcessedEvent.d) && Intrinsics.d(this.e, premiumBusRefundProcessedEvent.e);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6537a;
        }

        public final int hashCode() {
            String str = this.f6537a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PremiumBusRefundProcessedEvent(title=", this.f6537a, ", body=", this.b, ", bookingId=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            return vo1.p(sbE, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PremiumBusTripCancelledOrRescheduledEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTripCancelledOrRescheduledEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6538a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public PremiumBusTripCancelledOrRescheduledEvent(String str, String str2, String str3, String str4, String str5) {
            this.f6538a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusTripCancelledOrRescheduledEvent)) {
                return false;
            }
            PremiumBusTripCancelledOrRescheduledEvent premiumBusTripCancelledOrRescheduledEvent = (PremiumBusTripCancelledOrRescheduledEvent) obj;
            return Intrinsics.d(this.f6538a, premiumBusTripCancelledOrRescheduledEvent.f6538a) && Intrinsics.d(this.b, premiumBusTripCancelledOrRescheduledEvent.b) && Intrinsics.d(this.c, premiumBusTripCancelledOrRescheduledEvent.c) && Intrinsics.d(this.d, premiumBusTripCancelledOrRescheduledEvent.d) && Intrinsics.d(this.e, premiumBusTripCancelledOrRescheduledEvent.e);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6538a;
        }

        public final int hashCode() {
            String str = this.f6538a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PremiumBusTripCancelledOrRescheduledEvent(title=", this.f6538a, ", body=", this.b, ", bookingId=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            return vo1.p(sbE, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PremiumBusTripStartDelayedEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTripStartDelayedEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6539a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public PremiumBusTripStartDelayedEvent(String str, String str2, String str3, String str4, String str5) {
            this.f6539a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusTripStartDelayedEvent)) {
                return false;
            }
            PremiumBusTripStartDelayedEvent premiumBusTripStartDelayedEvent = (PremiumBusTripStartDelayedEvent) obj;
            return Intrinsics.d(this.f6539a, premiumBusTripStartDelayedEvent.f6539a) && Intrinsics.d(this.b, premiumBusTripStartDelayedEvent.b) && Intrinsics.d(this.c, premiumBusTripStartDelayedEvent.c) && Intrinsics.d(this.d, premiumBusTripStartDelayedEvent.d) && Intrinsics.d(this.e, premiumBusTripStartDelayedEvent.e);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6539a;
        }

        public final int hashCode() {
            String str = this.f6539a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PremiumBusTripStartDelayedEvent(title=", this.f6539a, ", body=", this.b, ", bookingId=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            return vo1.p(sbE, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PremiumBusTripStartedEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTripStartedEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6540a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public PremiumBusTripStartedEvent(String str, String str2, String str3, String str4, String str5) {
            this.f6540a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusTripStartedEvent)) {
                return false;
            }
            PremiumBusTripStartedEvent premiumBusTripStartedEvent = (PremiumBusTripStartedEvent) obj;
            return Intrinsics.d(this.f6540a, premiumBusTripStartedEvent.f6540a) && Intrinsics.d(this.b, premiumBusTripStartedEvent.b) && Intrinsics.d(this.c, premiumBusTripStartedEvent.c) && Intrinsics.d(this.d, premiumBusTripStartedEvent.d) && Intrinsics.d(this.e, premiumBusTripStartedEvent.e);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6540a;
        }

        public final int hashCode() {
            String str = this.f6540a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PremiumBusTripStartedEvent(title=", this.f6540a, ", body=", this.b, ", bookingId=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            return vo1.p(sbE, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PremiumBusTripVehicleChangedEvent;", "Lapp/chalo/notification/models/AppNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumBusTripVehicleChangedEvent implements AppNotification {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6541a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public PremiumBusTripVehicleChangedEvent(String str, String str2, String str3, String str4, String str5) {
            this.f6541a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBusTripVehicleChangedEvent)) {
                return false;
            }
            PremiumBusTripVehicleChangedEvent premiumBusTripVehicleChangedEvent = (PremiumBusTripVehicleChangedEvent) obj;
            return Intrinsics.d(this.f6541a, premiumBusTripVehicleChangedEvent.f6541a) && Intrinsics.d(this.b, premiumBusTripVehicleChangedEvent.b) && Intrinsics.d(this.c, premiumBusTripVehicleChangedEvent.c) && Intrinsics.d(this.d, premiumBusTripVehicleChangedEvent.d) && Intrinsics.d(this.e, premiumBusTripVehicleChangedEvent.e);
        }

        @Override // app.chalo.notification.models.AppNotification
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final String getF6546a() {
            return this.f6541a;
        }

        public final int hashCode() {
            String str = this.f6541a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.e.hashCode() + nf1.e(nf1.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PremiumBusTripVehicleChangedEvent(title=", this.f6541a, ", body=", this.b, ", bookingId=");
            cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
            return vo1.p(sbE, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\t\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PunchNotification;", "Lapp/chalo/notification/models/AppNotification;", "QuickPayNotificationEvent", "PremiumReserveTicketPunchEvent", "OndcTicketPunchEvent", "OndcMetroPunchEvent", "MTicketPunchedEvent", "Lapp/chalo/notification/models/AppNotification$PunchNotification$MTicketPunchedEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification$OndcMetroPunchEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification$OndcTicketPunchEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification$PremiumReserveTicketPunchEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification$QuickPayNotificationEvent;", "Lapp/chalo/notification/models/InstantTicketReceiptNotificationEvent;", "Lapp/chalo/notification/models/SuperPassPunchEvent;", "Lapp/chalo/notification/models/TITOTapInNotificationEvent;", "Lapp/chalo/notification/models/TITOTapOutNotificationEvent;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PunchNotification extends AppNotification {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PunchNotification$MTicketPunchedEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MTicketPunchedEvent implements PunchNotification {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6542a;
            public final String b;
            public final String c;

            public MTicketPunchedEvent(String str, String str2, String str3) {
                this.f6542a = str;
                this.b = str2;
                this.c = str3;
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getB() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MTicketPunchedEvent)) {
                    return false;
                }
                MTicketPunchedEvent mTicketPunchedEvent = (MTicketPunchedEvent) obj;
                return Intrinsics.d(this.f6542a, mTicketPunchedEvent.f6542a) && Intrinsics.d(this.b, mTicketPunchedEvent.b) && Intrinsics.d(this.c, mTicketPunchedEvent.c);
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF6546a() {
                return this.f6542a;
            }

            public final int hashCode() {
                String str = this.f6542a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return vo1.p(dd.e("MTicketPunchedEvent(title=", this.f6542a, ", body=", this.b, ", payload="), this.c, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PunchNotification$OndcMetroPunchEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OndcMetroPunchEvent implements PunchNotification {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6543a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final long f;
            public final String g;

            public OndcMetroPunchEvent(long j, String str, String str2, String str3, String str4, String str5, String str6) {
                this.f6543a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                this.f = j;
                this.g = str6;
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getB() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OndcMetroPunchEvent)) {
                    return false;
                }
                OndcMetroPunchEvent ondcMetroPunchEvent = (OndcMetroPunchEvent) obj;
                return Intrinsics.d(this.f6543a, ondcMetroPunchEvent.f6543a) && Intrinsics.d(this.b, ondcMetroPunchEvent.b) && Intrinsics.d(this.c, ondcMetroPunchEvent.c) && Intrinsics.d(this.d, ondcMetroPunchEvent.d) && Intrinsics.d(this.e, ondcMetroPunchEvent.e) && this.f == ondcMetroPunchEvent.f && Intrinsics.d(this.g, ondcMetroPunchEvent.g);
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF6546a() {
                return this.f6543a;
            }

            public final int hashCode() {
                String str = this.f6543a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int iE = nf1.e(nf1.e(nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
                long j = this.f;
                int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
                String str3 = this.g;
                return i + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbE = dd.e("OndcMetroPunchEvent(title=", this.f6543a, ", body=", this.b, ", bookingId=");
                cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
                n21.p(this.f, this.e, ", punchTime=", sbE);
                return z40.h(sbE, ", receiptInfoString=", this.g, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PunchNotification$OndcTicketPunchEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OndcTicketPunchEvent implements PunchNotification {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6544a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final long f;
            public final String g;

            public OndcTicketPunchEvent(long j, String str, String str2, String str3, String str4, String str5, String str6) {
                this.f6544a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                this.f = j;
                this.g = str6;
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getB() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OndcTicketPunchEvent)) {
                    return false;
                }
                OndcTicketPunchEvent ondcTicketPunchEvent = (OndcTicketPunchEvent) obj;
                return Intrinsics.d(this.f6544a, ondcTicketPunchEvent.f6544a) && Intrinsics.d(this.b, ondcTicketPunchEvent.b) && Intrinsics.d(this.c, ondcTicketPunchEvent.c) && Intrinsics.d(this.d, ondcTicketPunchEvent.d) && Intrinsics.d(this.e, ondcTicketPunchEvent.e) && this.f == ondcTicketPunchEvent.f && Intrinsics.d(this.g, ondcTicketPunchEvent.g);
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF6546a() {
                return this.f6544a;
            }

            public final int hashCode() {
                String str = this.f6544a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int iE = nf1.e(nf1.e(nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
                long j = this.f;
                int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
                String str3 = this.g;
                return i + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbE = dd.e("OndcTicketPunchEvent(title=", this.f6544a, ", body=", this.b, ", bookingId=");
                cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
                n21.p(this.f, this.e, ", punchTime=", sbE);
                return z40.h(sbE, ", receiptInfoString=", this.g, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PunchNotification$PremiumReserveTicketPunchEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumReserveTicketPunchEvent implements PunchNotification {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6545a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final long f;
            public final String g;

            public PremiumReserveTicketPunchEvent(long j, String str, String str2, String str3, String str4, String str5, String str6) {
                this.f6545a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                this.f = j;
                this.g = str6;
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getB() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PremiumReserveTicketPunchEvent)) {
                    return false;
                }
                PremiumReserveTicketPunchEvent premiumReserveTicketPunchEvent = (PremiumReserveTicketPunchEvent) obj;
                return Intrinsics.d(this.f6545a, premiumReserveTicketPunchEvent.f6545a) && Intrinsics.d(this.b, premiumReserveTicketPunchEvent.b) && Intrinsics.d(this.c, premiumReserveTicketPunchEvent.c) && Intrinsics.d(this.d, premiumReserveTicketPunchEvent.d) && Intrinsics.d(this.e, premiumReserveTicketPunchEvent.e) && this.f == premiumReserveTicketPunchEvent.f && Intrinsics.d(this.g, premiumReserveTicketPunchEvent.g);
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF6546a() {
                return this.f6545a;
            }

            public final int hashCode() {
                String str = this.f6545a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int iE = nf1.e(nf1.e(nf1.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
                long j = this.f;
                int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
                String str3 = this.g;
                return i + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbE = dd.e("PremiumReserveTicketPunchEvent(title=", this.f6545a, ", body=", this.b, ", bookingId=");
                cb0.t(sbE, this.c, ", productType=", this.d, ", productSubType=");
                n21.p(this.f, this.e, ", punchTime=", sbE);
                return z40.h(sbE, ", receiptInfoString=", this.g, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/AppNotification$PunchNotification$QuickPayNotificationEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class QuickPayNotificationEvent implements PunchNotification {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6546a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;
            public final String f;
            public final String g;

            public QuickPayNotificationEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                this.f6546a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
                this.e = str5;
                this.f = str6;
                this.g = str7;
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getB() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof QuickPayNotificationEvent)) {
                    return false;
                }
                QuickPayNotificationEvent quickPayNotificationEvent = (QuickPayNotificationEvent) obj;
                return Intrinsics.d(this.f6546a, quickPayNotificationEvent.f6546a) && Intrinsics.d(this.b, quickPayNotificationEvent.b) && Intrinsics.d(this.c, quickPayNotificationEvent.c) && Intrinsics.d(this.d, quickPayNotificationEvent.d) && Intrinsics.d(this.e, quickPayNotificationEvent.e) && Intrinsics.d(this.f, quickPayNotificationEvent.f) && Intrinsics.d(this.g, quickPayNotificationEvent.g);
            }

            @Override // app.chalo.notification.models.AppNotification
            /* JADX INFO: renamed from: getTitle, reason: from getter */
            public final String getF6546a() {
                return this.f6546a;
            }

            public final int hashCode() {
                String str = this.f6546a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.d;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.e;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.f;
                int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.g;
                return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbE = dd.e("QuickPayNotificationEvent(title=", this.f6546a, ", body=", this.b, ", walletId=");
                cb0.t(sbE, this.c, ", agency=", this.d, ", productType=");
                cb0.t(sbE, this.e, ", productSubType=", this.f, ", receiptInfo=");
                return vo1.p(sbE, this.g, ")");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    String getB();

    /* JADX INFO: renamed from: getTitle */
    String getF6546a();
}
