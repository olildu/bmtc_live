package app.chalo.usercommutepreference.data.remote.request;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/SaveStopPlaceRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SaveStopPlaceRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10260a;
    public final String b;
    public final UserCommutePreferencePlaceLocationApiRequestModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/SaveStopPlaceRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/remote/request/SaveStopPlaceRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SaveStopPlaceRequestApiModel> serializer() {
            return SaveStopPlaceRequestApiModel$$serializer.f10261a;
        }
    }

    public /* synthetic */ SaveStopPlaceRequestApiModel(int i, String str, String str2, UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(SaveStopPlaceRequestApiModel$$serializer.f10261a.getDescriptor(), i, 7);
            throw null;
        }
        this.f10260a = str;
        this.b = str2;
        this.c = userCommutePreferencePlaceLocationApiRequestModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveStopPlaceRequestApiModel)) {
            return false;
        }
        SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel = (SaveStopPlaceRequestApiModel) obj;
        return Intrinsics.d(this.f10260a, saveStopPlaceRequestApiModel.f10260a) && Intrinsics.d(this.b, saveStopPlaceRequestApiModel.b) && Intrinsics.d(this.c, saveStopPlaceRequestApiModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f10260a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SaveStopPlaceRequestApiModel(tag=", this.f10260a, ", label=", this.b, ", location=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }

    public SaveStopPlaceRequestApiModel(String tag, String label, UserCommutePreferencePlaceLocationApiRequestModel userCommutePreferencePlaceLocationApiRequestModel) {
        Intrinsics.i(tag, "tag");
        Intrinsics.i(label, "label");
        this.f10260a = tag;
        this.b = label;
        this.c = userCommutePreferencePlaceLocationApiRequestModel;
    }
}
