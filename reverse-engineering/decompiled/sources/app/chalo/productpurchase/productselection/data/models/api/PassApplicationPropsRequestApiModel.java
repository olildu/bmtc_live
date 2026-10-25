package app.chalo.productpurchase.productselection.data.models.api;

import androidx.core.app.FrameMetricsAggregator;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationPropsRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassApplicationPropsRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8585a;
    public final String b;
    public final int c;
    public final String d;
    public final double e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationPropsRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationPropsRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassApplicationPropsRequestApiModel> serializer() {
            return PassApplicationPropsRequestApiModel$$serializer.f8586a;
        }
    }

    public /* synthetic */ PassApplicationPropsRequestApiModel(int i, long j, String str, int i2, String str2, double d, String str3, String str4, String str5, String str6) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.b(PassApplicationPropsRequestApiModel$$serializer.f8586a.getDescriptor(), i, FrameMetricsAggregator.EVERY_DURATION);
            throw null;
        }
        this.f8585a = j;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = d;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassApplicationPropsRequestApiModel)) {
            return false;
        }
        PassApplicationPropsRequestApiModel passApplicationPropsRequestApiModel = (PassApplicationPropsRequestApiModel) obj;
        return this.f8585a == passApplicationPropsRequestApiModel.f8585a && Intrinsics.d(this.b, passApplicationPropsRequestApiModel.b) && this.c == passApplicationPropsRequestApiModel.c && Intrinsics.d(this.d, passApplicationPropsRequestApiModel.d) && Double.compare(this.e, passApplicationPropsRequestApiModel.e) == 0 && Intrinsics.d(this.f, passApplicationPropsRequestApiModel.f) && Intrinsics.d(this.g, passApplicationPropsRequestApiModel.g) && Intrinsics.d(this.h, passApplicationPropsRequestApiModel.h) && Intrinsics.d(this.i, passApplicationPropsRequestApiModel.i);
    }

    public final int hashCode() {
        long j = this.f8585a;
        int iE = nf1.e((nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b) + this.c) * 31, 31, this.d);
        long jDoubleToLongBits = Double.doubleToLongBits(this.e);
        int i = (iE + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        String str = this.f;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassApplicationPropsRequestApiModel(passStartDate=");
        sb.append(this.f8585a);
        sb.append(", categoryId=");
        sb.append(this.b);
        sb.append(", fmId=");
        sb.append(this.c);
        sb.append(", configurationId=");
        sb.append(this.d);
        pk0.z(sb, ", passFare=", this.e, ", startStopId=");
        cb0.t(sb, this.f, ", startStopName=", this.g, ", endStopId=");
        return r30.i(sb, this.h, ", endStopName=", this.i, ")");
    }

    public PassApplicationPropsRequestApiModel(long j, String categoryId, int i, String configurationId, double d, String str, String str2, String str3, String str4) {
        Intrinsics.i(categoryId, "categoryId");
        Intrinsics.i(configurationId, "configurationId");
        this.f8585a = j;
        this.b = categoryId;
        this.c = i;
        this.d = configurationId;
        this.e = d;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }
}
