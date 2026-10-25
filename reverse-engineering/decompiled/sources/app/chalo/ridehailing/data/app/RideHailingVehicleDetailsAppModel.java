package app.chalo.ridehailing.data.app;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.x11;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingVehicleDetailsAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideHailingVehicleDetailsAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(28)), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideHailingVehicleCategory f9117a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridehailing/data/app/RideHailingVehicleDetailsAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridehailing/data/app/RideHailingVehicleDetailsAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideHailingVehicleDetailsAppModel> serializer() {
            return RideHailingVehicleDetailsAppModel$$serializer.f9118a;
        }
    }

    public /* synthetic */ RideHailingVehicleDetailsAppModel(int i2, RideHailingVehicleCategory rideHailingVehicleCategory, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (255 != (i2 & 255)) {
            PluginExceptionsKt.b(RideHailingVehicleDetailsAppModel$$serializer.f9118a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f9117a = rideHailingVehicleCategory;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideHailingVehicleDetailsAppModel)) {
            return false;
        }
        RideHailingVehicleDetailsAppModel rideHailingVehicleDetailsAppModel = (RideHailingVehicleDetailsAppModel) obj;
        return this.f9117a == rideHailingVehicleDetailsAppModel.f9117a && Intrinsics.d(this.b, rideHailingVehicleDetailsAppModel.b) && Intrinsics.d(this.c, rideHailingVehicleDetailsAppModel.c) && Intrinsics.d(this.d, rideHailingVehicleDetailsAppModel.d) && Intrinsics.d(this.e, rideHailingVehicleDetailsAppModel.e) && Intrinsics.d(this.f, rideHailingVehicleDetailsAppModel.f) && Intrinsics.d(this.g, rideHailingVehicleDetailsAppModel.g) && Intrinsics.d(this.h, rideHailingVehicleDetailsAppModel.h);
    }

    public final int hashCode() {
        int iHashCode = this.f9117a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iE = nf1.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
        String str4 = this.f;
        int iHashCode4 = (iE + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RideHailingVehicleDetailsAppModel(category=");
        sb.append(this.f9117a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", variant=");
        cb0.t(sb, this.c, ", energyType=", this.d, ", registrationNumber=");
        cb0.t(sb, this.e, ", model=", this.f, ", make=");
        return r30.i(sb, this.g, ", imageUrl=", this.h, ")");
    }
}
