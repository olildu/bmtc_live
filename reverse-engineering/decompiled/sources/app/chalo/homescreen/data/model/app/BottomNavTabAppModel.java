package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.nf1;
import defpackage.wb;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/BottomNavTabAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BottomNavTabAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3716a;
    public final String b;
    public final String c;
    public final BottomNavTabType d;
    public final IconType e;
    public final IconType f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/BottomNavTabAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/BottomNavTabAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BottomNavTabAppModel> serializer() {
            return BottomNavTabAppModel$$serializer.f3717a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new wb(11)), LazyKt.a(lazyThreadSafetyMode, new wb(12)), LazyKt.a(lazyThreadSafetyMode, new wb(13))};
    }

    public /* synthetic */ BottomNavTabAppModel(int i, int i2, String str, String str2, BottomNavTabType bottomNavTabType, IconType iconType, IconType iconType2) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(BottomNavTabAppModel$$serializer.f3717a.getDescriptor(), i, 63);
            throw null;
        }
        this.f3716a = i2;
        this.b = str;
        this.c = str2;
        this.d = bottomNavTabType;
        this.e = iconType;
        this.f = iconType2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomNavTabAppModel)) {
            return false;
        }
        BottomNavTabAppModel bottomNavTabAppModel = (BottomNavTabAppModel) obj;
        return this.f3716a == bottomNavTabAppModel.f3716a && Intrinsics.d(this.b, bottomNavTabAppModel.b) && Intrinsics.d(this.c, bottomNavTabAppModel.c) && this.d == bottomNavTabAppModel.d && this.e == bottomNavTabAppModel.e && this.f == bottomNavTabAppModel.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + nf1.e(nf1.e(this.f3716a * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = nf1.p(this.f3716a, "BottomNavTabAppModel(position=", ", tabId=", this.b, ", tabName=");
        sbP.append(this.c);
        sbP.append(", tabType=");
        sbP.append(this.d);
        sbP.append(", tabIconSelected=");
        sbP.append(this.e);
        sbP.append(", tabIconUnselected=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }

    public BottomNavTabAppModel(int i, String tabId, String tabName, BottomNavTabType tabType, IconType tabIconSelected, IconType tabIconUnselected) {
        Intrinsics.i(tabId, "tabId");
        Intrinsics.i(tabName, "tabName");
        Intrinsics.i(tabType, "tabType");
        Intrinsics.i(tabIconSelected, "tabIconSelected");
        Intrinsics.i(tabIconUnselected, "tabIconUnselected");
        this.f3716a = i;
        this.b = tabId;
        this.c = tabName;
        this.d = tabType;
        this.e = tabIconSelected;
        this.f = tabIconUnselected;
    }
}
