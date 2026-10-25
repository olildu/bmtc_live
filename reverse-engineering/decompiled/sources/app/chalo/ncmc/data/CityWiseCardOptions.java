package app.chalo.ncmc.data;

import defpackage.ep;
import defpackage.q7;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/CityWiseCardOptions;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CityWiseCardOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ep(3)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6028a;
    public final List b;
    public final String c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/CityWiseCardOptions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/CityWiseCardOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CityWiseCardOptions> serializer() {
            return CityWiseCardOptions$$serializer.f6029a;
        }
    }

    public /* synthetic */ CityWiseCardOptions(int i, String str, String str2, String str3, List list) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.b(CityWiseCardOptions$$serializer.f6029a.getDescriptor(), i, 14);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f6028a = "";
        } else {
            this.f6028a = str;
        }
        this.b = list;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CityWiseCardOptions)) {
            return false;
        }
        CityWiseCardOptions cityWiseCardOptions = (CityWiseCardOptions) obj;
        return Intrinsics.d(this.f6028a, cityWiseCardOptions.f6028a) && Intrinsics.d(this.b, cityWiseCardOptions.b) && Intrinsics.d(this.c, cityWiseCardOptions.c) && Intrinsics.d(this.d, cityWiseCardOptions.d);
    }

    public final int hashCode() {
        int iB = r30.b(this.f6028a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return r30.i(q7.h("CityWiseCardOptions(city=", this.f6028a, ", chaloCardOptions=", ", buyCardUrl=", this.b), this.c, ", activateNcmcCardUrl=", this.d, ")");
    }
}
