package app.chalo.home.data.model.api;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/ProfilePageItemApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProfilePageItemApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2898a;
    public final String b;
    public final int c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/ProfilePageItemApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/ProfilePageItemApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProfilePageItemApiModel> serializer() {
            return ProfilePageItemApiModel$$serializer.f2899a;
        }
    }

    public /* synthetic */ ProfilePageItemApiModel(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(ProfilePageItemApiModel$$serializer.f2899a.getDescriptor(), i, 15);
            throw null;
        }
        this.f2898a = str;
        this.b = str2;
        this.c = i2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePageItemApiModel)) {
            return false;
        }
        ProfilePageItemApiModel profilePageItemApiModel = (ProfilePageItemApiModel) obj;
        return Intrinsics.d(this.f2898a, profilePageItemApiModel.f2898a) && Intrinsics.d(this.b, profilePageItemApiModel.b) && this.c == profilePageItemApiModel.c && Intrinsics.d(this.d, profilePageItemApiModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((nf1.e(this.f2898a.hashCode() * 31, 31, this.b) + this.c) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProfilePageItemApiModel(displayType=", this.f2898a, ", featureType=", this.b, ", position=");
        sbE.append(this.c);
        sbE.append(", title=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }
}
