package app.chalo.ncmc.uvik;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikServiceRequest;", "", "Creation", "BalanceUpdate", "BalanceEnquiry", "Lapp/chalo/ncmc/uvik/UvikServiceRequest$BalanceEnquiry;", "Lapp/chalo/ncmc/uvik/UvikServiceRequest$BalanceUpdate;", "Lapp/chalo/ncmc/uvik/UvikServiceRequest$Creation;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UvikServiceRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UvikServiceType f6449a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikServiceRequest$BalanceEnquiry;", "Lapp/chalo/ncmc/uvik/UvikServiceRequest;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BalanceEnquiry extends UvikServiceRequest {
        public final String e;
        public final String f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceEnquiry(String subUserId, String requestHash, String requestInvoiceNumber) {
            super(UvikServiceType.BALANCE_ENQUIRY, subUserId, requestHash, requestInvoiceNumber);
            Intrinsics.i(subUserId, "subUserId");
            Intrinsics.i(requestHash, "requestHash");
            Intrinsics.i(requestInvoiceNumber, "requestInvoiceNumber");
            this.e = subUserId;
            this.f = requestHash;
            this.g = requestInvoiceNumber;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getC() {
            return this.f;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.g;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceEnquiry)) {
                return false;
            }
            BalanceEnquiry balanceEnquiry = (BalanceEnquiry) obj;
            return Intrinsics.d(this.e, balanceEnquiry.e) && Intrinsics.d(this.f, balanceEnquiry.f) && Intrinsics.d(this.g, balanceEnquiry.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + nf1.e(this.e.hashCode() * 31, 31, this.f);
        }

        public final String toString() {
            return vo1.p(dd.e("BalanceEnquiry(subUserId=", this.e, ", requestHash=", this.f, ", requestInvoiceNumber="), this.g, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikServiceRequest$BalanceUpdate;", "Lapp/chalo/ncmc/uvik/UvikServiceRequest;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BalanceUpdate extends UvikServiceRequest {
        public final String e;
        public final String f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BalanceUpdate(String subUserId, String requestHash, String requestInvoiceNumber) {
            super(UvikServiceType.BALANCE_UPDATE, subUserId, requestHash, requestInvoiceNumber);
            Intrinsics.i(subUserId, "subUserId");
            Intrinsics.i(requestHash, "requestHash");
            Intrinsics.i(requestInvoiceNumber, "requestInvoiceNumber");
            this.e = subUserId;
            this.f = requestHash;
            this.g = requestInvoiceNumber;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getC() {
            return this.f;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.g;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BalanceUpdate)) {
                return false;
            }
            BalanceUpdate balanceUpdate = (BalanceUpdate) obj;
            return Intrinsics.d(this.e, balanceUpdate.e) && Intrinsics.d(this.f, balanceUpdate.f) && Intrinsics.d(this.g, balanceUpdate.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + nf1.e(this.e.hashCode() * 31, 31, this.f);
        }

        public final String toString() {
            return vo1.p(dd.e("BalanceUpdate(subUserId=", this.e, ", requestHash=", this.f, ", requestInvoiceNumber="), this.g, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikServiceRequest$Creation;", "Lapp/chalo/ncmc/uvik/UvikServiceRequest;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Creation extends UvikServiceRequest {
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Creation(String str, String str2, String subUserId, String requestHash, String requestInvoiceNumber) {
            super(UvikServiceType.SERVICE_CREATION, subUserId, requestHash, requestInvoiceNumber);
            Intrinsics.i(subUserId, "subUserId");
            Intrinsics.i(requestHash, "requestHash");
            Intrinsics.i(requestInvoiceNumber, "requestInvoiceNumber");
            this.e = str;
            this.f = str2;
            this.g = subUserId;
            this.h = requestHash;
            this.i = requestInvoiceNumber;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getC() {
            return this.h;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getD() {
            return this.i;
        }

        @Override // app.chalo.ncmc.uvik.UvikServiceRequest
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getB() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Creation)) {
                return false;
            }
            Creation creation = (Creation) obj;
            return Intrinsics.d(this.e, creation.e) && Intrinsics.d(this.f, creation.f) && Intrinsics.d(this.g, creation.g) && Intrinsics.d(this.h, creation.h) && Intrinsics.d(this.i, creation.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + nf1.e(nf1.e(nf1.e(this.e.hashCode() * 31, 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Creation(serviceId=", this.e, ", serviceManagementInfoNo=", this.f, ", subUserId=");
            cb0.t(sbE, this.g, ", requestHash=", this.h, ", requestInvoiceNumber=");
            return vo1.p(sbE, this.i, ")");
        }
    }

    public UvikServiceRequest(UvikServiceType uvikServiceType, String str, String str2, String str3) {
        this.f6449a = uvikServiceType;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getB() {
        return this.b;
    }
}
