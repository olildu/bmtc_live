package app.chalo.superpass.data.models.entities;

import defpackage.cb0;
import defpackage.dd;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassTripPreferences;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassTripPreferences {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9575a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassTripPreferences$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/superpass/data/models/entities/SuperPassTripPreferences;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassTripPreferences> serializer() {
            return SuperPassTripPreferences$$serializer.f9576a;
        }
    }

    public /* synthetic */ SuperPassTripPreferences(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(SuperPassTripPreferences$$serializer.f9576a.getDescriptor(), i, 31);
            throw null;
        }
        this.f9575a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassTripPreferences)) {
            return false;
        }
        SuperPassTripPreferences superPassTripPreferences = (SuperPassTripPreferences) obj;
        return Intrinsics.d(this.f9575a, superPassTripPreferences.f9575a) && Intrinsics.d(this.b, superPassTripPreferences.b) && Intrinsics.d(this.c, superPassTripPreferences.c) && Intrinsics.d(this.d, superPassTripPreferences.d) && Intrinsics.d(this.e, superPassTripPreferences.e);
    }

    public final int hashCode() {
        String str = this.f9575a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassTripPreferences(routeId=", this.f9575a, ", startStopId=", this.b, ", startStopName=");
        cb0.t(sbE, this.c, ", endStopId=", this.d, ", endStopName=");
        return vo1.p(sbE, this.e, ")");
    }

    public SuperPassTripPreferences(String str, String str2, String str3, String str4, String str5) {
        this.f9575a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
