package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloScenes;
import defpackage.dd;
import defpackage.ox0;
import defpackage.z40;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/ProductSelectionArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductSelectionArgs extends SceneArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final Source f;
    public final Source g;
    public final boolean h;
    public final String i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/ProductSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/ProductSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductSelectionArgs> serializer() {
            return ProductSelectionArgs$$serializer.f9299a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(16)), LazyKt.a(lazyThreadSafetyMode, new ox0(17)), null, null};
    }

    public /* synthetic */ ProductSelectionArgs(int i, String str, String str2, boolean z, boolean z2, Source source, Source source2, boolean z3, String str3) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 8) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 16) == 0) {
            this.f = Source.UNKNOWN;
        } else {
            this.f = source;
        }
        if ((i & 32) == 0) {
            this.g = Source.UNKNOWN;
        } else {
            this.g = source2;
        }
        if ((i & 64) == 0) {
            this.h = true;
        } else {
            this.h = z3;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str3;
        }
    }

    @Override // app.chalo.scenes.args.SceneArgs
    public final ChaloScenes c() {
        return ChaloScenes.ProductSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionArgs)) {
            return false;
        }
        ProductSelectionArgs productSelectionArgs = (ProductSelectionArgs) obj;
        return Intrinsics.d(this.b, productSelectionArgs.b) && Intrinsics.d(this.c, productSelectionArgs.c) && this.d == productSelectionArgs.d && this.e == productSelectionArgs.e && this.f == productSelectionArgs.f && this.g == productSelectionArgs.g && this.h == productSelectionArgs.h && Intrinsics.d(this.i, productSelectionArgs.i);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31;
        Source source = this.f;
        int iHashCode3 = (iHashCode2 + (source == null ? 0 : source.hashCode())) * 31;
        Source source2 = this.g;
        int iHashCode4 = (((iHashCode3 + (source2 == null ? 0 : source2.hashCode())) * 31) + (this.h ? 1231 : 1237)) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductSelectionArgs(routeAppModelJson=", this.b, ", targetConfigId=", this.c, ", showPremiumBusProductsOnly=");
        z40.r(sbE, this.d, ", isFromProductGroupHook=", this.e, ", previousScreenSource=");
        sbE.append(this.f);
        sbE.append(", source=");
        sbE.append(this.g);
        sbE.append(", showPremiumBusProducts=");
        sbE.append(this.h);
        sbE.append(", deeplinkAttribution=");
        sbE.append(this.i);
        sbE.append(")");
        return sbE.toString();
    }

    public ProductSelectionArgs(String str, String str2, Source source, Source source2, boolean z, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        source = (i & 16) != 0 ? Source.UNKNOWN : source;
        source2 = (i & 32) != 0 ? Source.UNKNOWN : source2;
        z = (i & 64) != 0 ? true : z;
        str3 = (i & 128) != 0 ? null : str3;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = z3;
        this.f = source;
        this.g = source2;
        this.h = z;
        this.i = str3;
    }
}
