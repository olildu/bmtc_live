package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.sg0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/MetroCardAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetroCardAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3759a;
    public final String b;
    public final String c;
    public final IconType d;
    public final RegularBusPageFeature e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/MetroCardAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/MetroCardAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetroCardAppModel> serializer() {
            return MetroCardAppModel$$serializer.f3760a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new sg0(17)), LazyKt.a(lazyThreadSafetyMode, new sg0(18))};
    }

    public /* synthetic */ MetroCardAppModel(int i, String str, String str2, String str3, IconType iconType, RegularBusPageFeature regularBusPageFeature) {
        if (17 != (i & 17)) {
            PluginExceptionsKt.b(MetroCardAppModel$$serializer.f3760a.getDescriptor(), i, 17);
            throw null;
        }
        this.f3759a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = iconType;
        }
        this.e = regularBusPageFeature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroCardAppModel)) {
            return false;
        }
        MetroCardAppModel metroCardAppModel = (MetroCardAppModel) obj;
        return Intrinsics.d(this.f3759a, metroCardAppModel.f3759a) && Intrinsics.d(this.b, metroCardAppModel.b) && Intrinsics.d(this.c, metroCardAppModel.c) && this.d == metroCardAppModel.d && this.e == metroCardAppModel.e;
    }

    public final int hashCode() {
        int iHashCode = this.f3759a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconType iconType = this.d;
        return this.e.hashCode() + ((iHashCode3 + (iconType != null ? iconType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("MetroCardAppModel(title=", this.f3759a, ", desc=", this.b, ", imageUrl=");
        sbE.append(this.c);
        sbE.append(", imageFallbackIcon=");
        sbE.append(this.d);
        sbE.append(", featureType=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }

    public MetroCardAppModel(String str, String str2, String str3, IconType iconType, RegularBusPageFeature featureType) {
        Intrinsics.i(featureType, "featureType");
        this.f3759a = str;
        this.b = str2;
        this.c = str3;
        this.d = iconType;
        this.e = featureType;
    }
}
