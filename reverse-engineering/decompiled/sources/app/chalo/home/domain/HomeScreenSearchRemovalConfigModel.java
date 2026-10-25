package app.chalo.home.domain;

import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/domain/HomeScreenSearchRemovalConfigModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HomeScreenSearchRemovalConfigModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3053a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/domain/HomeScreenSearchRemovalConfigModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/domain/HomeScreenSearchRemovalConfigModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HomeScreenSearchRemovalConfigModel> serializer() {
            return HomeScreenSearchRemovalConfigModel$$serializer.f3054a;
        }
    }

    public /* synthetic */ HomeScreenSearchRemovalConfigModel(int i, String str, String str2, boolean z, String str3, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.f3053a = "";
        } else {
            this.f3053a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeScreenSearchRemovalConfigModel)) {
            return false;
        }
        HomeScreenSearchRemovalConfigModel homeScreenSearchRemovalConfigModel = (HomeScreenSearchRemovalConfigModel) obj;
        return Intrinsics.d(this.f3053a, homeScreenSearchRemovalConfigModel.f3053a) && Intrinsics.d(this.b, homeScreenSearchRemovalConfigModel.b) && this.c == homeScreenSearchRemovalConfigModel.c && Intrinsics.d(this.d, homeScreenSearchRemovalConfigModel.d) && this.e == homeScreenSearchRemovalConfigModel.e && this.f == homeScreenSearchRemovalConfigModel.f;
    }

    public final int hashCode() {
        return ((nf1.e((nf1.e(this.f3053a.hashCode() * 31, 31, this.b) + (this.c ? 1231 : 1237)) * 31, 31, this.d) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("HomeScreenSearchRemovalConfigModel(expId=", this.f3053a, ", expName=", this.b, ", isEnabled=");
        pk0.x(", variant=", this.d, ", disableSearchBarOnHomeScreen=", sbE, this.c);
        return n21.h(sbE, this.e, ", showSearchTabOnBottomNavBar=", this.f, ")");
    }

    public HomeScreenSearchRemovalConfigModel(String str, String str2) {
        this.f3053a = "";
        this.b = str;
        this.c = false;
        this.d = str2;
        this.e = false;
        this.f = false;
    }
}
