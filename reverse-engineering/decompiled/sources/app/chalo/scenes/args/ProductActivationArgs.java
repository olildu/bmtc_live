package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.pw0;
import defpackage.r30;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/ProductActivationArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductActivationArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(10)), null, null, null, null, null, null};
    public final String b;
    public final String c;
    public final String d;
    public final Source e;
    public final String f;
    public final Long g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ProductActivationArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ProductActivationArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductActivationArgs> serializer() {
            return ProductActivationArgs$$serializer.f9298a;
        }
    }

    public ProductActivationArgs(String id, String productType, String productSubType, Source source, String str, String str2, String str3, int i) {
        source = (i & 8) != 0 ? null : source;
        boolean z = (i & 64) != 0;
        str = (i & 128) != 0 ? null : str;
        str2 = (i & 256) != 0 ? null : str2;
        str3 = (i & 512) != 0 ? null : str3;
        Intrinsics.i(id, "id");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        this.b = id;
        this.c = productType;
        this.d = productSubType;
        this.e = source;
        this.f = null;
        this.g = null;
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = str3;
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.ProductActivation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductActivationArgs)) {
            return false;
        }
        ProductActivationArgs productActivationArgs = (ProductActivationArgs) obj;
        return Intrinsics.d(this.b, productActivationArgs.b) && Intrinsics.d(this.c, productActivationArgs.c) && Intrinsics.d(this.d, productActivationArgs.d) && this.e == productActivationArgs.e && Intrinsics.d(this.f, productActivationArgs.f) && Intrinsics.d(this.g, productActivationArgs.g) && this.h == productActivationArgs.h && Intrinsics.d(this.i, productActivationArgs.i) && Intrinsics.d(this.j, productActivationArgs.j) && Intrinsics.d(this.k, productActivationArgs.k);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Source source = this.e;
        int iHashCode = (iE + (source == null ? 0 : source.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.g;
        int iHashCode3 = (((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductActivationArgs(id=", this.b, ", productType=", this.c, ", productSubType=");
        sbE.append(this.d);
        sbE.append(", source=");
        sbE.append(this.e);
        sbE.append(", walletId=");
        cb0.r(this.g, this.f, ", quickpayActivationExpiryTimestampInMillis=", ", isAfterFreshPurchase=", sbE);
        pk0.x(", bannerUiData=", this.i, ", discountPrice=", sbE, this.h);
        return r30.i(sbE, this.j, ", upsellRideOutcomeJson=", this.k, ")");
    }

    public /* synthetic */ ProductActivationArgs(int i, String str, String str2, String str3, Source source, String str4, Long l2, boolean z, String str5, String str6, String str7) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(ProductActivationArgs$$serializer.f9298a.getDescriptor(), i, 7);
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.d = str3;
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = source;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 64) == 0) {
            this.h = true;
        } else {
            this.h = z;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 512) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
    }
}
