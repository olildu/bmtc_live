package app.chalo.homescreen.data.model.app;

import app.chalo.providers.ChaloCtaDisplayType;
import defpackage.dd;
import defpackage.jk0;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NearbyRoutesSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class NearbyRoutesSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3768a;
    public final String b;
    public final ChaloCtaDisplayType c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/NearbyRoutesSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/NearbyRoutesSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<NearbyRoutesSectionAppModel> serializer() {
            return NearbyRoutesSectionAppModel$$serializer.f3769a;
        }
    }

    public /* synthetic */ NearbyRoutesSectionAppModel(int i, String str, String str2, ChaloCtaDisplayType chaloCtaDisplayType) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(NearbyRoutesSectionAppModel$$serializer.f3769a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3768a = str;
        this.b = str2;
        this.c = chaloCtaDisplayType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRoutesSectionAppModel)) {
            return false;
        }
        NearbyRoutesSectionAppModel nearbyRoutesSectionAppModel = (NearbyRoutesSectionAppModel) obj;
        return Intrinsics.d(this.f3768a, nearbyRoutesSectionAppModel.f3768a) && Intrinsics.d(this.b, nearbyRoutesSectionAppModel.b) && this.c == nearbyRoutesSectionAppModel.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f3768a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("NearbyRoutesSectionAppModel(sectionTitle=", this.f3768a, ", sectionCta=", this.b, ", sectionCtaDisplayType=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
