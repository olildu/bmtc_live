package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.nf1;
import defpackage.u01;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RechargeCardAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RechargeCardAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3793a;
    public final String b;
    public final IconType c;
    public final RegularBusPageFeature d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RechargeCardAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/RechargeCardAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RechargeCardAppModel> serializer() {
            return RechargeCardAppModel$$serializer.f3794a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new u01(2)), LazyKt.a(lazyThreadSafetyMode, new u01(3))};
    }

    public /* synthetic */ RechargeCardAppModel(int i, String str, String str2, IconType iconType, RegularBusPageFeature regularBusPageFeature) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.b(RechargeCardAppModel$$serializer.f3794a.getDescriptor(), i, 11);
            throw null;
        }
        this.f3793a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = iconType;
        }
        this.d = regularBusPageFeature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RechargeCardAppModel)) {
            return false;
        }
        RechargeCardAppModel rechargeCardAppModel = (RechargeCardAppModel) obj;
        return Intrinsics.d(this.f3793a, rechargeCardAppModel.f3793a) && Intrinsics.d(this.b, rechargeCardAppModel.b) && this.c == rechargeCardAppModel.c && this.d == rechargeCardAppModel.d;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f3793a.hashCode() * 31, 31, this.b);
        IconType iconType = this.c;
        return this.d.hashCode() + ((iE + (iconType == null ? 0 : iconType.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RechargeCardAppModel(title=", this.f3793a, ", imageUrl=", this.b, ", imageFallbackIcon=");
        sbE.append(this.c);
        sbE.append(", featureType=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public RechargeCardAppModel(String str, String str2, IconType iconType, RegularBusPageFeature featureType) {
        Intrinsics.i(featureType, "featureType");
        this.f3793a = str;
        this.b = str2;
        this.c = iconType;
        this.d = featureType;
    }
}
