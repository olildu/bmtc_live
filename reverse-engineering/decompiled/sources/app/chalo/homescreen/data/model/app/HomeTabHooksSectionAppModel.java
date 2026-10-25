package app.chalo.homescreen.data.model.app;

import defpackage.e80;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomeTabHooksSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HomeTabHooksSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new e80(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3753a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomeTabHooksSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/HomeTabHooksSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HomeTabHooksSectionAppModel> serializer() {
            return HomeTabHooksSectionAppModel$$serializer.f3754a;
        }
    }

    public /* synthetic */ HomeTabHooksSectionAppModel(int i, String str, List list) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(HomeTabHooksSectionAppModel$$serializer.f3754a.getDescriptor(), i, 3);
            throw null;
        }
        this.f3753a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTabHooksSectionAppModel)) {
            return false;
        }
        HomeTabHooksSectionAppModel homeTabHooksSectionAppModel = (HomeTabHooksSectionAppModel) obj;
        return Intrinsics.d(this.f3753a, homeTabHooksSectionAppModel.f3753a) && Intrinsics.d(this.b, homeTabHooksSectionAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3753a.hashCode() * 31);
    }

    public final String toString() {
        return nf1.m("HomeTabHooksSectionAppModel(sectionHeader=", this.f3753a, ", hookCardList=", ")", this.b);
    }

    public HomeTabHooksSectionAppModel(String str, List hookCardList) {
        Intrinsics.i(hookCardList, "hookCardList");
        this.f3753a = str;
        this.b = hookCardList;
    }
}
