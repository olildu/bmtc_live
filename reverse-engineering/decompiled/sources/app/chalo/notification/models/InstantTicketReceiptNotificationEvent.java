package app.chalo.notification.models;

import defpackage.cb0;
import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/models/InstantTicketReceiptNotificationEvent;", "Lapp/chalo/notification/models/AppNotification$PunchNotification;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstantTicketReceiptNotificationEvent implements AppNotification.PunchNotification {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6547a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public InstantTicketReceiptNotificationEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f6547a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
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
        if (!(obj instanceof InstantTicketReceiptNotificationEvent)) {
            return false;
        }
        InstantTicketReceiptNotificationEvent instantTicketReceiptNotificationEvent = (InstantTicketReceiptNotificationEvent) obj;
        return Intrinsics.d(this.f6547a, instantTicketReceiptNotificationEvent.f6547a) && Intrinsics.d(this.b, instantTicketReceiptNotificationEvent.b) && Intrinsics.d(this.c, instantTicketReceiptNotificationEvent.c) && Intrinsics.d(this.d, instantTicketReceiptNotificationEvent.d) && Intrinsics.d(this.e, instantTicketReceiptNotificationEvent.e) && Intrinsics.d(this.f, instantTicketReceiptNotificationEvent.f);
    }

    @Override // app.chalo.notification.models.AppNotification
    /* JADX INFO: renamed from: getTitle, reason: from getter */
    public final String getF6547a() {
        return this.f6547a;
    }

    public final int hashCode() {
        String str = this.f6547a;
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
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("InstantTicketReceiptNotificationEvent(title=", this.f6547a, ", body=", this.b, ", productType=");
        cb0.t(sbE, this.c, ", productSubType=", this.d, ", bookingId=");
        return r30.i(sbE, this.e, ", receiptInfoString=", this.f, ")");
    }
}
