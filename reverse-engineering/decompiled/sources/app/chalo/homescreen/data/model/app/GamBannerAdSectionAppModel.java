package app.chalo.homescreen.data.model.app;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/GamBannerAdSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class GamBannerAdSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3737a;
    public final String b;
    public final String c;
    public final int d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/GamBannerAdSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/GamBannerAdSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<GamBannerAdSectionAppModel> serializer() {
            return GamBannerAdSectionAppModel$$serializer.f3738a;
        }
    }

    public /* synthetic */ GamBannerAdSectionAppModel(int i, int i2, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(GamBannerAdSectionAppModel$$serializer.f3738a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3737a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = 250;
        } else {
            this.d = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamBannerAdSectionAppModel)) {
            return false;
        }
        GamBannerAdSectionAppModel gamBannerAdSectionAppModel = (GamBannerAdSectionAppModel) obj;
        return Intrinsics.d(this.f3737a, gamBannerAdSectionAppModel.f3737a) && Intrinsics.d(this.b, gamBannerAdSectionAppModel.b) && Intrinsics.d(this.c, gamBannerAdSectionAppModel.c) && this.d == gamBannerAdSectionAppModel.d;
    }

    public final int hashCode() {
        return nf1.e(nf1.e(this.f3737a.hashCode() * 31, 31, this.b), 31, this.c) + this.d;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("GamBannerAdSectionAppModel(title=", this.f3737a, ", header=", this.b, ", desc=");
        sbE.append(this.c);
        sbE.append(", maxHeightDp=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public GamBannerAdSectionAppModel(String str, String str2, String str3, int i) {
        this.f3737a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }
}
