package app.chalo.tripreceipt.data;

import app.chalo.models.EpochTimeAndZone;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.userprofile.Gender;
import defpackage.cb0;
import defpackage.ll1;
import defpackage.py;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/tripreceipt/data/TripReceiptDataAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripReceiptDataAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValidationProduct f9732a;
    public final EpochTimeAndZone b;
    public final EpochTimeAndZone c;
    public final String d;
    public final String e;
    public final Gender f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Long k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final Map p;
    public final RouteNamingSchemeType q;
    public final String r;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/tripreceipt/data/TripReceiptDataAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/tripreceipt/data/TripReceiptDataAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripReceiptDataAppModel> serializer() {
            return TripReceiptDataAppModel$$serializer.f9733a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ll1(4)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ll1(5)), null, null, null, null, null, null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ll1(6)), LazyKt.a(lazyThreadSafetyMode, new ll1(7)), null};
    }

    public /* synthetic */ TripReceiptDataAppModel(int i, ValidationProduct validationProduct, EpochTimeAndZone epochTimeAndZone, EpochTimeAndZone epochTimeAndZone2, String str, String str2, Gender gender, String str3, String str4, String str5, String str6, Long l, String str7, String str8, String str9, String str10, Map map, RouteNamingSchemeType routeNamingSchemeType, String str11) {
        if (163839 != (i & 163839)) {
            PluginExceptionsKt.b(TripReceiptDataAppModel$$serializer.f9733a.getDescriptor(), i, 163839);
            throw null;
        }
        this.f9732a = validationProduct;
        this.b = epochTimeAndZone;
        this.c = epochTimeAndZone2;
        this.d = str;
        this.e = str2;
        this.f = gender;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = l;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = str10;
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = map;
        }
        this.q = (i & 65536) == 0 ? RouteNamingSchemeType.DEFAULT : routeNamingSchemeType;
        this.r = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripReceiptDataAppModel)) {
            return false;
        }
        TripReceiptDataAppModel tripReceiptDataAppModel = (TripReceiptDataAppModel) obj;
        return Intrinsics.d(this.f9732a, tripReceiptDataAppModel.f9732a) && Intrinsics.d(this.b, tripReceiptDataAppModel.b) && Intrinsics.d(this.c, tripReceiptDataAppModel.c) && Intrinsics.d(this.d, tripReceiptDataAppModel.d) && Intrinsics.d(this.e, tripReceiptDataAppModel.e) && this.f == tripReceiptDataAppModel.f && Intrinsics.d(this.g, tripReceiptDataAppModel.g) && Intrinsics.d(this.h, tripReceiptDataAppModel.h) && Intrinsics.d(this.i, tripReceiptDataAppModel.i) && Intrinsics.d(this.j, tripReceiptDataAppModel.j) && Intrinsics.d(this.k, tripReceiptDataAppModel.k) && Intrinsics.d(this.l, tripReceiptDataAppModel.l) && Intrinsics.d(this.m, tripReceiptDataAppModel.m) && Intrinsics.d(this.n, tripReceiptDataAppModel.n) && Intrinsics.d(this.o, tripReceiptDataAppModel.o) && Intrinsics.d(this.p, tripReceiptDataAppModel.p) && this.q == tripReceiptDataAppModel.q && Intrinsics.d(this.r, tripReceiptDataAppModel.r);
    }

    public final int hashCode() {
        int iHashCode = this.f9732a.hashCode() * 31;
        EpochTimeAndZone epochTimeAndZone = this.b;
        int iHashCode2 = (iHashCode + (epochTimeAndZone == null ? 0 : epochTimeAndZone.hashCode())) * 31;
        EpochTimeAndZone epochTimeAndZone2 = this.c;
        int iHashCode3 = (iHashCode2 + (epochTimeAndZone2 == null ? 0 : epochTimeAndZone2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Gender gender = this.f;
        int iHashCode6 = (iHashCode5 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.k;
        int iHashCode11 = (iHashCode10 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.l;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.m;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.n;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.o;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map map = this.p;
        int iHashCode16 = (this.q.hashCode() + ((iHashCode15 + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        String str11 = this.r;
        return iHashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripReceiptDataAppModel(validationProduct=");
        sb.append(this.f9732a);
        sb.append(", activationTime=");
        sb.append(this.b);
        sb.append(", punchTime=");
        sb.append(this.c);
        sb.append(", fullName=");
        sb.append(this.d);
        sb.append(", dob=");
        sb.append(this.e);
        sb.append(", gender=");
        sb.append(this.f);
        sb.append(", profileImageUrl=");
        cb0.t(sb, this.g, ", routeName=", this.h, ", startStop=");
        cb0.t(sb, this.i, ", endStop=", this.j, ", amountInSubcurrency=");
        py.t(this.k, ", amountString=", this.l, ", conductorId=", sb);
        cb0.t(sb, this.m, ", vehicleNumber=", this.n, ", paymentMode=");
        sb.append(this.o);
        sb.append(", passengerCountDetails=");
        sb.append(this.p);
        sb.append(", routeNamingSchemeType=");
        sb.append(this.q);
        sb.append(", via=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
