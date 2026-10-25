package app.chalo.home.data.model.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/HomeScreenConfigResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HomeScreenConfigResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetadataApiModel f2888a;
    public final UiConfigApiModel b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/HomeScreenConfigResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/HomeScreenConfigResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HomeScreenConfigResponseApiModel> serializer() {
            return HomeScreenConfigResponseApiModel$$serializer.f2889a;
        }
    }

    public /* synthetic */ HomeScreenConfigResponseApiModel(int i, MetadataApiModel metadataApiModel, UiConfigApiModel uiConfigApiModel) {
        if ((i & 1) == 0) {
            this.f2888a = null;
        } else {
            this.f2888a = metadataApiModel;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uiConfigApiModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeScreenConfigResponseApiModel)) {
            return false;
        }
        HomeScreenConfigResponseApiModel homeScreenConfigResponseApiModel = (HomeScreenConfigResponseApiModel) obj;
        return Intrinsics.d(this.f2888a, homeScreenConfigResponseApiModel.f2888a) && Intrinsics.d(this.b, homeScreenConfigResponseApiModel.b);
    }

    public final int hashCode() {
        MetadataApiModel metadataApiModel = this.f2888a;
        int iHashCode = (metadataApiModel == null ? 0 : metadataApiModel.f2892a.hashCode()) * 31;
        UiConfigApiModel uiConfigApiModel = this.b;
        return iHashCode + (uiConfigApiModel != null ? uiConfigApiModel.hashCode() : 0);
    }

    public final String toString() {
        return "HomeScreenConfigResponseApiModel(metadata=" + this.f2888a + ", data=" + this.b + ")";
    }
}
