package app.chalo.usercommutepreference.data.remote.request;

import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/SaveCommutePreferenceRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SaveCommutePreferenceRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SaveStopPlaceRequestApiModel f10256a;
    public final SaveStopPlaceRequestApiModel b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usercommutepreference/data/remote/request/SaveCommutePreferenceRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usercommutepreference/data/remote/request/SaveCommutePreferenceRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SaveCommutePreferenceRequestApiModel> serializer() {
            return SaveCommutePreferenceRequestApiModel$$serializer.f10257a;
        }
    }

    public /* synthetic */ SaveCommutePreferenceRequestApiModel(int i, SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel, SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel2, Long l, Long l2, Long l3, Long l4, String str) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(SaveCommutePreferenceRequestApiModel$$serializer.f10257a.getDescriptor(), i, 127);
            throw null;
        }
        this.f10256a = saveStopPlaceRequestApiModel;
        this.b = saveStopPlaceRequestApiModel2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveCommutePreferenceRequestApiModel)) {
            return false;
        }
        SaveCommutePreferenceRequestApiModel saveCommutePreferenceRequestApiModel = (SaveCommutePreferenceRequestApiModel) obj;
        return Intrinsics.d(this.f10256a, saveCommutePreferenceRequestApiModel.f10256a) && Intrinsics.d(this.b, saveCommutePreferenceRequestApiModel.b) && Intrinsics.d(this.c, saveCommutePreferenceRequestApiModel.c) && Intrinsics.d(this.d, saveCommutePreferenceRequestApiModel.d) && Intrinsics.d(this.e, saveCommutePreferenceRequestApiModel.e) && Intrinsics.d(this.f, saveCommutePreferenceRequestApiModel.f) && Intrinsics.d(this.g, saveCommutePreferenceRequestApiModel.g);
    }

    public final int hashCode() {
        SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel = this.f10256a;
        int iHashCode = (saveStopPlaceRequestApiModel == null ? 0 : saveStopPlaceRequestApiModel.hashCode()) * 31;
        SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel2 = this.b;
        int iHashCode2 = (iHashCode + (saveStopPlaceRequestApiModel2 == null ? 0 : saveStopPlaceRequestApiModel2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.g;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SaveCommutePreferenceRequestApiModel(origin=");
        sb.append(this.f10256a);
        sb.append(", destination=");
        sb.append(this.b);
        sb.append(", leaveByTime=");
        nf1.w(sb, this.c, ", leaveByVarianceMin=", this.d, ", reachByTime=");
        nf1.w(sb, this.e, ", reachByVarianceMin=", this.f, ", commuteFrequency=");
        return vo1.p(sb, this.g, ")");
    }

    public SaveCommutePreferenceRequestApiModel(SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel, SaveStopPlaceRequestApiModel saveStopPlaceRequestApiModel2, Long l, Long l2, Long l3, Long l4, String str) {
        this.f10256a = saveStopPlaceRequestApiModel;
        this.b = saveStopPlaceRequestApiModel2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = str;
    }
}
