package app.chalo.homescreen.data.model.app;

import defpackage.a70;
import defpackage.xs;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomeScreenConfigAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HomeScreenConfigAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a70(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3749a;
    public final ProfileScreenAppModel b;
    public final List c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomeScreenConfigAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomeScreenConfigAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HomeScreenConfigAppModel> serializer() {
            return HomeScreenConfigAppModel$$serializer.f3750a;
        }
    }

    public /* synthetic */ HomeScreenConfigAppModel(int i, String str, ProfileScreenAppModel profileScreenAppModel, List list) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(HomeScreenConfigAppModel$$serializer.f3750a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3749a = str;
        this.b = profileScreenAppModel;
        this.c = list;
    }

    public static HomeScreenConfigAppModel a(HomeScreenConfigAppModel homeScreenConfigAppModel, List bottomNavConfig) {
        String str = homeScreenConfigAppModel.f3749a;
        ProfileScreenAppModel profileScreenAppModel = homeScreenConfigAppModel.b;
        homeScreenConfigAppModel.getClass();
        Intrinsics.i(bottomNavConfig, "bottomNavConfig");
        return new HomeScreenConfigAppModel(str, profileScreenAppModel, bottomNavConfig);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeScreenConfigAppModel)) {
            return false;
        }
        HomeScreenConfigAppModel homeScreenConfigAppModel = (HomeScreenConfigAppModel) obj;
        return Intrinsics.d(this.f3749a, homeScreenConfigAppModel.f3749a) && Intrinsics.d(this.b, homeScreenConfigAppModel.b) && Intrinsics.d(this.c, homeScreenConfigAppModel.c);
    }

    public final int hashCode() {
        String str = this.f3749a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ProfileScreenAppModel profileScreenAppModel = this.b;
        return this.c.hashCode() + ((iHashCode + (profileScreenAppModel != null ? profileScreenAppModel.f3782a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeScreenConfigAppModel(busService=");
        sb.append(this.f3749a);
        sb.append(", profileScreenAppModel=");
        sb.append(this.b);
        sb.append(", bottomNavConfig=");
        return xs.l(sb, this.c, ")");
    }

    public HomeScreenConfigAppModel(String str, ProfileScreenAppModel profileScreenAppModel, List list) {
        this.f3749a = str;
        this.b = profileScreenAppModel;
        this.c = list;
    }
}
