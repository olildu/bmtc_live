package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.e80;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomeTabHooksCardSectionData;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HomeTabHooksCardSectionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3751a;
    public final String b;
    public final int c;
    public final ItemTextDataAppModel d;
    public final HomePageFeature e;
    public final IconType f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomeTabHooksCardSectionData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomeTabHooksCardSectionData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HomeTabHooksCardSectionData> serializer() {
            return HomeTabHooksCardSectionData$$serializer.f3752a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new e80(2)), LazyKt.a(lazyThreadSafetyMode, new e80(3))};
    }

    public /* synthetic */ HomeTabHooksCardSectionData(int i, String str, String str2, int i2, ItemTextDataAppModel itemTextDataAppModel, HomePageFeature homePageFeature, IconType iconType) {
        if (28 != (i & 28)) {
            PluginExceptionsKt.b(HomeTabHooksCardSectionData$$serializer.f3752a.getDescriptor(), i, 28);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f3751a = null;
        } else {
            this.f3751a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = i2;
        this.d = itemTextDataAppModel;
        this.e = homePageFeature;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iconType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTabHooksCardSectionData)) {
            return false;
        }
        HomeTabHooksCardSectionData homeTabHooksCardSectionData = (HomeTabHooksCardSectionData) obj;
        return Intrinsics.d(this.f3751a, homeTabHooksCardSectionData.f3751a) && Intrinsics.d(this.b, homeTabHooksCardSectionData.b) && this.c == homeTabHooksCardSectionData.c && Intrinsics.d(this.d, homeTabHooksCardSectionData.d) && this.e == homeTabHooksCardSectionData.e && this.f == homeTabHooksCardSectionData.f;
    }

    public final int hashCode() {
        String str = this.f3751a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c) * 31)) * 31)) * 31;
        IconType iconType = this.f;
        return iHashCode2 + (iconType != null ? iconType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("HomeTabHooksCardSectionData(itemBgColor=", this.f3751a, ", itemImageUrl=", this.b, ", itemPosition=");
        sbE.append(this.c);
        sbE.append(", itemTextData=");
        sbE.append(this.d);
        sbE.append(", hookType=");
        sbE.append(this.e);
        sbE.append(", fallbackImage=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public HomeTabHooksCardSectionData(String str, String str2, int i, ItemTextDataAppModel itemTextDataAppModel, HomePageFeature hookType, IconType iconType) {
        Intrinsics.i(hookType, "hookType");
        this.f3751a = str;
        this.b = str2;
        this.c = i;
        this.d = itemTextDataAppModel;
        this.e = hookType;
        this.f = iconType;
    }
}
