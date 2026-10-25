package app.chalo.validationsdk.blevalidation.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle;", "", "TITOTapInData", "TITOTapOutData", "ConductorValidationPunchData", "InvalidData", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$ConductorValidationPunchData;", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$InvalidData;", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$TITOTapInData;", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$TITOTapOutData;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductValidationDataReceivedOverBle {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$ConductorValidationPunchData;", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConductorValidationPunchData extends ProductValidationDataReceivedOverBle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10502a;
        public final String b;
        public final String c;
        public final String d;
        public final long e;
        public final String f;

        public ConductorValidationPunchData(long j, String rawData, String bookingId, String str, String str2, String endStopId) {
            Intrinsics.i(rawData, "rawData");
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(endStopId, "endStopId");
            this.f10502a = rawData;
            this.b = bookingId;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = endStopId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConductorValidationPunchData)) {
                return false;
            }
            ConductorValidationPunchData conductorValidationPunchData = (ConductorValidationPunchData) obj;
            return Intrinsics.d(this.f10502a, conductorValidationPunchData.f10502a) && Intrinsics.d(this.b, conductorValidationPunchData.b) && Intrinsics.d(this.c, conductorValidationPunchData.c) && Intrinsics.d(this.d, conductorValidationPunchData.d) && this.e == conductorValidationPunchData.e && Intrinsics.d(this.f, conductorValidationPunchData.f);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(this.f10502a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            long j = this.e;
            return this.f.hashCode() + ((iE + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("ConductorValidationPunchData(rawData=", this.f10502a, ", bookingId=", this.b, ", productType=");
            cb0.t(sbE, this.c, ", productSubType=", this.d, ", punchTsInMillis=");
            dd.k(this.e, ", endStopId=", this.f, sbE);
            sbE.append(")");
            return sbE.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$InvalidData;", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidData extends ProductValidationDataReceivedOverBle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10503a;
        public final String b;

        public InvalidData(String rawData, String message) {
            Intrinsics.i(rawData, "rawData");
            Intrinsics.i(message, "message");
            this.f10503a = rawData;
            this.b = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvalidData)) {
                return false;
            }
            InvalidData invalidData = (InvalidData) obj;
            return Intrinsics.d(this.f10503a, invalidData.f10503a) && Intrinsics.d(this.b, invalidData.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10503a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("InvalidData(rawData=", this.f10503a, ", message=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$TITOTapInData;", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TITOTapInData extends ProductValidationDataReceivedOverBle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10504a;
        public final String b;
        public final String c;
        public final String d;
        public final long e;
        public final long f;
        public final long g;
        public final String h;
        public final String i;
        public final String j;
        public final long k;
        public final String l;
        public final String m;
        public final Long n;

        public TITOTapInData(String rawData, String bookingId, String productType, String productSubType, long j, long j2, long j3, String routeId, String stopId, String tripNo, long j4, String str, String str2, Long l) {
            Intrinsics.i(rawData, "rawData");
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(tripNo, "tripNo");
            this.f10504a = rawData;
            this.b = bookingId;
            this.c = productType;
            this.d = productSubType;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = routeId;
            this.i = stopId;
            this.j = tripNo;
            this.k = j4;
            this.l = str;
            this.m = str2;
            this.n = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TITOTapInData)) {
                return false;
            }
            TITOTapInData tITOTapInData = (TITOTapInData) obj;
            return Intrinsics.d(this.f10504a, tITOTapInData.f10504a) && Intrinsics.d(this.b, tITOTapInData.b) && Intrinsics.d(this.c, tITOTapInData.c) && Intrinsics.d(this.d, tITOTapInData.d) && this.e == tITOTapInData.e && this.f == tITOTapInData.f && this.g == tITOTapInData.g && Intrinsics.d(this.h, tITOTapInData.h) && Intrinsics.d(this.i, tITOTapInData.i) && Intrinsics.d(this.j, tITOTapInData.j) && this.k == tITOTapInData.k && Intrinsics.d(this.l, tITOTapInData.l) && Intrinsics.d(this.m, tITOTapInData.m) && Intrinsics.d(this.n, tITOTapInData.n);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(this.f10504a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            long j = this.e;
            int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int iE2 = nf1.e(nf1.e(nf1.e((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.h), 31, this.i), 31, this.j);
            long j4 = this.k;
            int iE3 = nf1.e((iE2 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.l);
            String str = this.m;
            int iHashCode = (iE3 + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.n;
            return iHashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("TITOTapInData(rawData=", this.f10504a, ", bookingId=", this.b, ", productType=");
            cb0.t(sbE, this.c, ", productSubType=", this.d, ", groupNo=");
            sbE.append(this.e);
            xs.r(this.f, ", activationTsInSec=", ", tapinPunchTsInMillis=", sbE);
            dd.k(this.g, ", routeId=", this.h, sbE);
            cb0.t(sbE, ", stopId=", this.i, ", tripNo=", this.j);
            xs.r(this.k, ", waybillNo=", ", vehicleNo=", sbE);
            cb0.t(sbE, this.l, ", walletId=", this.m, ", expiryTime=");
            return pk0.l(sbE, this.n, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle$TITOTapOutData;", "Lapp/chalo/validationsdk/blevalidation/data/models/app/ProductValidationDataReceivedOverBle;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TITOTapOutData extends ProductValidationDataReceivedOverBle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10505a;
        public final String b;
        public final String c;
        public final String d;
        public final long e;
        public final long f;
        public final long g;
        public final String h;
        public final String i;
        public final String j;
        public final long k;
        public final String l;
        public final String m;
        public final Integer n;
        public final String o;
        public final Long p;

        public TITOTapOutData(String rawData, String bookingId, String productType, String productSubType, long j, long j2, long j3, String routeId, String stopId, String tripNo, long j4, String str, String str2, Integer num, String str3, Long l) {
            Intrinsics.i(rawData, "rawData");
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(routeId, "routeId");
            Intrinsics.i(stopId, "stopId");
            Intrinsics.i(tripNo, "tripNo");
            this.f10505a = rawData;
            this.b = bookingId;
            this.c = productType;
            this.d = productSubType;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = routeId;
            this.i = stopId;
            this.j = tripNo;
            this.k = j4;
            this.l = str;
            this.m = str2;
            this.n = num;
            this.o = str3;
            this.p = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TITOTapOutData)) {
                return false;
            }
            TITOTapOutData tITOTapOutData = (TITOTapOutData) obj;
            return Intrinsics.d(this.f10505a, tITOTapOutData.f10505a) && Intrinsics.d(this.b, tITOTapOutData.b) && Intrinsics.d(this.c, tITOTapOutData.c) && Intrinsics.d(this.d, tITOTapOutData.d) && this.e == tITOTapOutData.e && this.f == tITOTapOutData.f && this.g == tITOTapOutData.g && Intrinsics.d(this.h, tITOTapOutData.h) && Intrinsics.d(this.i, tITOTapOutData.i) && Intrinsics.d(this.j, tITOTapOutData.j) && this.k == tITOTapOutData.k && Intrinsics.d(this.l, tITOTapOutData.l) && Intrinsics.d(this.m, tITOTapOutData.m) && Intrinsics.d(this.n, tITOTapOutData.n) && Intrinsics.d(this.o, tITOTapOutData.o) && Intrinsics.d(this.p, tITOTapOutData.p);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(nf1.e(this.f10505a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            long j = this.e;
            int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int iE2 = nf1.e(nf1.e(nf1.e((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.h), 31, this.i), 31, this.j);
            long j4 = this.k;
            int i3 = (iE2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            String str = this.l;
            int iHashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.m;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.n;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.o;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l = this.p;
            return iHashCode4 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("TITOTapOutData(rawData=", this.f10505a, ", bookingId=", this.b, ", productType=");
            cb0.t(sbE, this.c, ", productSubType=", this.d, ", groupNo=");
            sbE.append(this.e);
            xs.r(this.f, ", activationTsInSec=", ", tapOutTsInMillis=", sbE);
            dd.k(this.g, ", routeId=", this.h, sbE);
            cb0.t(sbE, ", stopId=", this.i, ", tripNo=", this.j);
            xs.r(this.k, ", waybillNo=", ", conductorId=", sbE);
            cb0.t(sbE, this.l, ", busNo=", this.m, ", passengerCount=");
            gf.w(this.n, ", walletId=", this.o, ", expiryTime=", sbE);
            return pk0.l(sbE, this.p, ")");
        }
    }
}
