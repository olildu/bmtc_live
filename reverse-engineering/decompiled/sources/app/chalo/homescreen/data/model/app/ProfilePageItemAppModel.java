package app.chalo.homescreen.data.model.app;

import defpackage.ox0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProfilePageItemAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProfilePageItemAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfilePageItemDisplayType f3780a;
    public final ProfilePageFeature b;
    public final int c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProfilePageItemAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ProfilePageItemAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProfilePageItemAppModel> serializer() {
            return ProfilePageItemAppModel$$serializer.f3781a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ox0(20)), LazyKt.a(lazyThreadSafetyMode, new ox0(21)), null, null};
    }

    public /* synthetic */ ProfilePageItemAppModel(int i, ProfilePageItemDisplayType profilePageItemDisplayType, ProfilePageFeature profilePageFeature, int i2, String str) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(ProfilePageItemAppModel$$serializer.f3781a.getDescriptor(), i, 15);
            throw null;
        }
        this.f3780a = profilePageItemDisplayType;
        this.b = profilePageFeature;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePageItemAppModel)) {
            return false;
        }
        ProfilePageItemAppModel profilePageItemAppModel = (ProfilePageItemAppModel) obj;
        return this.f3780a == profilePageItemAppModel.f3780a && this.b == profilePageItemAppModel.b && this.c == profilePageItemAppModel.c && Intrinsics.d(this.d, profilePageItemAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.b.hashCode() + (this.f3780a.hashCode() * 31)) * 31) + this.c) * 31);
    }

    public final String toString() {
        return "ProfilePageItemAppModel(displayType=" + this.f3780a + ", featureType=" + this.b + ", position=" + this.c + ", title=" + this.d + ")";
    }

    public ProfilePageItemAppModel(ProfilePageItemDisplayType displayType, ProfilePageFeature featureType, int i, String title) {
        Intrinsics.i(displayType, "displayType");
        Intrinsics.i(featureType, "featureType");
        Intrinsics.i(title, "title");
        this.f3780a = displayType;
        this.b = featureType;
        this.c = i;
        this.d = title;
    }
}
