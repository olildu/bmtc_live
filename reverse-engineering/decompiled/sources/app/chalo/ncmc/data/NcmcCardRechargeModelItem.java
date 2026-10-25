package app.chalo.ncmc.data;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardRechargeModelItem;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NcmcCardRechargeModelItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6040a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/NcmcCardRechargeModelItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/NcmcCardRechargeModelItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NcmcCardRechargeModelItem> serializer() {
            return NcmcCardRechargeModelItem$$serializer.f6041a;
        }
    }

    public /* synthetic */ NcmcCardRechargeModelItem(int i, String str, String str2, int i2, int i3, String str3, int i4, int i5, int i6) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.b(NcmcCardRechargeModelItem$$serializer.f6041a.getDescriptor(), i, 255);
            throw null;
        }
        this.f6040a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = str3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NcmcCardRechargeModelItem)) {
            return false;
        }
        NcmcCardRechargeModelItem ncmcCardRechargeModelItem = (NcmcCardRechargeModelItem) obj;
        return Intrinsics.d(this.f6040a, ncmcCardRechargeModelItem.f6040a) && Intrinsics.d(this.b, ncmcCardRechargeModelItem.b) && this.c == ncmcCardRechargeModelItem.c && this.d == ncmcCardRechargeModelItem.d && Intrinsics.d(this.e, ncmcCardRechargeModelItem.e) && this.f == ncmcCardRechargeModelItem.f && this.g == ncmcCardRechargeModelItem.g && this.h == ncmcCardRechargeModelItem.h;
    }

    public final int hashCode() {
        return ((((nf1.e((((nf1.e(this.f6040a.hashCode() * 31, 31, this.b) + this.c) * 31) + this.d) * 31, 31, this.e) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NcmcCardRechargeModelItem(cardNo=", this.f6040a, ", kitNo=", this.b, ", offlineBalance=");
        hq0.p(this.c, this.d, ", onlineBalance=", ", programType=", sbE);
        cb0.o(this.f, this.e, ", remainingOfflineLoadLimit=", ", remainingOnlineLoadLimit=", sbE);
        return xs.h(this.g, this.h, ", status=", ")", sbE);
    }
}
