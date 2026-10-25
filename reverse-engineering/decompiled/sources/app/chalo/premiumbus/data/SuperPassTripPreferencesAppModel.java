package app.chalo.premiumbus.data;

import defpackage.cb0;
import defpackage.jg1;
import defpackage.vo1;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassTripPreferencesAppModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassTripPreferencesAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jg1(8)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6971a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/data/SuperPassTripPreferencesAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/data/SuperPassTripPreferencesAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassTripPreferencesAppModel> serializer() {
            return SuperPassTripPreferencesAppModel$$serializer.f6972a;
        }
    }

    public /* synthetic */ SuperPassTripPreferencesAppModel(int i, String str, String str2, String str3, String str4, List list) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(SuperPassTripPreferencesAppModel$$serializer.f6972a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6971a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassTripPreferencesAppModel)) {
            return false;
        }
        SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel = (SuperPassTripPreferencesAppModel) obj;
        return Intrinsics.d(this.f6971a, superPassTripPreferencesAppModel.f6971a) && Intrinsics.d(this.b, superPassTripPreferencesAppModel.b) && Intrinsics.d(this.c, superPassTripPreferencesAppModel.c) && Intrinsics.d(this.d, superPassTripPreferencesAppModel.d) && Intrinsics.d(this.e, superPassTripPreferencesAppModel.e);
    }

    public final int hashCode() {
        List list = this.f6971a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassTripPreferencesAppModel(routeIds=");
        sb.append(this.f6971a);
        sb.append(", startStopId=");
        sb.append(this.b);
        sb.append(", startStopName=");
        cb0.t(sb, this.c, ", endStopId=", this.d, ", endStopName=");
        return vo1.p(sb, this.e, ")");
    }

    public SuperPassTripPreferencesAppModel(String str, String str2, String str3, String str4, List list) {
        this.f6971a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }
}
