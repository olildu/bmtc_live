package app.chalo.home.data.model.api;

import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/BackgroundApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BackgroundApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2876a;
    public final String b;
    public final PaddingApiModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/BackgroundApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/BackgroundApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BackgroundApiModel> serializer() {
            return BackgroundApiModel$$serializer.f2877a;
        }
    }

    public /* synthetic */ BackgroundApiModel(int i, String str, String str2, PaddingApiModel paddingApiModel) {
        if ((i & 1) == 0) {
            this.f2876a = null;
        } else {
            this.f2876a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = paddingApiModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundApiModel)) {
            return false;
        }
        BackgroundApiModel backgroundApiModel = (BackgroundApiModel) obj;
        return Intrinsics.d(this.f2876a, backgroundApiModel.f2876a) && Intrinsics.d(this.b, backgroundApiModel.b) && Intrinsics.d(this.c, backgroundApiModel.c);
    }

    public final int hashCode() {
        String str = this.f2876a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PaddingApiModel paddingApiModel = this.c;
        return iHashCode2 + (paddingApiModel != null ? paddingApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BackgroundApiModel(backgroundColor=", this.f2876a, ", backgroundStyle=", this.b, ", padding=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
