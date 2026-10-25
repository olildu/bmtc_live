package app.chalo.ncmc.data.appmodel;

import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/SemiClosedCardActivePassAppModel;", "Lapp/chalo/ncmc/data/appmodel/ChaloCardActivePass;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SemiClosedCardActivePassAppModel implements ChaloCardActivePass {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6155a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/appmodel/SemiClosedCardActivePassAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/appmodel/SemiClosedCardActivePassAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SemiClosedCardActivePassAppModel> serializer() {
            return SemiClosedCardActivePassAppModel$$serializer.f6156a;
        }
    }

    public /* synthetic */ SemiClosedCardActivePassAppModel(int i, String str, Long l, Integer num, Integer num2, Integer num3, Integer num4, String str2) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(SemiClosedCardActivePassAppModel$$serializer.f6156a.getDescriptor(), i, 127);
            throw null;
        }
        this.f6155a = str;
        this.b = l;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = str2;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardActivePass
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardActivePass
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getB() {
        return this.b;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardActivePass
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getD() {
        return this.d;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardActivePass
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardActivePass
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemiClosedCardActivePassAppModel)) {
            return false;
        }
        SemiClosedCardActivePassAppModel semiClosedCardActivePassAppModel = (SemiClosedCardActivePassAppModel) obj;
        return Intrinsics.d(this.f6155a, semiClosedCardActivePassAppModel.f6155a) && Intrinsics.d(this.b, semiClosedCardActivePassAppModel.b) && Intrinsics.d(this.c, semiClosedCardActivePassAppModel.c) && Intrinsics.d(this.d, semiClosedCardActivePassAppModel.d) && Intrinsics.d(this.e, semiClosedCardActivePassAppModel.e) && Intrinsics.d(this.f, semiClosedCardActivePassAppModel.f) && Intrinsics.d(this.g, semiClosedCardActivePassAppModel.g);
    }

    @Override // app.chalo.ncmc.data.appmodel.ChaloCardActivePass
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF6155a() {
        return this.f6155a;
    }

    public final int hashCode() {
        String str = this.f6155a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SemiClosedCardActivePassAppModel(name=");
        sb.append(this.f6155a);
        sb.append(", passExpiryTimeStamp=");
        sb.append(this.b);
        sb.append(", remainingTrips=");
        pk0.y(sb, this.c, ", maxPricePerTrip=", this.d, ", maxTripsPerDay=");
        pk0.y(sb, this.e, ", totalTrips=", this.f, ", productType=");
        return vo1.p(sb, this.g, ")");
    }

    public SemiClosedCardActivePassAppModel(String str, Long l, Integer num, Integer num2, Integer num3, Integer num4, String str2) {
        this.f6155a = str;
        this.b = l;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = str2;
    }
}
